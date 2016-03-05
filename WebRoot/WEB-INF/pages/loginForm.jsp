<%@ include file="/common/taglibs.jsp"%>

<form method="post" id="loginForm" action="<c:url value="/j_security_check"/>"
    onsubmit="saveUsername(this);return validateForm(this)">
    
    <table width="786" height="331" border="0">
  <tr height="200px">
    <td width="30px">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
   <td>&nbsp;</td>
   <td>
   <table border="0" align="left">
   <tr>
   <td align="left"> <div id="branding" align="left">
<script type="text/javascript">
swfobject.embedSWF("<c:url value='/images/1.swf'/>", "branding", "700", "137", "9.0.0", "<c:url value='/images/expressInstall.swf'/>");
</script>		
 </div></td></tr>
   </table>
  </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="31">&nbsp;</td>
    <td> 
    <table border="0" align="right">
    <tr>
    <td><c:if test="${param.error != null}">
    <label class="error">
        <img src="<c:url value="/images/iconWarning.gif"/>"
            alt="<fmt:message key="icon.warning"/>" class="icon" />
        <fmt:message key="errors.password.mismatch"/>
        <!--<c:out value="${sessionScope.ACEGI_SECURITY_LAST_EXCEPTION.message}"/>-->
    </label>
</c:if></td>
    <td> <label for="j_username" class="desc">
            <fmt:message key="label.username"/> <span class="req">*</span>
        </label></td>
    <td> <input type="text"  style="width: 80px"  name="j_username" id="j_username" tabindex="1" /></td>
    <td> <label for="j_password" class="desc">
            <fmt:message key="label.password"/> <span class="req">*</span>
        </label></td>
    <td><input type="password"  style="width: 80px" name="j_password" id="j_password" tabindex="2" /></td>
    </tr>
    <tr>
        <td> &nbsp;</td>
    <td> &nbsp;</td>
    <td> &nbsp;</td>
    <td valign="top"> <c:if test="${appConfig['rememberMeEnabled']}">
        <input type="checkbox" class="checkbox" name="rememberMe" id="rememberMe" align="top" title="<fmt:message key='login.rememberMe'/>" tabindex="3"/>
		</c:if></td>
    <td> <input type="submit" class="button" name="login" value="<fmt:message key="button.login"/>" tabindex="4" /></td>
    </tr>
    </table>
       </td>
    <td width="40px">&nbsp;</td>
  </tr>
</table>
</form>
<script type="text/javascript">
    if (getCookie("username") != null) {
        $("j_username").value = getCookie("username");
        $("j_password").focus();
    } else {
        $("j_username").focus();
    }
    
    function saveUsername(theForm) {
        var expires = new Date();
        expires.setTime(expires.getTime() + 24 * 30 * 60 * 60 * 1000); // sets it for approx 30 days.
        setCookie("username",theForm.j_username.value,expires,"<c:url value="/"/>");
    }
    
    function validateForm(form) {                                                               
        return validateRequired(form); 
    } 
    
    function passwordHint() {
        if ($("j_username").value.length == 0) {
            alert("The <fmt:message key="label.username"/> field must be filled in to get a password hint sent to you.");
            $("j_username").focus();
        } else {
            location.href="<c:url value="/passwordHint.html"/>?username=" + $("j_username").value;     
        }
    }
    
    function required () { 
        this.aa = new Array("j_username", "<fmt:message key="errors.required"><fmt:param><fmt:message key="label.username"/></fmt:param></fmt:message>", new Function ("varName", " return this[varName];"));
        this.ab = new Array("j_password", "<fmt:message key="errors.required"><fmt:param><fmt:message key="label.password"/></fmt:param></fmt:message>", new Function ("varName", " return this[varName];"));
    } 
</script>

