
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
import com.rosy.punish.model.AmerceReceipt;
import com.rosy.punish.service.AmerceReceiptManager;
import com.rosy.punish.webapp.form.AmerceReceiptForm;

/**
 * Action class to handle CRUD on a AmerceReceipt object
 *
 * @struts.action name="amerceReceiptForm" path="/amerceReceipts" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="amerceReceiptForm" path="/editAmerceReceipt" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="amerceReceiptForm" path="/saveAmerceReceipt" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/amerceReceiptForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/amerceReceiptList.jsp"
 * @struts.action-forward name="search" path="/amerceReceipts.html" redirect="true"
 */
public final class AmerceReceiptAction extends BaseAction {
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
        AmerceReceiptForm amerceReceiptForm = (AmerceReceiptForm) form;

        // Exceptions are caught by ActionExceptionHandler
        AmerceReceiptManager mgr = (AmerceReceiptManager) getBean("amerceReceiptManager");
        mgr.removeAmerceReceipt(amerceReceiptForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("amerceReceipt.deleted"));

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

        AmerceReceiptForm amerceReceiptForm = (AmerceReceiptForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (amerceReceiptForm.getId() != null) {
            AmerceReceiptManager mgr = (AmerceReceiptManager) getBean("amerceReceiptManager");
            AmerceReceipt amerceReceipt = mgr.getAmerceReceipt(amerceReceiptForm.getId());
            amerceReceiptForm = (AmerceReceiptForm) convert(amerceReceipt);
            updateFormBean(mapping, request, amerceReceiptForm);
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
        AmerceReceiptForm amerceReceiptForm = (AmerceReceiptForm) form;
        boolean isNew = ("".equals(amerceReceiptForm.getId()) || amerceReceiptForm.getId() == null);

        AmerceReceiptManager mgr = (AmerceReceiptManager) getBean("amerceReceiptManager");
        AmerceReceipt amerceReceipt = (AmerceReceipt) convert(amerceReceiptForm);
        mgr.saveAmerceReceipt(amerceReceipt);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("amerceReceipt.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("amerceReceipt.updated"));
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

        AmerceReceiptForm amerceReceiptForm = (AmerceReceiptForm) form;
        AmerceReceipt amerceReceipt = (AmerceReceipt) convert(amerceReceiptForm);

        AmerceReceiptManager mgr = (AmerceReceiptManager) getBean("amerceReceiptManager");
        request.setAttribute(Constants.AMERCERECEIPT_LIST, mgr.getAmerceReceipts(amerceReceipt));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
