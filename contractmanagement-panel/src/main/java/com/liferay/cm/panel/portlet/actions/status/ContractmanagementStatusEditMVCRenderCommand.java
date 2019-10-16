package com.liferay.cm.panel.portlet.actions.status;

import com.liferay.cm.model.Status;
import com.liferay.cm.panel.constants.ContractmanagementPanelPortletKeys;
import com.liferay.cm.service.StatusLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTSTATUSPORTLET,
                "mvc.command.name=/contractmanagement/status/edit"
        },
        service = MVCRenderCommand.class
)
public class ContractmanagementStatusEditMVCRenderCommand implements MVCRenderCommand {

    @Override
    public String render(
            RenderRequest renderRequest, RenderResponse renderResponse)
            throws PortletException {

        try {
            Long statusId = ParamUtil.getLong(renderRequest, "statusId", 0);
            Status status = _StatusService.getStatus(statusId);
            renderRequest.setAttribute("status",status);
        } catch (PortalException e) {
            e.printStackTrace();
        }

        return "/status/edit.jsp";
    }

    @Reference
    protected StatusLocalService _StatusService;
}
