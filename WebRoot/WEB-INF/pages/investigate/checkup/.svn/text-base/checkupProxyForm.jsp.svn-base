<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="checkupProxyDetail.title"/></title>
<content tag="heading"><fmt:message key="checkupProxyDetail.heading"/></content>

<html:form action="saveCheckupProxy" method="post" styleId="checkupProxyForm" onsubmit="return validateCheckupProxyForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="checkupProxyForm.depNum"/>
        <html:errors property="depNum"/>
        <html:text property="depNum" styleId="depNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupProxyForm.adminOrder"/>
        <html:errors property="adminOrder"/>
        <html:text property="adminOrder" styleId="adminOrder" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupProxyForm.keyWord"/>
        <html:errors property="keyWord"/>
        <html:text property="keyWord" styleId="keyWord" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupProxyForm.serialNum"/>
        <html:errors property="serialNum"/>
        <html:text property="serialNum" styleId="serialNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupProxyForm.consignRequire"/>
        <html:errors property="consignRequire"/>
        <html:text property="consignRequire" styleId="consignRequire" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupProxyForm.consignOrg"/>
        <html:errors property="consignOrg"/>
        <html:text property="consignOrg" styleId="consignOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupProxyForm.consignDate"/>
        <html:errors property="consignDate"/>
        <html:text property="consignDate" styleId="consignDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupProxyForm.consignMan"/>
        <html:errors property="consignMan"/>
        <html:text property="consignMan" styleId="consignMan" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupProxyForm.consignPost"/>
        <html:errors property="consignPost"/>
        <html:text property="consignPost" styleId="consignPost" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupProxyForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupProxyForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="checkupProxyForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('CheckupProxy')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("checkupProxyForm"));
</script>

<html:javascript formName="checkupProxyForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
