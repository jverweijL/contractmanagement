package com.liferay.cm.panel.portlet.actions.status;

import com.liferay.cm.model.Status;
import com.liferay.cm.panel.constants.ContractmanagementPanelPortletKeys;
import com.liferay.cm.service.StatusLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.*;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTSTATUSPORTLET,
                "mvc.command.name=/contractmanagement/status/edit"
        },
        service = MVCActionCommand.class
)
public class ContractmanagementStatusEditMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(
            ActionRequest actionRequest, ActionResponse actionResponse)
            throws PortletException {

        _handleActionCommand(actionRequest);

        return true;
    }

    private void _handleActionCommand(ActionRequest actionRequest) {
        Long statusId = ParamUtil.getLong(actionRequest, "statusId", 0);
        String name = ParamUtil.get(actionRequest, "name", StringPool.BLANK);
        String description = ParamUtil.get(actionRequest, "description", StringPool.BLANK);

        try {
            ServiceContext serviceContext= ServiceContextFactory.getInstance(actionRequest);
            Status status;
            if (statusId == 0) {
                status = _StatusService.addStatus(serviceContext, name, description);
            } else {
                status = _StatusService.updateStatus(statusId,serviceContext,name,description);
            }
            System.out.println("name: " + name + "(" + status.getStatusId() + ")");
        } catch (PortalException e) {
            e.printStackTrace();
        }

        /*if (_log.isInfoEnabled()) {
            _log.info("Hello " + name);
        }

        String greetingMessage = "Hello " + name + "! Welcome to OSGi";

        actionRequest.setAttribute("GREETER_MESSAGE", greetingMessage);

        SessionMessages.add(actionRequest, "greetingMessage", greetingMessage);*/
    }

    @Reference
    protected StatusLocalService _StatusService;

    private static final Log _log = LogFactoryUtil.getLog(
            ContractmanagementStatusEditMVCActionCommand.class);

}
