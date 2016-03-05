<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="releaseForceWritList.title"/></title>
<content tag="heading"><fmt:message key="releaseForceWritList.heading"/></content>
<meta name="menu" content="ReleaseForceWritMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editReleaseForceWrit.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="releaseForceWritList" cellspacing="0" cellpadding="0"
    id="releaseForceWritList" pagesize="25" class="table releaseForceWritList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editReleaseForceWrit.html" paramId="id" paramProperty="id"
        titleKey="releaseForceWritForm.id"/>
    <display:column property="depNum" sortable="true" headerClass="sortable"
         titleKey="releaseForceWritForm.depNum"/>
    <display:column property="adminOrder" sortable="true" headerClass="sortable"
         titleKey="releaseForceWritForm.adminOrder"/>
    <display:column property="keyWord" sortable="true" headerClass="sortable"
         titleKey="releaseForceWritForm.keyWord"/>
    <display:column property="serialNum" sortable="true" headerClass="sortable"
         titleKey="releaseForceWritForm.serialNum"/>
    <display:column property="ntitle" sortable="true" headerClass="sortable"
         titleKey="releaseForceWritForm.ntitle"/>
    <display:column property="rdate" sortable="true" headerClass="sortable"
         titleKey="releaseForceWritForm.rdate"/>
    <display:column property="ndate" sortable="true" headerClass="sortable"
         titleKey="releaseForceWritForm.ndate"/>
    <display:column property="norg" sortable="true" headerClass="sortable"
         titleKey="releaseForceWritForm.norg"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="releaseForceWritForm.createDate"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="releaseForceWritForm.rflag"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="releaseForceWritForm.remark"/>
    <display:setProperty name="paging.banner.item_name" value="releaseForceWrit"/>
    <display:setProperty name="paging.banner.items_name" value="releaseForceWrits"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("releaseForceWritList");
</script>
