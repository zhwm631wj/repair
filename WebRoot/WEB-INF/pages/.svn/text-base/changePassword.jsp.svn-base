<%@ include file="/common/taglibs.jsp"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<head>
    <title><fmt:message key="changeWord.title"/></title>
    <content tag="heading"><fmt:message key="changeWord.heading"/></content>
   
</head>

<html:form action="saveUser?method=editPass" >
 <input type="hidden" name="encryptPass" value="true"/>
<ul>
    <c:if test="${cookieLogin != 'true'}">
    <li>
       <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <TBODY>
  <TR>
     <td align="center" valign="top" > 
	   <fieldset style="font-size:13px;">
        <legend>修改密码</legend>
        <table width="500px" cellpadding="3" cellspacing="1"  border="0"  style="font-size:13px;">
	     <tr class="systemTr">
        <td>旧密码：</td><td><input type="password" name="oldword" id="oldword"/></td>
        <td><div id="oldwordTip" style="width:200px"></div></td>
      </tr>
      <tr class="systemTr">
        <td>新密码：</td><td><input type="password" name="newword" id="newword" /></td>
        <td><div id="newwordTip" style="width:200px"></div></td>
      </tr>
      <tr class="systemTr">
        <td>新密码确定：</td><td><input type="password" name="cfword" id="cfword" /></td>
        <td><div id="cfwordTip" style="width:200px"></div></td>
      </tr>    
		 </table>
      </fieldset>
  </td>
  </tr>
	      <tr>
	        <td>&nbsp;</td>
	      </tr>
	      <tr>
	        <td align="right"><input type="submit" class="button" value="修改" /></td>
	      </tr>
</TBODY>
</table>
    </li>
    </c:if>
</ul>
</html:form>


