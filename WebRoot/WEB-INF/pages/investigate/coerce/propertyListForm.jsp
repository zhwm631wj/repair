<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="propertyListDetail.title"/></title>
<content tag="heading"><fmt:message key="propertyListDetail.heading"/></content>

<html:form action="saveCoercePropertyList" method="post" styleId="propertyListForm" onsubmit="return validatePropertyListForm(this)">
<ul>
 <html:hidden property="id"/>
 <html:hidden property="inflag" value="1"/>
 <html:hidden property="eventId" value="1"/>
    <li>
		<div><div class="left">
		<apcasu:label styleClass="desc" key="propertyListForm.thnum"/>
        <html:errors property="thnum"/>
        <html:text property="thnum" styleId="thnum" styleClass="text medium"/>
		</div><div>
		<apcasu:label styleClass="desc" key="propertyListForm.serialNum"/>
        <html:errors property="serialNum"/>
        <html:text property="serialNum" styleId="serialNum" styleClass="text medium"/>		
		</div></div>     
    </li>
    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.propName"/>
        <html:errors property="propName"/>
        <html:text property="propName" styleId="propName" styleClass="text large"/>
    </li>
    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.specNum"/>
        <html:errors property="specNum"/>
        <html:text property="specNum" styleId="specNum" styleClass="text medium"/>
    </li>
    <li>
    <div><div class="left">
        <apcasu:label styleClass="desc" key="propertyListForm.unit"/>
        <html:errors property="unit"/>
        <html:text property="unit" styleId="unit" styleClass="text medium"/>
		</div><div>
        <apcasu:label styleClass="desc" key="propertyListForm.amount"/>
        <html:errors property="amount"/>
        <html:text property="amount" styleId="amount" styleClass="text medium"/>		
		</div></div>     
    </li>
    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.characteristic"/>
        <html:errors property="characteristic"/>
        <html:text property="characteristic" styleId="characteristic" styleClass="text large"/>
    </li>
    <li>
        <apcasu:label styleClass="desc" key="propertyListForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>
    </li>
    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>
        <c:if test="${!empty propertyListForm.id}">
        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('PropertyList')">
            <fmt:message key="button.delete"/>
        </html:submit>
        </c:if>
        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>
