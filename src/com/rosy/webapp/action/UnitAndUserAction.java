package com.rosy.webapp.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.rosy.webapp.action.BaseAction;
import com.rosy.Constants;
import com.rosy.model.ApcaOrganization;
import com.rosy.service.ApcaOrganizationManager;
import com.rosy.webapp.form.ApcaOrganizationForm;


public final class UnitAndUserAction extends BaseAction {
	
	private ApcaOrganizationManager mgr = (ApcaOrganizationManager) getBean("apcaOrganizationManager");
	
	public ActionForward cancel(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return mapping.findForward("search");
	}

	
	public ActionForward getUserUnit(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'user' method");
		}
		List<ApcaOrganization> firstUnit =mgr.getFirstUnit();
		for( ApcaOrganization apcaOrganization :firstUnit  ){
			apcaOrganization.getId();
			List<ApcaOrganization> secondUnit = mgr.getUnitByRank(apcaOrganization.getId());
		}

		return mapping.findForward("search");
	}

	public ActionForward edit(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'edit' method");
		}

		ApcaOrganizationForm apcaOrganizationForm = (ApcaOrganizationForm) form;

		// if an id is passed in, look up the user - otherwise
		// don't do anything - user is doing an add
		if (apcaOrganizationForm.getId() != null) {
			ApcaOrganization apcaOrganization = mgr
					.getApcaOrganization(apcaOrganizationForm.getId());
			apcaOrganizationForm = (ApcaOrganizationForm) convert(apcaOrganization);
			updateFormBean(mapping, request, apcaOrganizationForm);
		}

		return mapping.findForward("edit");
	}

	public ActionForward save(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'save' method");
		}

		// Extract attributes and parameters we will need
		ActionMessages messages = new ActionMessages();
		ApcaOrganizationForm apcaOrganizationForm = (ApcaOrganizationForm) form;
		boolean isNew = ("".equals(apcaOrganizationForm.getId()) || apcaOrganizationForm
				.getId() == null);


		ApcaOrganization apcaOrganization = (ApcaOrganization) convert(apcaOrganizationForm);
		mgr.saveApcaOrganization(apcaOrganization);

		// add success messages
		if (isNew) {
			messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"apcaOrganization.added"));
			// save messages in session to survive a redirect
			saveMessages(request.getSession(), messages);

			return mapping.findForward("search");
		} else {
			messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"apcaOrganization.updated"));
			saveMessages(request, messages);

			return mapping.findForward("edit");
		}
	}

	public ActionForward search(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("Entering 'search' method");
		}

		ApcaOrganizationForm apcaOrganizationForm = (ApcaOrganizationForm) form;
		ApcaOrganization apcaOrganization = (ApcaOrganization) convert(apcaOrganizationForm);


		request.setAttribute(Constants.APCAORGANIZATION_LIST, mgr
				.getApcaOrganizations(apcaOrganization));

		return mapping.findForward("list");
	}

	public ActionForward unspecified(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return search(mapping, form, request, response);
	}
}
