<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="transferCaseDetail.title"/></title>
<content tag="heading"><fmt:message key="transferCaseDetail.heading"/></content>

<html:form action="saveTransferCase" method="post" styleId="transferCaseForm" onsubmit="return validateTransferCaseForm(this)">
<ul>

<html:hidden property="id"/>


    <li>
        <apcasu:label styleClass="desc" key="transferCaseForm.content"/>
        <html:errors property="content"/>
        <html:text property="content" styleId="content" styleClass="text large"/>

    </li>

    <li>
         <div>
		<div class="left">
        <apcasu:label styleClass="desc" key="transferCaseForm.transMan"/>
        <html:errors property="transMan"/>
        <html:text property="transMan" styleId="transMan" styleClass="text medium"/>
		</div>
		<div >
        <apcasu:label styleClass="desc" key="transferCaseForm.headship"/>
        <html:errors property="headship"/>
        <html:text property="headship" styleId="headship" styleClass="text medium"/>
		</div>
		</div>

    </li>
    <li>
     <div>
		<div class="left">
        <apcasu:label styleClass="desc" key="transferCaseForm.transOrg"/>
        <html:errors property="transOrg"/>
        <html:text property="transOrg" styleId="transOrg" styleClass="text medium"/>
		</div>
		<div >
        <apcasu:label styleClass="desc" key="transferCaseForm.transDate"/>
        <html:errors property="transDate"/>
        <html:text property="transDate" styleId="transDate" styleClass="text medium"/>
		</div>
		</div>
    </li>


    <li>
      <div>
		<div class="left">
		<apcasu:label styleClass="desc" key="transferCaseForm.noteMan"/>
        <html:errors property="noteMan"/>
        <html:text property="noteMan" styleId="noteMan" styleClass="text medium"/>
		</div>
		<div >
		<apcasu:label styleClass="desc" key="transferCaseForm.noteDate"/>
        <html:errors property="noteDate"/>
        <html:text property="noteDate" styleId="noteDate" styleClass="text medium"/>	
		</div>
		</div>
    </li>
    <li>
        <apcasu:label styleClass="desc" key="transferCaseForm.acceptIdea"/>
        <html:errors property="acceptIdea"/>
        <html:text property="acceptIdea" styleId="acceptIdea" styleClass="text large"/>

    </li>

    <li>
		    <div>
		<div class="left">
		<apcasu:label styleClass="desc" key="transferCaseForm.acceptMan"/>
        <html:errors property="acceptMan"/>
        <html:text property="acceptMan" styleId="acceptMan" styleClass="text medium"/>
		</div>
		<div >
		<apcasu:label styleClass="desc" key="transferCaseForm.acceptDate"/>
        <html:errors property="acceptDate"/>
        <html:text property="acceptDate" styleId="acceptDate" styleClass="text medium"/>			
		</div>
		</div>
    </li>


    <li>
        <apcasu:label styleClass="desc" key="transferCaseForm.remark"/>
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
    Form.focusFirstElement($("transferCaseForm"));
</script>

<html:javascript formName="transferCaseForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
