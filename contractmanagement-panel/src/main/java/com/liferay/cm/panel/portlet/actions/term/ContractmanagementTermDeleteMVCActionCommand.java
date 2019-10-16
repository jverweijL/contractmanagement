package com.liferay.cm.panel.portlet.actions.term;

import com.liferay.cm.model.Term;
import com.liferay.cm.panel.constants.ContractmanagementPanelPortletKeys;
import com.liferay.cm.service.TermLocalService;
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
                "javax.portlet.name=" + ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTTERMPORTLET,
                "mvc.command.name=/contractmanagement/term/delete"
        },
        service = MVCActionCommand.class
)
public class ContractmanagementTermDeleteMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(
            ActionRequest actionRequest, ActionResponse actionResponse)
            throws PortletException {

        _handleActionCommand(actionRequest);

        return true;
    }

    private void _handleActionCommand(ActionRequest actionRequest) {
        //TODO validate access and exists
        Long termId = ParamUtil.getLong(actionRequest, "termId", 0);

        System.out.println("termID: " + termId);
        try {
            Term term = _TermService.deleteTerm(termId);
        } catch (PortalException e) {
            e.printStackTrace();
        }
    }

    @Reference
    protected TermLocalService _TermService;

    private static final Log _log = LogFactoryUtil.getLog(
            ContractmanagementTermDeleteMVCActionCommand.class);

}
