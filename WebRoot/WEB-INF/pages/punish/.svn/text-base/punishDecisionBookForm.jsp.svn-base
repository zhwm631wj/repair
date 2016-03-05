<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="punishDecisionBookDetail.title"/></title>
<content tag="heading"><fmt:message key="punishDecisionBookDetail.heading"/></content>

<html:form action="savePunishDecisionBook" method="post" styleId="punishDecisionBookForm" onsubmit="return validatePunishDecisionBookForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="punishDecisionBookForm.depNum"/>
        <html:errors property="depNum"/>
        <html:text property="depNum" styleId="depNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDecisionBookForm.adminOrder"/>
        <html:errors property="adminOrder"/>
        <html:text property="adminOrder" styleId="adminOrder" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDecisionBookForm.writContent"/>
        <html:errors property="writContent"/>
        <html:text property="writContent" styleId="writContent" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDecisionBookForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDecisionBookForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDecisionBookForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('PunishDecisionBook')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("punishDecisionBookForm"));
</script>

<html:javascript formName="punishDecisionBookForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
