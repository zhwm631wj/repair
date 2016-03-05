<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="amerceReceiptDetail.title"/></title>
<content tag="heading"><fmt:message key="amerceReceiptDetail.heading"/></content>

<html:form action="saveAmerceReceipt" method="post" styleId="amerceReceiptForm" onsubmit="return validateAmerceReceiptForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="amerceReceiptForm.serialNum"/>
        <html:errors property="serialNum"/>
        <html:text property="serialNum" styleId="serialNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="amerceReceiptForm.adminOrg"/>
        <html:errors property="adminOrg"/>
        <html:text property="adminOrg" styleId="adminOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="amerceReceiptForm.payOrg"/>
        <html:errors property="payOrg"/>
        <html:text property="payOrg" styleId="payOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="amerceReceiptForm.fine"/>
        <html:errors property="fine"/>
        <html:text property="fine" styleId="fine" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="amerceReceiptForm.confiscateSum"/>
        <html:errors property="confiscateSum"/>
        <html:text property="confiscateSum" styleId="confiscateSum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="amerceReceiptForm.total"/>
        <html:errors property="total"/>
        <html:text property="total" styleId="total" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="amerceReceiptForm.inceptBank"/>
        <html:errors property="inceptBank"/>
        <html:text property="inceptBank" styleId="inceptBank" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="amerceReceiptForm.inceptMan"/>
        <html:errors property="inceptMan"/>
        <html:text property="inceptMan" styleId="inceptMan" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="amerceReceiptForm.checkMan"/>
        <html:errors property="checkMan"/>
        <html:text property="checkMan" styleId="checkMan" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="amerceReceiptForm.inceptDate"/>
        <html:errors property="inceptDate"/>
        <html:text property="inceptDate" styleId="inceptDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="amerceReceiptForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="amerceReceiptForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="amerceReceiptForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('AmerceReceipt')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("amerceReceiptForm"));
</script>

<html:javascript formName="amerceReceiptForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
