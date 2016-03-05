
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
import com.rosy.investigate.model.EnrolList;
import com.rosy.investigate.service.EnrolListManager;
import com.rosy.investigate.webapp.form.EnrolListForm;

/**
 * Action class to handle CRUD on a EnrolList object
 *
 * @struts.action name="enrolListForm" path="/enrolLists" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="enrolListForm" path="/editEnrolList" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="enrolListForm" path="/saveEnrolList" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/investigate/enrolListForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/investigate/enrolListList.jsp"
 * @struts.action-forward name="search" path="/enrolLists.html" redirect="true"
 */
public final class EnrolListAction extends BaseAction {
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
        EnrolListForm enrolListForm = (EnrolListForm) form;

        // Exceptions are caught by ActionExceptionHandler
        EnrolListManager mgr = (EnrolListManager) getBean("enrolListManager");
        mgr.removeEnrolList(enrolListForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("enrolList.deleted"));

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

        EnrolListForm enrolListForm = (EnrolListForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (enrolListForm.getId() != null) {
            EnrolListManager mgr = (EnrolListManager) getBean("enrolListManager");
            EnrolList enrolList = mgr.getEnrolList(enrolListForm.getId());
            enrolListForm = (EnrolListForm) convert(enrolList);
            updateFormBean(mapping, request, enrolListForm);
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
        EnrolListForm enrolListForm = (EnrolListForm) form;
        boolean isNew = ("".equals(enrolListForm.getId()) || enrolListForm.getId() == null);

        EnrolListManager mgr = (EnrolListManager) getBean("enrolListManager");
        EnrolList enrolList = (EnrolList) convert(enrolListForm);
        mgr.saveEnrolList(enrolList);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("enrolList.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("enrolList.updated"));
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

        EnrolListForm enrolListForm = (EnrolListForm) form;
        EnrolList enrolList = (EnrolList) convert(enrolListForm);

        EnrolListManager mgr = (EnrolListManager) getBean("enrolListManager");
        request.setAttribute(Constants.ENROLLIST_LIST, mgr.getEnrolLists(enrolList));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
