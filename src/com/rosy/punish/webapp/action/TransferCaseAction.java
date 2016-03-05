
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
import com.rosy.punish.model.TransferCase;
import com.rosy.punish.service.TransferCaseManager;
import com.rosy.punish.webapp.form.TransferCaseForm;

/**
 * Action class to handle CRUD on a TransferCase object
 *
 * @struts.action name="transferCaseForm" path="/transferCases" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="transferCaseForm" path="/editTransferCase" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="transferCaseForm" path="/saveTransferCase" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/transferCaseForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/transferCaseList.jsp"
 * @struts.action-forward name="search" path="/transferCases.html" redirect="true"
 */
public final class TransferCaseAction extends BaseAction {
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
        TransferCaseForm transferCaseForm = (TransferCaseForm) form;

        // Exceptions are caught by ActionExceptionHandler
        TransferCaseManager mgr = (TransferCaseManager) getBean("transferCaseManager");
        mgr.removeTransferCase(transferCaseForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("transferCase.deleted"));

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

        TransferCaseForm transferCaseForm = (TransferCaseForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (transferCaseForm.getId() != null) {
            TransferCaseManager mgr = (TransferCaseManager) getBean("transferCaseManager");
            TransferCase transferCase = mgr.getTransferCase(transferCaseForm.getId());
            transferCaseForm = (TransferCaseForm) convert(transferCase);
            updateFormBean(mapping, request, transferCaseForm);
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
        TransferCaseForm transferCaseForm = (TransferCaseForm) form;
        boolean isNew = ("".equals(transferCaseForm.getId()) || transferCaseForm.getId() == null);

        TransferCaseManager mgr = (TransferCaseManager) getBean("transferCaseManager");
        TransferCase transferCase = (TransferCase) convert(transferCaseForm);
        mgr.saveTransferCase(transferCase);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("transferCase.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("transferCase.updated"));
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

        TransferCaseForm transferCaseForm = (TransferCaseForm) form;
        TransferCase transferCase = (TransferCase) convert(transferCaseForm);

        TransferCaseManager mgr = (TransferCaseManager) getBean("transferCaseManager");
        request.setAttribute(Constants.TRANSFERCASE_LIST, mgr.getTransferCases(transferCase));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
