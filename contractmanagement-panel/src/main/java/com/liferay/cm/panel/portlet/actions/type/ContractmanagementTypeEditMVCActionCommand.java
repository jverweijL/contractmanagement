package com.liferay.cm.panel.portlet.actions.type;

import com.liferay.cm.model.Type;
import com.liferay.cm.panel.constants.ContractmanagementPanelPortletKeys;
import com.liferay.cm.service.TypeLocalService;
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

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + ContractmanagementPanelPortletKeys.CONTRACTMANAGEMENTTYPEPORTLET,
                "mvc.command.name=/contractmanagement/type/edit"
        },
        service = MVCActionCommand.class
)
public class ContractmanagementTypeEditMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(
            ActionRequest actionRequest, ActionResponse actionResponse)
            throws PortletException {

        _handleActionCommand(actionRequest);

        return true;
    }

    private void _handleActionCommand(ActionRequest actionRequest) {
        Long typeId = ParamUtil.getLong(actionRequest, "typeId", 0);
        String name = ParamUtil.get(actionRequest, "name", StringPool.BLANK);
        String description = ParamUtil.get(actionRequest, "description", StringPool.BLANK);

        try {
            ServiceContext serviceContext= ServiceContextFactory.getInstance(actionRequest);
            Type type;
            if (typeId == 0) {
                type = _TypeService.addType(serviceContext, name, description);
            } else {
                type = _TypeService.updateType(typeId,serviceContext,name,description);
            }
            System.out.println("name: " + name + "(" + type.getTypeId() + ")");
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
    protected TypeLocalService _TypeService;

    private static final Log _log = LogFactoryUtil.getLog(
            ContractmanagementTypeEditMVCActionCommand.class);

}
