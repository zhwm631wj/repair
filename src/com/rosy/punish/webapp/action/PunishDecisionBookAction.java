
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
import com.rosy.punish.model.PunishDecisionBook;
import com.rosy.punish.service.PunishDecisionBookManager;
import com.rosy.punish.webapp.form.PunishDecisionBookForm;

/**
 * Action class to handle CRUD on a PunishDecisionBook object
 *
 * @struts.action name="punishDecisionBookForm" path="/punishDecisionBooks" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="punishDecisionBookForm" path="/editPunishDecisionBook" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="punishDecisionBookForm" path="/savePunishDecisionBook" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/punishDecisionBookForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/punishDecisionBookList.jsp"
 * @struts.action-forward name="search" path="/punishDecisionBooks.html" redirect="true"
 */
public final class PunishDecisionBookAction extends BaseAction {
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
        PunishDecisionBookForm punishDecisionBookForm = (PunishDecisionBookForm) form;

        // Exceptions are caught by ActionExceptionHandler
        PunishDecisionBookManager mgr = (PunishDecisionBookManager) getBean("punishDecisionBookManager");
        mgr.removePunishDecisionBook(punishDecisionBookForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("punishDecisionBook.deleted"));

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

        PunishDecisionBookForm punishDecisionBookForm = (PunishDecisionBookForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (punishDecisionBookForm.getId() != null) {
            PunishDecisionBookManager mgr = (PunishDecisionBookManager) getBean("punishDecisionBookManager");
            PunishDecisionBook punishDecisionBook = mgr.getPunishDecisionBook(punishDecisionBookForm.getId());
            punishDecisionBookForm = (PunishDecisionBookForm) convert(punishDecisionBook);
            updateFormBean(mapping, request, punishDecisionBookForm);
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
        PunishDecisionBookForm punishDecisionBookForm = (PunishDecisionBookForm) form;
        boolean isNew = ("".equals(punishDecisionBookForm.getId()) || punishDecisionBookForm.getId() == null);

        PunishDecisionBookManager mgr = (PunishDecisionBookManager) getBean("punishDecisionBookManager");
        PunishDecisionBook punishDecisionBook = (PunishDecisionBook) convert(punishDecisionBookForm);
        mgr.savePunishDecisionBook(punishDecisionBook);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("punishDecisionBook.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("punishDecisionBook.updated"));
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

        PunishDecisionBookForm punishDecisionBookForm = (PunishDecisionBookForm) form;
        PunishDecisionBook punishDecisionBook = (PunishDecisionBook) convert(punishDecisionBookForm);

        PunishDecisionBookManager mgr = (PunishDecisionBookManager) getBean("punishDecisionBookManager");
        request.setAttribute(Constants.PUNISHDECISIONBOOK_LIST, mgr.getPunishDecisionBooks(punishDecisionBook));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
