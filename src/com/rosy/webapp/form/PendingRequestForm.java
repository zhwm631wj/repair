package com.rosy.webapp.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import com.rosy.webapp.form.BaseForm;

/**
 * Generated by XDoclet/actionform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="pendingRequestForm" 
 */
public class PendingRequestForm
    extends    BaseForm
    implements java.io.Serializable
{

    protected String id;

    protected String caseId;

    protected String flowNum;

    protected String stepNum;

    protected String handleRoles;

    protected String rflag;

    protected String createDate;

    /** Default empty constructor. */
    public PendingRequestForm() {}

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

    public String getCaseId()
    {
        return this.caseId;
    }
   /**
    */

    public void setCaseId( String caseId )
    {
        this.caseId = caseId;
    }

    public String getFlowNum()
    {
        return this.flowNum;
    }
   /**
    */

    public void setFlowNum( String flowNum )
    {
        this.flowNum = flowNum;
    }

    public String getStepNum()
    {
        return this.stepNum;
    }
   /**
    */

    public void setStepNum( String stepNum )
    {
        this.stepNum = stepNum;
    }

    public String getHandleRoles()
    {
        return this.handleRoles;
    }
   /**
    */

    public void setHandleRoles( String handleRoles )
    {
        this.handleRoles = handleRoles;
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
           xdoclet-PendingRequestForm.java 
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
