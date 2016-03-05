
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
import com.rosy.register.model.PartyInfo;
import com.rosy.register.service.PartyInfoManager;
import com.rosy.register.webapp.form.PartyInfoForm;

/**
 * Action class to handle CRUD on a PartyInfo object
 *
 * @struts.action name="partyInfoForm" path="/partyInfos" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="partyInfoForm" path="/editPartyInfo" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="partyInfoForm" path="/savePartyInfo" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/register/partyInfoForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/register/partyInfoList.jsp"
 * @struts.action-forward name="search" path="/partyInfos.html" redirect="true"
 */
public final class PartyInfoAction extends BaseAction {
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
        PartyInfoForm partyInfoForm = (PartyInfoForm) form;

        // Exceptions are caught by ActionExceptionHandler
        PartyInfoManager mgr = (PartyInfoManager) getBean("partyInfoManager");
        mgr.removePartyInfo(partyInfoForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("partyInfo.deleted"));

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

        PartyInfoForm partyInfoForm = (PartyInfoForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (partyInfoForm.getId() != null) {
            PartyInfoManager mgr = (PartyInfoManager) getBean("partyInfoManager");
            PartyInfo partyInfo = mgr.getPartyInfo(partyInfoForm.getId());
            partyInfoForm = (PartyInfoForm) convert(partyInfo);
            updateFormBean(mapping, request, partyInfoForm);
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
        PartyInfoForm partyInfoForm = (PartyInfoForm) form;
        boolean isNew = ("".equals(partyInfoForm.getId()) || partyInfoForm.getId() == null);

        PartyInfoManager mgr = (PartyInfoManager) getBean("partyInfoManager");
        PartyInfo partyInfo = (PartyInfo) convert(partyInfoForm);
        mgr.savePartyInfo(partyInfo);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("partyInfo.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("partyInfo.updated"));
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

        PartyInfoForm partyInfoForm = (PartyInfoForm) form;
        PartyInfo partyInfo = (PartyInfo) convert(partyInfoForm);

        PartyInfoManager mgr = (PartyInfoManager) getBean("partyInfoManager");
        request.setAttribute(Constants.PARTYINFO_LIST, mgr.getPartyInfos(partyInfo));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
