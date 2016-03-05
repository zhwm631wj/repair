
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
import com.rosy.investigate.model.ExamProceeding;
import com.rosy.investigate.service.ExamProceedingManager;
import com.rosy.investigate.webapp.form.ExamProceedingForm;

/**
 * Action class to handle CRUD on a ExamProceeding object
 *
 * @struts.action name="examProceedingForm" path="/examProceedings" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="examProceedingForm" path="/editExamProceeding" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="examProceedingForm" path="/saveExamProceeding" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/investigate/examProceedingForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/investigate/examProceedingList.jsp"
 * @struts.action-forward name="search" path="/examProceedings.html" redirect="true"
 */
public final class ExamProceedingAction extends BaseAction {
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
        ExamProceedingForm examProceedingForm = (ExamProceedingForm) form;

        // Exceptions are caught by ActionExceptionHandler
        ExamProceedingManager mgr = (ExamProceedingManager) getBean("examProceedingManager");
        mgr.removeExamProceeding(examProceedingForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("examProceeding.deleted"));

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

        ExamProceedingForm examProceedingForm = (ExamProceedingForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (examProceedingForm.getId() != null) {
            ExamProceedingManager mgr = (ExamProceedingManager) getBean("examProceedingManager");
            ExamProceeding examProceeding = mgr.getExamProceeding(examProceedingForm.getId());
            examProceedingForm = (ExamProceedingForm) convert(examProceeding);
            updateFormBean(mapping, request, examProceedingForm);
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
        ExamProceedingForm examProceedingForm = (ExamProceedingForm) form;
        boolean isNew = ("".equals(examProceedingForm.getId()) || examProceedingForm.getId() == null);

        ExamProceedingManager mgr = (ExamProceedingManager) getBean("examProceedingManager");
        ExamProceeding examProceeding = (ExamProceeding) convert(examProceedingForm);
        mgr.saveExamProceeding(examProceeding);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("examProceeding.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("examProceeding.updated"));
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

        ExamProceedingForm examProceedingForm = (ExamProceedingForm) form;
        ExamProceeding examProceeding = (ExamProceeding) convert(examProceedingForm);

        ExamProceedingManager mgr = (ExamProceedingManager) getBean("examProceedingManager");
        request.setAttribute(Constants.EXAMPROCEEDING_LIST, mgr.getExamProceedings(examProceeding));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
