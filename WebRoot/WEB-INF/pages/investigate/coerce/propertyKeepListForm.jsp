<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="propertyKeepListDetail.title"/></title>
<content tag="heading"><fmt:message key="propertyKeepListDetail.heading"/></content>

<html:form action="savePropertyKeepList" method="post" styleId="propertyKeepListForm" onsubmit="return validatePropertyKeepListForm(this)">
<ul>

<html:hidden property="id"/>
   <html:hidden property="listId" value="1"/>
    <li>
        <apcasu:label styleClass="desc" key="propertyKeepListForm.listId"/>
        <html:errors property="listId"/>
        <html:text property="listId" styleId="listId" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyKeepListForm.writBook"/>
        <html:errors property="writBook"/>
        <html:text property="writBook" styleId="writBook" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyKeepListForm.writNum"/>
        <html:errors property="writNum"/>
        <html:text property="writNum" styleId="writNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyKeepListForm.excuteDate"/>
        <html:errors property="excuteDate"/>
        <html:text property="excuteDate" styleId="excuteDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyKeepListForm.indate"/>
        <html:errors property="indate"/>
        <html:text property="indate" styleId="indate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyKeepListForm.inceptMan"/>
        <html:errors property="inceptMan"/>
        <html:text property="inceptMan" styleId="inceptMan" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyKeepListForm.keeper"/>
        <html:errors property="keeper"/>
        <html:text property="keeper" styleId="keeper" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyKeepListForm.inceptDate"/>
        <html:errors property="inceptDate"/>
        <html:text property="inceptDate" styleId="inceptDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyKeepListForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyKeepListForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="propertyKeepListForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('PropertyKeepList')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>
<html:javascript formName="propertyKeepListForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
