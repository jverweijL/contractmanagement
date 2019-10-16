package com.liferay.cm.panel.portlet.actions.type;

import com.liferay.cm.model.Type;
import com.liferay.cm.panel.constants.ContractmanagementPanelPortletKeys;
import com.liferay.cm.service.TypeLocalService;
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
                "javax.portlet.name=" + ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTTYPEPORTLET,
                "mvc.command.name=/contractmanagement/type/edit"
        },
        service = MVCRenderCommand.class
)
public class ContractmanagementTypeEditMVCRenderCommand implements MVCRenderCommand {

    @Override
    public String render(
            RenderRequest renderRequest, RenderResponse renderResponse)
            throws PortletException {

        System.out.println("render type edit");

        try {
            Long typeId = ParamUtil.getLong(renderRequest, "typeId", 0);
            Type type = _TypeService.getType(typeId);
            renderRequest.setAttribute("type",type);
        } catch (PortalException e) {
            e.printStackTrace();
        }

        System.out.println("render type edit end");
        return "/type/edit.jsp";
    }

    @Reference
    protected TypeLocalService _TypeService;
}
