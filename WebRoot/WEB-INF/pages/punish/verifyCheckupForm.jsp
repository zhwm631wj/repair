<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="verifyCheckupDetail.title"/></title>
<content tag="heading"><fmt:message key="verifyCheckupDetail.heading"/></content>

<html:form action="saveVerifyCheckup" method="post" styleId="verifyCheckupForm" onsubmit="return validateVerifyCheckupForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="verifyCheckupForm.sendVerifyDate"/>
        <html:errors property="sendVerifyDate"/>
        <html:text property="sendVerifyDate" styleId="sendVerifyDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="verifyCheckupForm.lawPartIdea"/>
        <html:errors property="lawPartIdea"/>
        <html:text property="lawPartIdea" styleId="lawPartIdea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="verifyCheckupForm.lawPartMan"/>
        <html:errors property="lawPartMan"/>
        <html:text property="lawPartMan" styleId="lawPartMan" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="verifyCheckupForm.lawPartCheckDate"/>
        <html:errors property="lawPartCheckDate"/>
        <html:text property="lawPartCheckDate" styleId="lawPartCheckDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="verifyCheckupForm.directorGeneralIdea"/>
        <html:errors property="directorGeneralIdea"/>
        <html:text property="directorGeneralIdea" styleId="directorGeneralIdea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="verifyCheckupForm.directorGeneral"/>
        <html:errors property="directorGeneral"/>
        <html:text property="directorGeneral" styleId="directorGeneral" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="verifyCheckupForm.directorOrg"/>
        <html:errors property="directorOrg"/>
        <html:text property="directorOrg" styleId="directorOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="verifyCheckupForm.directorCheckDate"/>
        <html:errors property="directorCheckDate"/>
        <html:text property="directorCheckDate" styleId="directorCheckDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="verifyCheckupForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="verifyCheckupForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="verifyCheckupForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('VerifyCheckup')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("verifyCheckupForm"));
</script>

<html:javascript formName="verifyCheckupForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
