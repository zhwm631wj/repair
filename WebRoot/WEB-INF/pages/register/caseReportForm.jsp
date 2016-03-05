<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="caseReportDetail.title"/></title>
<content tag="heading"><fmt:message key="caseReportDetail.heading"/></content>

<html:form action="saveCaseReport" method="post" styleId="caseReportForm" onsubmit="return validateCaseReportForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="caseReportForm.caseReporter"/>
        <html:errors property="caseReporter"/>
        <html:text property="caseReporter" styleId="caseReporter" styleClass="text medium"/>

    </li>

    <li>
    <div>
		<div class="left">
        <apcasu:label styleClass="desc" key="caseReportForm.crsex"/>
        <html:errors property="crsex"/>
        <html:text property="crsex" styleId="crsex" styleClass="text medium"/>
		</div>
		<div>
	  	<apcasu:label styleClass="desc" key="caseReportForm.crbirthday"/>
        <html:errors property="crbirthday"/>
        <html:text property="crbirthday" styleId="crbirthday" styleClass="text medium"/>	
		</div>
		</div>
    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseReportForm.craddress"/>
        <html:errors property="craddress"/>
        <html:text property="craddress" styleId="craddress" styleClass="text large"/>

    </li>

    <li>
		<div>
		<div class="left">		
        <apcasu:label styleClass="desc" key="caseReportForm.crphone"/>
        <html:errors property="crphone"/>
        <html:text property="crphone" styleId="crphone" styleClass="text medium"/>		
		</div>
		<div >
		<apcasu:label styleClass="desc" key="caseReportForm.cridcard"/>
        <html:errors property="cridcard"/>
        <html:text property="cridcard" styleId="cridcard" styleClass="text medium"/>	
		</div>
		</div>
    </li>


    <li>
        <apcasu:label styleClass="desc" key="caseReportForm.reportContent"/>
        <html:errors property="reportContent"/>
        <html:text property="reportContent" styleId="reportContent" styleClass="text medium"/>

    </li>

    <li>
    <div>
		<div class="left">
        <apcasu:label styleClass="desc" key="caseReportForm.accepter"/>
        <html:errors property="accepter"/>
        <html:text property="accepter" styleId="accepter" styleClass="text medium"/>
		</div>
		<div>
  		<apcasu:label styleClass="desc" key="caseReportForm.acceptDate"/>
        <html:errors property="acceptDate"/>
        <html:text property="acceptDate" styleId="acceptDate" styleClass="text medium"/>
		</div>
		</div>
    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseReportForm.reportMethod"/>
        <html:errors property="reportMethod"/>
        <html:text property="reportMethod" styleId="reportMethod" styleClass="text medium"/>

    </li>

    <li>
        <div>
		<div class="left">
         <apcasu:label styleClass="desc" key="caseReportForm.receiveOrgIdea"/>
        <html:errors property="receiveOrgIdea"/>
        <html:text property="receiveOrgIdea" styleId="receiveOrgIdea" styleClass="text medium"/>

		</div>
		<div>
        <apcasu:label styleClass="desc" key="caseReportForm.receiveDate"/>
        <html:errors property="receiveDate"/>
        <html:text property="receiveDate" styleId="receiveDate" styleClass="text medium"/>
		</div>
		</div>
    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseReportForm.remark"/>
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
    Form.focusFirstElement($("caseReportForm"));
</script>

<html:javascript formName="caseReportForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
