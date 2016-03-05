
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
import com.rosy.punish.model.PunishExamine;
import com.rosy.punish.service.PunishExamineManager;
import com.rosy.punish.webapp.form.PunishExamineForm;

/**
 * Action class to handle CRUD on a PunishExamine object
 *
 * @struts.action name="punishExamineForm" path="/punishExamines" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="punishExamineForm" path="/editPunishExamine" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="punishExamineForm" path="/savePunishExamine" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/punishExamineForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/punishExamineList.jsp"
 * @struts.action-forward name="search" path="/punishExamines.html" redirect="true"
 */
public final class PunishExamineAction extends BaseAction {
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
        PunishExamineForm punishExamineForm = (PunishExamineForm) form;

        // Exceptions are caught by ActionExceptionHandler
        PunishExamineManager mgr = (PunishExamineManager) getBean("punishExamineManager");
        mgr.removePunishExamine(punishExamineForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("punishExamine.deleted"));

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

        PunishExamineForm punishExamineForm = (PunishExamineForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (punishExamineForm.getId() != null) {
            PunishExamineManager mgr = (PunishExamineManager) getBean("punishExamineManager");
            PunishExamine punishExamine = mgr.getPunishExamine(punishExamineForm.getId());
            punishExamineForm = (PunishExamineForm) convert(punishExamine);
            updateFormBean(mapping, request, punishExamineForm);
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
        PunishExamineForm punishExamineForm = (PunishExamineForm) form;
        boolean isNew = ("".equals(punishExamineForm.getId()) || punishExamineForm.getId() == null);

        PunishExamineManager mgr = (PunishExamineManager) getBean("punishExamineManager");
        PunishExamine punishExamine = (PunishExamine) convert(punishExamineForm);
        mgr.savePunishExamine(punishExamine);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("punishExamine.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("punishExamine.updated"));
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

        PunishExamineForm punishExamineForm = (PunishExamineForm) form;
        PunishExamine punishExamine = (PunishExamine) convert(punishExamineForm);

        PunishExamineManager mgr = (PunishExamineManager) getBean("punishExamineManager");
        request.setAttribute(Constants.PUNISHEXAMINE_LIST, mgr.getPunishExamines(punishExamine));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
