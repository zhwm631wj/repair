<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="transferCaseList.title"/></title>
<content tag="heading"><fmt:message key="transferCaseList.heading"/></content>
<meta name="menu" content="TransferCaseMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editTransferCase.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="transferCaseList" cellspacing="0" cellpadding="0"
    id="transferCaseList" pagesize="25" class="table transferCaseList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editTransferCase.html" paramId="id" paramProperty="id"
        titleKey="transferCaseForm.id"/>
    <display:column property="eventId" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.eventId"/>
    <display:column property="content" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.content"/>
    <display:column property="transMan" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.transMan"/>
    <display:column property="headship" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.headship"/>
    <display:column property="transOrg" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.transOrg"/>
    <display:column property="transDate" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.transDate"/>
    <display:column property="noteMan" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.noteMan"/>
    <display:column property="noteDate" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.noteDate"/>
    <display:column property="acceptIdea" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.acceptIdea"/>
    <display:column property="acceptDate" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.acceptDate"/>
    <display:column property="acceptMan" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.acceptMan"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.createDate"/>
    <display:column property="caseStatus" sortable="true" headerClass="sortable"
         titleKey="transferCaseForm.caseStatus"/>
    <display:setProperty name="paging.banner.item_name" value="transferCase"/>
    <display:setProperty name="paging.banner.items_name" value="transferCases"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("transferCaseList");
</script>
