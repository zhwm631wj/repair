<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="hearOfWitnesseDetail.title"/></title>
<content tag="heading"><fmt:message key="hearOfWitnesseDetail.heading"/></content>

<html:form action="saveHearOfWitnesse" method="post" styleId="hearOfWitnesseForm" onsubmit="return validateHearOfWitnesseForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="hearOfWitnesseForm.depNum"/>
        <html:errors property="depNum"/>
        <html:text property="depNum" styleId="depNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="hearOfWitnesseForm.adminOrder"/>
        <html:errors property="adminOrder"/>
        <html:text property="adminOrder" styleId="adminOrder" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="hearOfWitnesseForm.keyWord"/>
        <html:errors property="keyWord"/>
        <html:text property="keyWord" styleId="keyWord" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="hearOfWitnesseForm.serialNum"/>
        <html:errors property="serialNum"/>
        <html:text property="serialNum" styleId="serialNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="hearOfWitnesseForm.lawBasis"/>
        <html:errors property="lawBasis"/>
        <html:text property="lawBasis" styleId="lawBasis" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="hearOfWitnesseForm.lawNotify"/>
        <html:errors property="lawNotify"/>
        <html:text property="lawNotify" styleId="lawNotify" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="hearOfWitnesseForm.contactMan"/>
        <html:errors property="contactMan"/>
        <html:text property="contactMan" styleId="contactMan" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="hearOfWitnesseForm.contactPhone"/>
        <html:errors property="contactPhone"/>
        <html:text property="contactPhone" styleId="contactPhone" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="hearOfWitnesseForm.sendDate"/>
        <html:errors property="sendDate"/>
        <html:text property="sendDate" styleId="sendDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="hearOfWitnesseForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="hearOfWitnesseForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="hearOfWitnesseForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('HearOfWitnesse')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("hearOfWitnesseForm"));
</script>

<html:javascript formName="hearOfWitnesseForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
