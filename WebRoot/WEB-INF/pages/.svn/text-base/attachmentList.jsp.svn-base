<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="attachmentList.title"/></title>
<content tag="heading"><fmt:message key="attachmentList.heading"/></content>
<meta name="menu" content="AttachmentMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editAttachment.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="attachmentList" cellspacing="0" cellpadding="0"
    id="attachmentList" pagesize="25" class="table attachmentList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editAttachment.html" paramId="id" paramProperty="id"
        titleKey="attachmentForm.id"/>
    <display:column property="tableId" sortable="true" headerClass="sortable"
         titleKey="attachmentForm.tableId"/>
    <display:column property="tableName" sortable="true" headerClass="sortable"
         titleKey="attachmentForm.tableName"/>
    <display:column property="uploadTime" sortable="true" headerClass="sortable"
         titleKey="attachmentForm.uploadTime"/>
    <display:column property="type" sortable="true" headerClass="sortable"
         titleKey="attachmentForm.type"/>
    <display:column property="path" sortable="true" headerClass="sortable"
         titleKey="attachmentForm.path"/>
    <display:column property="status" sortable="true" headerClass="sortable"
         titleKey="attachmentForm.status"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="attachmentForm.remark"/>
    <display:setProperty name="paging.banner.item_name" value="attachment"/>
    <display:setProperty name="paging.banner.items_name" value="attachments"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("attachmentList");
</script>
