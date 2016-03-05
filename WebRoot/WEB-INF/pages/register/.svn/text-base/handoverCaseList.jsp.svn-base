<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="handoverCaseList.title"/></title>
<content tag="heading"><fmt:message key="handoverCaseList.heading"/></content>
<meta name="menu" content="HandoverCaseMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editHandoverCase.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="handoverCaseList" cellspacing="0" cellpadding="0"
    id="handoverCaseList" pagesize="25" class="table handoverCaseList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editHandoverCase.html" paramId="id" paramProperty="id"
        titleKey="handoverCaseForm.id"/>
    <display:column property="eventId" sortable="true" headerClass="sortable"
         titleKey="handoverCaseForm.eventId"/>
    <display:column property="handoverDate" sortable="true" headerClass="sortable"
         titleKey="handoverCaseForm.handoverDate"/>
    <display:column property="handoverOrg" sortable="true" headerClass="sortable"
         titleKey="handoverCaseForm.handoverOrg"/>
    <display:column property="content" sortable="true" headerClass="sortable"
         titleKey="handoverCaseForm.content"/>
    <display:column property="dataCatalog" sortable="true" headerClass="sortable"
         titleKey="handoverCaseForm.dataCatalog"/>
    <display:column property="acceptIdea" sortable="true" headerClass="sortable"
         titleKey="handoverCaseForm.acceptIdea"/>
    <display:column property="acceptDate" sortable="true" headerClass="sortable"
         titleKey="handoverCaseForm.acceptDate"/>
    <display:column property="acceptMan" sortable="true" headerClass="sortable"
         titleKey="handoverCaseForm.acceptMan"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="handoverCaseForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="handoverCaseForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="handoverCaseForm.createDate"/>
    <display:column property="caseStatus" sortable="true" headerClass="sortable"
         titleKey="handoverCaseForm.caseStatus"/>
    <display:setProperty name="paging.banner.item_name" value="handoverCase"/>
    <display:setProperty name="paging.banner.items_name" value="handoverCases"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("handoverCaseList");
</script>
