<%@ include file="/common/taglibs.jsp"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<head>
	<title><fmt:message key="userProfile.title" />
	</title>
	<content tag="heading">
	<fmt:message key="userProfile.heading" />
	</content>
	<meta name="menu" content="UserMenu" />
</head>

<html:form action="saveUser" styleId="userForm">
	<html:hidden property="id" />
	<html:hidden property="version" />
	<input type="hidden" name="from" value="<c:out value="${param.from}"/>" />
	<c:choose>
		<c:when test="${!empty userForm.id}">
			<html:hidden property="password" />
			<html:hidden property="confirmPassword" />
			<html:hidden property="passwordHint" styleId="passwordHint" />
		</c:when>
		<c:otherwise>
			<html:hidden property="password" value="123456" />
			<html:hidden property="confirmPassword" value="123456" />
			<input type="hidden" name="encryptPass" value="true" />
		</c:otherwise>
	</c:choose>
	<ul>
		<li class="buttonBar right">
			<%-- So the buttons can be used at the bottom of the form --%>
			<c:set var="buttons">
				<html:submit styleClass="button" property="method.save"
					onclick="bCancel=false">
					<fmt:message key="button.save" />
				</html:submit>
				<c:if test="${param.from == 'list' and param.method != 'Add'}">
					<html:submit styleClass="button" property="method.delete"
						onclick="bCancel=true; return confirmDelete('User')">
						<fmt:message key="button.delete" />
					</html:submit>
				</c:if>
				<html:cancel styleClass="button" onclick="bCancel=true">
					<fmt:message key="button.cancel" />
				</html:cancel>
			</c:set>
			<c:out value="${buttons}" escapeXml="false" />
		</li>
		<li class="info">
			<c:choose>
				<c:when test="${param.from == 'list'}">
					<p>
						<fmt:message key="userProfile.admin.message" />
					</p>
				</c:when>
				<c:otherwise>
					<p>
						<fmt:message key="userProfile.message" />
					</p>
				</c:otherwise>
			</c:choose>
		</li>
		<li>
			<c:if test="${empty userForm.id}">
				<apcasu:label styleClass="desc" key="userForm.username" />
				<html:errors property="username" />
				<html:text styleClass="text medium" property="username"
					styleId="username" />			
			</c:if>
			<c:if test="${!empty userForm.id}">
				<apcasu:label styleClass="desc" key="userForm.username" />
				<html:text property="username" styleClass="text medium"
					styleId="username" readonly="true" />
			</c:if>
		</li>
			<c:if test="${empty userForm.id}">
				<li>
				<apcasu:label styleClass="desc" key="userForm.passwordHint" />
				<html:errors property="passwordHint" />
				<html:text styleClass="text large" property="passwordHint"
					styleId="passwordHint" value="初始密码123456 请尽快修改密码" />
				</li>
			</c:if>
		<li>
			<apcasu:label styleClass="desc" key="userForm.personName" />
			<html:errors property="lastName" />
			<html:text styleClass="text medium" property="personName"
				styleId="personName" maxlength="50" />
		</li>
		<li>
			<div>
				<div class="left">
				<apcasu:label styleClass="desc" key="userForm.post" />
				<html:errors property="post" />
				<html:text styleClass="text medium" property="post" styleId="post" />
				</div>
				<div >
						<apcasu:label styleClass="desc" key="userForm.org" />
						<html:errors property="organization.id" />
				<apcasu:units name="untis" toScope="page" />
					<html:select property="organization.id" styleClass="select" style="width:176px">
						<html:option value="" />
						<html:options collection="untis" property="value"
							labelProperty="label" />
					</html:select>			
				</div>
				</div>
				
		</li>
		<li>
			<label class="desc">
				<fmt:message key="userForm.addressForm.contact" />
			</label>
			<div class="group">
				<div><p>
				    <apcasu:label styleClass="desc" key="userForm.email" /><html:errors property="email" />
					</p>
					<html:text styleClass="text large" property="email"
						styleId="email" />
				</div>
				<div>
					<p><apcasu:label styleClass="desc" key="userForm.addressForm.address" />
					<html:errors property="addressForm.address" /></p>
					<html:text styleClass="text large" property="addressForm.address"
						styleId="addressForm.address" />		
				</div>
				
				<div class="left">
					<p><apcasu:label styleClass="desc" key="userForm.addressForm.postalCode" />
					<html:errors property="addressForm.postalCode" /></p>
					<html:text styleClass="text zip" property="addressForm.postalCode"
						styleId="addressForm.postalCode" />
				</div>
				<div >
				<p><apcasu:label styleClass="desc" key="userForm.phoneNumber"/>
                <html:errors property="phoneNumber"/></p>
                <html:text styleClass="text medium" property="phoneNumber" styleId="phoneNumber"/>
				</div>
				<div>
				</div>
			</div>
		</li>
		<c:choose>
			<c:when test="${param.from == 'list' or param.method == 'Add'}">
				<li>
					<fieldset>
						<legend>
							<fmt:message key="userProfile.accountSettings" />
						</legend>
						<html:checkbox styleClass="checkbox" property="enabled"
							styleId="enabled" />
						<label for="enabled" class="choice">
							<fmt:message key="userForm.enabled" />
						</label>

						<html:checkbox styleClass="checkbox" property="accountExpired"
							styleId="accountExpired" />
						<label for="accountExpired" class="choice">
							<fmt:message key="userForm.accountExpired" />
						</label>

						<html:checkbox styleClass="checkbox" property="accountLocked"
							styleId="accountLocked" />
						<label for="accountLocked" class="choice">
							<fmt:message key="userForm.accountLocked" />
						</label>

						<html:checkbox styleClass="checkbox" property="credentialsExpired"
							styleId="credentialsExpired" />
						<label for="credentialsExpired" class="choice">
							<fmt:message key="userForm.credentialsExpired" />
						</label>
					</fieldset>
				</li>
				<li>
					<fieldset>
						<legend>
							<fmt:message key="userProfile.assignRoles" />
						</legend>
						<c:forEach var="role" items="${availableRoles}">
							<html-el:multibox styleClass="checkbox" property="userRoles"
								styleId="${role.label}">
								<c:out value="${role.value}" />
							</html-el:multibox>
							<label class="choice" for="<c:out value="${role.label}"/>">
								<c:out value="${role.label}" />
							</label>
						</c:forEach>
					</fieldset>
				</li>
			</c:when>
			<c:when test="${not empty userForm.username}">
				<li>
					<strong><fmt:message key="userForm.roles" />:</strong>

					<c:forEach var="role" items="${userForm.roles}" varStatus="status">
						<c:out value="${role.description}" />
						<c:if test="${!status.last}">,</c:if>
						<input type="hidden" name="userRoles"
							value="<c:out value="${role.name}"/>" />
					</c:forEach>
					<html:hidden property="enabled" />
					<html:hidden property="accountExpired" />
					<html:hidden property="accountLocked" />
					<html:hidden property="credentialsExpired" />
				</li>
			</c:when>
		</c:choose>
		<li class="buttonBar bottom">
			<c:out value="${buttons}" escapeXml="false" />
		</li>
	</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($('userForm'));
    highlightFormElements();
</script>

<html:javascript formName="userForm" cdata="false"
	dynamicJavascript="true" staticJavascript="false" />
<script type="text/javascript"
	src="<c:url value="/scripts/validator.jsp"/>"></script>

