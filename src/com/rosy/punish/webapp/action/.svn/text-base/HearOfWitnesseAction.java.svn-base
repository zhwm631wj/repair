
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
import com.rosy.punish.model.HearOfWitnesse;
import com.rosy.punish.service.HearOfWitnesseManager;
import com.rosy.punish.webapp.form.HearOfWitnesseForm;

/**
 * Action class to handle CRUD on a HearOfWitnesse object
 *
 * @struts.action name="hearOfWitnesseForm" path="/hearOfWitnesses" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="hearOfWitnesseForm" path="/editHearOfWitnesse" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="hearOfWitnesseForm" path="/saveHearOfWitnesse" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/hearOfWitnesseForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/hearOfWitnesseList.jsp"
 * @struts.action-forward name="search" path="/hearOfWitnesses.html" redirect="true"
 */
public final class HearOfWitnesseAction extends BaseAction {
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
        HearOfWitnesseForm hearOfWitnesseForm = (HearOfWitnesseForm) form;

        // Exceptions are caught by ActionExceptionHandler
        HearOfWitnesseManager mgr = (HearOfWitnesseManager) getBean("hearOfWitnesseManager");
        mgr.removeHearOfWitnesse(hearOfWitnesseForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("hearOfWitnesse.deleted"));

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

        HearOfWitnesseForm hearOfWitnesseForm = (HearOfWitnesseForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (hearOfWitnesseForm.getId() != null) {
            HearOfWitnesseManager mgr = (HearOfWitnesseManager) getBean("hearOfWitnesseManager");
            HearOfWitnesse hearOfWitnesse = mgr.getHearOfWitnesse(hearOfWitnesseForm.getId());
            hearOfWitnesseForm = (HearOfWitnesseForm) convert(hearOfWitnesse);
            updateFormBean(mapping, request, hearOfWitnesseForm);
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
        HearOfWitnesseForm hearOfWitnesseForm = (HearOfWitnesseForm) form;
        boolean isNew = ("".equals(hearOfWitnesseForm.getId()) || hearOfWitnesseForm.getId() == null);

        HearOfWitnesseManager mgr = (HearOfWitnesseManager) getBean("hearOfWitnesseManager");
        HearOfWitnesse hearOfWitnesse = (HearOfWitnesse) convert(hearOfWitnesseForm);
        mgr.saveHearOfWitnesse(hearOfWitnesse);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("hearOfWitnesse.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("hearOfWitnesse.updated"));
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

        HearOfWitnesseForm hearOfWitnesseForm = (HearOfWitnesseForm) form;
        HearOfWitnesse hearOfWitnesse = (HearOfWitnesse) convert(hearOfWitnesseForm);

        HearOfWitnesseManager mgr = (HearOfWitnesseManager) getBean("hearOfWitnesseManager");
        request.setAttribute(Constants.HEAROFWITNESSE_LIST, mgr.getHearOfWitnesses(hearOfWitnesse));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
