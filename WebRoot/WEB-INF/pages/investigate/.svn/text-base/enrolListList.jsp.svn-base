<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="enrolListList.title"/></title>
<content tag="heading"><fmt:message key="enrolListList.heading"/></content>
<meta name="menu" content="EnrolListMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editEnrolList.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="enrolListList" cellspacing="0" cellpadding="0"
    id="enrolListList" pagesize="25" class="table enrolListList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editEnrolList.html" paramId="id" paramProperty="id"
        titleKey="enrolListForm.id"/>
    <display:column property="listId" sortable="true" headerClass="sortable"
         titleKey="enrolListForm.listId"/>
    <display:column property="depNum" sortable="true" headerClass="sortable"
         titleKey="enrolListForm.depNum"/>
    <display:column property="adminOrder" sortable="true" headerClass="sortable"
         titleKey="enrolListForm.adminOrder"/>
    <display:column property="keyWord" sortable="true" headerClass="sortable"
         titleKey="enrolListForm.keyWord"/>
    <display:column property="serialNum" sortable="true" headerClass="sortable"
         titleKey="enrolListForm.serialNum"/>
    <display:column property="problemDescribe" sortable="true" headerClass="sortable"
         titleKey="enrolListForm.problemDescribe"/>
    <display:column property="keepedBy" sortable="true" headerClass="sortable"
         titleKey="enrolListForm.keepedBy"/>
    <display:column property="keepPlace" sortable="true" headerClass="sortable"
         titleKey="enrolListForm.keepPlace"/>
    <display:column property="keeper" sortable="true" headerClass="sortable"
         titleKey="enrolListForm.keeper"/>
    <display:column property="keepDate" sortable="true" headerClass="sortable"
         titleKey="enrolListForm.keepDate"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="enrolListForm.createDate"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="enrolListForm.rflag"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="enrolListForm.remark"/>
    <display:setProperty name="paging.banner.item_name" value="enrolList"/>
    <display:setProperty name="paging.banner.items_name" value="enrolLists"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("enrolListList");
</script>
