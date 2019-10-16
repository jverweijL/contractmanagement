<%@ include file="/init.jsp" %>

<liferay-portlet:actionURL name="/contractmanagement/status/edit" var="edit" />

<div class="container-fluid mt-1">
	<div class="row">
		<div class="col-sm">
			<aui:form name="fm" action="<%=edit%>" method="post">
				<aui:input name="statusId" type="hidden" value="${status.getStatusId()}"/>
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input label="status-name" name="name" type="text" value="${status.getName()}">
							<aui:validator name="required" errorMessage="status-name-required" />
						</aui:input>
						<aui:input label="status-description" name="description" type="textarea" value="${status.getDescription()}" />
					</aui:fieldset>
				</aui:fieldset-group>
				<aui:button-row>
					<aui:button name="submitButton" type="submit" value="Submit" />
				</aui:button-row>
			</aui:form>
		</div>
	</div>
</div>