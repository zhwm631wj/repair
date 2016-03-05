<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="otherCertDetail.title"/></title>
<content tag="heading"><fmt:message key="otherCertDetail.heading"/></content>

<html:form action="saveOtherCert" method="post" styleId="otherCertForm" onsubmit="return validateOtherCertForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="otherCertForm.certName"/>
        <html:errors property="certName"/>
        <html:text property="certName" styleId="certName" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="otherCertForm.certNo"/>
        <html:errors property="certNo"/>
        <html:text property="certNo" styleId="certNo" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="otherCertForm.cname"/>
        <html:errors property="cname"/>
        <html:text property="cname" styleId="cname" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="otherCertForm.pbound"/>
        <html:errors property="pbound"/>
        <html:text property="pbound" styleId="pbound" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="otherCertForm.dealInWhere"/>
        <html:errors property="dealInWhere"/>
        <html:text property="dealInWhere" styleId="dealInWhere" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="otherCertForm.dealInMode"/>
        <html:errors property="dealInMode"/>
        <html:text property="dealInMode" styleId="dealInMode" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="otherCertForm.validStartDate"/>
        <html:errors property="validStartDate"/>
        <html:text property="validStartDate" styleId="validStartDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="otherCertForm.validEndDate"/>
        <html:errors property="validEndDate"/>
        <html:text property="validEndDate" styleId="validEndDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="otherCertForm.issueCertOrg"/>
        <html:errors property="issueCertOrg"/>
        <html:text property="issueCertOrg" styleId="issueCertOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="otherCertForm.issueDate"/>
        <html:errors property="issueDate"/>
        <html:text property="issueDate" styleId="issueDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="otherCertForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="otherCertForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="otherCertForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('OtherCert')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("otherCertForm"));
</script>

<html:javascript formName="otherCertForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
