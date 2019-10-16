package com.liferay.cm.panel.portlet.actions.term;

import com.liferay.cm.model.Term;
import com.liferay.cm.panel.constants.ContractmanagementPanelPortletKeys;
import com.liferay.cm.service.TermLocalService;
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
                "javax.portlet.name=" + ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTTERMPORTLET,
                "mvc.command.name=/contractmanagement/term/edit"
        },
        service = MVCRenderCommand.class
)
public class ContractmanagementTermEditMVCRenderCommand implements MVCRenderCommand {

    @Override
    public String render(
            RenderRequest renderRequest, RenderResponse renderResponse)
            throws PortletException {

        System.out.println("render term edit");

        try {
            Long termId = ParamUtil.getLong(renderRequest, "termId", 0);
            Term term = _TermService.getTerm(termId);
            renderRequest.setAttribute("term",term);
        } catch (PortalException e) {
            e.printStackTrace();
        }

        System.out.println("render term edit end");
        return "/term/edit.jsp";
    }

    @Reference
    protected TermLocalService _TermService;
}
