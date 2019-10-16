package com.liferay.cm.panel.portlet.actions.type;

import com.liferay.cm.model.Type;
import com.liferay.cm.panel.constants.ContractmanagementPanelPortletKeys;
import com.liferay.cm.service.TypeLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTTYPEPORTLET,
                "mvc.command.name=/contractmanagement/type/delete"
        },
        service = MVCActionCommand.class
)
public class ContractmanagementTypeDeleteMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(
            ActionRequest actionRequest, ActionResponse actionResponse)
            throws PortletException {

        _handleActionCommand(actionRequest);

        return true;
    }

    private void _handleActionCommand(ActionRequest actionRequest) {
        //TODO validate access and exists
        Long typeId = ParamUtil.getLong(actionRequest, "typeId", 0);

        System.out.println("typeID: " + typeId);
        try {
            Type type = _TypeService.deleteType(typeId);
        } catch (PortalException e) {
            e.printStackTrace();
        }
    }

    @Reference
    protected TypeLocalService _TypeService;

    private static final Log _log = LogFactoryUtil.getLog(
            ContractmanagementTypeDeleteMVCActionCommand.class);

}
