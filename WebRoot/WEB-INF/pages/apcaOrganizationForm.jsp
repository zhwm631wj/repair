<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="apcaOrganizationDetail.title"/></title>
<content tag="heading"><fmt:message key="apcaOrganizationDetail.heading"/></content>

<html:form action="saveApcaOrganization" method="post" styleId="apcaOrganizationForm" onsubmit="return validateApcaOrganizationForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="apcaOrganizationForm.orgCode"/>
        <html:errors property="orgCode"/>
        <html:text property="orgCode" styleId="orgCode" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="apcaOrganizationForm.orgName"/>
        <html:errors property="orgName"/>
        <html:text property="orgName" styleId="orgName" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="apcaOrganizationForm.orgSatrap"/>
        <html:errors property="orgSatrap"/>
        <html:text property="orgSatrap" styleId="orgSatrap" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="apcaOrganizationForm.orgProperty"/>
        <html:errors property="orgProperty"/>
        <html:text property="orgProperty" styleId="orgProperty" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="apcaOrganizationForm.higherOrg"/>
        <html:errors property="higherOrg"/>
        <apcasu:units name="untis" toScope="page"/>
            <html:select property="organization.id"  styleClass="select">
                <html:option value=""/>
                <html:options collection="untis"
                    property="value" labelProperty="label"/>
            </html:select>
    </li>

    <li>
        <apcasu:label styleClass="desc" key="apcaOrganizationForm.orgRank"/>
        <html:errors property="orgRank"/>
        <html:text property="orgRank" styleId="orgRank" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="apcaOrganizationForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>
        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('ApcaOrganization')">
            <fmt:message key="button.delete"/>
        </html:submit>
        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("apcaOrganizationForm"));
</script>

<html:javascript formName="apcaOrganizationForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
