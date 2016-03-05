
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
import com.rosy.punish.model.AdminApprize;
import com.rosy.punish.service.AdminApprizeManager;
import com.rosy.punish.webapp.form.AdminApprizeForm;

/**
 * Action class to handle CRUD on a AdminApprize object
 *
 * @struts.action name="adminApprizeForm" path="/adminApprizes" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="adminApprizeForm" path="/editAdminApprize" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="adminApprizeForm" path="/saveAdminApprize" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/adminApprizeForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/adminApprizeList.jsp"
 * @struts.action-forward name="search" path="/adminApprizes.html" redirect="true"
 */
public final class AdminApprizeAction extends BaseAction {
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
        AdminApprizeForm adminApprizeForm = (AdminApprizeForm) form;

        // Exceptions are caught by ActionExceptionHandler
        AdminApprizeManager mgr = (AdminApprizeManager) getBean("adminApprizeManager");
        mgr.removeAdminApprize(adminApprizeForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("adminApprize.deleted"));

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

        AdminApprizeForm adminApprizeForm = (AdminApprizeForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (adminApprizeForm.getId() != null) {
            AdminApprizeManager mgr = (AdminApprizeManager) getBean("adminApprizeManager");
            AdminApprize adminApprize = mgr.getAdminApprize(adminApprizeForm.getId());
            adminApprizeForm = (AdminApprizeForm) convert(adminApprize);
            updateFormBean(mapping, request, adminApprizeForm);
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
        AdminApprizeForm adminApprizeForm = (AdminApprizeForm) form;
        boolean isNew = ("".equals(adminApprizeForm.getId()) || adminApprizeForm.getId() == null);

        AdminApprizeManager mgr = (AdminApprizeManager) getBean("adminApprizeManager");
        AdminApprize adminApprize = (AdminApprize) convert(adminApprizeForm);
        mgr.saveAdminApprize(adminApprize);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("adminApprize.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("adminApprize.updated"));
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

        AdminApprizeForm adminApprizeForm = (AdminApprizeForm) form;
        AdminApprize adminApprize = (AdminApprize) convert(adminApprizeForm);

        AdminApprizeManager mgr = (AdminApprizeManager) getBean("adminApprizeManager");
        request.setAttribute(Constants.ADMINAPPRIZE_LIST, mgr.getAdminApprizes(adminApprize));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
