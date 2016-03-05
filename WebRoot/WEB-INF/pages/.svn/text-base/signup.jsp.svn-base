<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="signup.title"/></title>
<content tag="heading"><fmt:message key="signup.heading"/></content>
<body id="signup"/>

<html:form action="/signup" styleId="userForm" onsubmit="return validateUserForm(this)">
<ul>
    <li class="info">
       <fmt:message key="signup.message"/>
    </li>
    <li>
        <apcasu:label styleClass="desc" key="userForm.username"/>
        <html:errors property="username"/>
        <html:text styleClass="text large" property="username" styleId="username"/>
    </li>
    <li>
        <div>
            <div class="left">
                <apcasu:label styleClass="desc" key="userForm.password"/>
                <html:errors property="password"/>
                <html:password styleClass="text medium" property="password" styleId="password" redisplay="true"/>
            </div>
            <div>
                <apcasu:label styleClass="desc" key="userForm.confirmPassword"/>
                <html:errors property="confirmPassword"/>
                <html:password styleClass="text medium" property="confirmPassword" styleId="confirmPassword" redisplay="true"/>
            </div>
        </div>
    </li>
  <li>
        <apcasu:label styleClass="desc" key="userForm.passwordHint"/>
        <html:errors property="passwordHint"/>
        <html:text styleClass="text large" property="passwordHint" styleId="passwordHint"/>
    </li>
    <li>
         <apcasu:label styleClass="desc" key="userForm.personName"/>
         <html:errors property="lastName"/>
         <html:text styleClass="text medium" property="personName" styleId="personName" maxlength="50"/>
    </li>
      <li>
        <apcasu:label styleClass="desc" key="userForm.post"/>
        <html:errors property="website"/>
        <html:text styleClass="text medium" property="post" styleId="post"/>
    </li>
    <li>
        <div>
            <div class="left">
                <apcasu:label styleClass="desc" key="userForm.email"/>
                <html:errors property="email"/>
                <html:text styleClass="text medium" property="email" styleId="email"/>
            </div>
            <div>
                <apcasu:label styleClass="desc" key="userForm.phoneNumber"/>
                <html:errors property="phoneNumber"/>
                <html:text styleClass="text medium" property="phoneNumber" styleId="phoneNumber"/>
            </div>
        </div>
    </li>

    <li>
        <label class="desc"><fmt:message key="userForm.addressForm.address"/></label>
        <div class="group">
            <div>
                <html:text styleClass="text large" property="addressForm.address"
                    styleId="addressForm.address"/>
                <html:errors property="addressForm.address"/>
                <p><apcasu:label key="userForm.addressForm.address"/></p>
            </div>
            <div class="left">
                <html:text styleClass="text zip" property="addressForm.postalCode"
                    styleId="addressForm.postalCode"/>
                <html:errors property="addressForm.postalCode"/>
                <p><apcasu:label key="userForm.addressForm.postalCode"/></p>
            </div>
              <div>
                <apcasu:units name="untis" toScope="page"/>
                <html:select property="organization.id" styleClass="select">
                    <html:option value=""/>
                    <html:options collection="untis"
                        property="value" labelProperty="label"/>
                </html:select>
                <html:errors property="addressForm.country"/>
                <p><apcasu:label key="userForm.addressForm.country"/></p>
            </div>
        </div>
    </li>
    <li class="buttonBar bottom">
        <html:submit styleClass="button" onclick="bCancel=false">
            <fmt:message key="button.register"/>
        </html:submit>
        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($('userForm'));
</script>
<html:javascript formName="userForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<c:url value="/scripts/validator.jsp"/>"></script>
