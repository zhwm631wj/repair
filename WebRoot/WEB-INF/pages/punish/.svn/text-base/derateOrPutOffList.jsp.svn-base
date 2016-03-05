<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="derateOrPutOffList.title"/></title>
<content tag="heading"><fmt:message key="derateOrPutOffList.heading"/></content>
<meta name="menu" content="DerateOrPutOffMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editDerateOrPutOff.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="derateOrPutOffList" cellspacing="0" cellpadding="0"
    id="derateOrPutOffList" pagesize="25" class="table derateOrPutOffList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editDerateOrPutOff.html" paramId="id" paramProperty="id"
        titleKey="derateOrPutOffForm.id"/>
    <display:column property="caseFine" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.caseFine"/>
    <display:column property="infine" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.infine"/>
    <display:column property="notInFine" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.notInFine"/>
    <display:column property="applyContent" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.applyContent"/>
    <display:column property="applyDate" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.applyDate"/>
    <display:column property="applyBook" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.applyBook"/>
    <display:column property="acceptCheck" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.acceptCheck"/>
    <display:column property="checkMan" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.checkMan"/>
    <display:column property="checkDate" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.checkDate"/>
    <display:column property="derateContent" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.derateContent"/>
    <display:column property="derateMan" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.derateMan"/>
    <display:column property="derateDate" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.derateDate"/>
    <display:column property="examineNote" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.examineNote"/>
    <display:column property="examineMan" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.examineMan"/>
    <display:column property="examineDate" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.examineDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="derateOrPutOffForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="derateOrPutOff"/>
    <display:setProperty name="paging.banner.items_name" value="derateOrPutOffs"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("derateOrPutOffList");
</script>
