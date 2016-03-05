<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="inspectMarketList.title"/></title>
<content tag="heading"><fmt:message key="inspectMarketList.heading"/></content>
<meta name="menu" content="InspectMarketMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editInspectMarket.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="inspectMarketList" cellspacing="0" cellpadding="0"
    id="inspectMarketList" pagesize="25" class="table inspectMarketList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editInspectMarket.html" paramId="id" paramProperty="id"
        titleKey="inspectMarketForm.id"/>
    <display:column property="manager" sortable="true" headerClass="sortable"
         titleKey="inspectMarketForm.manager"/>
    <display:column property="insDate" sortable="true" headerClass="sortable"
         titleKey="inspectMarketForm.insDate"/>
    <display:column property="insWhere" sortable="true" headerClass="sortable"
         titleKey="inspectMarketForm.insWhere"/>
    <display:column property="insInstance" sortable="true" headerClass="sortable"
         titleKey="inspectMarketForm.insInstance"/>
    <display:column property="insIdea" sortable="true" headerClass="sortable"
         titleKey="inspectMarketForm.insIdea"/>
    <display:column property="inspector" sortable="true" headerClass="sortable"
         titleKey="inspectMarketForm.inspector"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="inspectMarketForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="inspectMarketForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="inspectMarketForm.createDate"/>
    <display:column property="caseStatus" sortable="true" headerClass="sortable"
         titleKey="inspectMarketForm.caseStatus"/>
    <display:setProperty name="paging.banner.item_name" value="inspectMarket"/>
    <display:setProperty name="paging.banner.items_name" value="inspectMarkets"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("inspectMarketList");
</script>
