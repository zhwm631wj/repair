<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="affixToPunishDetail.title"/></title>
<content tag="heading"><fmt:message key="affixToPunishDetail.heading"/></content>

<html:form action="saveAffixToPunish" method="post" styleId="affixToPunishForm" onsubmit="return validateAffixToPunishForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="affixToPunishForm.keyWord"/>
        <html:errors property="keyWord"/>
        <html:text property="keyWord" styleId="keyWord" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="affixToPunishForm.serialNum"/>
        <html:errors property="serialNum"/>
        <html:text property="serialNum" styleId="serialNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="affixToPunishForm.punDraft"/>
        <html:errors property="punDraft"/>
        <html:text property="punDraft" styleId="punDraft" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="affixToPunishForm.directorGeneralIdea"/>
        <html:errors property="directorGeneralIdea"/>
        <html:text property="directorGeneralIdea" styleId="directorGeneralIdea" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="affixToPunishForm.directorGeneral"/>
        <html:errors property="directorGeneral"/>
        <html:text property="directorGeneral" styleId="directorGeneral" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="affixToPunishForm.directorCheckDate"/>
        <html:errors property="directorCheckDate"/>
        <html:text property="directorCheckDate" styleId="directorCheckDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="affixToPunishForm.directorOrg"/>
        <html:errors property="directorOrg"/>
        <html:text property="directorOrg" styleId="directorOrg" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="affixToPunishForm.affixDate"/>
        <html:errors property="affixDate"/>
        <html:text property="affixDate" styleId="affixDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="affixToPunishForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="affixToPunishForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="affixToPunishForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('AffixToPunish')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("affixToPunishForm"));
</script>

<html:javascript formName="affixToPunishForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
