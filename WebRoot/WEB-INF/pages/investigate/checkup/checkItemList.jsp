<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="checkItemList.title"/></title>
<content tag="heading"><fmt:message key="checkItemList.heading"/></content>
<meta name="menu" content="CheckItemMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editCheckItem.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="checkItemList" cellspacing="0" cellpadding="0"
    id="checkItemList" pagesize="25" class="table checkItemList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editCheckItem.html" paramId="id" paramProperty="id"
        titleKey="checkItemForm.id"/>
    <display:column property="checkItem" sortable="true" headerClass="sortable"
         titleKey="checkItemForm.checkItem"/>
    <display:column property="chitemValue" sortable="true" headerClass="sortable"
         titleKey="checkItemForm.chitemValue"/>
    <display:column property="consultValue" sortable="true" headerClass="sortable"
         titleKey="checkItemForm.consultValue"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="checkItemForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="checkItemForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="checkItemForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="checkItem"/>
    <display:setProperty name="paging.banner.items_name" value="checkItems"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("checkItemList");
</script>
