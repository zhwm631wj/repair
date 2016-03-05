<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="forceWritDetail.title"/></title>
<content tag="heading"><fmt:message key="forceWritDetail.heading"/></content>

<html:form action="saveForceWrit" method="post" styleId="forceWritForm" onsubmit="return validateForceWritForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.depNum"/>
        <html:errors property="depNum"/>
        <html:text property="depNum" styleId="depNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.adminOrder"/>
        <html:errors property="adminOrder"/>
        <html:text property="adminOrder" styleId="adminOrder" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.keyWord"/>
        <html:errors property="keyWord"/>
        <html:text property="keyWord" styleId="keyWord" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.serialNum"/>
        <html:errors property="serialNum"/>
        <html:text property="serialNum" styleId="serialNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.spokesManOfParty"/>
        <html:errors property="spokesManOfParty"/>
        <html:text property="spokesManOfParty" styleId="spokesManOfParty" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.decisionContent"/>
        <html:errors property="decisionContent"/>
        <html:text property="decisionContent" styleId="decisionContent" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.deciReasion"/>
        <html:errors property="deciReasion"/>
        <html:text property="deciReasion" styleId="deciReasion" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.preRevivorOrg"/>
        <html:errors property="preRevivorOrg"/>
        <html:text property="preRevivorOrg" styleId="preRevivorOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.sendOrderOrg"/>
        <html:errors property="sendOrderOrg"/>
        <html:text property="sendOrderOrg" styleId="sendOrderOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.orderDate"/>
        <html:errors property="orderDate"/>
        <html:text property="orderDate" styleId="orderDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.propertyList"/>
        <html:errors property="propertyList"/>
        <html:text property="propertyList" styleId="propertyList" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>
    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.affixKeeper"/>
        <html:errors property="affixKeeper"/>
        <html:text property="affixKeeper" styleId="affixKeeper" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.affixUndertakeMan"/>
        <html:errors property="affixUndertakeMan"/>
        <html:text property="affixUndertakeMan" styleId="affixUndertakeMan" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.affixEyewitness"/>
        <html:errors property="affixEyewitness"/>
        <html:text property="affixEyewitness" styleId="affixEyewitness" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.eyewitnessDate"/>
        <html:errors property="eyewitnessDate"/>
        <html:text property="eyewitnessDate" styleId="eyewitnessDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="forceWritForm.affixDate"/>
        <html:errors property="affixDate"/>
        <html:text property="affixDate" styleId="affixDate" styleClass="text medium"/>
    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>
         <c:if test="${!empty forceWritForm.id}">
        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('ForceWrit')">
            <fmt:message key="button.delete"/>
        </html:submit>
			</c:if>
        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("forceWritForm"));
</script>

<html:javascript formName="forceWritForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
