<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="sceneCheckList.title"/></title>
<content tag="heading"><fmt:message key="sceneCheckList.heading"/></content>
<meta name="menu" content="SceneCheckMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editSceneCheck.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="sceneCheckList" cellspacing="0" cellpadding="0"
    id="sceneCheckList" pagesize="25" class="table sceneCheckList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editSceneCheck.html" paramId="id" paramProperty="id"
        titleKey="sceneCheckForm.id"/>
    <display:column property="eventId" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.eventId"/>
    <display:column property="startTime" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.startTime"/>
    <display:column property="endTime" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.endTime"/>
    <display:column property="checkWhere" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.checkWhere"/>
    <display:column property="checkMan" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.checkMan"/>
    <display:column property="party" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.party"/>
    <display:column property="checkPurpose" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.checkPurpose"/>
    <display:column property="checkInstance" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.checkInstance"/>
    <display:column property="eyewithness" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.eyewithness"/>
    <display:column property="notesKey" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.notesKey"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.createDate"/>
    <display:column property="caseStatus" sortable="true" headerClass="sortable"
         titleKey="sceneCheckForm.caseStatus"/>
    <display:setProperty name="paging.banner.item_name" value="sceneCheck"/>
    <display:setProperty name="paging.banner.items_name" value="sceneChecks"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("sceneCheckList");
</script>
