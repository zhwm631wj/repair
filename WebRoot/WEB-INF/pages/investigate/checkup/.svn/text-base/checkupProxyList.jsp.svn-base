<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="checkupProxyList.title"/></title>
<content tag="heading"><fmt:message key="checkupProxyList.heading"/></content>
<meta name="menu" content="CheckupProxyMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editCheckupProxy.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="checkupProxyList" cellspacing="0" cellpadding="0"
    id="checkupProxyList" pagesize="25" class="table checkupProxyList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editCheckupProxy.html" paramId="id" paramProperty="id"
        titleKey="checkupProxyForm.id"/>
    <display:column property="depNum" sortable="true" headerClass="sortable"
         titleKey="checkupProxyForm.depNum"/>
    <display:column property="adminOrder" sortable="true" headerClass="sortable"
         titleKey="checkupProxyForm.adminOrder"/>
    <display:column property="keyWord" sortable="true" headerClass="sortable"
         titleKey="checkupProxyForm.keyWord"/>
    <display:column property="serialNum" sortable="true" headerClass="sortable"
         titleKey="checkupProxyForm.serialNum"/>
    <display:column property="consignRequire" sortable="true" headerClass="sortable"
         titleKey="checkupProxyForm.consignRequire"/>
    <display:column property="consignOrg" sortable="true" headerClass="sortable"
         titleKey="checkupProxyForm.consignOrg"/>
    <display:column property="consignDate" sortable="true" headerClass="sortable"
         titleKey="checkupProxyForm.consignDate"/>
    <display:column property="consignMan" sortable="true" headerClass="sortable"
         titleKey="checkupProxyForm.consignMan"/>
    <display:column property="consignPost" sortable="true" headerClass="sortable"
         titleKey="checkupProxyForm.consignPost"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="checkupProxyForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="checkupProxyForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="checkupProxyForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="checkupProxy"/>
    <display:setProperty name="paging.banner.items_name" value="checkupProxys"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("checkupProxyList");
</script>
