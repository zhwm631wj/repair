
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
import com.rosy.investigate.model.TransmitReturnReceipt;
import com.rosy.investigate.service.TransmitReturnReceiptManager;
import com.rosy.investigate.webapp.form.TransmitReturnReceiptForm;

/**
 * Action class to handle CRUD on a TransmitReturnReceipt object
 *
 * @struts.action name="transmitReturnReceiptForm" path="/transmitReturnReceipts" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="transmitReturnReceiptForm" path="/editTransmitReturnReceipt" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="transmitReturnReceiptForm" path="/saveTransmitReturnReceipt" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/investigate/transmitReturnReceiptForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/investigate/transmitReturnReceiptList.jsp"
 * @struts.action-forward name="search" path="/transmitReturnReceipts.html" redirect="true"
 */
public final class TransmitReturnReceiptAction extends BaseAction {
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
        TransmitReturnReceiptForm transmitReturnReceiptForm = (TransmitReturnReceiptForm) form;

        // Exceptions are caught by ActionExceptionHandler
        TransmitReturnReceiptManager mgr = (TransmitReturnReceiptManager) getBean("transmitReturnReceiptManager");
        mgr.removeTransmitReturnReceipt(transmitReturnReceiptForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("transmitReturnReceipt.deleted"));

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

        TransmitReturnReceiptForm transmitReturnReceiptForm = (TransmitReturnReceiptForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (transmitReturnReceiptForm.getId() != null) {
            TransmitReturnReceiptManager mgr = (TransmitReturnReceiptManager) getBean("transmitReturnReceiptManager");
            TransmitReturnReceipt transmitReturnReceipt = mgr.getTransmitReturnReceipt(transmitReturnReceiptForm.getId());
            transmitReturnReceiptForm = (TransmitReturnReceiptForm) convert(transmitReturnReceipt);
            updateFormBean(mapping, request, transmitReturnReceiptForm);
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
        TransmitReturnReceiptForm transmitReturnReceiptForm = (TransmitReturnReceiptForm) form;
        boolean isNew = ("".equals(transmitReturnReceiptForm.getId()) || transmitReturnReceiptForm.getId() == null);

        TransmitReturnReceiptManager mgr = (TransmitReturnReceiptManager) getBean("transmitReturnReceiptManager");
        TransmitReturnReceipt transmitReturnReceipt = (TransmitReturnReceipt) convert(transmitReturnReceiptForm);
        mgr.saveTransmitReturnReceipt(transmitReturnReceipt);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("transmitReturnReceipt.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("transmitReturnReceipt.updated"));
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

        TransmitReturnReceiptForm transmitReturnReceiptForm = (TransmitReturnReceiptForm) form;
        TransmitReturnReceipt transmitReturnReceipt = (TransmitReturnReceipt) convert(transmitReturnReceiptForm);

        TransmitReturnReceiptManager mgr = (TransmitReturnReceiptManager) getBean("transmitReturnReceiptManager");
        request.setAttribute(Constants.TRANSMITRETURNRECEIPT_LIST, mgr.getTransmitReturnReceipts(transmitReturnReceipt));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
