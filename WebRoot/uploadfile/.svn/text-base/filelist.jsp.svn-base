<%@ include file="/common/taglibs.jsp"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <title>上传的文件列表</title>
	<link rel="stylesheet" type="text/css" href="<c:url value='/styles/listinfo.css'/>"/>
    <script type="text/javascript" src="<c:url value='/scripts/filelist.js'/>" charset="UTF-8"></script>   
  </head>
  
  <body> 
   <html:form action="/attachments.html?method=delete" method="POST"  >
  <display:table name="sessionScope.attachmentCacheList"  cellspacing="0" cellpadding="0"
    id="item" pagesize="25" class="table attachmentList"
    export="false" requestURI="">
     <display:column  title="<input type='checkbox' title='全选/取消全选'  id='seldelAll' />" >
      <input type="checkbox" name="seldel" value="<c:out value='${item.id}'/>" />
      </display:column>
    <display:column property="path" sortable="true" headerClass="sortable" maxWords="7" maxLength="8"
         title="文件" url="/attachments.html?method=getInfoById" paramId="id" paramProperty="id" />
    <display:column property="type" sortable="true" headerClass="sortable"
         title="文件类型"/>
    <display:column property="uploadTime"format="{0,date,yyyy-MM-dd}" sortable="true" headerClass="sortable"
         title="上传时间"/>
    <display:column title="操作"  > 
   <a  href="../attachments.html?method=getInfoById&id=<c:out value='${item.id}'/>" id="view" >查看</a>
   <a  href="../servlet/FileDownload?id=<c:out value='${item.id}'/>" id="download" >下载</a>
      </display:column>
    <display:setProperty name="paging.banner.no_items_found" value=""/>
    <display:setProperty name="paging.banner.one_item_found" value=""/>
    <display:setProperty name="paging.banner.all_items_found" value=""/>
    <display:setProperty name="paging.banner.some_items_found" value=""/>
    </display:table> 
     <input type="submit" value="删除">
     <input type="submit" value="关闭">
  </html:form> 
  
  </body>
</html:html>
