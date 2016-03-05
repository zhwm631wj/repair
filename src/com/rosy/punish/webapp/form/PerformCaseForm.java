package com.rosy.punish.webapp.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import com.rosy.webapp.form.BaseForm;

/**
 * Generated by XDoclet/actionform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="performCaseForm" 
 */
public class PerformCaseForm
    extends    BaseForm
    implements java.io.Serializable
{

    protected String id;

    protected String caseFine;

    protected String confiscateProperty;

    protected String infine;

    protected String notInFine;

    protected String confiscateState;

    protected String propertyKeep;

    protected String decideMeasure;

    protected String remark;

    protected String rflag;

    protected String createDate;

    /** Default empty constructor. */
    public PerformCaseForm() {}

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

    public String getCaseFine()
    {
        return this.caseFine;
    }
   /**
    */

    public void setCaseFine( String caseFine )
    {
        this.caseFine = caseFine;
    }

    public String getConfiscateProperty()
    {
        return this.confiscateProperty;
    }
   /**
    */

    public void setConfiscateProperty( String confiscateProperty )
    {
        this.confiscateProperty = confiscateProperty;
    }

    public String getInfine()
    {
        return this.infine;
    }
   /**
    */

    public void setInfine( String infine )
    {
        this.infine = infine;
    }

    public String getNotInFine()
    {
        return this.notInFine;
    }
   /**
    */

    public void setNotInFine( String notInFine )
    {
        this.notInFine = notInFine;
    }

    public String getConfiscateState()
    {
        return this.confiscateState;
    }
   /**
    */

    public void setConfiscateState( String confiscateState )
    {
        this.confiscateState = confiscateState;
    }

    public String getPropertyKeep()
    {
        return this.propertyKeep;
    }
   /**
    */

    public void setPropertyKeep( String propertyKeep )
    {
        this.propertyKeep = propertyKeep;
    }

    public String getDecideMeasure()
    {
        return this.decideMeasure;
    }
   /**
    */

    public void setDecideMeasure( String decideMeasure )
    {
        this.decideMeasure = decideMeasure;
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
           xdoclet-PerformCaseForm.java 
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