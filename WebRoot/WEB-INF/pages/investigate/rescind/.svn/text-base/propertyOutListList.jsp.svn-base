<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="propertyKeepListList.title"/></title>
<content tag="heading"><fmt:message key="propertyKeepListList.heading"/></content>
<meta name="menu" content="PropertyKeepListMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editPropertyKeepList.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="propertyKeepListList" cellspacing="0" cellpadding="0"
    id="propertyKeepListList" pagesize="25" class="table propertyKeepListList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editPropertyKeepList.html" paramId="id" paramProperty="id"
        titleKey="propertyKeepListForm.id"/>
    <display:column property="listId" sortable="true" headerClass="sortable"
         titleKey="propertyKeepListForm.listId"/>
    <display:column property="writBook" sortable="true" headerClass="sortable"
         titleKey="propertyKeepListForm.writBook"/>
    <display:column property="writNum" sortable="true" headerClass="sortable"
         titleKey="propertyKeepListForm.writNum"/>
    <display:column property="excuteDate" sortable="true" headerClass="sortable"
         titleKey="propertyKeepListForm.excuteDate"/>
    <display:column property="indate" sortable="true" headerClass="sortable"
         titleKey="propertyKeepListForm.indate"/>
    <display:column property="inceptMan" sortable="true" headerClass="sortable"
         titleKey="propertyKeepListForm.inceptMan"/>
    <display:column property="keeper" sortable="true" headerClass="sortable"
         titleKey="propertyKeepListForm.keeper"/>
    <display:column property="inceptDate" sortable="true" headerClass="sortable"
         titleKey="propertyKeepListForm.inceptDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="propertyKeepListForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="propertyKeepListForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="propertyKeepListForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="propertyKeepList"/>
    <display:setProperty name="paging.banner.items_name" value="propertyKeepLists"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("propertyKeepListList");
</script>
