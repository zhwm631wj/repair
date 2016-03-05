<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="sceneCheckDetail.title"/></title>
<content tag="heading"><fmt:message key="sceneCheckDetail.heading"/></content>

<html:form action="saveSceneCheck" method="post" styleId="sceneCheckForm" onsubmit="return validateSceneCheckForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="sceneCheckForm.checkWhere"/>
        <html:errors property="checkWhere"/>
        <html:text property="checkWhere" styleId="checkWhere" styleClass="text large"/>
    </li>

    <li>
    <div>
	<div class="left">
        <apcasu:label styleClass="desc" key="sceneCheckForm.startTime"/>
        <html:errors property="startTime"/>
        <html:text property="startTime" styleId="startTime" styleClass="text medium"/>
		</div><div>
        <apcasu:label styleClass="desc" key="sceneCheckForm.endTime"/>
        <html:errors property="endTime"/>
        <html:text property="endTime" styleId="endTime" styleClass="text medium"/>	
		</div>
		</div>
    </li>

    <li>
        <apcasu:label styleClass="desc" key="sceneCheckForm.party"/>
        <html:errors property="party"/>
        <html:text property="party" styleId="party" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="sceneCheckForm.checkPurpose"/>
        <html:errors property="checkPurpose"/>
        <html:text property="checkPurpose" styleId="checkPurpose" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="sceneCheckForm.checkInstance"/>
        <html:errors property="checkInstance"/>
        <html:text property="checkInstance" styleId="checkInstance" styleClass="text medium"/>

    </li>

        <li>
    <div>
	<div class="left">
             <apcasu:label styleClass="desc" key="sceneCheckForm.checkMan"/>
        <html:errors property="checkMan"/>
        <html:text property="checkMan" styleId="checkMan" styleClass="text medium"/>

		</div>
		<div>
         <apcasu:label styleClass="desc" key="sceneCheckForm.eyewithness"/>
        <html:errors property="eyewithness"/>
        <html:text property="eyewithness" styleId="eyewithness" styleClass="text medium"/>
		</div>
		</div>
    </li>
   
    <li>
        <apcasu:label styleClass="desc" key="sceneCheckForm.notesKey"/>
        <html:errors property="notesKey"/>
        <html:text property="notesKey" styleId="notesKey" styleClass="text medium"/>
    </li>
    <li>
        <apcasu:label styleClass="desc" key="sceneCheckForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>
    </li>



    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.next"/>
        </html:submit>
        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.previous"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("sceneCheckForm"));
</script>

<html:javascript formName="sceneCheckForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
