<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="otherCertList.title"/></title>
<content tag="heading"><fmt:message key="otherCertList.heading"/></content>
<meta name="menu" content="OtherCertMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editOtherCert.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="otherCertList" cellspacing="0" cellpadding="0"
    id="otherCertList" pagesize="25" class="table otherCertList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editOtherCert.html" paramId="id" paramProperty="id"
        titleKey="otherCertForm.id"/>
    <display:column property="certName" sortable="true" headerClass="sortable"
         titleKey="otherCertForm.certName"/>
    <display:column property="certNo" sortable="true" headerClass="sortable"
         titleKey="otherCertForm.certNo"/>
    <display:column property="cname" sortable="true" headerClass="sortable"
         titleKey="otherCertForm.cname"/>
    <display:column property="pbound" sortable="true" headerClass="sortable"
         titleKey="otherCertForm.pbound"/>
    <display:column property="dealInWhere" sortable="true" headerClass="sortable"
         titleKey="otherCertForm.dealInWhere"/>
    <display:column property="dealInMode" sortable="true" headerClass="sortable"
         titleKey="otherCertForm.dealInMode"/>
    <display:column property="validStartDate" sortable="true" headerClass="sortable"
         titleKey="otherCertForm.validStartDate"/>
    <display:column property="validEndDate" sortable="true" headerClass="sortable"
         titleKey="otherCertForm.validEndDate"/>
    <display:column property="issueCertOrg" sortable="true" headerClass="sortable"
         titleKey="otherCertForm.issueCertOrg"/>
    <display:column property="issueDate" sortable="true" headerClass="sortable"
         titleKey="otherCertForm.issueDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="otherCertForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="otherCertForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="otherCertForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="otherCert"/>
    <display:setProperty name="paging.banner.items_name" value="otherCerts"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("otherCertList");
</script>
