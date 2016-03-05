<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="adminApprizeList.title"/></title>
<content tag="heading"><fmt:message key="adminApprizeList.heading"/></content>
<meta name="menu" content="AdminApprizeMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editAdminApprize.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="adminApprizeList" cellspacing="0" cellpadding="0"
    id="adminApprizeList" pagesize="25" class="table adminApprizeList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editAdminApprize.html" paramId="id" paramProperty="id"
        titleKey="adminApprizeForm.id"/>
    <display:column property="adminOrder" sortable="true" headerClass="sortable"
         titleKey="adminApprizeForm.adminOrder"/>
    <display:column property="keyWord" sortable="true" headerClass="sortable"
         titleKey="adminApprizeForm.keyWord"/>
    <display:column property="announce" sortable="true" headerClass="sortable"
         titleKey="adminApprizeForm.announce"/>
    <display:column property="dispatchOrg" sortable="true" headerClass="sortable"
         titleKey="adminApprizeForm.dispatchOrg"/>
    <display:column property="linkman" sortable="true" headerClass="sortable"
         titleKey="adminApprizeForm.linkman"/>
    <display:column property="linkPhone" sortable="true" headerClass="sortable"
         titleKey="adminApprizeForm.linkPhone"/>
    <display:column property="dispatchDate" sortable="true" headerClass="sortable"
         titleKey="adminApprizeForm.dispatchDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="adminApprizeForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="adminApprizeForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="adminApprizeForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="adminApprize"/>
    <display:setProperty name="paging.banner.items_name" value="adminApprizes"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("adminApprizeList");
</script>
