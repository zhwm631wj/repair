package com.rosy.register.webapp.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import com.rosy.webapp.form.BaseForm;

/**
 * Generated by XDoclet/actionform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="sceneCheckForm" 
 */
public class SceneCheckForm
    extends    BaseForm
    implements java.io.Serializable
{

    protected String id;

    protected String eventId;

    protected String startTime;

    protected String endTime;

    protected String checkWhere;

    protected String checkMan;

    protected String party;

    protected String checkPurpose;

    protected String checkInstance;

    protected String eyewithness;

    protected String notesKey;

    protected String remark;

    protected String rflag;

    protected String createDate;

    protected String caseStatus;

    /** Default empty constructor. */
    public SceneCheckForm() {}

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

    public String getStartTime()
    {
        return this.startTime;
    }
   /**
    */

    public void setStartTime( String startTime )
    {
        this.startTime = startTime;
    }

    public String getEndTime()
    {
        return this.endTime;
    }
   /**
    */

    public void setEndTime( String endTime )
    {
        this.endTime = endTime;
    }

    public String getCheckWhere()
    {
        return this.checkWhere;
    }
   /**
    */

    public void setCheckWhere( String checkWhere )
    {
        this.checkWhere = checkWhere;
    }

    public String getCheckMan()
    {
        return this.checkMan;
    }
   /**
    */

    public void setCheckMan( String checkMan )
    {
        this.checkMan = checkMan;
    }

    public String getParty()
    {
        return this.party;
    }
   /**
    */

    public void setParty( String party )
    {
        this.party = party;
    }

    public String getCheckPurpose()
    {
        return this.checkPurpose;
    }
   /**
    */

    public void setCheckPurpose( String checkPurpose )
    {
        this.checkPurpose = checkPurpose;
    }

    public String getCheckInstance()
    {
        return this.checkInstance;
    }
   /**
    */

    public void setCheckInstance( String checkInstance )
    {
        this.checkInstance = checkInstance;
    }

    public String getEyewithness()
    {
        return this.eyewithness;
    }
   /**
    */

    public void setEyewithness( String eyewithness )
    {
        this.eyewithness = eyewithness;
    }

    public String getNotesKey()
    {
        return this.notesKey;
    }
   /**
    */

    public void setNotesKey( String notesKey )
    {
        this.notesKey = notesKey;
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
           xdoclet-SceneCheckForm.java 
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
