<%@ include file="/init.jsp" %>

<%@ page import="java.util.Calendar" %>
<%@ page import="com.liferay.cm.model.Contract" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%
    Calendar today = Calendar.getInstance();
    Contract contract = (Contract)request.getAttribute("contract");
    int day, month, year;
    if (contract != null && contract.getStartdate() != null) {
        day = contract.getStartdate().getDate();
        month = contract.getStartdate().getMonth();
        year = contract.getStartdate().getYear()+1900;
    } else {
        day = today.get(Calendar.DAY_OF_MONTH);
        month = today.get(Calendar.MONTH);
        year = today.get(Calendar.YEAR);
    }

%>

<liferay-portlet:actionURL name="/contract/edit" var="edit" />

<div class="container-fluid mt-1">
    <div class="row">
        <div class="col-sm">
            <aui:form name="fm" action="<%=edit%>" method="post">
                <aui:input name="contractId" type="hidden" value="${contract.getContractId()}"/>
                <aui:fieldset-group markupView="lexicon">
                    <aui:fieldset>
                        <aui:input label="contract-name" name="name" type="text" value="${contract.getName()}">
                            <aui:validator name="required" errorMessage="contract-name-required" />
                        </aui:input>
                        <aui:input label="contract-version" name="version" type="text" value="${contract.getVersion()}">
                            <aui:validator name="required" errorMessage="contract-version-required" />
                        </aui:input>
                        <aui:select name="select-example" label="type-name">
                            <c:forEach items="${types}" var="type">
                                <aui:option value="${type.getTypeId()}">${type.getName()}</aui:option>
                            </c:forEach>
                        </aui:select>
                        <aui:select name="select-example" label="status-name">
                            <c:forEach items="${statuses}" var="status">
                                <aui:option value="${status.getStatusId()}">${status.getName()}</aui:option>
                            </c:forEach>
                        </aui:select>
                        <aui:select name="select-example" label="term-name">
                            <c:forEach items="${terms}" var="term">
                                <aui:option value="${term.getTermId()}">${term.getName()}</aui:option>
                            </c:forEach>
                        </aui:select>
                        <div class="form-group input-select-wrapper">
                            <label class="control-label" for="_com_reeleez_cm_web_ContractmanagementPortlet_select-example">
                                <%=LanguageUtil.get(locale,"contract-start-date")%>
                            </label>
                            <liferay-ui:input-date name="<portlet:namespace/>startdate" firstEnabledDate="<%=today.getTime()%>"
                                dayValue="<%=day%>" monthValue="<%=month%>" yearValue="<%=year%>" />
                        </div>
                        <div class="form-group input-select-wrapper">
                            <label class="control-label" for="_com_reeleez_cm_web_ContractmanagementPortlet_select-example">
                                <%=LanguageUtil.get(locale,"contract-review-date")%>
                            </label>
                            <!-- TODO: set review based on startdate and term -->
                            <liferay-ui:input-date name="<portlet:namespace/>reviewdate" firstEnabledDate="<%=today.getTime()%>"
                                dayValue="<%=day%>" monthValue="<%=month%>" yearValue="<%=year+1%>"
                                disabled="true"/>
                        </div>
                        <label class="toggle-switch">
                            <input class="toggle-switch-check" type="checkbox" />
                            <span class="toggle-switch-label">contract-auto-extend</span>
                            <span aria-hidden="true" class="toggle-switch-bar">
                            <span class="toggle-switch-handle" data-label-off="" data-label-on="ON">
                            </span>
                        </span>
                        </label>

                    </aui:fieldset>
                </aui:fieldset-group>
                <aui:button-row>
                    <aui:button name="submitButton" type="submit" value="Submit" />
                </aui:button-row>
            </aui:form>
        </div>
    </div>
</div>

