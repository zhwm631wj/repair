<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="propertyListList.title"/></title>
<content tag="heading"><fmt:message key="propertyListList.heading"/></content>
<meta name="menu" content="PropertyListMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editPropertyList.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="propertyListList" cellspacing="0" cellpadding="0"
    id="propertyListList" pagesize="25" class="table propertyListList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editPropertyList.html" paramId="id" paramProperty="id"
        titleKey="propertyListForm.id"/>
    <display:column property="eventId" sortable="true" headerClass="sortable"
         titleKey="propertyListForm.eventId"/>
    <display:column property="thnum" sortable="true" headerClass="sortable"
         titleKey="propertyListForm.thnum"/>
    <display:column property="serialNum" sortable="true" headerClass="sortable"
         titleKey="propertyListForm.serialNum"/>
    <display:column property="propName" sortable="true" headerClass="sortable"
         titleKey="propertyListForm.propName"/>
    <display:column property="specNum" sortable="true" headerClass="sortable"
         titleKey="propertyListForm.specNum"/>
    <display:column property="unit" sortable="true" headerClass="sortable"
         titleKey="propertyListForm.unit"/>
    <display:column property="amount" sortable="true" headerClass="sortable"
         titleKey="propertyListForm.amount"/>
    <display:column property="characteristic" sortable="true" headerClass="sortable"
         titleKey="propertyListForm.characteristic"/>
    <display:column property="inflag" sortable="true" headerClass="sortable"
         titleKey="propertyListForm.inflag"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="propertyListForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="propertyListForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="propertyListForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="propertyList"/>
    <display:setProperty name="paging.banner.items_name" value="propertyLists"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("propertyListList");
</script>
