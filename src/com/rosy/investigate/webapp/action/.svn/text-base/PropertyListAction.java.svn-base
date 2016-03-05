
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
import com.rosy.investigate.model.PropertyList;
import com.rosy.investigate.service.PropertyListManager;
import com.rosy.investigate.webapp.form.PropertyListForm;

/**
 * Action class to handle CRUD on a PropertyList object
 *
 * @struts.action name="propertyListForm" path="/propertyLists" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="propertyListForm" path="/editPropertyList" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="propertyListForm" path="/savePropertyList" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/investigate/propertyListForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/investigate/propertyListList.jsp"
 * @struts.action-forward name="search" path="/propertyLists.html" redirect="true"
 */
public final class PropertyListAction extends BaseAction {
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
        PropertyListForm propertyListForm = (PropertyListForm) form;

        // Exceptions are caught by ActionExceptionHandler
        PropertyListManager mgr = (PropertyListManager) getBean("propertyListManager");
        mgr.removePropertyList(propertyListForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("propertyList.deleted"));

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

        PropertyListForm propertyListForm = (PropertyListForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (propertyListForm.getId() != null) {
            PropertyListManager mgr = (PropertyListManager) getBean("propertyListManager");
            PropertyList propertyList = mgr.getPropertyList(propertyListForm.getId());
            propertyListForm = (PropertyListForm) convert(propertyList);
            updateFormBean(mapping, request, propertyListForm);
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
        PropertyListForm propertyListForm = (PropertyListForm) form;
        boolean isNew = ("".equals(propertyListForm.getId()) || propertyListForm.getId() == null);

        PropertyListManager mgr = (PropertyListManager) getBean("propertyListManager");
        PropertyList propertyList = (PropertyList) convert(propertyListForm);
        mgr.savePropertyList(propertyList);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("propertyList.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("propertyList.updated"));
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

        PropertyListForm propertyListForm = (PropertyListForm) form;
        PropertyList propertyList = (PropertyList) convert(propertyListForm);

        PropertyListManager mgr = (PropertyListManager) getBean("propertyListManager");
        request.setAttribute(Constants.PROPERTYLIST_LIST, mgr.getPropertyLists(propertyList));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
