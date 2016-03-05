
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
import com.rosy.punish.model.PerformCase;
import com.rosy.punish.service.PerformCaseManager;
import com.rosy.punish.webapp.form.PerformCaseForm;

/**
 * Action class to handle CRUD on a PerformCase object
 *
 * @struts.action name="performCaseForm" path="/performCases" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="performCaseForm" path="/editPerformCase" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="performCaseForm" path="/savePerformCase" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/performCaseForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/performCaseList.jsp"
 * @struts.action-forward name="search" path="/performCases.html" redirect="true"
 */
public final class PerformCaseAction extends BaseAction {
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
        PerformCaseForm performCaseForm = (PerformCaseForm) form;

        // Exceptions are caught by ActionExceptionHandler
        PerformCaseManager mgr = (PerformCaseManager) getBean("performCaseManager");
        mgr.removePerformCase(performCaseForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("performCase.deleted"));

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

        PerformCaseForm performCaseForm = (PerformCaseForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (performCaseForm.getId() != null) {
            PerformCaseManager mgr = (PerformCaseManager) getBean("performCaseManager");
            PerformCase performCase = mgr.getPerformCase(performCaseForm.getId());
            performCaseForm = (PerformCaseForm) convert(performCase);
            updateFormBean(mapping, request, performCaseForm);
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
        PerformCaseForm performCaseForm = (PerformCaseForm) form;
        boolean isNew = ("".equals(performCaseForm.getId()) || performCaseForm.getId() == null);

        PerformCaseManager mgr = (PerformCaseManager) getBean("performCaseManager");
        PerformCase performCase = (PerformCase) convert(performCaseForm);
        mgr.savePerformCase(performCase);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("performCase.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("performCase.updated"));
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

        PerformCaseForm performCaseForm = (PerformCaseForm) form;
        PerformCase performCase = (PerformCase) convert(performCaseForm);

        PerformCaseManager mgr = (PerformCaseManager) getBean("performCaseManager");
        request.setAttribute(Constants.PERFORMCASE_LIST, mgr.getPerformCases(performCase));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
