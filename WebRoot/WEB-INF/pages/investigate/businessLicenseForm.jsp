<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="businessLicenseDetail.title"/></title>
<content tag="heading"><fmt:message key="businessLicenseDetail.heading"/></content>

<html:form action="saveBusinessLicense" method="post" styleId="businessLicenseForm" onsubmit="return validateBusinessLicenseForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.regCode"/>
        <html:errors property="regCode"/>
        <html:text property="regCode" styleId="regCode" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.regName"/>
        <html:errors property="regName"/>
        <html:text property="regName" styleId="regName" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.dealInPerson"/>
        <html:errors property="dealInPerson"/>
        <html:text property="dealInPerson" styleId="dealInPerson" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.buildupWay"/>
        <html:errors property="buildupWay"/>
        <html:text property="buildupWay" styleId="buildupWay" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.dealInWhere"/>
        <html:errors property="dealInWhere"/>
        <html:text property="dealInWhere" styleId="dealInWhere" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.dealInMode"/>
        <html:errors property="dealInMode"/>
        <html:text property="dealInMode" styleId="dealInMode" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.dealInBound"/>
        <html:errors property="dealInBound"/>
        <html:text property="dealInBound" styleId="dealInBound" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.mainDealIn"/>
        <html:errors property="mainDealIn"/>
        <html:text property="mainDealIn" styleId="mainDealIn" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.asideBusiness"/>
        <html:errors property="asideBusiness"/>
        <html:text property="asideBusiness" styleId="asideBusiness" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.issueCertOrg"/>
        <html:errors property="issueCertOrg"/>
        <html:text property="issueCertOrg" styleId="issueCertOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.validStartDate"/>
        <html:errors property="validStartDate"/>
        <html:text property="validStartDate" styleId="validStartDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.validEndDate"/>
        <html:errors property="validEndDate"/>
        <html:text property="validEndDate" styleId="validEndDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.copyDate"/>
        <html:errors property="copyDate"/>
        <html:text property="copyDate" styleId="copyDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.copyWhere"/>
        <html:errors property="copyWhere"/>
        <html:text property="copyWhere" styleId="copyWhere" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.witness"/>
        <html:errors property="witness"/>
        <html:text property="witness" styleId="witness" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.witnessDate"/>
        <html:errors property="witnessDate"/>
        <html:text property="witnessDate" styleId="witnessDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="businessLicenseForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('BusinessLicense')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>


<html:javascript formName="businessLicenseForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
