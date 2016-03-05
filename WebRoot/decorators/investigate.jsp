<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/2000/REC-xhtml1-200000126/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<head>
 <%@ include file="/common/meta.jsp" %>
 <title><decorator:title/> | <fmt:message key="webapp.name"/></title>

<link rel="shortcut icon" href="/favicon.ico" />
<script type="text/javascript" src="<c:url value='/scripts/jquery.js'/>" ></script>
<script type="text/javascript" src="<c:url value='/scripts/plugin/jquery.validate.js'/>"></script>
<script type="text/javascript" src="<c:url value='/scripts/plugin/jquery-ui.js'/>"></script>
<script type="text/javascript" src="<c:url value='/scripts/plugin/jquery.maskedinput.js'/>"></script>
<script type="text/javascript" src="<c:url value='/scripts/flowglobal.js'/>"></script>
<link rel="stylesheet" type="text/css" media="screen" href="<c:url value='/styles/flow.css'/>" />
<link rel="stylesheet" type="text/css" media="screen" href="<c:url value='/styles/forms.css'/>" />
<link rel="stylesheet" type="text/css" media="screen" href="<c:url value='/styles/flora/flora.tabs.css'/>" />
  <decorator:head/>
</head>
<body<decorator:getProperty property="body.id" writeEntireProperty="true"/><decorator:getProperty property="body.class" writeEntireProperty="true"/>>
<!-- start page wrapper --><div id="letterbox">

<!-- start header container -->
<div id="header-background">
        <div class="nav-global-container">

                <div class="login"></div>
                <div class="logo"><a href="#"><img src="images/flow/logo_marketo.gif" width="168" height="73"  alt="Marketo" /></a></div>
		<div class="nav-global">
			
		</div>

	</div>
</div>
<!-- end header container -->
<div class="line-grey-tier"></div>

<!-- start page container 2 div-->
<div id="page-container" class="resize"><div id="page-content-inner" class="resize">

<!-- start col-main -->

<div id="col-main" class="resize" style="">



  <!-- start main content  -->
  <div class="main-content resize">

  <div class="action-container" style="display:inline;"></div>
<br clear="all" />
<div>
   <%@ include file="/common/messages.jsp" %>
                <h1><decorator:getProperty property="page.heading"/></h1>
                <decorator:body/>
  <br clear="all"/>


</div>



	</div>	<!-- end main content  -->
	<br />
</div> <!-- end col-main -->

<!-- start left col -->
<div id="col-left" class="nav-left-back empty resize" style="position: absolute; min-height: 450px;">
  <div class="col-left-header-tab" style="position: absolute;">调查取证</div>
  <div class="nav-left">

  </div>
      <div class="left-nav-callout png" style="top: 15px; margin-bottom: 100px;">
        <jsp:include page="/common/investigate.jsp"/>
      </div>

<div class="footerAddress">
<b>Marketo Inc.</b><br />
1710 S. Amphlett Blvd.<br />
San Mateo, CA 94402 USA<br />
</div>
<br clear="all"/>
</div>	<!-- end left col -->

</div>  </div>  <!-- end page container 2 divs-->

  <div id="footer-container" align="center">
   <div class="footer">
    <ul>
    <li><c:if test="${pageContext.request.remoteUser != null}">
        <fmt:message key="user.status"/> <authz:authentication  operation="fullName"/>
        </c:if></li>
    <li><a href="#">Home</a></li>
    <li class="line-off"><a href="step2.htm">Second step</a></li>
    </ul>
    </div></div>



<!-- end page wrapper -->
</div>
    </body>
</html>
