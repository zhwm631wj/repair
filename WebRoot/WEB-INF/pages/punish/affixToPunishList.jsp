<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="affixToPunishList.title"/></title>
<content tag="heading"><fmt:message key="affixToPunishList.heading"/></content>
<meta name="menu" content="AffixToPunishMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editAffixToPunish.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="affixToPunishList" cellspacing="0" cellpadding="0"
    id="affixToPunishList" pagesize="25" class="table affixToPunishList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editAffixToPunish.html" paramId="id" paramProperty="id"
        titleKey="affixToPunishForm.id"/>
    <display:column property="keyWord" sortable="true" headerClass="sortable"
         titleKey="affixToPunishForm.keyWord"/>
    <display:column property="serialNum" sortable="true" headerClass="sortable"
         titleKey="affixToPunishForm.serialNum"/>
    <display:column property="punDraft" sortable="true" headerClass="sortable"
         titleKey="affixToPunishForm.punDraft"/>
    <display:column property="directorGeneralIdea" sortable="true" headerClass="sortable"
         titleKey="affixToPunishForm.directorGeneralIdea"/>
    <display:column property="directorGeneral" sortable="true" headerClass="sortable"
         titleKey="affixToPunishForm.directorGeneral"/>
    <display:column property="directorCheckDate" sortable="true" headerClass="sortable"
         titleKey="affixToPunishForm.directorCheckDate"/>
    <display:column property="directorOrg" sortable="true" headerClass="sortable"
         titleKey="affixToPunishForm.directorOrg"/>
    <display:column property="affixDate" sortable="true" headerClass="sortable"
         titleKey="affixToPunishForm.affixDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="affixToPunishForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="affixToPunishForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="affixToPunishForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="affixToPunish"/>
    <display:setProperty name="paging.banner.items_name" value="affixToPunishs"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("affixToPunishList");
</script>
