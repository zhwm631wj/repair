<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="checkItemDetail.title"/></title>
<content tag="heading"><fmt:message key="checkItemDetail.heading"/></content>

<html:form action="saveCheckItem" method="post" styleId="checkItemForm" onsubmit="return validateCheckItemForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcase:label styleClass="desc" key="checkItemForm.checkItem"/>
        <html:errors property="checkItem"/>
        <html:text property="checkItem" styleId="checkItem" styleClass="text medium"/>

    </li>

    <li>
        <apcase:label styleClass="desc" key="checkItemForm.chitemValue"/>
        <html:errors property="chitemValue"/>
        <html:text property="chitemValue" styleId="chitemValue" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkItemForm.consultValue"/>
        <html:errors property="consultValue"/>
        <html:text property="consultValue" styleId="consultValue" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkItemForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkItemForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkItemForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('CheckItem')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("checkItemForm"));
</script>

<html:javascript formName="checkItemForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
