<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="enrolListDetail.title"/></title>
<content tag="heading"><fmt:message key="enrolListDetail.heading"/></content>

<html:form action="saveEnrolList" method="post" styleId="enrolListForm" onsubmit="return validateEnrolListForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="enrolListForm.listId"/>
        <html:errors property="listId"/>
        <html:text property="listId" styleId="listId" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="enrolListForm.depNum"/>
        <html:errors property="depNum"/>
        <html:text property="depNum" styleId="depNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="enrolListForm.adminOrder"/>
        <html:errors property="adminOrder"/>
        <html:text property="adminOrder" styleId="adminOrder" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="enrolListForm.keyWord"/>
        <html:errors property="keyWord"/>
        <html:text property="keyWord" styleId="keyWord" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="enrolListForm.serialNum"/>
        <html:errors property="serialNum"/>
        <html:text property="serialNum" styleId="serialNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="enrolListForm.problemDescribe"/>
        <html:errors property="problemDescribe"/>
        <html:text property="problemDescribe" styleId="problemDescribe" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="enrolListForm.keepedBy"/>
        <html:errors property="keepedBy"/>
        <html:text property="keepedBy" styleId="keepedBy" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="enrolListForm.keepPlace"/>
        <html:errors property="keepPlace"/>
        <html:text property="keepPlace" styleId="keepPlace" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="enrolListForm.keeper"/>
        <html:errors property="keeper"/>
        <html:text property="keeper" styleId="keeper" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="enrolListForm.keepDate"/>
        <html:errors property="keepDate"/>
        <html:text property="keepDate" styleId="keepDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="enrolListForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="enrolListForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="enrolListForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('EnrolList')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("enrolListForm"));
</script>

<html:javascript formName="enrolListForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
