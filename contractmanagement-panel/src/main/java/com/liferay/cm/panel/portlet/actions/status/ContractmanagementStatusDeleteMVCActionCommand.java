package com.liferay.cm.panel.portlet.actions.status;

import com.liferay.cm.model.Status;
import com.liferay.cm.panel.constants.ContractmanagementPanelPortletKeys;
import com.liferay.cm.service.StatusLocalService;
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
                "javax.portlet.name=" + ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTSTATUSPORTLET,
                "mvc.command.name=/contractmanagement/status/delete"
        },
        service = MVCActionCommand.class
)
public class ContractmanagementStatusDeleteMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(
            ActionRequest actionRequest, ActionResponse actionResponse)
            throws PortletException {

        _handleActionCommand(actionRequest);

        return true;
    }

    private void _handleActionCommand(ActionRequest actionRequest) {
        //TODO validate access and exists
        Long statusId = ParamUtil.getLong(actionRequest, "statusId", 0);

        System.out.println("statusID: " + statusId);
        try {
            Status status = _StatusService.deleteStatus(statusId);
        } catch (PortalException e) {
            e.printStackTrace();
        }
    }

    @Reference
    protected StatusLocalService _StatusService;

    private static final Log _log = LogFactoryUtil.getLog(
            ContractmanagementStatusDeleteMVCActionCommand.class);

}
