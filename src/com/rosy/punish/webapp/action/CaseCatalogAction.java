
package com.rosy.punish.webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.rosy.webapp.action.BaseAction;
import com.rosy.Constants;
import com.rosy.punish.model.CaseCatalog;
import com.rosy.punish.service.CaseCatalogManager;
import com.rosy.punish.webapp.form.CaseCatalogForm;

/**
 * Action class to handle CRUD on a CaseCatalog object
 *
 * @struts.action name="caseCatalogForm" path="/caseCatalogs" scope="request"
 *  validate="false" parameter="method" input="mainMenu"
 * @struts.action name="caseCatalogForm" path="/editCaseCatalog" scope="request"
 *  validate="false" parameter="method" input="list"
 * @struts.action name="caseCatalogForm" path="/saveCaseCatalog" scope="request"
 *  validate="true" parameter="method" input="edit"
 * @struts.action-set-property property="cancellable" value="true"
 * @struts.action-forward name="edit" path="/WEB-INF/pages/punish/caseCatalogForm.jsp"
 * @struts.action-forward name="list" path="/WEB-INF/pages/punish/caseCatalogList.jsp"
 * @struts.action-forward name="search" path="/caseCatalogs.html" redirect="true"
 */
public final class CaseCatalogAction extends BaseAction {
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
        CaseCatalogForm caseCatalogForm = (CaseCatalogForm) form;

        // Exceptions are caught by ActionExceptionHandler
        CaseCatalogManager mgr = (CaseCatalogManager) getBean("caseCatalogManager");
        mgr.removeCaseCatalog(caseCatalogForm.getId());

        messages.add(ActionMessages.GLOBAL_MESSAGE,
                     new ActionMessage("caseCatalog.deleted"));

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

        CaseCatalogForm caseCatalogForm = (CaseCatalogForm) form;

        // if an id is passed in, look up the user - otherwise
        // don't do anything - user is doing an add
        if (caseCatalogForm.getId() != null) {
            CaseCatalogManager mgr = (CaseCatalogManager) getBean("caseCatalogManager");
            CaseCatalog caseCatalog = mgr.getCaseCatalog(caseCatalogForm.getId());
            caseCatalogForm = (CaseCatalogForm) convert(caseCatalog);
            updateFormBean(mapping, request, caseCatalogForm);
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
        CaseCatalogForm caseCatalogForm = (CaseCatalogForm) form;
        boolean isNew = ("".equals(caseCatalogForm.getId()) || caseCatalogForm.getId() == null);

        CaseCatalogManager mgr = (CaseCatalogManager) getBean("caseCatalogManager");
        CaseCatalog caseCatalog = (CaseCatalog) convert(caseCatalogForm);
        mgr.saveCaseCatalog(caseCatalog);

        // add success messages
        if (isNew) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("caseCatalog.added"));

            // save messages in session to survive a redirect
            saveMessages(request.getSession(), messages);

            return mapping.findForward("search");
        } else {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                         new ActionMessage("caseCatalog.updated"));
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

        CaseCatalogForm caseCatalogForm = (CaseCatalogForm) form;
        CaseCatalog caseCatalog = (CaseCatalog) convert(caseCatalogForm);

        CaseCatalogManager mgr = (CaseCatalogManager) getBean("caseCatalogManager");
        request.setAttribute(Constants.CASECATALOG_LIST, mgr.getCaseCatalogs(caseCatalog));

        return mapping.findForward("list");
    }
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
            throws Exception {
        return search(mapping, form, request, response);
    }
}
