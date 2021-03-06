package com.rosy.investigate.webapp.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import com.rosy.webapp.form.BaseForm;

/**
 * Generated by XDoclet/actionform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="releaseForceWritForm" 
 */
public class ReleaseForceWritForm
    extends    BaseForm
    implements java.io.Serializable
{

    protected String id;

    protected String depNum;

    protected String adminOrder;

    protected String keyWord;

    protected String serialNum;

    protected String ntitle;

    protected String rdate;

    protected String ndate;

    protected String norg;

    protected String createDate;

    protected String rflag;

    protected String remark;

    /** Default empty constructor. */
    public ReleaseForceWritForm() {}

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

    public String getNtitle()
    {
        return this.ntitle;
    }
   /**
    */

    public void setNtitle( String ntitle )
    {
        this.ntitle = ntitle;
    }

    public String getRdate()
    {
        return this.rdate;
    }
   /**
    */

    public void setRdate( String rdate )
    {
        this.rdate = rdate;
    }

    public String getNdate()
    {
        return this.ndate;
    }
   /**
    */

    public void setNdate( String ndate )
    {
        this.ndate = ndate;
    }

    public String getNorg()
    {
        return this.norg;
    }
   /**
    */

    public void setNorg( String norg )
    {
        this.norg = norg;
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

        /* To add non XDoclet-generated methods, create a file named
           xdoclet-ReleaseForceWritForm.java 
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
