<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="caseInvestEndReportList.title"/></title>
<content tag="heading"><fmt:message key="caseInvestEndReportList.heading"/></content>
<meta name="menu" content="CaseInvestEndReportMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editCaseInvestEndReport.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="caseInvestEndReportList" cellspacing="0" cellpadding="0"
    id="caseInvestEndReportList" pagesize="25" class="table caseInvestEndReportList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editCaseInvestEndReport.html" paramId="id" paramProperty="id"
        titleKey="caseInvestEndReportForm.id"/>
    <display:column property="repContent" sortable="true" headerClass="sortable"
         titleKey="caseInvestEndReportForm.repContent"/>
    <display:column property="finishDate" sortable="true" headerClass="sortable"
         titleKey="caseInvestEndReportForm.finishDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="caseInvestEndReportForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="caseInvestEndReportForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="caseInvestEndReportForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="caseInvestEndReport"/>
    <display:setProperty name="paging.banner.items_name" value="caseInvestEndReports"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("caseInvestEndReportList");
</script>
