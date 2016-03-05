
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
import com.rosy.model.PendingRequest;
import com.rosy.service.PendingRequestManager;
import com.rosy.webapp.form.PendingRequestForm;

/**
 * Action class to handle CRUD on a PendingRequest object
 *
 * @struts.action name="pendingRequestForm" path="/pendingRequests" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="pendingRequestForm" path="/editPendingRequest" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="pendingRequestForm" path="/savePendingRequest" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/pendingRequestForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/pendingRequestList.jsp"
 * @struts.action-forward name="search" path="/pendingRequests.html" redirect="true"
 */
public final class PendingRequestAction extends BaseAction {
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
        PendingRequestForm pendingRequestForm = (PendingRequestForm) form;

        // Exceptions are caught by ActionExceptionHandler
        PendingRequestManager mgr = (PendingRequestManager) getBean("pendingRequestManager");
        mgr.removePendingRequest(pendingRequestForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("pendingRequest.deleted"));

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

        PendingRequestForm pendingRequestForm = (PendingRequestForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (pendingRequestForm.getId() != null) {
            PendingRequestManager mgr = (PendingRequestManager) getBean("pendingRequestManager");
            PendingRequest pendingRequest = mgr.getPendingRequest(pendingRequestForm.getId());
            pendingRequestForm = (PendingRequestForm) convert(pendingRequest);
            updateFormBean(mapping, request, pendingRequestForm);
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
        PendingRequestForm pendingRequestForm = (PendingRequestForm) form;
        boolean isNew = ("".equals(pendingRequestForm.getId()) || pendingRequestForm.getId() == null);

        PendingRequestManager mgr = (PendingRequestManager) getBean("pendingRequestManager");
        PendingRequest pendingRequest = (PendingRequest) convert(pendingRequestForm);
        mgr.savePendingRequest(pendingRequest);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("pendingRequest.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("pendingRequest.updated"));
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

        PendingRequestForm pendingRequestForm = (PendingRequestForm) form;
        PendingRequest pendingRequest = (PendingRequest) convert(pendingRequestForm);

        PendingRequestManager mgr = (PendingRequestManager) getBean("pendingRequestManager");
        request.setAttribute(Constants.PENDINGREQUEST_LIST, mgr.getPendingRequests(pendingRequest));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
