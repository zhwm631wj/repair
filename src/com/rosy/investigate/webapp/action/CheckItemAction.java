
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
import com.rosy.investigate.model.CheckItem;
import com.rosy.investigate.service.CheckItemManager;
import com.rosy.investigate.webapp.form.CheckItemForm;

/**
 * Action class to handle CRUD on a CheckItem object
 *
 * @struts.action name="checkItemForm" path="/checkItems" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="checkItemForm" path="/editCheckItem" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="checkItemForm" path="/saveCheckItem" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/investigate/checkItemForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/investigate/checkItemList.jsp"
 * @struts.action-forward name="search" path="/checkItems.html" redirect="true"
 */
public final class CheckItemAction extends BaseAction {
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
        CheckItemForm checkItemForm = (CheckItemForm) form;

        // Exceptions are caught by ActionExceptionHandler
        CheckItemManager mgr = (CheckItemManager) getBean("checkItemManager");
        mgr.removeCheckItem(checkItemForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("checkItem.deleted"));

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

        CheckItemForm checkItemForm = (CheckItemForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (checkItemForm.getId() != null) {
            CheckItemManager mgr = (CheckItemManager) getBean("checkItemManager");
            CheckItem checkItem = mgr.getCheckItem(checkItemForm.getId());
            checkItemForm = (CheckItemForm) convert(checkItem);
            updateFormBean(mapping, request, checkItemForm);
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
        CheckItemForm checkItemForm = (CheckItemForm) form;
        boolean isNew = ("".equals(checkItemForm.getId()) || checkItemForm.getId() == null);

        CheckItemManager mgr = (CheckItemManager) getBean("checkItemManager");
        CheckItem checkItem = (CheckItem) convert(checkItemForm);
        mgr.saveCheckItem(checkItem);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("checkItem.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("checkItem.updated"));
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

        CheckItemForm checkItemForm = (CheckItemForm) form;
        CheckItem checkItem = (CheckItem) convert(checkItemForm);

        CheckItemManager mgr = (CheckItemManager) getBean("checkItemManager");
        request.setAttribute(Constants.CHECKITEM_LIST, mgr.getCheckItems(checkItem));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
