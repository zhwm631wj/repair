
package com.rosy.punish.webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.rosy.webapp.action.BaseAction;
import com.rosy.Constants;
import com.rosy.punish.model.CaseInvestEndReport;
import com.rosy.punish.service.CaseInvestEndReportManager;
import com.rosy.punish.webapp.form.CaseInvestEndReportForm;

/**
 * Action class to handle CRUD on a CaseInvestEndReport object
 *
 * @struts.action name="caseInvestEndReportForm" path="/caseInvestEndReports" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="caseInvestEndReportForm" path="/editCaseInvestEndReport" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="caseInvestEndReportForm" path="/saveCaseInvestEndReport" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/caseInvestEndReportForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/caseInvestEndReportList.jsp"
 * @struts.action-forward name="search" path="/caseInvestEndReports.html" redirect="true"
 */
public final class CaseInvestEndReportAction extends BaseAction {
    public ActionForward cancel(ActionMapping mapping, ActionForm form,
                                HttpServletRequest request,
                                HttpServletResponse response)
    throws Exception {
        return mapping.findForward("search");
    }

    public ActionForward delete(ActionMapping mapping, ActionForm form,
                                HttpServletRequest request,
                                HttpServletResponse response)
    throws Exception {
        if (log.isDebugEnabled()) {
            log.debug("Entering 'delete' method");
        }

        ActionMessages messages = new ActionMessages();
        CaseInvestEndReportForm caseInvestEndReportForm = (CaseInvestEndReportForm) form;

        // Exceptions are caught by ActionExceptionHandler
        CaseInvestEndReportManager mgr = (CaseInvestEndReportManager) getBean("caseInvestEndReportManager");
        mgr.removeCaseInvestEndReport(caseInvestEndReportForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("caseInvestEndReport.deleted"));

        // save messages in session, so they'll survive the redirect
        saveMessages(request.getSession(), messages);

        return mapping.findForward("search");
    }

    public ActionForward edit(ActionMapping mapping, ActionForm form,
                              HttpServletRequest request,
                              HttpServletResponse response)
    throws Exception {
        if (log.isDebugEnabled()) {
            log.debug("Entering 'edit' method");
        }

        CaseInvestEndReportForm caseInvestEndReportForm = (CaseInvestEndReportForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (caseInvestEndReportForm.getId() != null) {
            CaseInvestEndReportManager mgr = (CaseInvestEndReportManager) getBean("caseInvestEndReportManager");
            CaseInvestEndReport caseInvestEndReport = mgr.getCaseInvestEndReport(caseInvestEndReportForm.getId());
            caseInvestEndReportForm = (CaseInvestEndReportForm) convert(caseInvestEndReport);
            updateFormBean(mapping, request, caseInvestEndReportForm);
        }

        return mapping.findForward("edit");
    }

    public ActionForward save(ActionMapping mapping, ActionForm form,
                              HttpServletRequest request,
                              HttpServletResponse response)
    throws Exception {
        if (log.isDebugEnabled()) {
            log.debug("Entering 'save' method");
        }

        // Extract attributes and parameters we will need
        ActionMessages messages = new ActionMessages();
        CaseInvestEndReportForm caseInvestEndReportForm = (CaseInvestEndReportForm) form;
        boolean isNew = ("".equals(caseInvestEndReportForm.getId()) || caseInvestEndReportForm.getId() == null);

        CaseInvestEndReportManager mgr = (CaseInvestEndReportManager) getBean("caseInvestEndReportManager");
        CaseInvestEndReport caseInvestEndReport = (CaseInvestEndReport) convert(caseInvestEndReportForm);
        mgr.saveCaseInvestEndReport(caseInvestEndReport);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("caseInvestEndReport.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("caseInvestEndReport.updated"));
            saveMessages(request, messages);

            return mapping.findForward("edit");
        }
    }

    public ActionForward search(ActionMapping mapping, ActionForm form,
                                HttpServletRequest request,
                                HttpServletResponse response)
    throws Exception {
        if (log.isDebugEnabled()) {
            log.debug("Entering 'search' method");
        }

        CaseInvestEndReportForm caseInvestEndReportForm = (CaseInvestEndReportForm) form;
        CaseInvestEndReport caseInvestEndReport = (CaseInvestEndReport) convert(caseInvestEndReportForm);

        CaseInvestEndReportManager mgr = (CaseInvestEndReportManager) getBean("caseInvestEndReportManager");
        request.setAttribute(Constants.CASEINVESTENDREPORT_LIST, mgr.getCaseInvestEndReports(caseInvestEndReport));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
