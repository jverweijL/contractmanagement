<%@ include file="/init.jsp" %>

<liferay-portlet:actionURL name="/contractmanagement/type/edit" var="edit" />

<div class="container-fluid mt-1">
	<div class="row">
		<div class="col-sm">
			<aui:form name="fm" action="<%=edit%>" method="post">
				<aui:input name="typeId" type="hidden" value="${type.getTypeId()}"/>
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input label="type-name" name="name" type="text" value="${type.getName()}">
							<aui:validator name="required" errorMessage="type-name-required" />
						</aui:input>
						<aui:input label="type-description" name="description" type="textarea" value="${type.getDescription()}">
							<aui:validator name="maxLength" errorMessage="type-description-maxlength">4000</aui:validator>
						</aui:input>
					</aui:fieldset>
				</aui:fieldset-group>
				<aui:button-row>
					<aui:button name="submitButton" type="submit" value="Submit" />
				</aui:button-row>
			</aui:form>
		</div>
	</div>
</div>