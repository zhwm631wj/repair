<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="examProceedingList.title"/></title>
<content tag="heading"><fmt:message key="examProceedingList.heading"/></content>
<meta name="menu" content="ExamProceedingMenu"/>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editExamProceeding.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" onclick="location.href='<html:rewrite forward="mainMenu"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false"/>

<display:table name="examProceedingList" cellspacing="0" cellpadding="0"
    id="examProceedingList" pagesize="25" class="table examProceedingList"
    export="true" requestURI="">

    <display:column property="id" sortable="true" headerClass="sortable"
        url="/editExamProceeding.html" paramId="id" paramProperty="id"
        titleKey="examProceedingForm.id"/>
    <display:column property="caseName" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.caseName"/>
    <display:column property="examineApprove" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.examineApprove"/>
    <display:column property="reasonThereunder" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.reasonThereunder"/>
    <display:column property="commitDate" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.commitDate"/>
    <display:column property="undertakeIdea" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.undertakeIdea"/>
    <display:column property="undertakeExaminant" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.undertakeExaminant"/>
    <display:column property="examDate" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.examDate"/>
    <display:column property="regOrgIdea" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.regOrgIdea"/>
    <display:column property="regOrgExaminant" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.regOrgExaminant"/>
    <display:column property="regOrg" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.regOrg"/>
    <display:column property="regOrgExamDate" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.regOrgExamDate"/>
    <display:column property="directorGeneralIdea" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.directorGeneralIdea"/>
    <display:column property="directorGeneral" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.directorGeneral"/>
    <display:column property="direGenBureaux" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.direGenBureaux"/>
    <display:column property="direGenExamDate" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.direGenExamDate"/>
    <display:column property="remark" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.remark"/>
    <display:column property="rflag" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.rflag"/>
    <display:column property="createDate" sortable="true" headerClass="sortable"
         titleKey="examProceedingForm.createDate"/>
    <display:setProperty name="paging.banner.item_name" value="examProceeding"/>
    <display:setProperty name="paging.banner.items_name" value="examProceedings"/>
</display:table>

<c:out value="${buttons}" escapeXml="false"/>

<script type="text/javascript">
    highlightTableRows("examProceedingList");
</script>
