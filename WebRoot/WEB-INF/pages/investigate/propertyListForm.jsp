<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="propertyListDetail.title"/></title>
<content tag="heading"><fmt:message key="propertyListDetail.heading"/></content>

<html:form action="savePropertyList" method="post" styleId="propertyListForm" onsubmit="return validatePropertyListForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.eventId"/>
        <html:errors property="eventId"/>
        <html:text property="eventId" styleId="eventId" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.thnum"/>
        <html:errors property="thnum"/>
        <html:text property="thnum" styleId="thnum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.serialNum"/>
        <html:errors property="serialNum"/>
        <html:text property="serialNum" styleId="serialNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.propName"/>
        <html:errors property="propName"/>
        <html:text property="propName" styleId="propName" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.specNum"/>
        <html:errors property="specNum"/>
        <html:text property="specNum" styleId="specNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.unit"/>
        <html:errors property="unit"/>
        <html:text property="unit" styleId="unit" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.amount"/>
        <html:errors property="amount"/>
        <html:text property="amount" styleId="amount" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.characteristic"/>
        <html:errors property="characteristic"/>
        <html:text property="characteristic" styleId="characteristic" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.inflag"/>
        <html:errors property="inflag"/>
        <html:text property="inflag" styleId="inflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('PropertyList')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("propertyListForm"));
</script>

<html:javascript formName="propertyListForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
