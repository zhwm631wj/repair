<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="derateOrPutOffDetail.title"/></title>
<content tag="heading"><fmt:message key="derateOrPutOffDetail.heading"/></content>

<html:form action="saveDerateOrPutOff" method="post" styleId="derateOrPutOffForm" onsubmit="return validateDerateOrPutOffForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.caseFine"/>
        <html:errors property="caseFine"/>
        <html:text property="caseFine" styleId="caseFine" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.infine"/>
        <html:errors property="infine"/>
        <html:text property="infine" styleId="infine" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.notInFine"/>
        <html:errors property="notInFine"/>
        <html:text property="notInFine" styleId="notInFine" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.applyContent"/>
        <html:errors property="applyContent"/>
        <html:text property="applyContent" styleId="applyContent" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.applyDate"/>
        <html:errors property="applyDate"/>
        <html:text property="applyDate" styleId="applyDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.applyBook"/>
        <html:errors property="applyBook"/>
        <html:text property="applyBook" styleId="applyBook" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.acceptCheck"/>
        <html:errors property="acceptCheck"/>
        <html:text property="acceptCheck" styleId="acceptCheck" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.checkMan"/>
        <html:errors property="checkMan"/>
        <html:text property="checkMan" styleId="checkMan" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.checkDate"/>
        <html:errors property="checkDate"/>
        <html:text property="checkDate" styleId="checkDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.derateContent"/>
        <html:errors property="derateContent"/>
        <html:text property="derateContent" styleId="derateContent" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.derateMan"/>
        <html:errors property="derateMan"/>
        <html:text property="derateMan" styleId="derateMan" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.derateDate"/>
        <html:errors property="derateDate"/>
        <html:text property="derateDate" styleId="derateDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.examineNote"/>
        <html:errors property="examineNote"/>
        <html:text property="examineNote" styleId="examineNote" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.examineMan"/>
        <html:errors property="examineMan"/>
        <html:text property="examineMan" styleId="examineMan" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.examineDate"/>
        <html:errors property="examineDate"/>
        <html:text property="examineDate" styleId="examineDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="derateOrPutOffForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('DerateOrPutOff')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("derateOrPutOffForm"));
</script>

<html:javascript formName="derateOrPutOffForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
