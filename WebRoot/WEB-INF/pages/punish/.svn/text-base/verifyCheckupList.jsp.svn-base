<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="verifyCheckupList.title"/></title>
<content tag="heading"><fmt:message key="verifyCheckupList.heading"/></content>
<meta name="menu" content="VerifyCheckupMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editVerifyCheckup.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="verifyCheckupList" cellspacing="0" cellpadding="0"
    id="verifyCheckupList" pagesize="25" class="table verifyCheckupList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editVerifyCheckup.html" paramId="id" paramProperty="id"
        titleKey="verifyCheckupForm.id"/>
    <display:column property="sendVerifyDate" sortable="true" headerClass="sortable"
         titleKey="verifyCheckupForm.sendVerifyDate"/>
    <display:column property="lawPartIdea" sortable="true" headerClass="sortable"
         titleKey="verifyCheckupForm.lawPartIdea"/>
    <display:column property="lawPartMan" sortable="true" headerClass="sortable"
         titleKey="verifyCheckupForm.lawPartMan"/>
    <display:column property="lawPartCheckDate" sortable="true" headerClass="sortable"
         titleKey="verifyCheckupForm.lawPartCheckDate"/>
    <display:column property="directorGeneralIdea" sortable="true" headerClass="sortable"
         titleKey="verifyCheckupForm.directorGeneralIdea"/>
    <display:column property="directorGeneral" sortable="true" headerClass="sortable"
         titleKey="verifyCheckupForm.directorGeneral"/>
    <display:column property="directorOrg" sortable="true" headerClass="sortable"
         titleKey="verifyCheckupForm.directorOrg"/>
    <display:column property="directorCheckDate" sortable="true" headerClass="sortable"
         titleKey="verifyCheckupForm.directorCheckDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="verifyCheckupForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="verifyCheckupForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="verifyCheckupForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="verifyCheckup"/>
    <display:setProperty name="paging.banner.items_name" value="verifyCheckups"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("verifyCheckupList");
</script>
