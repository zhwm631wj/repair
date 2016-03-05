<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="checkupReportList.title"/></title>
<content tag="heading"><fmt:message key="checkupReportList.heading"/></content>
<meta name="menu" content="CheckupReportMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editCheckupReport.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="checkupReportList" cellspacing="0" cellpadding="0"
    id="checkupReportList" pagesize="25" class="table checkupReportList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editCheckupReport.html" paramId="id" paramProperty="id"
        titleKey="checkupReportForm.id"/>
    <display:column property="repNum" sortable="true" headerClass="sortable"
         titleKey="checkupReportForm.repNum"/>
    <display:column property="productName" sortable="true" headerClass="sortable"
         titleKey="checkupReportForm.productName"/>
    <display:column property="spec" sortable="true" headerClass="sortable"
         titleKey="checkupReportForm.spec"/>
    <display:column property="brand" sortable="true" headerClass="sortable"
         titleKey="checkupReportForm.brand"/>
    <display:column property="productionOrg" sortable="true" headerClass="sortable"
         titleKey="checkupReportForm.productionOrg"/>
    <display:column property="sellOrg" sortable="true" headerClass="sortable"
         titleKey="checkupReportForm.sellOrg"/>
    <display:column property="checkResult" sortable="true" headerClass="sortable"
         titleKey="checkupReportForm.checkResult"/>
    <display:column property="checkOrg" sortable="true" headerClass="sortable"
         titleKey="checkupReportForm.checkOrg"/>
    <display:column property="markDate" sortable="true" headerClass="sortable"
         titleKey="checkupReportForm.markDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="checkupReportForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="checkupReportForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="checkupReportForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="checkupReport"/>
    <display:setProperty name="paging.banner.items_name" value="checkupReports"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("checkupReportList");
</script>
