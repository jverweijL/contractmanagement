<%@ include file="/init.jsp" %>
<portlet:renderURL var="editEntryURL">
	<portlet:param name="mvcRenderCommandName" value="/blogs/edit_entry" />
	<portlet:param name="redirect" value="${currentURL} %>" />
</portlet:renderURL>

<div>
	<b><liferay-ui:message key="contractmanagement.caption"/></b><br/>

	<c:if test="${contractPermissionChecker.containsTopLevel(
		permissionChecker, groupId, 'ADD_CONTRACT')}">
		<aui:button href="<%= editEntryURL %>" icon="icon-plus" value="add-contract-entry" />
	</c:if>

	<c:choose>
		<c:when test="${contractPermissionChecker.containsTopLevel(
		permissionChecker, groupId, 'VIEW_CONTRACTS')}">
		<liferay-ui:search-container
				emptyResultsMessage="no-contracts"
				id="submissionEntries"
				iteratorURL="${portletURL}"
				total="${contractsCount}">

			<liferay-ui:search-container-results results="${contracts}" />

			<liferay-ui:search-container-row
					className="com.liferay.cm.model.Contract"
					modelVar="entry">
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

	<%--<c:if
			test="${assignmentPermissionChecker.contains(permissionChecker, scopeGroupId, assignment.assignmentId, 'DELETE')}">

		<portlet:actionURL name="<%=MVCCommandNames.DELETE_ASSIGNMENT %>" var="deleteAssignmentURL">
			<portlet:param name="redirect" value="${currentURL}" />
			<portlet:param name="assignmentId" value="${assignment.assignmentId}" />
		</portlet:actionURL>

		<liferay-ui:icon-delete url="${deleteAssignmentURL}" />
	</c:if>--%>

</div>