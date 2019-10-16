package com.liferay.cm.web.portlet.actions;

import com.liferay.cm.model.Contract;
import com.liferay.cm.service.ContractLocalService;
import com.liferay.cm.web.constants.ContractmanagementPortletKeys;
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
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + ContractmanagementPortletKeys.CONTRACTMANAGEMENT,
                "mvc.command.name=/contract/edit"
        },
        service = MVCActionCommand.class
)
public class ContractEditMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(
            ActionRequest actionRequest, ActionResponse actionResponse)
            throws PortletException {

        _handleActionCommand(actionRequest);

        return true;
    }

    private void _handleActionCommand(ActionRequest actionRequest) {
        Calendar today = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Long contractId = ParamUtil.getLong(actionRequest, "contractId", 0);
        String name = ParamUtil.get(actionRequest, "name", StringPool.BLANK);
        String remarks = ParamUtil.get(actionRequest, "remarks", StringPool.BLANK);
        Boolean autoextend = ParamUtil.getBoolean(actionRequest,"autoextend",false);
        Date startdate = ParamUtil.getDate(actionRequest,"startdate",sdf,today.getTime());
        today.add(Calendar.YEAR,1);
        Date reviewdate = ParamUtil.getDate(actionRequest,"reviewdate",sdf,today.getTime());
        Long statusid = ParamUtil.getLong(actionRequest,"status",0);
        Long termid = ParamUtil.getLong(actionRequest,"term",0);
        Long typeid = ParamUtil.getLong(actionRequest,"type",0);
        String version = ParamUtil.get(actionRequest, "version", StringPool.BLANK);

        try {
            ServiceContext serviceContext= ServiceContextFactory.getInstance(actionRequest);
            Contract contract;
            if (contractId == 0) {
                contract = _ContractLocalService.addContract(serviceContext,name,startdate,reviewdate,statusid,termid,typeid,version,remarks,autoextend);
            } else {
                contract = _ContractLocalService.updateContract(contractId,serviceContext,name,startdate,reviewdate,statusid,termid,typeid,version,remarks,autoextend);
            }
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
    protected ContractLocalService _ContractLocalService;

    private static final Log _log = LogFactoryUtil.getLog(
            ContractEditMVCActionCommand.class);

}
