<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="punishDraftList.title"/></title>
<content tag="heading"><fmt:message key="punishDraftList.heading"/></content>
<meta name="menu" content="PunishDraftMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editPunishDraft.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="punishDraftList" cellspacing="0" cellpadding="0"
    id="punishDraftList" pagesize="25" class="table punishDraftList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editPunishDraft.html" paramId="id" paramProperty="id"
        titleKey="punishDraftForm.id"/>
    <display:column property="depNum" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.depNum"/>
    <display:column property="adminOrder" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.adminOrder"/>
    <display:column property="keyWord" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.keyWord"/>
    <display:column property="serialNum" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.serialNum"/>
    <display:column property="writContent" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.writContent"/>
    <display:column property="draftDate" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.draftDate"/>
    <display:column property="lawPartIdea" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.lawPartIdea"/>
    <display:column property="lawPartMan" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.lawPartMan"/>
    <display:column property="lawPartCheckDate" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.lawPartCheckDate"/>
    <display:column property="lawPartOrg" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.lawPartOrg"/>
    <display:column property="directorGeneralIdea" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.directorGeneralIdea"/>
    <display:column property="directorGeneral" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.directorGeneral"/>
    <display:column property="directorCheckDate" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.directorCheckDate"/>
    <display:column property="directorOrg" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.directorOrg"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="punishDraftForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="punishDraft"/>
    <display:setProperty name="paging.banner.items_name" value="punishDrafts"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("punishDraftList");
</script>
