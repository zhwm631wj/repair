<%@ include file="/common/taglibs.jsp"%>
<%@ page language="java" pageEncoding="UTF-8"%>

<title><fmt:message key="partyInfoDetail.title"/></title>
<content tag="heading"><fmt:message key="partyInfoDetail.heading"/></content>
 
<html:form action="savePartyInfo" method="post" styleId="partyInfoForm" onsubmit="return validatePartyInfoForm(this)">
<ul>

<html:hidden property="id"/>


    <li>
        <apcasu:label styleClass="desc" key="partyInfoForm.pname"/>
        <html:errors property="pname"/>
        <html:text property="pname" styleId="pname" styleClass="text large"/>
    </li>
    <li>
        <apcasu:label styleClass="desc" key="partyInfoForm.corporatePerson"/>
        <html:errors property="corporatePerson"/>
        <html:text property="corporatePerson" styleId="corporatePerson" styleClass="text medium"/>

    </li>
    <li><div>
		<div class="left">
		<apcasu:label styleClass="desc" key="partyInfoForm.idcard"/>
        <html:errors property="idcard"/>
        <html:text property="idcard" styleId="idcard" styleClass="text medium"/>    	
		</div>
		<div>
		 <apcasu:label styleClass="desc" key="partyInfoForm.effectPeriod"/>
        <html:errors property="effectPeriod"/>
        <html:text property="effectPeriod" styleId="effectPeriod" styleClass="text medium"/>	
		</div>
		</div>
    </li>
    <li><div>
		<div class="left">
        <apcasu:label styleClass="desc" key="partyInfoForm.regIdorg"/>
        <html:errors property="regIdorg"/>
        <html:text property="regIdorg" styleId="regIdorg" styleClass="text medium"/>		
		</div>
		<div>
        <apcasu:label styleClass="desc" key="partyInfoForm.regDate"/>
        <html:errors property="regDate"/>
        <html:text property="regDate" styleId="regDate" styleClass="text medium"/>
		</div>
		</div>
    </li>  
    <li>
        <apcasu:label styleClass="desc" key="partyInfoForm.birthday"/>
        <html:errors property="birthday"/>
        <html:text property="birthday" styleId="birthday" styleClass="text medium"/>

    </li>
    <li>
    <div>
		<div class="left">
        <apcasu:label styleClass="desc" key="partyInfoForm.sex"/>
        <html:errors property="sex"/>
        <html:text property="sex" styleId="sex" styleClass="text medium"/>	
		</div>
		<div>
        <apcasu:label styleClass="desc" key="partyInfoForm.married"/>
        <html:errors property="married"/>
        <html:text property="married" styleId="married" styleClass="text medium"/>
		</div>
		</div>
    </li>
    <li>
     <div>
		<div class="left">
		<apcasu:label styleClass="desc" key="partyInfoForm.metier"/>
        <html:errors property="metier"/>
        <html:text property="metier" styleId="metier" styleClass="text medium"/>
		</div>
		<div>
        <apcasu:label styleClass="desc" key="partyInfoForm.phone"/>
        <html:errors property="phone"/>
        <html:text property="phone" styleId="phone" styleClass="text medium"/>
		</div>
		</div>


    </li>

    <li>
        <apcasu:label styleClass="desc" key="partyInfoForm.regAddress"/>
        <html:errors property="regAddress"/>
        <html:text property="regAddress" styleId="regAddress" styleClass="text large"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partyInfoForm.regPostalcode"/>
        <html:errors property="regPostalcode"/>
        <html:text property="regPostalcode" styleId="regPostalcode" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partyInfoForm.bideAddress"/>
        <html:errors property="bideAddress"/>
        <html:text property="bideAddress" styleId="bideAddress" styleClass="text large"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partyInfoForm.bidePostcode"/>
        <html:errors property="bidePostcode"/>
        <html:text property="bidePostcode" styleId="bidePostcode" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partyInfoForm.address"/>
        <html:errors property="address"/>
        <html:text property="address" styleId="address" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partyInfoForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>
    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('PartyInfo')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>


<html:javascript formName="partyInfoForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
