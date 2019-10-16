package com.liferay.cm.panel.portlet.actions.term;

import com.liferay.cm.model.Term;
import com.liferay.cm.panel.constants.ContractmanagementPanelPortletKeys;
import com.liferay.cm.service.TermLocalService;
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
                "javax.portlet.name=" + ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTTERMPORTLET,
                "mvc.command.name=/contractmanagement/term/edit"
        },
        service = MVCActionCommand.class
)
public class ContractmanagementTermEditMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(
            ActionRequest actionRequest, ActionResponse actionResponse)
            throws PortletException {

        _handleActionCommand(actionRequest);

        return true;
    }

    private void _handleActionCommand(ActionRequest actionRequest) {
        Long termId = ParamUtil.getLong(actionRequest, "termId", 0);
        String name = ParamUtil.get(actionRequest, "name", StringPool.BLANK);
        String description = ParamUtil.get(actionRequest, "description", StringPool.BLANK);

        try {
            ServiceContext serviceContext= ServiceContextFactory.getInstance(actionRequest);
            Term term;
            if (termId == 0) {
                term = _TermService.addTerm(serviceContext, name, description);
            } else {
                term = _TermService.updateTerm(termId,serviceContext,name,description);
            }
            System.out.println("name: " + name + "(" + term.getTermId() + ")");
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
    protected TermLocalService _TermService;

    private static final Log _log = LogFactoryUtil.getLog(
            ContractmanagementTermEditMVCActionCommand.class);

}
