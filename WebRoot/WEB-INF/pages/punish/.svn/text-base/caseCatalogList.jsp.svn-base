<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="caseCatalogList.title"/></title>
<content tag="heading"><fmt:message key="caseCatalogList.heading"/></content>
<meta name="menu" content="CaseCatalogMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editCaseCatalog.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="caseCatalogList" cellspacing="0" cellpadding="0"
    id="caseCatalogList" pagesize="25" class="table caseCatalogList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editCaseCatalog.html" paramId="id" paramProperty="id"
        titleKey="caseCatalogForm.id"/>
    <display:column property="orderNum" sortable="true" headerClass="sortable"
         titleKey="caseCatalogForm.orderNum"/>
    <display:column property="stuffName" sortable="true" headerClass="sortable"
         titleKey="caseCatalogForm.stuffName"/>
    <display:column property="bookDate" sortable="true" headerClass="sortable"
         titleKey="caseCatalogForm.bookDate"/>
    <display:column property="pages" sortable="true" headerClass="sortable"
         titleKey="caseCatalogForm.pages"/>
    <display:column property="pageNum" sortable="true" headerClass="sortable"
         titleKey="caseCatalogForm.pageNum"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="caseCatalogForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="caseCatalogForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="caseCatalogForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="caseCatalog"/>
    <display:setProperty name="paging.banner.items_name" value="caseCatalogs"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("caseCatalogList");
</script>
