<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="releaseForceWritDetail.title"/></title>
<content tag="heading"><fmt:message key="releaseForceWritDetail.heading"/></content>

<html:form action="saveReleaseForceWrit" method="post" styleId="releaseForceWritForm" onsubmit="return validateReleaseForceWritForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="releaseForceWritForm.depNum"/>
        <html:errors property="depNum"/>
        <html:text property="depNum" styleId="depNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="releaseForceWritForm.adminOrder"/>
        <html:errors property="adminOrder"/>
        <html:text property="adminOrder" styleId="adminOrder" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="releaseForceWritForm.keyWord"/>
        <html:errors property="keyWord"/>
        <html:text property="keyWord" styleId="keyWord" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="releaseForceWritForm.serialNum"/>
        <html:errors property="serialNum"/>
        <html:text property="serialNum" styleId="serialNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="releaseForceWritForm.ntitle"/>
        <html:errors property="ntitle"/>
        <html:text property="ntitle" styleId="ntitle" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="releaseForceWritForm.rdate"/>
        <html:errors property="rdate"/>
        <html:text property="rdate" styleId="rdate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="releaseForceWritForm.ndate"/>
        <html:errors property="ndate"/>
        <html:text property="ndate" styleId="ndate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="releaseForceWritForm.norg"/>
        <html:errors property="norg"/>
        <html:text property="norg" styleId="norg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="releaseForceWritForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="releaseForceWritForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="releaseForceWritForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('ReleaseForceWrit')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("releaseForceWritForm"));
</script>

<html:javascript formName="releaseForceWritForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
