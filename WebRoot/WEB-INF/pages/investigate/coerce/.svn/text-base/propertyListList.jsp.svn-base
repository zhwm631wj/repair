<%@ include file="/common/taglibs.jsp"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<head>
<title><fmt:message key="propertyListList.title"/>
</title>
<link rel="stylesheet" type="text/css" media="screen" href="<c:url value='/styles/typo.css'/>" />
<content tag="heading"><fmt:message key="propertyListList.heading"/></content>
</head>
<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editCoercePropertyList.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="propertyListList" cellspacing="0" cellpadding="0"
    id="propertyListList" pagesize="25" class="table propertyListList"
    export="true" requestURI="">
    <display:column property="thnum" sortable="true" headerClass="sortable"
        url="/editCoercePropertyList.html" paramId="id" paramProperty="id"
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
    <display:setProperty name="paging.banner.item_name" value="财务清单"/>
    <display:setProperty name="paging.banner.items_name" value="财务清单"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("propertyListList");
</script>
