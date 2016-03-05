
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
import com.rosy.punish.model.DiscussCaseRec;
import com.rosy.punish.service.DiscussCaseRecManager;
import com.rosy.punish.webapp.form.DiscussCaseRecForm;

/**
 * Action class to handle CRUD on a DiscussCaseRec object
 *
 * @struts.action name="discussCaseRecForm" path="/discussCaseRecs" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="discussCaseRecForm" path="/editDiscussCaseRec" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="discussCaseRecForm" path="/saveDiscussCaseRec" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/discussCaseRecForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/discussCaseRecList.jsp"
 * @struts.action-forward name="search" path="/discussCaseRecs.html" redirect="true"
 */
public final class DiscussCaseRecAction extends BaseAction {
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
        DiscussCaseRecForm discussCaseRecForm = (DiscussCaseRecForm) form;

        // Exceptions are caught by ActionExceptionHandler
        DiscussCaseRecManager mgr = (DiscussCaseRecManager) getBean("discussCaseRecManager");
        mgr.removeDiscussCaseRec(discussCaseRecForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("discussCaseRec.deleted"));

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

        DiscussCaseRecForm discussCaseRecForm = (DiscussCaseRecForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (discussCaseRecForm.getId() != null) {
            DiscussCaseRecManager mgr = (DiscussCaseRecManager) getBean("discussCaseRecManager");
            DiscussCaseRec discussCaseRec = mgr.getDiscussCaseRec(discussCaseRecForm.getId());
            discussCaseRecForm = (DiscussCaseRecForm) convert(discussCaseRec);
            updateFormBean(mapping, request, discussCaseRecForm);
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
        DiscussCaseRecForm discussCaseRecForm = (DiscussCaseRecForm) form;
        boolean isNew = ("".equals(discussCaseRecForm.getId()) || discussCaseRecForm.getId() == null);

        DiscussCaseRecManager mgr = (DiscussCaseRecManager) getBean("discussCaseRecManager");
        DiscussCaseRec discussCaseRec = (DiscussCaseRec) convert(discussCaseRecForm);
        mgr.saveDiscussCaseRec(discussCaseRec);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("discussCaseRec.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("discussCaseRec.updated"));
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

        DiscussCaseRecForm discussCaseRecForm = (DiscussCaseRecForm) form;
        DiscussCaseRec discussCaseRec = (DiscussCaseRec) convert(discussCaseRecForm);

        DiscussCaseRecManager mgr = (DiscussCaseRecManager) getBean("discussCaseRecManager");
        request.setAttribute(Constants.DISCUSSCASEREC_LIST, mgr.getDiscussCaseRecs(discussCaseRec));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
