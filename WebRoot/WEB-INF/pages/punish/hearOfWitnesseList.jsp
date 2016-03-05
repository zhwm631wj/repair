<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="hearOfWitnesseList.title"/></title>
<content tag="heading"><fmt:message key="hearOfWitnesseList.heading"/></content>
<meta name="menu" content="HearOfWitnesseMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editHearOfWitnesse.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="hearOfWitnesseList" cellspacing="0" cellpadding="0"
    id="hearOfWitnesseList" pagesize="25" class="table hearOfWitnesseList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editHearOfWitnesse.html" paramId="id" paramProperty="id"
        titleKey="hearOfWitnesseForm.id"/>
    <display:column property="depNum" sortable="true" headerClass="sortable"
         titleKey="hearOfWitnesseForm.depNum"/>
    <display:column property="adminOrder" sortable="true" headerClass="sortable"
         titleKey="hearOfWitnesseForm.adminOrder"/>
    <display:column property="keyWord" sortable="true" headerClass="sortable"
         titleKey="hearOfWitnesseForm.keyWord"/>
    <display:column property="serialNum" sortable="true" headerClass="sortable"
         titleKey="hearOfWitnesseForm.serialNum"/>
    <display:column property="lawBasis" sortable="true" headerClass="sortable"
         titleKey="hearOfWitnesseForm.lawBasis"/>
    <display:column property="lawNotify" sortable="true" headerClass="sortable"
         titleKey="hearOfWitnesseForm.lawNotify"/>
    <display:column property="contactMan" sortable="true" headerClass="sortable"
         titleKey="hearOfWitnesseForm.contactMan"/>
    <display:column property="contactPhone" sortable="true" headerClass="sortable"
         titleKey="hearOfWitnesseForm.contactPhone"/>
    <display:column property="sendDate" sortable="true" headerClass="sortable"
         titleKey="hearOfWitnesseForm.sendDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="hearOfWitnesseForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="hearOfWitnesseForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="hearOfWitnesseForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="hearOfWitnesse"/>
    <display:setProperty name="paging.banner.items_name" value="hearOfWitnesses"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("hearOfWitnesseList");
</script>
