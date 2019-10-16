<%@ include file="/init.jsp" %>
<liferay-portlet:actionURL name="/contractmanagement/term/delete" var="delete" />
<aui:form name="fm" action="<%=delete%>" method="post">
	<aui:input name="termId" type="hidden"/>
</aui:form>

<portlet:renderURL var="editEntryURL">
	<portlet:param name="mvcRenderCommandName" value="/contractmanagement/term/edit" />
	<portlet:param name="redirect" value="${currentURL} %>" />
</portlet:renderURL>

<aui:script>
	window.deleteTerm = function(termId){
		$('input[name="<portlet:namespace/>termId"]').val(termId);
		$( "#<portlet:namespace/>fm" ).submit();
	}
</aui:script>

<div class="container-fluid mt-3">
	<div class="row">
		<div class="col-sm">
			<aui:button href="<%= editEntryURL %>" icon="icon-plus" value="add-term-entry" cssClass="mb-3" />

			<liferay-ui:search-container
					emptyResultsMessage="no-term"
					id="termEntries"
					iteratorURL="${portletURL}"
					total="${termCount}">

				<liferay-ui:search-container-results results="${terms}" />

					<liferay-ui:search-container-row
							className="com.liferay.cm.model.Term"
							modelVar="entry">

						<liferay-ui:search-container-column-text name='term-name' value="<%= entry.getName() %>" />
						<liferay-ui:search-container-column-text name='term-description' value="<%= entry.getDescription() %>" />
						<liferay-ui:search-container-column-text>
							<div class="btn-group">
								<button aria-expanded="false" aria-haspopup="true" class="btn btn-monospaced btn-sm btn-secundary dropdown-toggle" data-toggle="dropdown" type="button">
									<clay:icon symbol="ellipsis-v" />
								</button>
								<div class="dropdown-menu">
									<a class="dropdown-item" href="<%= editEntryURL %>&<portlet:namespace/>termId=<%= entry.getTermId() %>">Edit</a>
									<div class="dropdown-divider"></div>
									<a class="dropdown-item" href="javascript:void(0)" onclick="deleteTerm(<%= entry.getTermId() %>);">Delete</a>
								</div>
							</div>
						</liferay-ui:search-container-column-text>

					</liferay-ui:search-container-row>

				<liferay-ui:search-iterator markupView="lexicon" />

			</liferay-ui:search-container>
		</div>
	</div>
</div>
