package com.rosy.punish.webapp.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import com.rosy.webapp.form.BaseForm;

/**
 * Generated by XDoclet/actionform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="transferCaseForm" 
 */
public class TransferCaseForm
    extends    BaseForm
    implements java.io.Serializable
{

    protected String id;

    protected String eventId;

    protected String content;

    protected String transMan;

    protected String headship;

    protected String transOrg;

    protected String transDate;

    protected String noteMan;

    protected String noteDate;

    protected String acceptIdea;

    protected String acceptDate;

    protected String acceptMan;

    protected String remark;

    protected String rflag;

    protected String createDate;

    protected String caseStatus;

    /** Default empty constructor. */
    public TransferCaseForm() {}

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

    public String getContent()
    {
        return this.content;
    }
   /**
    */

    public void setContent( String content )
    {
        this.content = content;
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

    public String getHeadship()
    {
        return this.headship;
    }
   /**
    */

    public void setHeadship( String headship )
    {
        this.headship = headship;
    }

    public String getTransOrg()
    {
        return this.transOrg;
    }
   /**
    */

    public void setTransOrg( String transOrg )
    {
        this.transOrg = transOrg;
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

    public String getNoteMan()
    {
        return this.noteMan;
    }
   /**
    */

    public void setNoteMan( String noteMan )
    {
        this.noteMan = noteMan;
    }

    public String getNoteDate()
    {
        return this.noteDate;
    }
   /**
    */

    public void setNoteDate( String noteDate )
    {
        this.noteDate = noteDate;
    }

    public String getAcceptIdea()
    {
        return this.acceptIdea;
    }
   /**
    */

    public void setAcceptIdea( String acceptIdea )
    {
        this.acceptIdea = acceptIdea;
    }

    public String getAcceptDate()
    {
        return this.acceptDate;
    }
   /**
    */

    public void setAcceptDate( String acceptDate )
    {
        this.acceptDate = acceptDate;
    }

    public String getAcceptMan()
    {
        return this.acceptMan;
    }
   /**
    */

    public void setAcceptMan( String acceptMan )
    {
        this.acceptMan = acceptMan;
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

    public String getCaseStatus()
    {
        return this.caseStatus;
    }
   /**
    */

    public void setCaseStatus( String caseStatus )
    {
        this.caseStatus = caseStatus;
    }

        /* To add non XDoclet-generated methods, create a file named
           xdoclet-TransferCaseForm.java 
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