<%@ include file="/init.jsp" %>
<liferay-portlet:actionURL name="/contract/delete" var="delete" />
<aui:form name="fm" action="<%=delete%>" method="post">
	<aui:input name="contractId" type="hidden"/>
</aui:form>

<portlet:renderURL var="editEntryURL">
	<portlet:param name="mvcRenderCommandName" value="/contract/edit" />
	<portlet:param name="redirect" value="${currentURL} %>" />
</portlet:renderURL>

<aui:script>
	window.deleteContract = function(contractId){
	$('input[name="<portlet:namespace/>contractId"]').val(contractId);
	$( "#<portlet:namespace/>fm" ).submit();
	}
</aui:script>

<div>
	<b><liferay-ui:message key="contractmanagement.caption"/></b><br/>

	<c:if test="${contractPermissionChecker.containsTopLevel(
		permissionChecker, groupId, 'ADD_CONTRACT')}">
		<aui:button href="<%= editEntryURL %>" icon="icon-plus" value="add-contract-entry" cssClass="mb-3"/>
	</c:if>

	<c:choose>
		<c:when test="${contractPermissionChecker.containsTopLevel(
		permissionChecker, groupId, 'VIEW_CONTRACTS')}">

			<liferay-ui:search-container
					emptyResultsMessage="no-contract"
					id="tcontractEntries"
					iteratorURL="${portletURL}"
					total="${contractsCount}">

				<liferay-ui:search-container-results results="${contracts}" />

				<liferay-ui:search-container-row
						className="com.liferay.cm.model.Contract"
						modelVar="entry">

					<liferay-ui:search-container-column-text name='contract-name' value="<%= entry.getName() %>" />
					<liferay-ui:search-container-column-text name='contract-status' value="" />
					<%--<liferay-ui:search-container-column-text name='term-description' value="<%= entry.getDescription() %>" />--%>
					<liferay-ui:search-container-column-text align="right">
						<div class="btn-group">
							<button aria-expanded="false" aria-haspopup="true" class="btn btn-monospaced btn-sm btn-secundary dropdown-toggle" data-toggle="dropdown" type="button">
								<clay:icon symbol="ellipsis-v" />
							</button>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="<%= editEntryURL %>&<portlet:namespace/>contractId=<%= entry.getContractId() %>">Edit</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="javascript:void(0)" onclick="deleteContract(<%= entry.getContractId() %>);">Delete</a>
							</div>
						</div>
					</liferay-ui:search-container-column-text>

				</liferay-ui:search-container-row>

				<liferay-ui:search-iterator markupView="lexicon" />

			</liferay-ui:search-container>

		</c:when>
		<c:otherwise>
			<clay:alert
					message="No Access!"
					style="danger"
					title="Error"
			/>
		</c:otherwise>
	</c:choose>
</div>