
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
import com.rosy.register.model.InspectMarket;
import com.rosy.register.service.InspectMarketManager;
import com.rosy.register.webapp.form.InspectMarketForm;

/**
 * Action class to handle CRUD on a InspectMarket object
 *
 * @struts.action name="inspectMarketForm" path="/inspectMarkets" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="inspectMarketForm" path="/editInspectMarket" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="inspectMarketForm" path="/saveInspectMarket" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/register/inspectMarketForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/register/inspectMarketList.jsp"
 * @struts.action-forward name="search" path="/inspectMarkets.html" redirect="true"
 */
public final class InspectMarketAction extends BaseAction {
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
        InspectMarketForm inspectMarketForm = (InspectMarketForm) form;

        // Exceptions are caught by ActionExceptionHandler
        InspectMarketManager mgr = (InspectMarketManager) getBean("inspectMarketManager");
        mgr.removeInspectMarket(inspectMarketForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("inspectMarket.deleted"));

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

        InspectMarketForm inspectMarketForm = (InspectMarketForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (inspectMarketForm.getId() != null) {
            InspectMarketManager mgr = (InspectMarketManager) getBean("inspectMarketManager");
            InspectMarket inspectMarket = mgr.getInspectMarket(inspectMarketForm.getId());
            inspectMarketForm = (InspectMarketForm) convert(inspectMarket);
            updateFormBean(mapping, request, inspectMarketForm);
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
        InspectMarketForm inspectMarketForm = (InspectMarketForm) form;
        boolean isNew = ("".equals(inspectMarketForm.getId()) || inspectMarketForm.getId() == null);

        InspectMarketManager mgr = (InspectMarketManager) getBean("inspectMarketManager");
        InspectMarket inspectMarket = (InspectMarket) convert(inspectMarketForm);
        mgr.saveInspectMarket(inspectMarket);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("inspectMarket.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("inspectMarket.updated"));
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

        InspectMarketForm inspectMarketForm = (InspectMarketForm) form;
        InspectMarket inspectMarket = (InspectMarket) convert(inspectMarketForm);

        InspectMarketManager mgr = (InspectMarketManager) getBean("inspectMarketManager");
        request.setAttribute(Constants.INSPECTMARKET_LIST, mgr.getInspectMarkets(inspectMarket));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
