package com.liferay.cm.panel.application.list;

import com.liferay.cm.panel.constants.ContractmanagementPanelCategoryKeys;
import com.liferay.cm.panel.constants.ContractmanagementPanelPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author jverweij
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + ContractmanagementPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class ContractmanagementStatusPanelPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTSTATUSPORTLET;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTSTATUSPORTLET + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}