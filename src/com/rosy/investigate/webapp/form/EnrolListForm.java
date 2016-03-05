package com.rosy.investigate.webapp.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import com.rosy.webapp.form.BaseForm;

/**
 * Generated by XDoclet/actionform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="enrolListForm" 
 */
public class EnrolListForm
    extends    BaseForm
    implements java.io.Serializable
{

    protected String id;

    protected String listId;

    protected String depNum;

    protected String adminOrder;

    protected String keyWord;

    protected String serialNum;

    protected String problemDescribe;

    protected String keepedBy;

    protected String keepPlace;

    protected String keeper;

    protected String keepDate;

    protected String createDate;

    protected String rflag;

    protected String remark;

    /** Default empty constructor. */
    public EnrolListForm() {}

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

    public String getListId()
    {
        return this.listId;
    }
   /**
    */

    public void setListId( String listId )
    {
        this.listId = listId;
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

    public String getProblemDescribe()
    {
        return this.problemDescribe;
    }
   /**
    */

    public void setProblemDescribe( String problemDescribe )
    {
        this.problemDescribe = problemDescribe;
    }

    public String getKeepedBy()
    {
        return this.keepedBy;
    }
   /**
    */

    public void setKeepedBy( String keepedBy )
    {
        this.keepedBy = keepedBy;
    }

    public String getKeepPlace()
    {
        return this.keepPlace;
    }
   /**
    */

    public void setKeepPlace( String keepPlace )
    {
        this.keepPlace = keepPlace;
    }

    public String getKeeper()
    {
        return this.keeper;
    }
   /**
    */

    public void setKeeper( String keeper )
    {
        this.keeper = keeper;
    }

    public String getKeepDate()
    {
        return this.keepDate;
    }
   /**
    */

    public void setKeepDate( String keepDate )
    {
        this.keepDate = keepDate;
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
           xdoclet-EnrolListForm.java 
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
