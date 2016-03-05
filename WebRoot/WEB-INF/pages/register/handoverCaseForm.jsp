<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="handoverCaseDetail.title"/></title>
<content tag="heading"><fmt:message key="handoverCaseDetail.heading"/></content>

<html:form action="saveHandoverCase" method="post" styleId="handoverCaseForm" onsubmit="return validateHandoverCaseForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="handoverCaseForm.content"/>
        <html:errors property="content"/>
        <html:text property="content" styleId="content" styleClass="text large"/>

    </li>
     <li>
        <apcasu:label styleClass="desc" key="handoverCaseForm.handoverOrg"/>
        <html:errors property="handoverOrg"/>
        <html:text property="handoverOrg" styleId="handoverOrg" styleClass="text medium"/>

    </li>
    <li>
        <apcasu:label styleClass="desc" key="handoverCaseForm.dataCatalog"/>
        <html:errors property="dataCatalog"/>
        <html:text property="dataCatalog" styleId="dataCatalog" styleClass="text large"/>

    </li>
    
    <li>
        <apcasu:label styleClass="desc" key="handoverCaseForm.handoverDate"/>
        <html:errors property="handoverDate"/>
        <html:text property="handoverDate" styleId="handoverDate" styleClass="text medium"/>

    </li>
    <li>
        <apcasu:label styleClass="desc" key="handoverCaseForm.acceptIdea"/>
        <html:errors property="acceptIdea"/>
        <html:text property="acceptIdea" styleId="acceptIdea" styleClass="text medium"/>

    </li>

      <li>
    <div>
	<div class="left">
      <apcasu:label styleClass="desc" key="handoverCaseForm.acceptMan"/>
        <html:errors property="acceptMan"/>
        <html:text property="acceptMan" styleId="acceptMan" styleClass="text medium"/>
		</div>
		<div>
         <apcasu:label styleClass="desc" key="handoverCaseForm.acceptDate"/>
        <html:errors property="acceptDate"/>
        <html:text property="acceptDate" styleId="acceptDate" styleClass="text medium"/>
		</div>
		</div>
    </li>

    <li>
        <apcasu:label styleClass="desc" key="handoverCaseForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>
    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.next"/>
        </html:submit>
        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.previous"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("handoverCaseForm"));
</script>

<html:javascript formName="handoverCaseForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
