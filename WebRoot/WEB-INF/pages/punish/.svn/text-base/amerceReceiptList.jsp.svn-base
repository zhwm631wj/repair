<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="amerceReceiptList.title"/></title>
<content tag="heading"><fmt:message key="amerceReceiptList.heading"/></content>
<meta name="menu" content="AmerceReceiptMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editAmerceReceipt.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="amerceReceiptList" cellspacing="0" cellpadding="0"
    id="amerceReceiptList" pagesize="25" class="table amerceReceiptList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editAmerceReceipt.html" paramId="id" paramProperty="id"
        titleKey="amerceReceiptForm.id"/>
    <display:column property="serialNum" sortable="true" headerClass="sortable"
         titleKey="amerceReceiptForm.serialNum"/>
    <display:column property="adminOrg" sortable="true" headerClass="sortable"
         titleKey="amerceReceiptForm.adminOrg"/>
    <display:column property="payOrg" sortable="true" headerClass="sortable"
         titleKey="amerceReceiptForm.payOrg"/>
    <display:column property="fine" sortable="true" headerClass="sortable"
         titleKey="amerceReceiptForm.fine"/>
    <display:column property="confiscateSum" sortable="true" headerClass="sortable"
         titleKey="amerceReceiptForm.confiscateSum"/>
    <display:column property="total" sortable="true" headerClass="sortable"
         titleKey="amerceReceiptForm.total"/>
    <display:column property="inceptBank" sortable="true" headerClass="sortable"
         titleKey="amerceReceiptForm.inceptBank"/>
    <display:column property="inceptMan" sortable="true" headerClass="sortable"
         titleKey="amerceReceiptForm.inceptMan"/>
    <display:column property="checkMan" sortable="true" headerClass="sortable"
         titleKey="amerceReceiptForm.checkMan"/>
    <display:column property="inceptDate" sortable="true" headerClass="sortable"
         titleKey="amerceReceiptForm.inceptDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="amerceReceiptForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="amerceReceiptForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="amerceReceiptForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="amerceReceipt"/>
    <display:setProperty name="paging.banner.items_name" value="amerceReceipts"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("amerceReceiptList");
</script>
