
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
import com.rosy.punish.model.HandoverCase;
import com.rosy.punish.service.HandoverCaseManager;
import com.rosy.punish.webapp.form.HandoverCaseForm;

/**
 * Action class to handle CRUD on a HandoverCase object
 *
 * @struts.action name="handoverCaseForm" path="/handoverCases" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="handoverCaseForm" path="/editHandoverCase" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="handoverCaseForm" path="/saveHandoverCase" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/handoverCaseForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/handoverCaseList.jsp"
 * @struts.action-forward name="search" path="/handoverCases.html" redirect="true"
 */
public final class HandoverCaseAction extends BaseAction {
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
        HandoverCaseForm handoverCaseForm = (HandoverCaseForm) form;

        // Exceptions are caught by ActionExceptionHandler
        HandoverCaseManager mgr = (HandoverCaseManager) getBean("handoverCaseManager");
        mgr.removeHandoverCase(handoverCaseForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("handoverCase.deleted"));

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

        HandoverCaseForm handoverCaseForm = (HandoverCaseForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (handoverCaseForm.getId() != null) {
            HandoverCaseManager mgr = (HandoverCaseManager) getBean("handoverCaseManager");
            HandoverCase handoverCase = mgr.getHandoverCase(handoverCaseForm.getId());
            handoverCaseForm = (HandoverCaseForm) convert(handoverCase);
            updateFormBean(mapping, request, handoverCaseForm);
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
        HandoverCaseForm handoverCaseForm = (HandoverCaseForm) form;
        boolean isNew = ("".equals(handoverCaseForm.getId()) || handoverCaseForm.getId() == null);

        HandoverCaseManager mgr = (HandoverCaseManager) getBean("handoverCaseManager");
        HandoverCase handoverCase = (HandoverCase) convert(handoverCaseForm);
        mgr.saveHandoverCase(handoverCase);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("handoverCase.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("handoverCase.updated"));
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

        HandoverCaseForm handoverCaseForm = (HandoverCaseForm) form;
        HandoverCase handoverCase = (HandoverCase) convert(handoverCaseForm);

        HandoverCaseManager mgr = (HandoverCaseManager) getBean("handoverCaseManager");
        request.setAttribute(Constants.HANDOVERCASE_LIST, mgr.getHandoverCases(handoverCase));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
