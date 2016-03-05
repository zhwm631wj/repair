<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="sysLogList.title"/></title>
<content tag="heading"><fmt:message key="sysLogList.heading"/></content>
<meta name="menu" content="SysLogMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editSysLog.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="sysLogList" cellspacing="0" cellpadding="0"
    id="sysLogList" pagesize="25" class="table sysLogList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editSysLog.html" paramId="id" paramProperty="id"
        titleKey="sysLogForm.id"/>
    <display:column property="caseId" sortable="true" headerClass="sortable"
         titleKey="sysLogForm.caseId"/>
    <display:column property="timePoint" sortable="true" headerClass="sortable"
         titleKey="sysLogForm.timePoint"/>
    <display:column property="userId" sortable="true" headerClass="sortable"
         titleKey="sysLogForm.userId"/>
    <display:column property="username" sortable="true" headerClass="sortable"
         titleKey="sysLogForm.username"/>
    <display:column property="orgNum" sortable="true" headerClass="sortable"
         titleKey="sysLogForm.orgNum"/>
    <display:column property="orgName" sortable="true" headerClass="sortable"
         titleKey="sysLogForm.orgName"/>
    <display:column property="description" sortable="true" headerClass="sortable"
         titleKey="sysLogForm.description"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="sysLogForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="sysLogForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="sysLog"/>
    <display:setProperty name="paging.banner.items_name" value="sysLogs"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("sysLogList");
</script>
