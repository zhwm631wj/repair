
package com.rosy.investigate.webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.rosy.webapp.action.BaseAction;
import com.rosy.Constants;
import com.rosy.investigate.model.CheckupReport;
import com.rosy.investigate.service.CheckupReportManager;
import com.rosy.investigate.webapp.form.CheckupReportForm;

/**
 * Action class to handle CRUD on a CheckupReport object
 *
 * @struts.action name="checkupReportForm" path="/checkupReports" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="checkupReportForm" path="/editCheckupReport" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="checkupReportForm" path="/saveCheckupReport" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/investigate/checkupReportForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/investigate/checkupReportList.jsp"
 * @struts.action-forward name="search" path="/checkupReports.html" redirect="true"
 */
public final class CheckupReportAction extends BaseAction {
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
        CheckupReportForm checkupReportForm = (CheckupReportForm) form;

        // Exceptions are caught by ActionExceptionHandler
        CheckupReportManager mgr = (CheckupReportManager) getBean("checkupReportManager");
        mgr.removeCheckupReport(checkupReportForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("checkupReport.deleted"));

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

        CheckupReportForm checkupReportForm = (CheckupReportForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (checkupReportForm.getId() != null) {
            CheckupReportManager mgr = (CheckupReportManager) getBean("checkupReportManager");
            CheckupReport checkupReport = mgr.getCheckupReport(checkupReportForm.getId());
            checkupReportForm = (CheckupReportForm) convert(checkupReport);
            updateFormBean(mapping, request, checkupReportForm);
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
        CheckupReportForm checkupReportForm = (CheckupReportForm) form;
        boolean isNew = ("".equals(checkupReportForm.getId()) || checkupReportForm.getId() == null);

        CheckupReportManager mgr = (CheckupReportManager) getBean("checkupReportManager");
        CheckupReport checkupReport = (CheckupReport) convert(checkupReportForm);
        mgr.saveCheckupReport(checkupReport);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("checkupReport.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("checkupReport.updated"));
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

        CheckupReportForm checkupReportForm = (CheckupReportForm) form;
        CheckupReport checkupReport = (CheckupReport) convert(checkupReportForm);

        CheckupReportManager mgr = (CheckupReportManager) getBean("checkupReportManager");
        request.setAttribute(Constants.CHECKUPREPORT_LIST, mgr.getCheckupReports(checkupReport));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
