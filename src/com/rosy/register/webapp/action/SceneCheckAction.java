
package com.rosy.register.webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.rosy.webapp.action.BaseAction;
import com.rosy.Constants;
import com.rosy.register.model.SceneCheck;
import com.rosy.register.service.SceneCheckManager;
import com.rosy.register.webapp.form.SceneCheckForm;

/**
 * Action class to handle CRUD on a SceneCheck object
 *
 * @struts.action name="sceneCheckForm" path="/sceneChecks" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="sceneCheckForm" path="/editSceneCheck" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="sceneCheckForm" path="/saveSceneCheck" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/register/sceneCheckForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/register/sceneCheckList.jsp"
 * @struts.action-forward name="search" path="/sceneChecks.html" redirect="true"
 */
public final class SceneCheckAction extends BaseAction {
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
        SceneCheckForm sceneCheckForm = (SceneCheckForm) form;

        // Exceptions are caught by ActionExceptionHandler
        SceneCheckManager mgr = (SceneCheckManager) getBean("sceneCheckManager");
        mgr.removeSceneCheck(sceneCheckForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("sceneCheck.deleted"));

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

        SceneCheckForm sceneCheckForm = (SceneCheckForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (sceneCheckForm.getId() != null) {
            SceneCheckManager mgr = (SceneCheckManager) getBean("sceneCheckManager");
            SceneCheck sceneCheck = mgr.getSceneCheck(sceneCheckForm.getId());
            sceneCheckForm = (SceneCheckForm) convert(sceneCheck);
            updateFormBean(mapping, request, sceneCheckForm);
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
        SceneCheckForm sceneCheckForm = (SceneCheckForm) form;
        boolean isNew = ("".equals(sceneCheckForm.getId()) || sceneCheckForm.getId() == null);

        SceneCheckManager mgr = (SceneCheckManager) getBean("sceneCheckManager");
        SceneCheck sceneCheck = (SceneCheck) convert(sceneCheckForm);
        mgr.saveSceneCheck(sceneCheck);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("sceneCheck.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("sceneCheck.updated"));
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

        SceneCheckForm sceneCheckForm = (SceneCheckForm) form;
        SceneCheck sceneCheck = (SceneCheck) convert(sceneCheckForm);

        SceneCheckManager mgr = (SceneCheckManager) getBean("sceneCheckManager");
        request.setAttribute(Constants.SCENECHECK_LIST, mgr.getSceneChecks(sceneCheck));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
