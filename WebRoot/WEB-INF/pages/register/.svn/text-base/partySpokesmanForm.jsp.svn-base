<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="partySpokesmanDetail.title"/></title>
<content tag="heading"><fmt:message key="partySpokesmanDetail.heading"/></content>

<html:form action="savePartySpokesman" method="post" styleId="partySpokesmanForm" onsubmit="return validatePartySpokesmanForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.corporatePerson"/>
        <html:errors property="corporatePerson"/>
        <html:text property="corporatePerson" styleId="corporatePerson" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.idcard"/>
        <html:errors property="idcard"/>
        <html:text property="idcard" styleId="idcard" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.regIdorg"/>
        <html:errors property="regIdorg"/>
        <html:text property="regIdorg" styleId="regIdorg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.regDate"/>
        <html:errors property="regDate"/>
        <html:text property="regDate" styleId="regDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.effectPeriod"/>
        <html:errors property="effectPeriod"/>
        <html:text property="effectPeriod" styleId="effectPeriod" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.pname"/>
        <html:errors property="pname"/>
        <html:text property="pname" styleId="pname" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.phone"/>
        <html:errors property="phone"/>
        <html:text property="phone" styleId="phone" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.sex"/>
        <html:errors property="sex"/>
        <html:text property="sex" styleId="sex" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.birthday"/>
        <html:errors property="birthday"/>
        <html:text property="birthday" styleId="birthday" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.married"/>
        <html:errors property="married"/>
        <html:text property="married" styleId="married" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.metier"/>
        <html:errors property="metier"/>
        <html:text property="metier" styleId="metier" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.regAddress"/>
        <html:errors property="regAddress"/>
        <html:text property="regAddress" styleId="regAddress" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.regPostalcode"/>
        <html:errors property="regPostalcode"/>
        <html:text property="regPostalcode" styleId="regPostalcode" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.bideAddress"/>
        <html:errors property="bideAddress"/>
        <html:text property="bideAddress" styleId="bideAddress" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.bidePostalcode"/>
        <html:errors property="bidePostalcode"/>
        <html:text property="bidePostalcode" styleId="bidePostalcode" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.address"/>
        <html:errors property="address"/>
        <html:text property="address" styleId="address" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="partySpokesmanForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('PartySpokesman')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<html:javascript formName="partySpokesmanForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
