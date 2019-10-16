package com.liferay.cm.panel.portlet;

import com.liferay.cm.panel.constants.ContractmanagementPanelPortletKeys;

import com.liferay.cm.service.StatusLocalService;
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
		"com.liferay.portlet.add-default-resource=true",
		"com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.layout-cacheable=true",
		"com.liferay.portlet.private-request-attributes=false",
		"com.liferay.portlet.private-session-attributes=false",
		"com.liferay.portlet.render-weight=50",
		"com.liferay.portlet.use-default-template=true",
		"javax.portlet.display-name=ContractmanagmentStatusPanel",
		"javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/status/view.jsp",
		"javax.portlet.name=" + ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTSTATUSPORTLET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supports.mime-type=text/html"
	},
	service = Portlet.class
)
public class ContractmanagementStatusPanelPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		//renderRequest.setAttribute("contractPermissionChecker",_ContractPermissionChecker);
		//renderRequest.setAttribute("toplevel", ContractPermissionChecker.TOP_LEVEL_RESOURCE);
		renderRequest.setAttribute("statusCount", _StatusService.getStatusesCount());
		renderRequest.setAttribute("statuses",_StatusService.getStatuses(0,10));


		super.doView(renderRequest,renderResponse);
	}


	@Reference
	protected StatusLocalService _StatusService;
}