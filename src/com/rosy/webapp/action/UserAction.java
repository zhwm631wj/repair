package com.rosy.webapp.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.acegisecurity.Authentication;
import org.acegisecurity.AuthenticationTrustResolver;
import org.acegisecurity.AuthenticationTrustResolverImpl;
import org.acegisecurity.context.SecurityContext;
import org.acegisecurity.context.SecurityContextHolder;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.util.MessageResources;
import org.springframework.mail.SimpleMailMessage;

import com.rosy.Constants;
import com.rosy.model.Role;
import com.rosy.model.User;
import com.rosy.service.MailEngine;
import com.rosy.service.RoleManager;
import com.rosy.service.UserExistsException;
import com.rosy.service.UserManager;
import com.rosy.util.StringUtil;
import com.rosy.webapp.form.UserForm;
import com.rosy.webapp.util.RequestUtil;

/**
 * Implementation of <strong>Action</strong> that interacts with the {@link
 * UserForm} and retrieves values. It interacts with the {@link UserManager} to
 * retrieve/persist values to the database.
 * 
 * <p>
 * <a href="UserAction.java.html"><i>View Source</i></a>
 * </p>
 * 
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a> Modified by
 *         <a href="mailto:dan@getrolling.com">Dan Kibler</a>
 * 
 * @struts.action name="userForm" path="/users" scope="request" validate="false"
 *                parameter="method" input="mainMenu" roles="admin"
 * @struts.action name="userForm" path="/editUser" scope="request"
 *                validate="false" parameter="method" input="list" roles="admin"
 * @struts.action name="userForm" path="/editProfile" scope="request"
 *                validate="false" parameter="method" input="mainMenu"
 * @struts.action name="userForm" path="/saveUser" scope="request"
 *                validate="false" parameter="method" input="edit"
 * 
 * @struts.action-forward name="list" path="/WEB-INF/pages/userList.jsp"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/userForm.jsp"
 */
public final class UserAction extends BaseAction {

	public ActionForward add(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'add' method");
		}

		User user = new User();
		user.addRole(new Role(Constants.USER_ROLE));
		UserForm userForm = (UserForm) convert(user);
		updateFormBean(mapping, request, userForm);
		checkForRememberMeLogin(request);
		return mapping.findForward("edit");
	}

	public ActionForward cancel(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'cancel' method");
		}

		if (!StringUtils.equals(request.getParameter("from"), "list")) {
			return mapping.findForward("mainMenu");
		} else {
			return mapping.findForward("viewUsers");
		}
	}

	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'delete' method");
		}

		// Extract attributes and parameters we will need
		ActionMessages messages = new ActionMessages();
		UserForm userForm = (UserForm) form;

		// Exceptions are caught by ActionExceptionHandler
		UserManager mgr = (UserManager) getBean("userManager");
		mgr.removeUser(userForm.getId());

		messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
				"user.deleted", userForm.getPersonName()));

		saveMessages(request.getSession(), messages);

		// return a forward to searching users
		return mapping.findForward("viewUsers");
	}

	public ActionForward edit(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'edit' method");
		}

		UserForm userForm = (UserForm) form;

		// if URL is "editProfile" - make sure it's the current user
		if (request.getRequestURI().indexOf("editProfile") > -1) {
			// reject if username passed in or "list" parameter passed in
			// someone that is trying this probably knows the AppFuse code
			// but it's a legitimate bug, so I'll fix it. ;-)
			if ((request.getParameter("username") != null)
					|| (request.getParameter("from") != null)) {
				response.sendError(HttpServletResponse.SC_FORBIDDEN);
				log.warn("User '" + request.getRemoteUser()
						+ "' is trying to edit user '"
						+ request.getParameter("username") + "'");

				return null;
			}
		}

		// Exceptions are caught by ActionExceptionHandler
		UserManager mgr = (UserManager) getBean("userManager");
		User user = null;

		// if a user's username is passed in
		if (request.getParameter("username") != null) {
			// lookup the user using that id
			user = mgr.getUserByUsername(userForm.getUsername());
		} else {
			// look it up based on the current user's id
			user = mgr.getUserByUsername(request.getRemoteUser());
		}

		BeanUtils.copyProperties(userForm, convert(user));
		userForm.setConfirmPassword(userForm.getPassword());
		updateFormBean(mapping, request, userForm);

		checkForRememberMeLogin(request);

		// return a forward to edit forward
		return mapping.findForward("edit");
	}

	public ActionForward save(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'save' method");
		}

		// run validation rules on this form
		// See https://appfuse.dev.java.net/issues/show_bug.cgi?id=128
		ActionMessages errors = form.validate(mapping, request);

		if (!errors.isEmpty()) {
			saveErrors(request, errors);
			return mapping.findForward("edit");
		}

		// Extract attributes and parameters we will need
		ActionMessages messages = new ActionMessages();
		UserForm userForm = (UserForm) form;
		User user = new User();

		// Exceptions are caught by ActionExceptionHandler
		// all we need to persist is the parent object
		BeanUtils.copyProperties(user, userForm);
		Boolean encrypt = (Boolean) getConfiguration().get(
				Constants.ENCRYPT_PASSWORD);
		if (StringUtils.equals(request.getParameter("encryptPass"), "true")
				&& (encrypt != null && encrypt.booleanValue())) {
			String algorithm = (String) getConfiguration().get(
					Constants.ENC_ALGORITHM);

			if (algorithm == null) { // should only happen for test case
				log.debug("assuming testcase, setting algorithm to 'SHA'");
				algorithm = "SHA";
			}

			user.setPassword(StringUtil.encodePassword(user.getPassword(),
					algorithm));
		}

		UserManager mgr = (UserManager) getBean("userManager");
		RoleManager roleMgr = (RoleManager) getBean("roleManager");
		String[] userRoles = request.getParameterValues("userRoles");

		for (int i = 0; userRoles != null && i < userRoles.length; i++) {
			String roleName = userRoles[i];
			user.addRole(roleMgr.getRole(roleName));
		}
		try {
			mgr.saveUser(user);
		} catch (UserExistsException e) {
			log.warn(e.getMessage());
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"errors.existing.user", userForm.getUsername(), userForm
							.getEmail()));
			saveErrors(request, errors);
			BeanUtils.copyProperties(userForm, convert(user));
			userForm.setConfirmPassword(userForm.getPassword());
			// reset the version # to what was passed in
			userForm.setVersion(request.getParameter("version"));
			updateFormBean(mapping, request, userForm);

			return mapping.findForward("edit");
		}

		BeanUtils.copyProperties(userForm, convert(user));
		userForm.setConfirmPassword(userForm.getPassword());
		updateFormBean(mapping, request, userForm);
		if (!StringUtils.equals(request.getParameter("from"), "list")) {
			// add success messages
			messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"user.saved"));
			saveMessages(request.getSession(), messages);

			// return a forward to main Menu
			return mapping.findForward("mainMenu");
		} else {
			// add success messages
			if ("".equals(request.getParameter("version"))) {
				messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
						"user.added", user.getPersonName()));
				saveMessages(request.getSession(), messages);
				sendNewUserEmail(request, userForm);

				return mapping.findForward("addUser");
			} else {
				messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
						"user.updated.byAdmin", user.getPersonName()));
				saveMessages(request, messages);

				return mapping.findForward("edit");
			}
		}
	}

	public ActionForward search(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'search' method");
		}

		UserForm userForm = (UserForm) form;

		// Exceptions are caught by ActionExceptionHandler
		UserManager mgr = (UserManager) getBean("userManager");
		User user = (User) convert(userForm);
		List users = mgr.getUsers(user);
		request.setAttribute(Constants.USER_LIST, users);

		// return a forward to the user list definition
		return mapping.findForward("list");
	}

	public ActionForward unspecified(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		return search(mapping, form, request, response);
	}

	private void sendNewUserEmail(HttpServletRequest request, UserForm userForm)
			throws Exception {
		MessageResources resources = getResources(request);

		// Send user an e-mail
		if (log.isDebugEnabled()) {
			log.debug("Sending user '" + userForm.getUsername()
					+ "' an account information e-mail");
		}

		SimpleMailMessage message = (SimpleMailMessage) getBean("mailMessage");
		message.setTo(userForm.getFullName() + "<" + userForm.getEmail() + ">");

		StringBuffer msg = new StringBuffer();
		msg.append(resources.getMessage("newuser.email.message", userForm
				.getFullName()));
		msg.append("\n\n" + resources.getMessage("userForm.username"));
		msg.append(": " + userForm.getUsername() + "\n");
		msg.append(resources.getMessage("userForm.password") + ": ");
		msg.append(userForm.getPassword());
		msg.append("\n\nLogin at: " + RequestUtil.getAppURL(request));
		message.setText(msg.toString());

		message.setSubject(resources.getMessage("signup.email.subject"));

		MailEngine engine = (MailEngine) getBean("mailEngine");
		engine.send(message);
	}

	/**
	 * 调用修改当前用户的密码页面
	 * 
	 * @author 631wj
	 * @param
	 * @return
	 */
	public ActionForward toEditPass(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering chang user password method");
		}
		 checkForRememberMeLogin(request);
		return mapping.findForward("editPass");
	}

	/**
	 * 修改当前用户的密码
	 * 
	 * @author 631wj
	 * @param
	 * @return
	 */
	public ActionForward editPass(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering chang user password method");
		}

		UserManager mgr = (UserManager) getBean("userManager");
		ActionMessages messages = new ActionMessages();
		ActionErrors errors = new ActionErrors();
		// 原来的密码
		String oldword = request.getParameter("oldword");
		// 新的密码
		String newword = request.getParameter("newword");
		// 确定密码
		String cfword = request.getParameter("cfword");

		Boolean encrypt = (Boolean) getConfiguration().get(
				Constants.ENCRYPT_PASSWORD);

		// 得到当前用户
		User currentUser = mgr.getCurrentUser();

		boolean encryptTrue = StringUtils.equals(request
				.getParameter("encryptPass"), "true")
				&& (encrypt != null && encrypt.booleanValue());
		String algorithm = null;
		// 如果当前用户存在
		if (currentUser != null && oldword != null && newword != null
				&& cfword != null) {
			String id = currentUser.getId();
			// 重新从数据库中读取当前用户信息
			currentUser = mgr.getUser(id);

			if (encryptTrue) {
				algorithm = (String) getConfiguration().get(
						Constants.ENC_ALGORITHM);
				if (algorithm == null) {
					log.debug("assuming testcase, setting algorithm to 'SHA'");
					algorithm = "SHA";
				}

				oldword = StringUtil.encodePassword(oldword, algorithm);
			}

			String currentUserPassword = currentUser.getPassword();
			// 两次密码输入不一致
			if (!newword.equals(cfword)) {
				// 修改失败
				errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
						"changeWord.error.confirm"));
				saveErrors(request.getSession(), errors);
				return mapping.findForward("editPass");

			} else {
				if (oldword.equals(currentUserPassword)) {
					if (encryptTrue) {
						currentUser.setPassword(StringUtil.encodePassword(
								cfword, algorithm));
					}
					mgr.saveUser(currentUser);
					// 修改成功
					messages.add(ActionMessages.GLOBAL_MESSAGE,
							new ActionMessage("changeWord.success"));
					saveMessages(request.getSession(), messages);

				} else {
					// 修改失败
					errors.add(ActionMessages.GLOBAL_MESSAGE,
							new ActionMessage("changeWord.error.current"));
					saveErrors(request.getSession(), errors);
					return mapping.findForward("editPass");
				}

			}

		} else {
			// 修改失败
			messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"changeWord.error"));
			saveErrors(request.getSession(), messages);
			return mapping.findForward("editPass");
		}
		return mapping.findForward("mainMenu");
	}

	private void checkForRememberMeLogin(HttpServletRequest request) {
		// if user logged in with remember me, display a warning that they can't
		// change passwords
		log.debug("checking for remember me login...");

		AuthenticationTrustResolver resolver = new AuthenticationTrustResolverImpl();
		SecurityContext ctx = SecurityContextHolder.getContext();

		if (ctx != null) {
			Authentication auth = ctx.getAuthentication();

			if (resolver.isRememberMe(auth)) {
				request.getSession().setAttribute("cookieLogin", "true");

				// add warning message
				ActionMessages messages = new ActionMessages();
				messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
						"userProfile.cookieLogin"));
				saveMessages(request, messages);
			}
		}
	}
}
