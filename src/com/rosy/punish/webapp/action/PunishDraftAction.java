
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
import com.rosy.punish.model.PunishDraft;
import com.rosy.punish.service.PunishDraftManager;
import com.rosy.punish.webapp.form.PunishDraftForm;

/**
 * Action class to handle CRUD on a PunishDraft object
 *
 * @struts.action name="punishDraftForm" path="/punishDrafts" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="punishDraftForm" path="/editPunishDraft" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="punishDraftForm" path="/savePunishDraft" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/punishDraftForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/punishDraftList.jsp"
 * @struts.action-forward name="search" path="/punishDrafts.html" redirect="true"
 */
public final class PunishDraftAction extends BaseAction {
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
        PunishDraftForm punishDraftForm = (PunishDraftForm) form;

        // Exceptions are caught by ActionExceptionHandler
        PunishDraftManager mgr = (PunishDraftManager) getBean("punishDraftManager");
        mgr.removePunishDraft(punishDraftForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("punishDraft.deleted"));

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

        PunishDraftForm punishDraftForm = (PunishDraftForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (punishDraftForm.getId() != null) {
            PunishDraftManager mgr = (PunishDraftManager) getBean("punishDraftManager");
            PunishDraft punishDraft = mgr.getPunishDraft(punishDraftForm.getId());
            punishDraftForm = (PunishDraftForm) convert(punishDraft);
            updateFormBean(mapping, request, punishDraftForm);
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
        PunishDraftForm punishDraftForm = (PunishDraftForm) form;
        boolean isNew = ("".equals(punishDraftForm.getId()) || punishDraftForm.getId() == null);

        PunishDraftManager mgr = (PunishDraftManager) getBean("punishDraftManager");
        PunishDraft punishDraft = (PunishDraft) convert(punishDraftForm);
        mgr.savePunishDraft(punishDraft);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("punishDraft.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("punishDraft.updated"));
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

        PunishDraftForm punishDraftForm = (PunishDraftForm) form;
        PunishDraft punishDraft = (PunishDraft) convert(punishDraftForm);

        PunishDraftManager mgr = (PunishDraftManager) getBean("punishDraftManager");
        request.setAttribute(Constants.PUNISHDRAFT_LIST, mgr.getPunishDrafts(punishDraft));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
