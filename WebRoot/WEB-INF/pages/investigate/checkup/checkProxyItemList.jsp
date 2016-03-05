<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="checkProxyItemList.title"/></title>
<content tag="heading"><fmt:message key="checkProxyItemList.heading"/></content>
<meta name="menu" content="CheckProxyItemMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editCheckProxyItem.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="checkProxyItemList" cellspacing="0" cellpadding="0"
    id="checkProxyItemList" pagesize="25" class="table checkProxyItemList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editCheckProxyItem.html" paramId="id" paramProperty="id"
        titleKey="checkProxyItemForm.id"/>
    <display:column property="checkItem" sortable="true" headerClass="sortable"
         titleKey="checkProxyItemForm.checkItem"/>
    <display:column property="specNum" sortable="true" headerClass="sortable"
         titleKey="checkProxyItemForm.specNum"/>
    <display:column property="unit" sortable="true" headerClass="sortable"
         titleKey="checkProxyItemForm.unit"/>
    <display:column property="amount" sortable="true" headerClass="sortable"
         titleKey="checkProxyItemForm.amount"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="checkProxyItemForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="checkProxyItemForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="checkProxyItemForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="checkProxyItem"/>
    <display:setProperty name="paging.banner.items_name" value="checkProxyItems"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("checkProxyItemList");
</script>
