<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="caseReportList.title"/></title>
<content tag="heading"><fmt:message key="caseReportList.heading"/></content>
<meta name="menu" content="CaseReportMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editCaseReport.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="caseReportList" cellspacing="0" cellpadding="0"
    id="caseReportList" pagesize="25" class="table caseReportList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editCaseReport.html" paramId="id" paramProperty="id"
        titleKey="caseReportForm.id"/>
    <display:column property="caseReporter" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.caseReporter"/>
    <display:column property="crsex" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.crsex"/>
    <display:column property="crbirthday" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.crbirthday"/>
    <display:column property="craddress" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.craddress"/>
    <display:column property="crphone" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.crphone"/>
    <display:column property="cridcard" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.cridcard"/>
    <display:column property="reportContent" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.reportContent"/>
    <display:column property="accepter" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.accepter"/>
    <display:column property="acceptDate" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.acceptDate"/>
    <display:column property="reportMethod" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.reportMethod"/>
    <display:column property="receiveOrgIdea" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.receiveOrgIdea"/>
    <display:column property="receiveDate" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.receiveDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.createDate"/>
    <display:column property="caseStatus" sortable="true" headerClass="sortable"
         titleKey="caseReportForm.caseStatus"/>
    <display:setProperty name="paging.banner.item_name" value="caseReport"/>
    <display:setProperty name="paging.banner.items_name" value="caseReports"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("caseReportList");
</script>
