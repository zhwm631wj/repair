<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="punishExamineDetail.title"/></title>
<content tag="heading"><fmt:message key="punishExamineDetail.heading"/></content>

<html:form action="savePunishExamine" method="post" styleId="punishExamineForm" onsubmit="return validatePunishExamineForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.caseKind"/>
        <html:errors property="caseKind"/>
        <html:text property="caseKind" styleId="caseKind" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.regCaseDate"/>
        <html:errors property="regCaseDate"/>
        <html:text property="regCaseDate" styleId="regCaseDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.punishContent"/>
        <html:errors property="punishContent"/>
        <html:text property="punishContent" styleId="punishContent" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.signatureDate"/>
        <html:errors property="signatureDate"/>
        <html:text property="signatureDate" styleId="signatureDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.undertakeOrgIdea"/>
        <html:errors property="undertakeOrgIdea"/>
        <html:text property="undertakeOrgIdea" styleId="undertakeOrgIdea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.superintendent"/>
        <html:errors property="superintendent"/>
        <html:text property="superintendent" styleId="superintendent" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.supeExamDate"/>
        <html:errors property="supeExamDate"/>
        <html:text property="supeExamDate" styleId="supeExamDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.lawPartidea"/>
        <html:errors property="lawPartidea"/>
        <html:text property="lawPartidea" styleId="lawPartidea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.lawPartMan"/>
        <html:errors property="lawPartMan"/>
        <html:text property="lawPartMan" styleId="lawPartMan" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.lawPartCheckDate"/>
        <html:errors property="lawPartCheckDate"/>
        <html:text property="lawPartCheckDate" styleId="lawPartCheckDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.lawPartOrg"/>
        <html:errors property="lawPartOrg"/>
        <html:text property="lawPartOrg" styleId="lawPartOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.directorGeneralIdea"/>
        <html:errors property="directorGeneralIdea"/>
        <html:text property="directorGeneralIdea" styleId="directorGeneralIdea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.directorGeneral"/>
        <html:errors property="directorGeneral"/>
        <html:text property="directorGeneral" styleId="directorGeneral" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.direGenBureaux"/>
        <html:errors property="direGenBureaux"/>
        <html:text property="direGenBureaux" styleId="direGenBureaux" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.direGenExamDate"/>
        <html:errors property="direGenExamDate"/>
        <html:text property="direGenExamDate" styleId="direGenExamDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishExamineForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('PunishExamine')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("punishExamineForm"));
</script>

<html:javascript formName="punishExamineForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
