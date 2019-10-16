package com.liferay.cm.panel.application.list;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.cm.panel.constants.ContractmanagementPanelCategoryKeys;
import com.liferay.cm.panel.constants.ContractmanagementPanelPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author jverweij
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=101",
		"panel.category.key=" + ContractmanagementPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class ContractmanagementTermPanelPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTTERMPORTLET;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTTERMPORTLET + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}