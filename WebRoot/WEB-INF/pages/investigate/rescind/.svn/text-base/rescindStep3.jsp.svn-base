<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="examProceedingDetail.title"/></title>
<content tag="heading"><fmt:message key="examProceedingDetail.heading"/></content>

<html:form action="saveExamProceeding" method="post" styleId="examProceedingForm" onsubmit="return validateExamProceedingForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.caseName"/>
        <html:errors property="caseName"/>
        <html:text property="caseName" styleId="caseName" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.examineApprove"/>
        <html:errors property="examineApprove"/>
        <html:text property="examineApprove" styleId="examineApprove" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.reasonThereunder"/>
        <html:errors property="reasonThereunder"/>
        <html:text property="reasonThereunder" styleId="reasonThereunder" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.commitDate"/>
        <html:errors property="commitDate"/>
        <html:text property="commitDate" styleId="commitDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.undertakeIdea"/>
        <html:errors property="undertakeIdea"/>
        <html:text property="undertakeIdea" styleId="undertakeIdea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.undertakeExaminant"/>
        <html:errors property="undertakeExaminant"/>
        <html:text property="undertakeExaminant" styleId="undertakeExaminant" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.examDate"/>
        <html:errors property="examDate"/>
        <html:text property="examDate" styleId="examDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.regOrgIdea"/>
        <html:errors property="regOrgIdea"/>
        <html:text property="regOrgIdea" styleId="regOrgIdea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.regOrgExaminant"/>
        <html:errors property="regOrgExaminant"/>
        <html:text property="regOrgExaminant" styleId="regOrgExaminant" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.regOrg"/>
        <html:errors property="regOrg"/>
        <html:text property="regOrg" styleId="regOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.regOrgExamDate"/>
        <html:errors property="regOrgExamDate"/>
        <html:text property="regOrgExamDate" styleId="regOrgExamDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.directorGeneralIdea"/>
        <html:errors property="directorGeneralIdea"/>
        <html:text property="directorGeneralIdea" styleId="directorGeneralIdea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.directorGeneral"/>
        <html:errors property="directorGeneral"/>
        <html:text property="directorGeneral" styleId="directorGeneral" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.direGenBureaux"/>
        <html:errors property="direGenBureaux"/>
        <html:text property="direGenBureaux" styleId="direGenBureaux" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.direGenExamDate"/>
        <html:errors property="direGenExamDate"/>
        <html:text property="direGenExamDate" styleId="direGenExamDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="examProceedingForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('ExamProceeding')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("examProceedingForm"));
</script>

<html:javascript formName="examProceedingForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
