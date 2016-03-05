<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="performCaseList.title"/></title>
<content tag="heading"><fmt:message key="performCaseList.heading"/></content>
<meta name="menu" content="PerformCaseMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editPerformCase.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="performCaseList" cellspacing="0" cellpadding="0"
    id="performCaseList" pagesize="25" class="table performCaseList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editPerformCase.html" paramId="id" paramProperty="id"
        titleKey="performCaseForm.id"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="performCaseForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="performCaseForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="performCaseForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="performCase"/>
    <display:setProperty name="paging.banner.items_name" value="performCases"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("performCaseList");
</script>
