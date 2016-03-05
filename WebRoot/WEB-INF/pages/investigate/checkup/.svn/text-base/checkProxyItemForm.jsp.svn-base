<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="checkProxyItemDetail.title"/></title>
<content tag="heading"><fmt:message key="checkProxyItemDetail.heading"/></content>

<html:form action="saveCheckProxyItem" method="post" styleId="checkProxyItemForm" onsubmit="return validateCheckProxyItemForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="checkProxyItemForm.checkItem"/>
        <html:errors property="checkItem"/>
        <html:text property="checkItem" styleId="checkItem" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkProxyItemForm.specNum"/>
        <html:errors property="specNum"/>
        <html:text property="specNum" styleId="specNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkProxyItemForm.unit"/>
        <html:errors property="unit"/>
        <html:text property="unit" styleId="unit" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkProxyItemForm.amount"/>
        <html:errors property="amount"/>
        <html:text property="amount" styleId="amount" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkProxyItemForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkProxyItemForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkProxyItemForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('CheckProxyItem')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("checkProxyItemForm"));
</script>

<html:javascript formName="checkProxyItemForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
