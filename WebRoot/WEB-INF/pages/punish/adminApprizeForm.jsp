<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="adminApprizeDetail.title"/></title>
<content tag="heading"><fmt:message key="adminApprizeDetail.heading"/></content>

<html:form action="saveAdminApprize" method="post" styleId="adminApprizeForm" onsubmit="return validateAdminApprizeForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="adminApprizeForm.adminOrder"/>
        <html:errors property="adminOrder"/>
        <html:text property="adminOrder" styleId="adminOrder" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="adminApprizeForm.keyWord"/>
        <html:errors property="keyWord"/>
        <html:text property="keyWord" styleId="keyWord" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="adminApprizeForm.announce"/>
        <html:errors property="announce"/>
        <html:text property="announce" styleId="announce" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="adminApprizeForm.dispatchOrg"/>
        <html:errors property="dispatchOrg"/>
        <html:text property="dispatchOrg" styleId="dispatchOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="adminApprizeForm.linkman"/>
        <html:errors property="linkman"/>
        <html:text property="linkman" styleId="linkman" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="adminApprizeForm.linkPhone"/>
        <html:errors property="linkPhone"/>
        <html:text property="linkPhone" styleId="linkPhone" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="adminApprizeForm.dispatchDate"/>
        <html:errors property="dispatchDate"/>
        <html:text property="dispatchDate" styleId="dispatchDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="adminApprizeForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="adminApprizeForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="adminApprizeForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('AdminApprize')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("adminApprizeForm"));
</script>

<html:javascript formName="adminApprizeForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
