<%@ include file="/init.jsp" %>

<liferay-portlet:actionURL name="/contractmanagement/term/edit" var="edit" />

<div class="container-fluid mt-1">
	<div class="row">
		<div class="col-sm">
			<aui:form name="fm" action="<%=edit%>" method="post">
				<aui:input name="termId" type="hidden" value="${term.getTermId()}"/>
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input label="term-name" name="name" type="text" value="${term.getName()}">
							<aui:validator name="required" errorMessage="status-name-required" />
						</aui:input>
						<aui:input label="term-description" name="description" type="textarea" value="${term.getDescription()}" />
					</aui:fieldset>
				</aui:fieldset-group>
				<aui:button-row>
					<aui:button name="submitButton" type="submit" value="Submit" />
				</aui:button-row>
			</aui:form>
		</div>
	</div>
</div>