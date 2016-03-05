
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
import com.rosy.punish.model.VerifyCheckup;
import com.rosy.punish.service.VerifyCheckupManager;
import com.rosy.punish.webapp.form.VerifyCheckupForm;

/**
 * Action class to handle CRUD on a VerifyCheckup object
 *
 * @struts.action name="verifyCheckupForm" path="/verifyCheckups" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="verifyCheckupForm" path="/editVerifyCheckup" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="verifyCheckupForm" path="/saveVerifyCheckup" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/verifyCheckupForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/verifyCheckupList.jsp"
 * @struts.action-forward name="search" path="/verifyCheckups.html" redirect="true"
 */
public final class VerifyCheckupAction extends BaseAction {
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
        VerifyCheckupForm verifyCheckupForm = (VerifyCheckupForm) form;

        // Exceptions are caught by ActionExceptionHandler
        VerifyCheckupManager mgr = (VerifyCheckupManager) getBean("verifyCheckupManager");
        mgr.removeVerifyCheckup(verifyCheckupForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("verifyCheckup.deleted"));

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

        VerifyCheckupForm verifyCheckupForm = (VerifyCheckupForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (verifyCheckupForm.getId() != null) {
            VerifyCheckupManager mgr = (VerifyCheckupManager) getBean("verifyCheckupManager");
            VerifyCheckup verifyCheckup = mgr.getVerifyCheckup(verifyCheckupForm.getId());
            verifyCheckupForm = (VerifyCheckupForm) convert(verifyCheckup);
            updateFormBean(mapping, request, verifyCheckupForm);
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
        VerifyCheckupForm verifyCheckupForm = (VerifyCheckupForm) form;
        boolean isNew = ("".equals(verifyCheckupForm.getId()) || verifyCheckupForm.getId() == null);

        VerifyCheckupManager mgr = (VerifyCheckupManager) getBean("verifyCheckupManager");
        VerifyCheckup verifyCheckup = (VerifyCheckup) convert(verifyCheckupForm);
        mgr.saveVerifyCheckup(verifyCheckup);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("verifyCheckup.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("verifyCheckup.updated"));
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

        VerifyCheckupForm verifyCheckupForm = (VerifyCheckupForm) form;
        VerifyCheckup verifyCheckup = (VerifyCheckup) convert(verifyCheckupForm);

        VerifyCheckupManager mgr = (VerifyCheckupManager) getBean("verifyCheckupManager");
        request.setAttribute(Constants.VERIFYCHECKUP_LIST, mgr.getVerifyCheckups(verifyCheckup));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
