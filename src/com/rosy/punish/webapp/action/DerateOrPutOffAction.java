
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
import com.rosy.punish.model.DerateOrPutOff;
import com.rosy.punish.service.DerateOrPutOffManager;
import com.rosy.punish.webapp.form.DerateOrPutOffForm;

/**
 * Action class to handle CRUD on a DerateOrPutOff object
 *
 * @struts.action name="derateOrPutOffForm" path="/derateOrPutOffs" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="derateOrPutOffForm" path="/editDerateOrPutOff" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="derateOrPutOffForm" path="/saveDerateOrPutOff" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/derateOrPutOffForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/derateOrPutOffList.jsp"
 * @struts.action-forward name="search" path="/derateOrPutOffs.html" redirect="true"
 */
public final class DerateOrPutOffAction extends BaseAction {
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
        DerateOrPutOffForm derateOrPutOffForm = (DerateOrPutOffForm) form;

        // Exceptions are caught by ActionExceptionHandler
        DerateOrPutOffManager mgr = (DerateOrPutOffManager) getBean("derateOrPutOffManager");
        mgr.removeDerateOrPutOff(derateOrPutOffForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("derateOrPutOff.deleted"));

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

        DerateOrPutOffForm derateOrPutOffForm = (DerateOrPutOffForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (derateOrPutOffForm.getId() != null) {
            DerateOrPutOffManager mgr = (DerateOrPutOffManager) getBean("derateOrPutOffManager");
            DerateOrPutOff derateOrPutOff = mgr.getDerateOrPutOff(derateOrPutOffForm.getId());
            derateOrPutOffForm = (DerateOrPutOffForm) convert(derateOrPutOff);
            updateFormBean(mapping, request, derateOrPutOffForm);
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
        DerateOrPutOffForm derateOrPutOffForm = (DerateOrPutOffForm) form;
        boolean isNew = ("".equals(derateOrPutOffForm.getId()) || derateOrPutOffForm.getId() == null);

        DerateOrPutOffManager mgr = (DerateOrPutOffManager) getBean("derateOrPutOffManager");
        DerateOrPutOff derateOrPutOff = (DerateOrPutOff) convert(derateOrPutOffForm);
        mgr.saveDerateOrPutOff(derateOrPutOff);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("derateOrPutOff.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("derateOrPutOff.updated"));
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

        DerateOrPutOffForm derateOrPutOffForm = (DerateOrPutOffForm) form;
        DerateOrPutOff derateOrPutOff = (DerateOrPutOff) convert(derateOrPutOffForm);

        DerateOrPutOffManager mgr = (DerateOrPutOffManager) getBean("derateOrPutOffManager");
        request.setAttribute(Constants.DERATEORPUTOFF_LIST, mgr.getDerateOrPutOffs(derateOrPutOff));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
