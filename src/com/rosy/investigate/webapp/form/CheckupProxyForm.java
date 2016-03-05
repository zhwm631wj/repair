package com.rosy.investigate.webapp.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import com.rosy.webapp.form.BaseForm;

/**
 * Generated by XDoclet/actionform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="checkupProxyForm" 
 */
public class CheckupProxyForm
    extends    BaseForm
    implements java.io.Serializable
{

    protected String id;

    protected String depNum;

    protected String adminOrder;

    protected String keyWord;

    protected String serialNum;

    protected String consignRequire;

    protected String consignOrg;

    protected String consignDate;

    protected String consignMan;

    protected String consignPost;

    protected String remark;

    protected String rflag;

    protected String createDate;

    /** Default empty constructor. */
    public CheckupProxyForm() {}

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

    public String getConsignRequire()
    {
        return this.consignRequire;
    }
   /**
    */

    public void setConsignRequire( String consignRequire )
    {
        this.consignRequire = consignRequire;
    }

    public String getConsignOrg()
    {
        return this.consignOrg;
    }
   /**
    */

    public void setConsignOrg( String consignOrg )
    {
        this.consignOrg = consignOrg;
    }

    public String getConsignDate()
    {
        return this.consignDate;
    }
   /**
    */

    public void setConsignDate( String consignDate )
    {
        this.consignDate = consignDate;
    }

    public String getConsignMan()
    {
        return this.consignMan;
    }
   /**
    */

    public void setConsignMan( String consignMan )
    {
        this.consignMan = consignMan;
    }

    public String getConsignPost()
    {
        return this.consignPost;
    }
   /**
    */

    public void setConsignPost( String consignPost )
    {
        this.consignPost = consignPost;
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
           xdoclet-CheckupProxyForm.java 
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