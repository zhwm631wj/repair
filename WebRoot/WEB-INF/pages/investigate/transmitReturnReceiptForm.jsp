<%@ include file="/common/taglibs.jsp"%>

<title><fmt:message key="transmitReturnReceiptDetail.title"/></title>
<content tag="heading"><fmt:message key="transmitReturnReceiptDetail.heading"/></content>

<html:form action="saveTransmitReturnReceipt" method="post" styleId="transmitReturnReceiptForm" onsubmit="return validateTransmitReturnReceiptForm(this)">
<ul>

<html:hidden property="id"/>
<html:hidden property="eventId" value="1"/>
    <li>
     <div><div class="left">
        <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.depNum"/>
        <html:errors property="depNum"/>
        <html:text property="depNum" styleId="depNum" styleClass="text medium"/>
		</div><div>
 		<apcasu:label styleClass="desc" key="transmitReturnReceiptForm.adminOrder"/>
        <html:errors property="adminOrder"/>
        <html:text property="adminOrder" styleId="adminOrder" styleClass="text medium"/>
		</div></div>   
    </li>
    <li>
       <div><div class="left">
        <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.keyWord"/>
        <html:errors property="keyWord"/>
        <html:text property="keyWord" styleId="keyWord" styleClass="text medium"/>
		</div><div>
        <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.serialNum"/>
        <html:errors property="serialNum"/>
        <html:text property="serialNum" styleId="serialNum" styleClass="text medium"/>
		</div></div>   
    </li>
    <li>
        <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.writName"/>
        <html:errors property="writName"/>
        <html:text property="writName" styleId="writName" styleClass="text large"/>

    </li>

    <li>
        <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.wirtNo"/>
        <html:errors property="wirtNo"/>
        <html:text property="wirtNo" styleId="wirtNo" styleClass="text medium"/>

    </li>

    <li>
        <div><div class="left">
        <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.inceptMan"/>
        <html:errors property="inceptMan"/>
        <html:text property="inceptMan" styleId="inceptMan" styleClass="text medium"/>
		</div><div>
        <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.transDate"/>
        <html:errors property="transDate"/>
        <html:text property="transDate" styleId="transDate" styleClass="text medium"/>
		</div></div>   
    </li>
    <li>
        <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.transWhere"/>
        <html:errors property="transWhere"/>
        <html:text property="transWhere" styleId="transWhere" styleClass="text large"/>
    </li>

    <li>
        <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.transWay"/>
        <html:errors property="transWay"/>
        <html:text property="transWay" styleId="transWay" styleClass="text medium"/>

    </li>

    <li><div><div class="left">
        <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.inceptManVisa"/>
        <html:errors property="inceptManVisa"/>
        <html:text property="inceptManVisa" styleId="inceptManVisa" styleClass="text medium"/>
		</div><div>
        <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.transMan"/>
        <html:errors property="transMan"/>
        <html:text property="transMan" styleId="transMan" styleClass="text medium"/>
		</div></div>   
    </li>
    <li>
    <div><div class="left">
          <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.eyewitness"/>
        <html:errors property="eyewitness"/>
        <html:text property="eyewitness" styleId="eyewitness" styleClass="text medium"/>
		</div><div>
	      <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.eyewitnessDate"/>
        <html:errors property="eyewitnessDate"/>
        <html:text property="eyewitnessDate" styleId="eyewitnessDate" styleClass="text medium"/>
		</div></div>   
    </li>

    <li>
        <apcasu:label styleClass="desc" key="transmitReturnReceiptForm.remark"/>
        <html:errors property="remark"/>
        <html:text property="remark" styleId="remark" styleClass="text medium"/>

    </li>

    <li class="buttonBar bottom">
        <html:submit styleClass="button" property="method.save" onclick="bCancel=false">
            <fmt:message key="button.save"/>
        </html:submit>
       <c:if test="${!empty propertyListForm.id}">
        <html:submit styleClass="button" property="method.delete" onclick="bCancel=true; return confirmDelete('TransmitReturnReceipt')">
            <fmt:message key="button.delete"/>
        </html:submit>
		</c:if>
        <html:cancel styleClass="button" onclick="bCancel=true">
            <fmt:message key="button.cancel"/>
        </html:cancel>
    </li>
</ul>
</html:form>
<html:javascript formName="transmitReturnReceiptForm" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<html:rewrite page="/scripts/validator.jsp"/>"></script>
