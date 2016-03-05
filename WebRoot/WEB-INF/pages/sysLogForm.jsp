<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="sysLogDetail.title"/></title>
<content tag="heading"><fmt:message key="sysLogDetail.heading"/></content>

<html:form action="saveSysLog" method="post" styleId="sysLogForm" onsubmit="return validateSysLogForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="sysLogForm.caseId"/>
        <html:errors property="caseId"/>
        <html:text property="caseId" styleId="caseId" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="sysLogForm.timePoint"/>
        <html:errors property="timePoint"/>
        <html:text property="timePoint" styleId="timePoint" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="sysLogForm.userId"/>
        <html:errors property="userId"/>
        <html:text property="userId" styleId="userId" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="sysLogForm.username"/>
        <html:errors property="username"/>
        <html:text property="username" styleId="username" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="sysLogForm.orgNum"/>
        <html:errors property="orgNum"/>
        <html:text property="orgNum" styleId="orgNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="sysLogForm.orgName"/>
        <html:errors property="orgName"/>
        <html:text property="orgName" styleId="orgName" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="sysLogForm.description"/>
        <html:errors property="description"/>
        <html:text property="description" styleId="description" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="sysLogForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="sysLogForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('SysLog')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("sysLogForm"));
</script>

<html:javascript formName="sysLogForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
