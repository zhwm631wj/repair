<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="punishDecisionBookList.title"/></title>
<content tag="heading"><fmt:message key="punishDecisionBookList.heading"/></content>
<meta name="menu" content="PunishDecisionBookMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editPunishDecisionBook.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="punishDecisionBookList" cellspacing="0" cellpadding="0"
    id="punishDecisionBookList" pagesize="25" class="table punishDecisionBookList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editPunishDecisionBook.html" paramId="id" paramProperty="id"
        titleKey="punishDecisionBookForm.id"/>
    <display:column property="depNum" sortable="true" headerClass="sortable"
         titleKey="punishDecisionBookForm.depNum"/>
    <display:column property="adminOrder" sortable="true" headerClass="sortable"
         titleKey="punishDecisionBookForm.adminOrder"/>
    <display:column property="writContent" sortable="true" headerClass="sortable"
         titleKey="punishDecisionBookForm.writContent"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="punishDecisionBookForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="punishDecisionBookForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="punishDecisionBookForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="punishDecisionBook"/>
    <display:setProperty name="paging.banner.items_name" value="punishDecisionBooks"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("punishDecisionBookList");
</script>
