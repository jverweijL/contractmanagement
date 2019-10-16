package com.liferay.cm.panel.portlet;

import com.liferay.cm.service.StatusLocalService;
import com.liferay.cm.service.TermLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.cm.panel.constants.ContractmanagementPanelPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
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
		"javax.portlet.display-name=ContractmanagmentTermPanel",
		"javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/term/view.jsp",
		"javax.portlet.name=" + ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTTERMPORTLET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supports.mime-type=text/html"
	},
	service = Portlet.class
)
public class ContractmanagementTermPanelPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		//TODO get data by groupID.
		//renderRequest.setAttribute("contractPermissionChecker",_ContractPermissionChecker);
		//renderRequest.setAttribute("toplevel", ContractPermissionChecker.TOP_LEVEL_RESOURCE);
		renderRequest.setAttribute("termCount", _TermService.getTermsCount());
		renderRequest.setAttribute("terms",_TermService.getTerms(0,10));


		super.doView(renderRequest,renderResponse);
	}


	@Reference
	protected TermLocalService _TermService;
}