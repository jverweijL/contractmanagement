<%@ include file="/init.jsp" %>
<liferay-portlet:actionURL name="/contractmanagement/status/delete" var="delete" />
<aui:form name="fm" action="<%=delete%>" method="post">
	<aui:input name="statusId" type="hidden"/>
</aui:form>

<portlet:renderURL var="editEntryURL">
	<portlet:param name="mvcRenderCommandName" value="/contractmanagement/status/edit" />
	<portlet:param name="redirect" value="${currentURL} %>" />
</portlet:renderURL>

<aui:script>
	window.deleteStatus = function(statusId){
		$('input[name="<portlet:namespace/>statusId"]').val(statusId);
		$( "#<portlet:namespace/>fm" ).submit();
	}
</aui:script>

<%--<c:out value="${statusCount}"/>--%>


<div class="container-fluid mt-3">
	<div class="row">
		<div class="col-sm">
			<aui:button href="<%= editEntryURL %>" icon="icon-plus" value="add-status-entry" cssClass="mb-3" />

			<liferay-ui:search-container
					emptyResultsMessage="no-status"
					id="statusEntries"
					iteratorURL="${portletURL}"
					total="${statusCount}">

				<liferay-ui:search-container-results results="${statuses}" />

					<liferay-ui:search-container-row
							className="com.liferay.cm.model.Status"
							modelVar="entry">

						<liferay-ui:search-container-column-text name='status-name' value="<%= entry.getName() %>" />
						<liferay-ui:search-container-column-text name='status-description' value="<%= entry.getDescription() %>" />
						<%--<liferay-ui:search-container-column-jsp	align="right" path="<%=renderRequest.getContextPath() + "/status/tools.jsp"%>"/>--%>
						<liferay-ui:search-container-column-text>
							<div class="btn-group">
								<button aria-expanded="false" aria-haspopup="true" class="btn btn-monospaced btn-sm btn-secundary dropdown-toggle" data-toggle="dropdown" type="button">
									<clay:icon symbol="ellipsis-v" />
								</button>
								<div class="dropdown-menu">
									<a class="dropdown-item" href="<%= editEntryURL %>&<portlet:namespace/>statusId=<%= entry.getStatusId() %>">Edit</a>
									<div class="dropdown-divider"></div>
									<a class="dropdown-item" href="javascript:void(0)" onclick="deleteStatus(<%= entry.getStatusId() %>);">Delete</a>
								</div>
							</div>
						</liferay-ui:search-container-column-text>

					</liferay-ui:search-container-row>

				<liferay-ui:search-iterator markupView="lexicon" />

			</liferay-ui:search-container>
		</div>
	</div>
</div>
