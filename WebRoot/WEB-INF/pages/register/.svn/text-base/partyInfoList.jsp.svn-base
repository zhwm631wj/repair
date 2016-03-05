<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="partyInfoList.title"/></title>
<content tag="heading"><fmt:message key="partyInfoList.heading"/></content>
<meta name="menu" content="PartyInfoMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editPartyInfo.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="partyInfoList" cellspacing="0" cellpadding="0"
    id="partyInfoList" pagesize="25" class="table partyInfoList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editPartyInfo.html" paramId="id" paramProperty="id"
        titleKey="partyInfoForm.id"/>
    <display:column property="idcard" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.idcard"/>
    <display:column property="regIdorg" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.regIdorg"/>
    <display:column property="regDate" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.regDate"/>
    <display:column property="effectPeriod" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.effectPeriod"/>
    <display:column property="pname" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.pname"/>
    <display:column property="phone" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.phone"/>
    <display:column property="sex" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.sex"/>
    <display:column property="birthday" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.birthday"/>
    <display:column property="married" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.married"/>
    <display:column property="metier" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.metier"/>
    <display:column property="regAddress" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.regAddress"/>
    <display:column property="regPostalcode" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.regPostalcode"/>
    <display:column property="bideAddress" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.bideAddress"/>
    <display:column property="bidePostcode" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.bidePostcode"/>
    <display:column property="corporatePerson" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.corporatePerson"/>
    <display:column property="address" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.address"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.createDate"/>
    <display:column property="caseStatus" sortable="true" headerClass="sortable"
         titleKey="partyInfoForm.caseStatus"/>
    <display:setProperty name="paging.banner.item_name" value="partyInfo"/>
    <display:setProperty name="paging.banner.items_name" value="partyInfos"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("partyInfoList");
</script>
