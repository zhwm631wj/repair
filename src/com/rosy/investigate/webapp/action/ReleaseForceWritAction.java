
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
import com.rosy.investigate.model.ReleaseForceWrit;
import com.rosy.investigate.service.ReleaseForceWritManager;
import com.rosy.investigate.webapp.form.ReleaseForceWritForm;

/**
 * Action class to handle CRUD on a ReleaseForceWrit object
 *
 * @struts.action name="releaseForceWritForm" path="/releaseForceWrits" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="releaseForceWritForm" path="/editReleaseForceWrit" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="releaseForceWritForm" path="/saveReleaseForceWrit" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/investigate/releaseForceWritForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/investigate/releaseForceWritList.jsp"
 * @struts.action-forward name="search" path="/releaseForceWrits.html" redirect="true"
 */
public final class ReleaseForceWritAction extends BaseAction {
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
        ReleaseForceWritForm releaseForceWritForm = (ReleaseForceWritForm) form;

        // Exceptions are caught by ActionExceptionHandler
        ReleaseForceWritManager mgr = (ReleaseForceWritManager) getBean("releaseForceWritManager");
        mgr.removeReleaseForceWrit(releaseForceWritForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("releaseForceWrit.deleted"));

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

        ReleaseForceWritForm releaseForceWritForm = (ReleaseForceWritForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (releaseForceWritForm.getId() != null) {
            ReleaseForceWritManager mgr = (ReleaseForceWritManager) getBean("releaseForceWritManager");
            ReleaseForceWrit releaseForceWrit = mgr.getReleaseForceWrit(releaseForceWritForm.getId());
            releaseForceWritForm = (ReleaseForceWritForm) convert(releaseForceWrit);
            updateFormBean(mapping, request, releaseForceWritForm);
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
        ReleaseForceWritForm releaseForceWritForm = (ReleaseForceWritForm) form;
        boolean isNew = ("".equals(releaseForceWritForm.getId()) || releaseForceWritForm.getId() == null);

        ReleaseForceWritManager mgr = (ReleaseForceWritManager) getBean("releaseForceWritManager");
        ReleaseForceWrit releaseForceWrit = (ReleaseForceWrit) convert(releaseForceWritForm);
        mgr.saveReleaseForceWrit(releaseForceWrit);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("releaseForceWrit.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("releaseForceWrit.updated"));
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

        ReleaseForceWritForm releaseForceWritForm = (ReleaseForceWritForm) form;
        ReleaseForceWrit releaseForceWrit = (ReleaseForceWrit) convert(releaseForceWritForm);

        ReleaseForceWritManager mgr = (ReleaseForceWritManager) getBean("releaseForceWritManager");
        request.setAttribute(Constants.RELEASEFORCEWRIT_LIST, mgr.getReleaseForceWrits(releaseForceWrit));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
