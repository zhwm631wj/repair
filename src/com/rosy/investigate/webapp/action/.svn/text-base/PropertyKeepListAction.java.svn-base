
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
import com.rosy.investigate.model.PropertyKeepList;
import com.rosy.investigate.service.PropertyKeepListManager;
import com.rosy.investigate.webapp.form.PropertyKeepListForm;

/**
 * Action class to handle CRUD on a PropertyKeepList object
 *
 * @struts.action name="propertyKeepListForm" path="/propertyKeepLists" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="propertyKeepListForm" path="/editPropertyKeepList" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="propertyKeepListForm" path="/savePropertyKeepList" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/investigate/propertyKeepListForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/investigate/propertyKeepListList.jsp"
 * @struts.action-forward name="search" path="/propertyKeepLists.html" redirect="true"
 */
public final class PropertyKeepListAction extends BaseAction {
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
        PropertyKeepListForm propertyKeepListForm = (PropertyKeepListForm) form;

        // Exceptions are caught by ActionExceptionHandler
        PropertyKeepListManager mgr = (PropertyKeepListManager) getBean("propertyKeepListManager");
        mgr.removePropertyKeepList(propertyKeepListForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("propertyKeepList.deleted"));

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

        PropertyKeepListForm propertyKeepListForm = (PropertyKeepListForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (propertyKeepListForm.getId() != null) {
            PropertyKeepListManager mgr = (PropertyKeepListManager) getBean("propertyKeepListManager");
            PropertyKeepList propertyKeepList = mgr.getPropertyKeepList(propertyKeepListForm.getId());
            propertyKeepListForm = (PropertyKeepListForm) convert(propertyKeepList);
            updateFormBean(mapping, request, propertyKeepListForm);
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
        PropertyKeepListForm propertyKeepListForm = (PropertyKeepListForm) form;
        boolean isNew = ("".equals(propertyKeepListForm.getId()) || propertyKeepListForm.getId() == null);

        PropertyKeepListManager mgr = (PropertyKeepListManager) getBean("propertyKeepListManager");
        PropertyKeepList propertyKeepList = (PropertyKeepList) convert(propertyKeepListForm);
        mgr.savePropertyKeepList(propertyKeepList);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("propertyKeepList.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("propertyKeepList.updated"));
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

        PropertyKeepListForm propertyKeepListForm = (PropertyKeepListForm) form;
        PropertyKeepList propertyKeepList = (PropertyKeepList) convert(propertyKeepListForm);

        PropertyKeepListManager mgr = (PropertyKeepListManager) getBean("propertyKeepListManager");
        request.setAttribute(Constants.PROPERTYKEEPLIST_LIST, mgr.getPropertyKeepLists(propertyKeepList));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
