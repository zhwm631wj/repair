<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="attachmentDetail.title"/></title>
<content tag="heading"><fmt:message key="attachmentDetail.heading"/></content>

<html:form action="saveAttachment" method="post" styleId="attachmentForm" onsubmit="return validateAttachmentForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="attachmentForm.tableId"/>
        <html:errors property="tableId"/>
        <html:text property="tableId" styleId="tableId" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="attachmentForm.tableName"/>
        <html:errors property="tableName"/>
        <html:text property="tableName" styleId="tableName" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="attachmentForm.uploadTime"/>
        <html:errors property="uploadTime"/>
        <html:text property="uploadTime" styleId="uploadTime" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="attachmentForm.type"/>
        <html:errors property="type"/>
        <html:text property="type" styleId="type" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="attachmentForm.path"/>
        <html:errors property="path"/>
        <html:text property="path" styleId="path" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="attachmentForm.status"/>
        <html:errors property="status"/>
        <html:text property="status" styleId="status" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="attachmentForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('Attachment')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("attachmentForm"));
</script>

<html:javascript formName="attachmentForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
