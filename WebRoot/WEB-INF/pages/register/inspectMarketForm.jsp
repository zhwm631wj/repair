<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="inspectMarketDetail.title"/></title>
<content tag="heading"><fmt:message key="inspectMarketDetail.heading"/></content>

<html:form action="saveInspectMarket" method="post" styleId="inspectMarketForm" onsubmit="return validateInspectMarketForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="inspectMarketForm.manager"/>
        <html:errors property="manager"/>
        <html:text property="manager" styleId="manager" styleClass="text large"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="inspectMarketForm.insWhere"/>
        <html:errors property="insWhere"/>
        <html:text property="insWhere" styleId="insWhere" styleClass="text large"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="inspectMarketForm.insInstance"/>
        <html:errors property="insInstance"/>
        <html:text property="insInstance" styleId="insInstance" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="inspectMarketForm.insIdea"/>
        <html:errors property="insIdea"/>
        <html:text property="insIdea" styleId="insIdea" styleClass="text medium"/>

    </li>

    <li>
		<div>
		<div class="left">
        <apcasu:label styleClass="desc" key="inspectMarketForm.inspector"/>
        <html:errors property="inspector"/>
        <html:text property="inspector" styleId="inspector" styleClass="text medium"/>
		</div>
		<div >
	    <apcasu:label styleClass="desc" key="inspectMarketForm.insDate"/>
        <html:errors property="insDate"/>
        <html:text property="insDate" styleId="insDate" styleClass="text medium"/>		
		</div>
		</div>
    

    </li>

    <li>
        <apcasu:label styleClass="desc" key="inspectMarketForm.remark"/>
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
    Form.focusFirstElement($("inspectMarketForm"));
</script>

<html:javascript formName="inspectMarketForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
