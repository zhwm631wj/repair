<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="discussCaseRecList.title"/></title>
<content tag="heading"><fmt:message key="discussCaseRecList.heading"/></content>
<meta name="menu" content="DiscussCaseRecMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editDiscussCaseRec.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="discussCaseRecList" cellspacing="0" cellpadding="0"
    id="discussCaseRecList" pagesize="25" class="table discussCaseRecList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editDiscussCaseRec.html" paramId="id" paramProperty="id"
        titleKey="discussCaseRecForm.id"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="discussCaseRecForm.createDate"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="discussCaseRecForm.rflag"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="discussCaseRecForm.remark"/>
    <display:setProperty name="paging.banner.item_name" value="discussCaseRec"/>
    <display:setProperty name="paging.banner.items_name" value="discussCaseRecs"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("discussCaseRecList");
</script>
