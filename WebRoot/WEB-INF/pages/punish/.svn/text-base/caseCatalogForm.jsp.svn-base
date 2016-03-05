<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="caseCatalogDetail.title"/></title>
<content tag="heading"><fmt:message key="caseCatalogDetail.heading"/></content>

<html:form action="saveCaseCatalog" method="post" styleId="caseCatalogForm" onsubmit="return validateCaseCatalogForm(this)">
<ul>

<html:hidden property="id"/>

    <li>
        <apcasu:label styleClass="desc" key="caseCatalogForm.orderNum"/>
        <html:errors property="orderNum"/>
        <html:text property="orderNum" styleId="orderNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseCatalogForm.stuffName"/>
        <html:errors property="stuffName"/>
        <html:text property="stuffName" styleId="stuffName" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseCatalogForm.bookDate"/>
        <html:errors property="bookDate"/>
        <html:text property="bookDate" styleId="bookDate" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseCatalogForm.pages"/>
        <html:errors property="pages"/>
        <html:text property="pages" styleId="pages" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseCatalogForm.pageNum"/>
        <html:errors property="pageNum"/>
        <html:text property="pageNum" styleId="pageNum" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseCatalogForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseCatalogForm.rflag"/>
        <html:errors property="rflag"/>
        <html:text property="rflag" styleId="rflag" styleClass="text medium"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="caseCatalogForm.createDate"/>
        <html:errors property="createDate"/>
        <html:text property="createDate" styleId="createDate" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>

        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('CaseCatalog')">
            <fmt:message key="button.delete"/>
        </html:submit>

        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>

<script type="text/javascript">
    Form.focusFirstElement($("caseCatalogForm"));
</script>

<html:javascript formName="caseCatalogForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
