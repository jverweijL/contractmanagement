package com.liferay.cm.web.portlet.actions;

import com.liferay.cm.model.Contract;
import com.liferay.cm.service.ContractLocalService;
import com.liferay.cm.web.constants.ContractmanagementPortletKeys;
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
                "javax.portlet.name=" + ContractmanagementPortletKeys.CONTRACTMANAGEMENT,
                "mvc.command.name=/contract/delete"
        },
        service = MVCActionCommand.class
)
public class ContractDeleteMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(
            ActionRequest actionRequest, ActionResponse actionResponse)
            throws PortletException {

        _handleActionCommand(actionRequest);

        return true;
    }

    private void _handleActionCommand(ActionRequest actionRequest) {
        //TODO validate access and exists
        Long contractId = ParamUtil.getLong(actionRequest, "contractId", 0);

        System.out.println("contractId: " + contractId);
        try {
            Contract contract = _ContractLocalService.deleteContract(contractId);
        } catch (PortalException e) {
            e.printStackTrace();
        }
    }

    @Reference
    protected ContractLocalService _ContractLocalService;

    private static final Log _log = LogFactoryUtil.getLog(
            ContractDeleteMVCActionCommand.class);

}
