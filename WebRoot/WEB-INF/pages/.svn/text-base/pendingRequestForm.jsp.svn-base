<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="pendingRequestDetail.title"/></title>
<content tag="heading"><fmt:message key="pendingRequestDetail.heading"/></content>

<html:form action="savePendingRequest" method="post" styleId="pendingRequestForm" onsubmit="return validatePendingRequestForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="pendingRequestForm.caseId"/>
        <html:errors property="caseId"/>
        <html:text property="caseId" styleId="caseId" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="pendingRequestForm.endTime"/>
        <html:errors property="endTime"/>
        <html:text property="endTime" styleId="endTime" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="pendingRequestForm.startTime"/>
        <html:errors property="startTime"/>
        <html:text property="startTime" styleId="startTime" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="pendingRequestForm.checkWhere"/>
        <html:errors property="checkWhere"/>
        <html:text property="checkWhere" styleId="checkWhere" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="pendingRequestForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="pendingRequestForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('PendingRequest')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("pendingRequestForm"));
</script>

<html:javascript formName="pendingRequestForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
