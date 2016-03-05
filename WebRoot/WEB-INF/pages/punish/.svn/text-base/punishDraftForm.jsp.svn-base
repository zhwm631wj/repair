<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="punishDraftDetail.title"/></title>
<content tag="heading"><fmt:message key="punishDraftDetail.heading"/></content>

<html:form action="savePunishDraft" method="post" styleId="punishDraftForm" onsubmit="return validatePunishDraftForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.depNum"/>
        <html:errors property="depNum"/>
        <html:text property="depNum" styleId="depNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.adminOrder"/>
        <html:errors property="adminOrder"/>
        <html:text property="adminOrder" styleId="adminOrder" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.keyWord"/>
        <html:errors property="keyWord"/>
        <html:text property="keyWord" styleId="keyWord" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.serialNum"/>
        <html:errors property="serialNum"/>
        <html:text property="serialNum" styleId="serialNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.writContent"/>
        <html:errors property="writContent"/>
        <html:text property="writContent" styleId="writContent" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.draftDate"/>
        <html:errors property="draftDate"/>
        <html:text property="draftDate" styleId="draftDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.lawPartIdea"/>
        <html:errors property="lawPartIdea"/>
        <html:text property="lawPartIdea" styleId="lawPartIdea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.lawPartMan"/>
        <html:errors property="lawPartMan"/>
        <html:text property="lawPartMan" styleId="lawPartMan" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.lawPartCheckDate"/>
        <html:errors property="lawPartCheckDate"/>
        <html:text property="lawPartCheckDate" styleId="lawPartCheckDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.lawPartOrg"/>
        <html:errors property="lawPartOrg"/>
        <html:text property="lawPartOrg" styleId="lawPartOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.directorGeneralIdea"/>
        <html:errors property="directorGeneralIdea"/>
        <html:text property="directorGeneralIdea" styleId="directorGeneralIdea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.directorGeneral"/>
        <html:errors property="directorGeneral"/>
        <html:text property="directorGeneral" styleId="directorGeneral" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.directorCheckDate"/>
        <html:errors property="directorCheckDate"/>
        <html:text property="directorCheckDate" styleId="directorCheckDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.directorOrg"/>
        <html:errors property="directorOrg"/>
        <html:text property="directorOrg" styleId="directorOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="punishDraftForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('PunishDraft')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("punishDraftForm"));
</script>

<html:javascript formName="punishDraftForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
