
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
import com.rosy.investigate.model.OtherCert;
import com.rosy.investigate.service.OtherCertManager;
import com.rosy.investigate.webapp.form.OtherCertForm;

/**
 * Action class to handle CRUD on a OtherCert object
 *
 * @struts.action name="otherCertForm" path="/otherCerts" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="otherCertForm" path="/editOtherCert" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="otherCertForm" path="/saveOtherCert" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/investigate/otherCertForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/investigate/otherCertList.jsp"
 * @struts.action-forward name="search" path="/otherCerts.html" redirect="true"
 */
public final class OtherCertAction extends BaseAction {
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
        OtherCertForm otherCertForm = (OtherCertForm) form;

        // Exceptions are caught by ActionExceptionHandler
        OtherCertManager mgr = (OtherCertManager) getBean("otherCertManager");
        mgr.removeOtherCert(otherCertForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("otherCert.deleted"));

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

        OtherCertForm otherCertForm = (OtherCertForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (otherCertForm.getId() != null) {
            OtherCertManager mgr = (OtherCertManager) getBean("otherCertManager");
            OtherCert otherCert = mgr.getOtherCert(otherCertForm.getId());
            otherCertForm = (OtherCertForm) convert(otherCert);
            updateFormBean(mapping, request, otherCertForm);
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
        OtherCertForm otherCertForm = (OtherCertForm) form;
        boolean isNew = ("".equals(otherCertForm.getId()) || otherCertForm.getId() == null);

        OtherCertManager mgr = (OtherCertManager) getBean("otherCertManager");
        OtherCert otherCert = (OtherCert) convert(otherCertForm);
        mgr.saveOtherCert(otherCert);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("otherCert.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("otherCert.updated"));
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

        OtherCertForm otherCertForm = (OtherCertForm) form;
        OtherCert otherCert = (OtherCert) convert(otherCertForm);

        OtherCertManager mgr = (OtherCertManager) getBean("otherCertManager");
        request.setAttribute(Constants.OTHERCERT_LIST, mgr.getOtherCerts(otherCert));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
