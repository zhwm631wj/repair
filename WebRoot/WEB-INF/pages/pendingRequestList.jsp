<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="pendingRequestList.title"/></title>
<content tag="heading"><fmt:message key="pendingRequestList.heading"/></content>
<meta name="menu" content="PendingRequestMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editPendingRequest.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="pendingRequestList" cellspacing="0" cellpadding="0"
    id="pendingRequestList" pagesize="25" class="table pendingRequestList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editPendingRequest.html" paramId="id" paramProperty="id"
        titleKey="pendingRequestForm.id"/>
    <display:column property="caseId" sortable="true" headerClass="sortable"
         titleKey="pendingRequestForm.caseId"/>
    <display:column property="endTime" sortable="true" headerClass="sortable"
         titleKey="pendingRequestForm.endTime"/>
    <display:column property="startTime" sortable="true" headerClass="sortable"
         titleKey="pendingRequestForm.startTime"/>
    <display:column property="checkWhere" sortable="true" headerClass="sortable"
         titleKey="pendingRequestForm.checkWhere"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="pendingRequestForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="pendingRequestForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="pendingRequest"/>
    <display:setProperty name="paging.banner.items_name" value="pendingRequests"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("pendingRequestList");
</script>
