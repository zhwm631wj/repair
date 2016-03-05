
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
import com.rosy.punish.model.AffixToPunish;
import com.rosy.punish.service.AffixToPunishManager;
import com.rosy.punish.webapp.form.AffixToPunishForm;

/**
 * Action class to handle CRUD on a AffixToPunish object
 *
 * @struts.action name="affixToPunishForm" path="/affixToPunishs" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="affixToPunishForm" path="/editAffixToPunish" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="affixToPunishForm" path="/saveAffixToPunish" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/affixToPunishForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/affixToPunishList.jsp"
 * @struts.action-forward name="search" path="/affixToPunishs.html" redirect="true"
 */
public final class AffixToPunishAction extends BaseAction {
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
        AffixToPunishForm affixToPunishForm = (AffixToPunishForm) form;

        // Exceptions are caught by ActionExceptionHandler
        AffixToPunishManager mgr = (AffixToPunishManager) getBean("affixToPunishManager");
        mgr.removeAffixToPunish(affixToPunishForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("affixToPunish.deleted"));

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

        AffixToPunishForm affixToPunishForm = (AffixToPunishForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (affixToPunishForm.getId() != null) {
            AffixToPunishManager mgr = (AffixToPunishManager) getBean("affixToPunishManager");
            AffixToPunish affixToPunish = mgr.getAffixToPunish(affixToPunishForm.getId());
            affixToPunishForm = (AffixToPunishForm) convert(affixToPunish);
            updateFormBean(mapping, request, affixToPunishForm);
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
        AffixToPunishForm affixToPunishForm = (AffixToPunishForm) form;
        boolean isNew = ("".equals(affixToPunishForm.getId()) || affixToPunishForm.getId() == null);

        AffixToPunishManager mgr = (AffixToPunishManager) getBean("affixToPunishManager");
        AffixToPunish affixToPunish = (AffixToPunish) convert(affixToPunishForm);
        mgr.saveAffixToPunish(affixToPunish);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("affixToPunish.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("affixToPunish.updated"));
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

        AffixToPunishForm affixToPunishForm = (AffixToPunishForm) form;
        AffixToPunish affixToPunish = (AffixToPunish) convert(affixToPunishForm);

        AffixToPunishManager mgr = (AffixToPunishManager) getBean("affixToPunishManager");
        request.setAttribute(Constants.AFFIXTOPUNISH_LIST, mgr.getAffixToPunishs(affixToPunish));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
