
package com.rosy.register.webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.rosy.webapp.action.BaseAction;
import com.rosy.Constants;
import com.rosy.register.model.PartySpokesman;
import com.rosy.register.service.PartySpokesmanManager;
import com.rosy.register.webapp.form.PartySpokesmanForm;

/**
 * Action class to handle CRUD on a PartySpokesman object
 *
 * @struts.action name="partySpokesmanForm" path="/partySpokesmans" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="partySpokesmanForm" path="/editPartySpokesman" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="partySpokesmanForm" path="/savePartySpokesman" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/register/partySpokesmanForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/register/partySpokesmanList.jsp"
 * @struts.action-forward name="search" path="/partySpokesmans.html" redirect="true"
 */
public final class PartySpokesmanAction extends BaseAction {
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
        PartySpokesmanForm partySpokesmanForm = (PartySpokesmanForm) form;

        // Exceptions are caught by ActionExceptionHandler
        PartySpokesmanManager mgr = (PartySpokesmanManager) getBean("partySpokesmanManager");
        mgr.removePartySpokesman(partySpokesmanForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("partySpokesman.deleted"));

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

        PartySpokesmanForm partySpokesmanForm = (PartySpokesmanForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (partySpokesmanForm.getId() != null) {
            PartySpokesmanManager mgr = (PartySpokesmanManager) getBean("partySpokesmanManager");
            PartySpokesman partySpokesman = mgr.getPartySpokesman(partySpokesmanForm.getId());
            partySpokesmanForm = (PartySpokesmanForm) convert(partySpokesman);
            updateFormBean(mapping, request, partySpokesmanForm);
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
        PartySpokesmanForm partySpokesmanForm = (PartySpokesmanForm) form;
        boolean isNew = ("".equals(partySpokesmanForm.getId()) || partySpokesmanForm.getId() == null);

        PartySpokesmanManager mgr = (PartySpokesmanManager) getBean("partySpokesmanManager");
        PartySpokesman partySpokesman = (PartySpokesman) convert(partySpokesmanForm);
        mgr.savePartySpokesman(partySpokesman);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("partySpokesman.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("partySpokesman.updated"));
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

        PartySpokesmanForm partySpokesmanForm = (PartySpokesmanForm) form;
        PartySpokesman partySpokesman = (PartySpokesman) convert(partySpokesmanForm);

        PartySpokesmanManager mgr = (PartySpokesmanManager) getBean("partySpokesmanManager");
        request.setAttribute(Constants.PARTYSPOKESMAN_LIST, mgr.getPartySpokesmans(partySpokesman));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
