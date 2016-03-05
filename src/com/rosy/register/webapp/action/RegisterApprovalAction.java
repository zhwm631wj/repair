package com.rosy.register.webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.rosy.webapp.action.BaseAction;
import com.rosy.Constants;
import com.rosy.register.model.RegisterApproval;
import com.rosy.register.service.RegisterApprovalManager;
import com.rosy.register.webapp.form.RegisterApprovalForm;

/**
 * Action class to handle CRUD on a RegisterApproval object
 * 
 * @struts.action name="registerApprovalForm" path="/registerApprovals"
 *                scope="request" validate="false" parameter="method"
 *                input="mainMenu"
 * @struts.action name="registerApprovalForm" path="/editRegisterApproval"
 *                scope="request" validate="false" parameter="method"
 *                input="list"
 * @struts.action name="registerApprovalForm" path="/saveRegisterApproval"
 *                scope="request" validate="true" parameter="method"
 *                input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit"
 *                        path="/WEB-INF/pages/register/registerApprovalForm.jsp"
 * @struts.action-forward name="list"
 *                        path="/WEB-INF/pages/register/registerApprovalList.jsp"
 * @struts.action-forward name="search" path="/registerApprovals.html"
 *                        redirect="true"
 */
public final class RegisterApprovalAction extends BaseAction {
	public ActionForward cancel(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return mapping.findForward("search");
	}

	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'delete' method");
		}

		ActionMessages messages = new ActionMessages();
		RegisterApprovalForm registerApprovalForm = (RegisterApprovalForm) form;

		// Exceptions are caught by ActionExceptionHandler
		RegisterApprovalManager mgr = (RegisterApprovalManager) getBean("registerApprovalManager");
		mgr.removeRegisterApproval(registerApprovalForm.getId());

		messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
				"registerApproval.deleted"));

		// save messages in session, so they'll survive the redirect
		saveMessages(request.getSession(), messages);

		return mapping.findForward("search");
	}

	public ActionForward edit(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'edit' method");
		}

		RegisterApprovalForm registerApprovalForm = (RegisterApprovalForm) form;

		// if an id is passed in, look up the user - otherwise
		// don't do anything - user is doing an add
		if (registerApprovalForm.getId() != null) {
			RegisterApprovalManager mgr = (RegisterApprovalManager) getBean("registerApprovalManager");
			RegisterApproval registerApproval = mgr
					.getRegisterApproval(registerApprovalForm.getId());
			registerApprovalForm = (RegisterApprovalForm) convert(registerApproval);
			updateFormBean(mapping, request, registerApprovalForm);
		}

		return mapping.findForward("edit");
	}

	public ActionForward save(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'save' method");
		}

		// Extract attributes and parameters we will need
		ActionMessages messages = new ActionMessages();
		RegisterApprovalForm registerApprovalForm = (RegisterApprovalForm) form;
		boolean isNew = ("".equals(registerApprovalForm.getId()) || registerApprovalForm
				.getId() == null);

		RegisterApprovalManager mgr = (RegisterApprovalManager) getBean("registerApprovalManager");
		RegisterApproval registerApproval = (RegisterApproval) convert(registerApprovalForm);
		mgr.saveRegisterApproval(registerApproval);

		// add success messages
		if (isNew) {
			messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"registerApproval.added"));

			// save messages in session to survive a redirect
			saveMessages(request.getSession(), messages);

			return mapping.findForward("step21");
		} else {
			messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"registerApproval.updated"));
			saveMessages(request, messages);

			return mapping.findForward("step21");
		}
	}

	public ActionForward search(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'search' method");
		}

		RegisterApprovalForm registerApprovalForm = (RegisterApprovalForm) form;
		RegisterApproval registerApproval = (RegisterApproval) convert(registerApprovalForm);

		RegisterApprovalManager mgr = (RegisterApprovalManager) getBean("registerApprovalManager");
		request.setAttribute(Constants.REGISTERAPPROVAL_LIST, mgr
				.getRegisterApprovals(registerApproval));

		return mapping.findForward("list");
	}

	public ActionForward unspecified(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return search(mapping, form, request, response);
	}
}
