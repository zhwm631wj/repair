<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="transmitReturnReceiptList.title"/></title>
<content tag="heading"><fmt:message key="transmitReturnReceiptList.heading"/></content>
<meta name="menu" content="TransmitReturnReceiptMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editTransmitReturnReceipt.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="transmitReturnReceiptList" cellspacing="0" cellpadding="0"
    id="transmitReturnReceiptList" pagesize="25" class="table transmitReturnReceiptList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editTransmitReturnReceipt.html" paramId="id" paramProperty="id"
        titleKey="transmitReturnReceiptForm.id"/>
    <display:column property="eventId" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.eventId"/>
    <display:column property="depNum" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.depNum"/>
    <display:column property="adminOrder" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.adminOrder"/>
    <display:column property="keyWord" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.keyWord"/>
    <display:column property="serialNum" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.serialNum"/>
    <display:column property="writName" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.writName"/>
    <display:column property="wirtNo" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.wirtNo"/>
    <display:column property="inceptMan" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.inceptMan"/>
    <display:column property="transDate" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.transDate"/>
    <display:column property="transWhere" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.transWhere"/>
    <display:column property="transWay" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.transWay"/>
    <display:column property="inceptManVisa" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.inceptManVisa"/>
    <display:column property="transMan" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.transMan"/>
    <display:column property="eyewitness" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.eyewitness"/>
    <display:column property="eyewitnessDate" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.eyewitnessDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="transmitReturnReceiptForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="transmitReturnReceipt"/>
    <display:setProperty name="paging.banner.items_name" value="transmitReturnReceipts"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("transmitReturnReceiptList");
</script>
