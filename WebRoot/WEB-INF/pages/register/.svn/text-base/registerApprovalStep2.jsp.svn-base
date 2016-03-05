<%@ include file="/common/taglibs.jsp"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<title><fmt:message key="registerApprovalDetail.title"/></title>
<content tag="heading">案件基本信息</content>

<html:form action="saveRegisterApprovalStep1" method="post" styleId="registerApprovalForm" onsubmit="return validateRegisterApprovalForm(this)">
<ul>

<html:hidden property="id" ></html:hidden>
    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.caseWhere"/>
        <html:errors property="caseWhere"/>
        <html:text property="caseWhere" styleId="caseWhere" styleClass="text large"/>

    </li>
    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.caseFrom"/>
        <html:errors property="caseFrom"/>
        <html:text property="caseFrom" styleId="caseFrom" styleClass="text medium"/>
    </li>
     <li>
        <label class="desc" for="pname">当事人名称</label>
        <input type="text" name="pname" id="pname"   class="text medium"/>
    </li>
    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.caseAndGist"/>
        <html:errors property="caseAndGist"/>
        <html:textarea property="caseAndGist" styleId="caseAndGist" styleClass="textarea medium"/>
    </li>

    <li>
    <div>
		<div class="left">
		<apcasu:label styleClass="desc" key="registerApprovalForm.undertakePerson"/>
        <html:errors property="undertakePerson"/>
        <html:text property="undertakePerson" styleId="undertakePerson" styleClass="text medium"/>
		</div>
			<div>
	    <apcasu:label styleClass="desc" key="registerApprovalForm.undertakeDate"/>
        <html:errors property="undertakeDate"/>
        <html:text property="undertakeDate" styleId="undertakeDate" styleClass="text medium"/>	
				</div>
				</div>
    </li>

    <li>
        <apcasu:label styleClass="desc" key="registerApprovalForm.undertakeOrg"/>
        <html:errors property="undertakeOrg"/>
        <html:text property="undertakeOrg" styleId="undertakeOrg" styleClass="text medium"/>

    </li>
    
    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.refer"/>
        </html:submit>
        <html:cancel styleClass="button" onclick="bCancel=true">
           <fmt:message key="button.previous"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("registerApprovalForm"));
</script>

<html:javascript formName="registerApprovalForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
