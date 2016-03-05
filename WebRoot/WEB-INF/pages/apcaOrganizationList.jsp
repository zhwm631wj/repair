<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="apcaOrganizationList.title"/></title>
<content tag="heading"><fmt:message key="apcaOrganizationList.heading"/></content>
<meta name="menu" content="ApcaOrganizationMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editApcaOrganization.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="apcaOrganizationList" cellspacing="0" cellpadding="0"
    id="apcaOrganizationList" pagesize="25" class="table apcaOrganizationList"
    export="true" requestURI="">
    <display:column property="orgCode" sortable="true" headerClass="sortable"
         url="/editApcaOrganization.html" paramId="id" paramProperty="id"
         titleKey="apcaOrganizationForm.orgCode"/>
    <display:column property="orgName" sortable="true" headerClass="sortable"
         url="/editApcaOrganization.html" paramId="id" paramProperty="id"
         titleKey="apcaOrganizationForm.orgName"/>
    <display:column property="orgSatrap" sortable="true" headerClass="sortable"
         titleKey="apcaOrganizationForm.orgSatrap"/>
    <display:column property="orgProperty" sortable="true" headerClass="sortable"
         titleKey="apcaOrganizationForm.orgProperty"/>
    <display:column property="organization.orgName" sortable="true" headerClass="sortable"
         titleKey="apcaOrganizationForm.higherOrg"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="apcaOrganizationForm.remark"/>
    <display:setProperty name="paging.banner.item_name" value="<fmt:message key='apcaOrganizationList.title'/>"/>
    <display:setProperty name="paging.banner.items_name" value="<fmt:message key='apcaOrganizationList.title'/>"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("apcaOrganizationList");
</script>
