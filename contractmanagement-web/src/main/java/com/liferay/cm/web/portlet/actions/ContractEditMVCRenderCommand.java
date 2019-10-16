package com.liferay.cm.web.portlet.actions;

import com.liferay.cm.model.Contract;
import com.liferay.cm.model.Type;
import com.liferay.cm.service.ContractLocalService;
import com.liferay.cm.service.StatusLocalService;
import com.liferay.cm.service.TermLocalService;
import com.liferay.cm.service.TypeLocalService;
import com.liferay.cm.web.constants.ContractmanagementPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + ContractmanagementPortletKeys.CONTRACTMANAGEMENT,
                "mvc.command.name=/contract/edit"
        },
        service = MVCRenderCommand.class
)
public class ContractEditMVCRenderCommand implements MVCRenderCommand {

    @Override
    public String render(
            RenderRequest renderRequest, RenderResponse renderResponse)
            throws PortletException {

        try {
            ServiceContext serviceContext= ServiceContextFactory.getInstance(renderRequest);
            renderRequest.setAttribute("types",_TypeLocalService.getTypesByGroupId(serviceContext.getScopeGroupId()));
            renderRequest.setAttribute("statuses",_StatusLocalService.getStatussByGroupId(serviceContext.getScopeGroupId()));
            renderRequest.setAttribute("terms",_TermLocalService.getTermsByGroupId(serviceContext.getScopeGroupId()));

            Long contractId = ParamUtil.getLong(renderRequest, "contractId", 0);
            Contract contract = _ContractLocalService.getContract(contractId);

            renderRequest.setAttribute("contract",contract);
        } catch (PortalException e) {
            e.printStackTrace();
        }

        return "/edit.jsp";
    }

    @Reference
    protected ContractLocalService _ContractLocalService;

    @Reference
    protected TypeLocalService _TypeLocalService;

    @Reference
    protected TermLocalService _TermLocalService;

    @Reference
    protected StatusLocalService _StatusLocalService;
}
