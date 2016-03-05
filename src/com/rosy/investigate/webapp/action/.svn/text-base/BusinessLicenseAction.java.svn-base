
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
import com.rosy.investigate.model.BusinessLicense;
import com.rosy.investigate.service.BusinessLicenseManager;
import com.rosy.investigate.webapp.form.BusinessLicenseForm;

/**
 * Action class to handle CRUD on a BusinessLicense object
 *
 * @struts.action name="businessLicenseForm" path="/businessLicenses" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="businessLicenseForm" path="/editBusinessLicense" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="businessLicenseForm" path="/saveBusinessLicense" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/investigate/businessLicenseForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/investigate/businessLicenseList.jsp"
 * @struts.action-forward name="search" path="/businessLicenses.html" redirect="true"
 */
public final class BusinessLicenseAction extends BaseAction {
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
        BusinessLicenseForm businessLicenseForm = (BusinessLicenseForm) form;

        // Exceptions are caught by ActionExceptionHandler
        BusinessLicenseManager mgr = (BusinessLicenseManager) getBean("businessLicenseManager");
        mgr.removeBusinessLicense(businessLicenseForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("businessLicense.deleted"));

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

        BusinessLicenseForm businessLicenseForm = (BusinessLicenseForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (businessLicenseForm.getId() != null) {
            BusinessLicenseManager mgr = (BusinessLicenseManager) getBean("businessLicenseManager");
            BusinessLicense businessLicense = mgr.getBusinessLicense(businessLicenseForm.getId());
            businessLicenseForm = (BusinessLicenseForm) convert(businessLicense);
            updateFormBean(mapping, request, businessLicenseForm);
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
        BusinessLicenseForm businessLicenseForm = (BusinessLicenseForm) form;
        boolean isNew = ("".equals(businessLicenseForm.getId()) || businessLicenseForm.getId() == null);

        BusinessLicenseManager mgr = (BusinessLicenseManager) getBean("businessLicenseManager");
        BusinessLicense businessLicense = (BusinessLicense) convert(businessLicenseForm);
        mgr.saveBusinessLicense(businessLicense);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("businessLicense.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("businessLicense.updated"));
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

        BusinessLicenseForm businessLicenseForm = (BusinessLicenseForm) form;
        BusinessLicense businessLicense = (BusinessLicense) convert(businessLicenseForm);

        BusinessLicenseManager mgr = (BusinessLicenseManager) getBean("businessLicenseManager");
        request.setAttribute(Constants.BUSINESSLICENSE_LIST, mgr.getBusinessLicenses(businessLicense));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
