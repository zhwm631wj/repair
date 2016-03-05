<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="forceWritList.title"/></title>
<content tag="heading"><fmt:message key="forceWritList.heading"/></content>
<meta name="menu" content="ForceWritMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editForceWrit.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="forceWritList" cellspacing="0" cellpadding="0"
    id="forceWritList" pagesize="25" class="table forceWritList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editForceWrit.html" paramId="id" paramProperty="id"
        titleKey="forceWritForm.id"/>
    <display:column property="depNum" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.depNum"/>
    <display:column property="adminOrder" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.adminOrder"/>
    <display:column property="keyWord" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.keyWord"/>
    <display:column property="serialNum" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.serialNum"/>
    <display:column property="spokesManOfParty" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.spokesManOfParty"/>
    <display:column property="decisionContent" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.decisionContent"/>
    <display:column property="deciReasion" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.deciReasion"/>
    <display:column property="preRevivorOrg" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.preRevivorOrg"/>
    <display:column property="sendOrderOrg" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.sendOrderOrg"/>
    <display:column property="orderDate" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.orderDate"/>
    <display:column property="propertyList" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.propertyList"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.createDate"/>
    <display:column property="affixKeeper" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.affixKeeper"/>
    <display:column property="affixUndertakeMan" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.affixUndertakeMan"/>
    <display:column property="affixEyewitness" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.affixEyewitness"/>
    <display:column property="eyewitnessDate" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.eyewitnessDate"/>
    <display:column property="affixDate" sortable="true" headerClass="sortable"
         titleKey="forceWritForm.affixDate"/>
    <display:setProperty name="paging.banner.item_name" value="forceWrit"/>
    <display:setProperty name="paging.banner.items_name" value="forceWrits"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("forceWritList");
</script>
