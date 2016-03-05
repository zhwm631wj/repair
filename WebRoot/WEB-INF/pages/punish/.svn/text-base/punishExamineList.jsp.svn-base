<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="punishExamineList.title"/></title>
<content tag="heading"><fmt:message key="punishExamineList.heading"/></content>
<meta name="menu" content="PunishExamineMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editPunishExamine.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="punishExamineList" cellspacing="0" cellpadding="0"
    id="punishExamineList" pagesize="25" class="table punishExamineList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editPunishExamine.html" paramId="id" paramProperty="id"
        titleKey="punishExamineForm.id"/>
    <display:column property="caseKind" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.caseKind"/>
    <display:column property="regCaseDate" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.regCaseDate"/>
    <display:column property="punishContent" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.punishContent"/>
    <display:column property="signatureDate" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.signatureDate"/>
    <display:column property="undertakeOrgIdea" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.undertakeOrgIdea"/>
    <display:column property="superintendent" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.superintendent"/>
    <display:column property="supeExamDate" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.supeExamDate"/>
    <display:column property="lawPartidea" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.lawPartidea"/>
    <display:column property="lawPartMan" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.lawPartMan"/>
    <display:column property="lawPartCheckDate" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.lawPartCheckDate"/>
    <display:column property="lawPartOrg" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.lawPartOrg"/>
    <display:column property="directorGeneralIdea" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.directorGeneralIdea"/>
    <display:column property="directorGeneral" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.directorGeneral"/>
    <display:column property="direGenBureaux" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.direGenBureaux"/>
    <display:column property="direGenExamDate" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.direGenExamDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="punishExamineForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="punishExamine"/>
    <display:setProperty name="paging.banner.items_name" value="punishExamines"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("punishExamineList");
</script>
