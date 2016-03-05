<%@ include file="/common/taglibs.jsp"%>

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head> 

    <script type="text/javascript" src="<c:url value='/scripts/fileupload.js'/>" charset="UTF-8"></script> 
    <title>文件上传</title>
  </head>
  <body>
  <form action="<c:url value='/servlet/FileUpload'/>" method="POST" target="fileList" enctype="multipart/form-data" >
  <input type=file name="fidle" title="选择文件"/>
  <input type="submit">
  </form>
  <iframe name="fileList" id="fileList" height="400px" width="400px" src="" scrolling="no" frameborder="0" style="display: inline" > </iframe>
  
  </body>
</html:html>
