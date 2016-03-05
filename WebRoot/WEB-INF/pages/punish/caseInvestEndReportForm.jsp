<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="caseInvestEndReportDetail.title"/></title>
<content tag="heading"><fmt:message key="caseInvestEndReportDetail.heading"/></content>

<html:form action="saveCaseInvestEndReport" method="post" styleId="caseInvestEndReportForm" onsubmit="return validateCaseInvestEndReportForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="caseInvestEndReportForm.repContent"/>
        <html:errors property="repContent"/>
        <html:text property="repContent" styleId="repContent" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseInvestEndReportForm.finishDate"/>
        <html:errors property="finishDate"/>
        <html:text property="finishDate" styleId="finishDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseInvestEndReportForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseInvestEndReportForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseInvestEndReportForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('CaseInvestEndReport')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("caseInvestEndReportForm"));
</script>

<html:javascript formName="caseInvestEndReportForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
