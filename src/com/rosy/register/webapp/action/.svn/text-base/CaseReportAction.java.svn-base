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
import com.rosy.register.model.CaseReport;
import com.rosy.register.service.CaseReportManager;
import com.rosy.register.webapp.form.CaseReportForm;

/**
 * Action class to handle CRUD on a CaseReport object
 * 
 * @struts.action name="caseReportForm" path="/caseReports" scope="request"
 *                validate="false" parameter="method" input="mainMenu"
 * @struts.action name="caseReportForm" path="/editCaseReport" scope="request"
 *                validate="false" parameter="method" input="list"
 * @struts.action name="caseReportForm" path="/saveCaseReport" scope="request"
 *                validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit"
 *                        path="/WEB-INF/pages/register/caseReportForm.jsp"
 * @struts.action-forward name="list"
 *                        path="/WEB-INF/pages/register/caseReportList.jsp"
 * @struts.action-forward name="search" path="/caseReports.html" redirect="true"
 */
public final class CaseReportAction extends BaseAction {
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
		CaseReportForm caseReportForm = (CaseReportForm) form;

		// Exceptions are caught by ActionExceptionHandler
		CaseReportManager mgr = (CaseReportManager) getBean("caseReportManager");
		mgr.removeCaseReport(caseReportForm.getId());

		messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
				"caseReport.deleted"));

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

		CaseReportForm caseReportForm = (CaseReportForm) form;

		// if an id is passed in, look up the user - otherwise
		// don't do anything - user is doing an add
		if (caseReportForm.getId() != null) {
			CaseReportManager mgr = (CaseReportManager) getBean("caseReportManager");
			CaseReport caseReport = mgr.getCaseReport(caseReportForm.getId());
			caseReportForm = (CaseReportForm) convert(caseReport);
			updateFormBean(mapping, request, caseReportForm);
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
		CaseReportForm caseReportForm = (CaseReportForm) form;
		boolean isNew = ("".equals(caseReportForm.getId()) || caseReportForm
				.getId() == null);

		CaseReportManager mgr = (CaseReportManager) getBean("caseReportManager");
		CaseReport caseReport = (CaseReport) convert(caseReportForm);
		mgr.saveCaseReport(caseReport);

		// add success messages
		if (isNew) {
			messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"caseReport.added"));

			// save messages in session to survive a redirect
			saveMessages(request.getSession(), messages);

			return mapping.findForward("next");
		} else {
			messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"caseReport.updated"));
			saveMessages(request, messages);

			return mapping.findForward("next");
		}
	}

	public ActionForward search(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'search' method");
		}

		CaseReportForm caseReportForm = (CaseReportForm) form;
		CaseReport caseReport = (CaseReport) convert(caseReportForm);

		CaseReportManager mgr = (CaseReportManager) getBean("caseReportManager");
		request.setAttribute(Constants.CASEREPORT_LIST, mgr
				.getCaseReports(caseReport));

		return mapping.findForward("list");
	}

	public ActionForward unspecified(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return search(mapping, form, request, response);
	}
}
