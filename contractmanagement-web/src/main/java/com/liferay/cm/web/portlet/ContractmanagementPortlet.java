package com.liferay.cm.web.portlet;

import com.liferay.cm.service.ContractLocalService;
import com.liferay.cm.service.permission.ContractPermissionChecker;
import com.liferay.cm.web.constants.ContractmanagementPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


import java.io.IOException;

/**
 * @author jverweij
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.cm",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Contractmanagement",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ContractmanagementPortletKeys.CONTRACTMANAGEMENT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ContractmanagementPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		renderRequest.setAttribute("contractPermissionChecker",_ContractPermissionChecker);
		renderRequest.setAttribute("toplevel",ContractPermissionChecker.TOP_LEVEL_RESOURCE);
		renderRequest.setAttribute("contractsCount", _ContractService.getContractsCount());
		renderRequest.setAttribute("contracts",_ContractService.getContracts(0,10));

		super.doView(renderRequest,renderResponse);
	}

	@Reference
	protected ContractPermissionChecker _ContractPermissionChecker;

	@Reference
	protected ContractLocalService _ContractService;

}