<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="partySpokesmanList.title"/></title>
<content tag="heading"><fmt:message key="partySpokesmanList.heading"/></content>
<meta name="menu" content="PartySpokesmanMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editPartySpokesman.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="partySpokesmanList" cellspacing="0" cellpadding="0"
    id="partySpokesmanList" pagesize="25" class="table partySpokesmanList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editPartySpokesman.html" paramId="id" paramProperty="id"
        titleKey="partySpokesmanForm.id"/>
    <display:column property="corporatePerson" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.corporatePerson"/>
    <display:column property="idcard" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.idcard"/>
    <display:column property="regIdorg" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.regIdorg"/>
    <display:column property="regDate" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.regDate"/>
    <display:column property="effectPeriod" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.effectPeriod"/>
    <display:column property="pname" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.pname"/>
    <display:column property="phone" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.phone"/>
    <display:column property="sex" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.sex"/>
    <display:column property="birthday" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.birthday"/>
    <display:column property="married" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.married"/>
    <display:column property="metier" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.metier"/>
    <display:column property="regAddress" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.regAddress"/>
    <display:column property="regPostalcode" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.regPostalcode"/>
    <display:column property="bideAddress" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.bideAddress"/>
    <display:column property="bidePostalcode" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.bidePostalcode"/>
    <display:column property="address" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.address"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="partySpokesmanForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="partySpokesman"/>
    <display:setProperty name="paging.banner.items_name" value="partySpokesmans"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("partySpokesmanList");
</script>
