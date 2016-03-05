<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="checkupReportDetail.title"/></title>
<content tag="heading"><fmt:message key="checkupReportDetail.heading"/></content>

<html:form action="saveCheckupReport" method="post" styleId="checkupReportForm" onsubmit="return validateCheckupReportForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="checkupReportForm.repNum"/>
        <html:errors property="repNum"/>
        <html:text property="repNum" styleId="repNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupReportForm.productName"/>
        <html:errors property="productName"/>
        <html:text property="productName" styleId="productName" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupReportForm.spec"/>
        <html:errors property="spec"/>
        <html:text property="spec" styleId="spec" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupReportForm.brand"/>
        <html:errors property="brand"/>
        <html:text property="brand" styleId="brand" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupReportForm.productionOrg"/>
        <html:errors property="productionOrg"/>
        <html:text property="productionOrg" styleId="productionOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupReportForm.sellOrg"/>
        <html:errors property="sellOrg"/>
        <html:text property="sellOrg" styleId="sellOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupReportForm.checkResult"/>
        <html:errors property="checkResult"/>
        <html:text property="checkResult" styleId="checkResult" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupReportForm.checkOrg"/>
        <html:errors property="checkOrg"/>
        <html:text property="checkOrg" styleId="checkOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupReportForm.markDate"/>
        <html:errors property="markDate"/>
        <html:text property="markDate" styleId="markDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupReportForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupReportForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupReportForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('CheckupReport')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("checkupReportForm"));
</script>

<html:javascript formName="checkupReportForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
