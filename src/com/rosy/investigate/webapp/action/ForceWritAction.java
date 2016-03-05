
package com.rosy.investigate.webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.rosy.webapp.action.BaseAction;
import com.rosy.Constants;
import com.rosy.investigate.model.ForceWrit;
import com.rosy.investigate.service.ForceWritManager;
import com.rosy.investigate.webapp.form.ForceWritForm;

/**
 * Action class to handle CRUD on a ForceWrit object
 *
 * @struts.action name="forceWritForm" path="/forceWrits" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="forceWritForm" path="/editForceWrit" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="forceWritForm" path="/saveForceWrit" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/investigate/forceWritForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/investigate/forceWritList.jsp"
 * @struts.action-forward name="search" path="/forceWrits.html" redirect="true"
 */
public final class ForceWritAction extends BaseAction {
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
        ForceWritForm forceWritForm = (ForceWritForm) form;

        // Exceptions are caught by ActionExceptionHandler
        ForceWritManager mgr = (ForceWritManager) getBean("forceWritManager");
        mgr.removeForceWrit(forceWritForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("forceWrit.deleted"));

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

        ForceWritForm forceWritForm = (ForceWritForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (forceWritForm.getId() != null) {
            ForceWritManager mgr = (ForceWritManager) getBean("forceWritManager");
            ForceWrit forceWrit = mgr.getForceWrit(forceWritForm.getId());
            forceWritForm = (ForceWritForm) convert(forceWrit);
            updateFormBean(mapping, request, forceWritForm);
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
        ForceWritForm forceWritForm = (ForceWritForm) form;
        boolean isNew = ("".equals(forceWritForm.getId()) || forceWritForm.getId() == null);

        ForceWritManager mgr = (ForceWritManager) getBean("forceWritManager");
        ForceWrit forceWrit = (ForceWrit) convert(forceWritForm);
        mgr.saveForceWrit(forceWrit);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("forceWrit.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("forceWrit.updated"));
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

        ForceWritForm forceWritForm = (ForceWritForm) form;
        ForceWrit forceWrit = (ForceWrit) convert(forceWritForm);

        ForceWritManager mgr = (ForceWritManager) getBean("forceWritManager");
        request.setAttribute(Constants.FORCEWRIT_LIST, mgr.getForceWrits(forceWrit));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
