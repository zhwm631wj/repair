
package com.rosy.webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.rosy.webapp.action.BaseAction;
import com.rosy.Constants;
import com.rosy.model.SysLog;
import com.rosy.service.SysLogManager;
import com.rosy.webapp.form.SysLogForm;

/**
 * Action class to handle CRUD on a SysLog object
 *
 * @struts.action name="sysLogForm" path="/sysLogs" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="sysLogForm" path="/editSysLog" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="sysLogForm" path="/saveSysLog" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/sysLogForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/sysLogList.jsp"
 * @struts.action-forward name="search" path="/sysLogs.html" redirect="true"
 */
public final class SysLogAction extends BaseAction {
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
        SysLogForm sysLogForm = (SysLogForm) form;

        // Exceptions are caught by ActionExceptionHandler
        SysLogManager mgr = (SysLogManager) getBean("sysLogManager");
        mgr.removeSysLog(sysLogForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("sysLog.deleted"));

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

        SysLogForm sysLogForm = (SysLogForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (sysLogForm.getId() != null) {
            SysLogManager mgr = (SysLogManager) getBean("sysLogManager");
            SysLog sysLog = mgr.getSysLog(sysLogForm.getId());
            sysLogForm = (SysLogForm) convert(sysLog);
            updateFormBean(mapping, request, sysLogForm);
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
        SysLogForm sysLogForm = (SysLogForm) form;
        boolean isNew = ("".equals(sysLogForm.getId()) || sysLogForm.getId() == null);

        SysLogManager mgr = (SysLogManager) getBean("sysLogManager");
        SysLog sysLog = (SysLog) convert(sysLogForm);
        mgr.saveSysLog(sysLog);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("sysLog.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("sysLog.updated"));
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

        SysLogForm sysLogForm = (SysLogForm) form;
        SysLog sysLog = (SysLog) convert(sysLogForm);

        SysLogManager mgr = (SysLogManager) getBean("sysLogManager");
        request.setAttribute(Constants.SYSLOG_LIST, mgr.getSysLogs(sysLog));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
