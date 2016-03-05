package com.rosy.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.rosy.Constants;
import com.rosy.model.Attachment;
import com.rosy.service.AttachmentManager;
import com.rosy.util.DateUtil;
import com.rosy.util.UploadFile;
import com.rosy.webapp.form.AttachmentForm;

/**
 * Action class to handle CRUD on a Attachment object
 * 
 * @struts.action name="attachmentForm" path="/attachments" scope="request"
 *                validate="false" parameter="method" input="mainMenu"
 * @struts.action name="attachmentForm" path="/editAttachment" scope="request"
 *                validate="false" parameter="method" input="list"
 * @struts.action name="attachmentForm" path="/saveAttachment" scope="request"
 *                validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/attachmentForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/attachmentList.jsp"
 * @struts.action-forward name="search" path="/attachments.html" redirect="true"
 */
public final class AttachmentAction extends BaseAction {
	public ActionForward cancel(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return mapping.findForward("search");
	}

	/**
	 * 删除附件
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'delete' method");
		}
		HttpSession session = request.getSession();
		ActionMessages messages = new ActionMessages();
		AttachmentForm attachmentForm = (AttachmentForm) form;
		String [] ids=attachmentForm.getSeldel();
		List<Attachment> atrrachments  = new ArrayList<Attachment>();;
		AttachmentManager mgr = (AttachmentManager) getBean("attachmentManager");
		if (session.getAttribute(Constants.ATTACHMENT_CACHE__LIST) != null) {
			atrrachments = (List<Attachment>) session.getAttribute(Constants.ATTACHMENT_CACHE__LIST);
		} 
		if(ids!=null)
		for (String id : ids) {
			Attachment attachment = mgr.getAttachment(id);
			mgr.removeAttachment(id);
			atrrachments.remove(attachment);
		}
		// Exceptions are caught by ActionExceptionHandler
		messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
				"attachment.deleted"));
		// save messages in session, so they'll survive the redirect
		saveMessages(request.getSession(), messages);
		session.setAttribute(Constants.ATTACHMENT_CACHE__LIST, atrrachments);
		return mapping.findForward("fileCache");
	}

	
	/**
	 * 获得附件的信息
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward getInfoById(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'edit' method");
		}
		AttachmentManager mgr = (AttachmentManager) getBean("attachmentManager");
		String id  = request.getParameter("id");
		Attachment attachment = null;
		 if(StringUtils.isNotEmpty(id)){
	    attachment = mgr.getAttachment(id);	 
		 }
		StringBuffer infoBuffer= new StringBuffer();
		infoBuffer
		.append("<div class='info-head'><div class='head-btn'><label class='close'  title='关闭'/></div><div class='head-name'>基本信息");
		infoBuffer.append("</div></div>");
		infoBuffer.append(" <table width='100%' id='").append("info").append(
				"' style='font-size:13px;'><tr> ").append("\n");
		infoBuffer.append("<td>文 件 名</td>").append("\n");
		infoBuffer.append("<td>文件类型</td>").append("\n");
		infoBuffer.append(" </tr><tr>").append("\n");
		infoBuffer.append("<td><input type='text' readonly='readonly' value='").append(
				attachment.getFileName()!=null?attachment.getFileName():"").append("' id='filename' />").append("\n");
		infoBuffer.append("<td><input type='text'  readonly='readonly' value='").append(
				attachment.getType()!=null?attachment.getType():"").append("' id='type' />").append(
				"\n");
		infoBuffer.append(" </tr><tr>").append("\n");
		infoBuffer.append("<td>上 传 者</td>").append("\n");
		infoBuffer.append("<td>上传时间</td>").append("\n");
		infoBuffer.append(" </tr><tr>").append("\n");
		infoBuffer.append("<td><input type='text' readonly='readonly'  value='").append(
				attachment.getUploadUser()!=null?attachment.getUploadUser():"").append("' id='author' />").append(
				"\n");
		infoBuffer.append("<td><input type='text' readonly='readonly' value='").append(
				DateUtil.getDate(attachment.getUploadTime())).append("' id='uploadtime' />").append("\n");
		infoBuffer.append(" </tr><tr>").append("\n");
		infoBuffer.append("<td clospan='2'>文件说明</td>").append("\n");
		infoBuffer.append(" </tr><tr>").append("\n");
		infoBuffer.append("<td clospan='2'><textarea readonly='readonly' value='").append(
				attachment.getRemark()!=null?attachment.getRemark():"").append("' id='remark' />").append("\n");
		infoBuffer.append(" </td></tr><tr>");
		infoBuffer.append(" </table>");
        response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print(infoBuffer.toString());
		return null;
		
	}
	
	/**
	 * 下载附件
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward downloadById(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'edit' method");
		}
		AttachmentManager mgr = (AttachmentManager) getBean("attachmentManager");
		String id  = request.getParameter("id");
		Attachment attachment = null;
		 if(StringUtils.isNotEmpty(id)){
	    attachment = mgr.getAttachment(id); 
		 }
		Boolean succee=UploadFile.downloadFileByWriter(request, response, attachment);
		if(!succee){
			return getInfoById(mapping, form, request, response);
		}else{
			return null;
		}
	}
	
	
	/**
	 * 编辑附件
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward edit(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'edit' method");
		}
		AttachmentForm attachmentForm = (AttachmentForm) form;
		if (attachmentForm.getId() != null) {
			AttachmentManager mgr = (AttachmentManager) getBean("attachmentManager");
			Attachment attachment = mgr.getAttachment(attachmentForm.getId());
			attachmentForm = (AttachmentForm) convert(attachment);
			updateFormBean(mapping, request, attachmentForm);
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
		AttachmentForm attachmentForm = (AttachmentForm) form;
		boolean isNew = ("".equals(attachmentForm.getId()) || attachmentForm
				.getId() == null);

		AttachmentManager mgr = (AttachmentManager) getBean("attachmentManager");
		Attachment attachment = (Attachment) convert(attachmentForm);
		mgr.saveAttachment(attachment);

		// add success messages
		if (isNew) {
			messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"attachment.added"));

			// save messages in session to survive a redirect
			saveMessages(request.getSession(), messages);

			return mapping.findForward("search");
		} else {
			messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"attachment.updated"));
			saveMessages(request, messages);

			return mapping.findForward("edit");
		}
	}

	public ActionForward search(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'search' method");
		}

		AttachmentForm attachmentForm = (AttachmentForm) form;
		Attachment attachment = (Attachment) convert(attachmentForm);

		AttachmentManager mgr = (AttachmentManager) getBean("attachmentManager");
		request.setAttribute(Constants.ATTACHMENT_LIST, mgr
				.getAttachments(attachment));

		return mapping.findForward("list");
	}
	/**
	 * 查找用户的附件
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward fileCache(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'search' method");
		}
		HttpSession session = request.getSession();
		List atrrachments = null;
		Attachment attachment = (Attachment) request
				.getAttribute("upattachment");
		if (attachment.getId() != null) {
			AttachmentManager mgr = (AttachmentManager) getBean("attachmentManager");
			attachment = mgr.getAttachment(attachment.getId());
		}
		if (session.getAttribute(Constants.ATTACHMENT_CACHE__LIST) != null) {
			atrrachments = (List) session
					.getAttribute(Constants.ATTACHMENT_CACHE__LIST);
			atrrachments.add(attachment);
		} else {
			atrrachments = new ArrayList();

			atrrachments.add(attachment);
		}
		session.setAttribute(Constants.ATTACHMENT_CACHE__LIST, atrrachments);
		// request.setAttribute(Constants.ATTACHMENT_CACHE__LIST, atrrachments);
		request.setAttribute(Constants.ATTACHMENT_LIST, atrrachments);
		return mapping.findForward("fileCache");
	}

	public ActionForward unspecified(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return search(mapping, form, request, response);
	}
}
