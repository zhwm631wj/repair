
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
import com.rosy.investigate.model.CheckProxyItem;
import com.rosy.investigate.service.CheckProxyItemManager;
import com.rosy.investigate.webapp.form.CheckProxyItemForm;

/**
 * Action class to handle CRUD on a CheckProxyItem object
 *
 * @struts.action name="checkProxyItemForm" path="/checkProxyItems" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="checkProxyItemForm" path="/editCheckProxyItem" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="checkProxyItemForm" path="/saveCheckProxyItem" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/investigate/checkProxyItemForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/investigate/checkProxyItemList.jsp"
 * @struts.action-forward name="search" path="/checkProxyItems.html" redirect="true"
 */
public final class CheckProxyItemAction extends BaseAction {
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
        CheckProxyItemForm checkProxyItemForm = (CheckProxyItemForm) form;

        // Exceptions are caught by ActionExceptionHandler
        CheckProxyItemManager mgr = (CheckProxyItemManager) getBean("checkProxyItemManager");
        mgr.removeCheckProxyItem(checkProxyItemForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("checkProxyItem.deleted"));

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

        CheckProxyItemForm checkProxyItemForm = (CheckProxyItemForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (checkProxyItemForm.getId() != null) {
            CheckProxyItemManager mgr = (CheckProxyItemManager) getBean("checkProxyItemManager");
            CheckProxyItem checkProxyItem = mgr.getCheckProxyItem(checkProxyItemForm.getId());
            checkProxyItemForm = (CheckProxyItemForm) convert(checkProxyItem);
            updateFormBean(mapping, request, checkProxyItemForm);
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
        CheckProxyItemForm checkProxyItemForm = (CheckProxyItemForm) form;
        boolean isNew = ("".equals(checkProxyItemForm.getId()) || checkProxyItemForm.getId() == null);

        CheckProxyItemManager mgr = (CheckProxyItemManager) getBean("checkProxyItemManager");
        CheckProxyItem checkProxyItem = (CheckProxyItem) convert(checkProxyItemForm);
        mgr.saveCheckProxyItem(checkProxyItem);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("checkProxyItem.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("checkProxyItem.updated"));
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

        CheckProxyItemForm checkProxyItemForm = (CheckProxyItemForm) form;
        CheckProxyItem checkProxyItem = (CheckProxyItem) convert(checkProxyItemForm);

        CheckProxyItemManager mgr = (CheckProxyItemManager) getBean("checkProxyItemManager");
        request.setAttribute(Constants.CHECKPROXYITEM_LIST, mgr.getCheckProxyItems(checkProxyItem));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
