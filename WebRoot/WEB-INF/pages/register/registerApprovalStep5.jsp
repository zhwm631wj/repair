<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="registerApprovalDetail.title"/></title>
<content tag="heading"><fmt:message key="registerApprovalDetail.heading"/></content>

<html:form action="saveRegisterApproval" method="post" styleId="registerApprovalForm" onsubmit="return validateRegisterApprovalForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.caseWhere"/>
        <html:errors property="caseWhere"/>
        <html:text property="caseWhere" styleId="caseWhere" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.caseFrom"/>
        <html:errors property="caseFrom"/>
        <html:text property="caseFrom" styleId="caseFrom" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.caseAndGist"/>
        <html:errors property="caseAndGist"/>
        <html:text property="caseAndGist" styleId="caseAndGist" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.undertakePerson"/>
        <html:errors property="undertakePerson"/>
        <html:text property="undertakePerson" styleId="undertakePerson" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.undertakeDate"/>
        <html:errors property="undertakeDate"/>
        <html:text property="undertakeDate" styleId="undertakeDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.undertakeIdea"/>
        <html:errors property="undertakeIdea"/>
        <html:text property="undertakeIdea" styleId="undertakeIdea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.undertakeOrg"/>
        <html:errors property="undertakeOrg"/>
        <html:text property="undertakeOrg" styleId="undertakeOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.superintendent"/>
        <html:errors property="superintendent"/>
        <html:text property="superintendent" styleId="superintendent" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.ssignDate"/>
        <html:errors property="ssignDate"/>
        <html:text property="ssignDate" styleId="ssignDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.regOrgIdea"/>
        <html:errors property="regOrgIdea"/>
        <html:text property="regOrgIdea" styleId="regOrgIdea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.regOrg"/>
        <html:errors property="regOrg"/>
        <html:text property="regOrg" styleId="regOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.regOrgMan"/>
        <html:errors property="regOrgMan"/>
        <html:text property="regOrgMan" styleId="regOrgMan" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.regDate"/>
        <html:errors property="regDate"/>
        <html:text property="regDate" styleId="regDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.ministerIdea"/>
        <html:errors property="ministerIdea"/>
        <html:text property="ministerIdea" styleId="ministerIdea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.minister"/>
        <html:errors property="minister"/>
        <html:text property="minister" styleId="minister" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.miniOrg"/>
        <html:errors property="miniOrg"/>
        <html:text property="miniOrg" styleId="miniOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.checkDate"/>
        <html:errors property="checkDate"/>
        <html:text property="checkDate" styleId="checkDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

      <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>
        <html:cancel styleClass="button" onclick="bCancel=true">
           <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("registerApprovalForm"));
</script>

<html:javascript formName="registerApprovalForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
