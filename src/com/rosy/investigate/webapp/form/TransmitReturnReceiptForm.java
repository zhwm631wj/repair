package com.rosy.investigate.webapp.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import com.rosy.webapp.form.BaseForm;

/**
 * Generated by XDoclet/actionform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="transmitReturnReceiptForm" 
 */
public class TransmitReturnReceiptForm
    extends    BaseForm
    implements java.io.Serializable
{

    protected String id;

    protected String eventId;

    protected String depNum;

    protected String adminOrder;

    protected String keyWord;

    protected String serialNum;

    protected String writName;

    protected String wirtNo;

    protected String inceptMan;

    protected String transDate;

    protected String transWhere;

    protected String transWay;

    protected String inceptManVisa;

    protected String transMan;

    protected String eyewitness;

    protected String eyewitnessDate;

    protected String remark;

    protected String rflag;

    protected String createDate;

    /** Default empty constructor. */
    public TransmitReturnReceiptForm() {}

    public String getId()
    {
        return this.id;
    }
   /**
    */

    public void setId( String id )
    {
        this.id = id;
    }

    public String getEventId()
    {
        return this.eventId;
    }
   /**
    */

    public void setEventId( String eventId )
    {
        this.eventId = eventId;
    }

    public String getDepNum()
    {
        return this.depNum;
    }
   /**
    */

    public void setDepNum( String depNum )
    {
        this.depNum = depNum;
    }

    public String getAdminOrder()
    {
        return this.adminOrder;
    }
   /**
    */

    public void setAdminOrder( String adminOrder )
    {
        this.adminOrder = adminOrder;
    }

    public String getKeyWord()
    {
        return this.keyWord;
    }
   /**
    */

    public void setKeyWord( String keyWord )
    {
        this.keyWord = keyWord;
    }

    public String getSerialNum()
    {
        return this.serialNum;
    }
   /**
    */

    public void setSerialNum( String serialNum )
    {
        this.serialNum = serialNum;
    }

    public String getWritName()
    {
        return this.writName;
    }
   /**
    */

    public void setWritName( String writName )
    {
        this.writName = writName;
    }

    public String getWirtNo()
    {
        return this.wirtNo;
    }
   /**
    */

    public void setWirtNo( String wirtNo )
    {
        this.wirtNo = wirtNo;
    }

    public String getInceptMan()
    {
        return this.inceptMan;
    }
   /**
    */

    public void setInceptMan( String inceptMan )
    {
        this.inceptMan = inceptMan;
    }

    public String getTransDate()
    {
        return this.transDate;
    }
   /**
    */

    public void setTransDate( String transDate )
    {
        this.transDate = transDate;
    }

    public String getTransWhere()
    {
        return this.transWhere;
    }
   /**
    */

    public void setTransWhere( String transWhere )
    {
        this.transWhere = transWhere;
    }

    public String getTransWay()
    {
        return this.transWay;
    }
   /**
    */

    public void setTransWay( String transWay )
    {
        this.transWay = transWay;
    }

    public String getInceptManVisa()
    {
        return this.inceptManVisa;
    }
   /**
    */

    public void setInceptManVisa( String inceptManVisa )
    {
        this.inceptManVisa = inceptManVisa;
    }

    public String getTransMan()
    {
        return this.transMan;
    }
   /**
    */

    public void setTransMan( String transMan )
    {
        this.transMan = transMan;
    }

    public String getEyewitness()
    {
        return this.eyewitness;
    }
   /**
    */

    public void setEyewitness( String eyewitness )
    {
        this.eyewitness = eyewitness;
    }

    public String getEyewitnessDate()
    {
        return this.eyewitnessDate;
    }
   /**
    */

    public void setEyewitnessDate( String eyewitnessDate )
    {
        this.eyewitnessDate = eyewitnessDate;
    }

    public String getRemark()
    {
        return this.remark;
    }
   /**
    */

    public void setRemark( String remark )
    {
        this.remark = remark;
    }

    public String getRflag()
    {
        return this.rflag;
    }
   /**
    */

    public void setRflag( String rflag )
    {
        this.rflag = rflag;
    }

    public String getCreateDate()
    {
        return this.createDate;
    }
   /**
    */

    public void setCreateDate( String createDate )
    {
        this.createDate = createDate;
    }

        /* To add non XDoclet-generated methods, create a file named
           xdoclet-TransmitReturnReceiptForm.java 
           containing the additional code and place it in your metadata/web directory.
        */
    /**
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping,
     *                                                javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        // reset any boolean data types to false

    }

}