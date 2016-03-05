<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="businessLicenseList.title"/></title>
<content tag="heading"><fmt:message key="businessLicenseList.heading"/></content>
<meta name="menu" content="BusinessLicenseMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editBusinessLicense.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="businessLicenseList" cellspacing="0" cellpadding="0"
    id="businessLicenseList" pagesize="25" class="table businessLicenseList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editBusinessLicense.html" paramId="id" paramProperty="id"
        titleKey="businessLicenseForm.id"/>
    <display:column property="regCode" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.regCode"/>
    <display:column property="regName" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.regName"/>
    <display:column property="dealInPerson" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.dealInPerson"/>
    <display:column property="buildupWay" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.buildupWay"/>
    <display:column property="dealInWhere" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.dealInWhere"/>
    <display:column property="dealInMode" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.dealInMode"/>
    <display:column property="dealInBound" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.dealInBound"/>
    <display:column property="mainDealIn" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.mainDealIn"/>
    <display:column property="asideBusiness" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.asideBusiness"/>
    <display:column property="issueCertOrg" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.issueCertOrg"/>
    <display:column property="validStartDate" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.validStartDate"/>
    <display:column property="validEndDate" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.validEndDate"/>
    <display:column property="copyDate" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.copyDate"/>
    <display:column property="copyWhere" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.copyWhere"/>
    <display:column property="witness" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.witness"/>
    <display:column property="witnessDate" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.witnessDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="businessLicenseForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="businessLicense"/>
    <display:setProperty name="paging.banner.items_name" value="businessLicenses"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("businessLicenseList");
</script>
