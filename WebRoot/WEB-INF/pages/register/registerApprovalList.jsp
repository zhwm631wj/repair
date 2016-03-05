<%@ include file="/common/taglibs.jsp"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<head>
<title></title>
<script type="text/javascript">
var locationHref = new String(location.href) ;
	locationHref = locationHref.slice(8, locationHref.length) ;
	chunkStart = locationHref.indexOf("/") ;
    chunkStart = locationHref.indexOf("/") ;
	locationHref = locationHref.slice(chunkStart+1, locationHref.length) ;
	var bits = CutString(locationHref, "/") ;
	var title=document.title;
 for ( var i = 0 ; i < bits.length ; i ++ )
	{
	   if(bits[i]=="cs"){
	    title+="办案区";
	   }
	   if(bits[i]=="case"){
	    title+="-立(销)案";
	   }
	   if(bits[i]=="in"){
	    title+="-调查取证";
	   }
	   if(bits[i]=="force"){
	    title+="-强制措施";
	   }
	}
   if(locationHref.indexOf("registerCase")!=-1){
	 title+="-立案";
	}
	if(locationHref.indexOf("registerCloses")!=-1){
	 title+="-销案";
	}
	if(locationHref.indexOf("forces.html")!=-1){
	 title+="-采取强制措施";
	}
	if(locationHref.indexOf("deforces.html")!=-1){
	 title+="-解除强制措施";
	}
	   if(locationHref.indexOf("books.html")!=-1){
	 title+="-先行登记";
	}
	if(locationHref.indexOf("partys.html")!=-1){
	 title+="-当事人";
	}
	if(locationHref.indexOf("witness.html")!=-1){
	 title+="-取证";
	}
	if(locationHref.indexOf("ends.html")!=-1){
	 title+="-调查终结";
	}
	document.title=title;
</script>
</head>
<meta name="menu" content="RegisterApprovalMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editRegisterApproval.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="registerApprovalList" cellspacing="0" cellpadding="0"
    id="registerApprovalList" pagesize="5" class="table registerApprovalList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editRegisterApproval.html" paramId="id" paramProperty="id"
        titleKey="registerApprovalForm.id"/>
    <display:column property="caseWhere" sortable="true" headerClass="sortable"
         titleKey="registerApprovalForm.caseWhere"/>
    <display:column property="caseFrom" sortable="true" headerClass="sortable"
         titleKey="registerApprovalForm.caseFrom"/>
    <display:column property="caseAndGist" sortable="true" headerClass="sortable"
         titleKey="registerApprovalForm.caseAndGist"/>
    <display:column property="undertakePerson" sortable="true" headerClass="sortable"
         titleKey="registerApprovalForm.undertakePerson"/>
    <display:column property="superintendent" sortable="true" headerClass="sortable"
         titleKey="registerApprovalForm.superintendent"/>
    <display:column property="ssignDate" sortable="true" headerClass="sortable"
         titleKey="registerApprovalForm.ssignDate"/>
    <display:column property="regOrgIdea" sortable="true" headerClass="sortable"
         titleKey="registerApprovalForm.regOrgIdea"/>
    <display:column property="regOrg" sortable="true" headerClass="sortable"
         titleKey="registerApprovalForm.regOrg"/>
    <display:column property="regOrgMan" sortable="true" headerClass="sortable"
         titleKey="registerApprovalForm.regOrgMan"/>
    <display:column property="regDate" sortable="true" headerClass="sortable"
         titleKey="registerApprovalForm.regDate"/>
    <display:column property="ministerIdea" sortable="true" headerClass="sortable"
         titleKey="registerApprovalForm.ministerIdea"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="registerApprovalForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="registerApproval"/>
    <display:setProperty name="paging.banner.items_name" value="registerApprovals"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("registerApprovalList");
</script>
