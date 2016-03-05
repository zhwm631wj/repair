
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
import com.rosy.investigate.model.CheckupProxy;
import com.rosy.investigate.service.CheckupProxyManager;
import com.rosy.investigate.webapp.form.CheckupProxyForm;

/**
 * Action class to handle CRUD on a CheckupProxy object
 *
 * @struts.action name="checkupProxyForm" path="/checkupProxys" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="checkupProxyForm" path="/editCheckupProxy" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="checkupProxyForm" path="/saveCheckupProxy" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/investigate/checkupProxyForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/investigate/checkupProxyList.jsp"
 * @struts.action-forward name="search" path="/checkupProxys.html" redirect="true"
 */
public final class CheckupProxyAction extends BaseAction {
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
        CheckupProxyForm checkupProxyForm = (CheckupProxyForm) form;

        // Exceptions are caught by ActionExceptionHandler
        CheckupProxyManager mgr = (CheckupProxyManager) getBean("checkupProxyManager");
        mgr.removeCheckupProxy(checkupProxyForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("checkupProxy.deleted"));

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

        CheckupProxyForm checkupProxyForm = (CheckupProxyForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (checkupProxyForm.getId() != null) {
            CheckupProxyManager mgr = (CheckupProxyManager) getBean("checkupProxyManager");
            CheckupProxy checkupProxy = mgr.getCheckupProxy(checkupProxyForm.getId());
            checkupProxyForm = (CheckupProxyForm) convert(checkupProxy);
            updateFormBean(mapping, request, checkupProxyForm);
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
        CheckupProxyForm checkupProxyForm = (CheckupProxyForm) form;
        boolean isNew = ("".equals(checkupProxyForm.getId()) || checkupProxyForm.getId() == null);

        CheckupProxyManager mgr = (CheckupProxyManager) getBean("checkupProxyManager");
        CheckupProxy checkupProxy = (CheckupProxy) convert(checkupProxyForm);
        mgr.saveCheckupProxy(checkupProxy);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("checkupProxy.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("checkupProxy.updated"));
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

        CheckupProxyForm checkupProxyForm = (CheckupProxyForm) form;
        CheckupProxy checkupProxy = (CheckupProxy) convert(checkupProxyForm);

        CheckupProxyManager mgr = (CheckupProxyManager) getBean("checkupProxyManager");
        request.setAttribute(Constants.CHECKUPPROXY_LIST, mgr.getCheckupProxys(checkupProxy));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
