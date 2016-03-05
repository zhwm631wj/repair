package com.rosy.punish.webapp.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import com.rosy.webapp.form.BaseForm;

/**
 * Generated by XDoclet/actionform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="punishDraftForm" 
 */
public class PunishDraftForm
    extends    BaseForm
    implements java.io.Serializable
{

    protected String id;

    protected String depNum;

    protected String adminOrder;

    protected String keyWord;

    protected String serialNum;

    protected String writContent;

    protected String draftDate;

    protected String lawPartIdea;

    protected String lawPartMan;

    protected String lawPartCheckDate;

    protected String lawPartOrg;

    protected String directorGeneralIdea;

    protected String directorGeneral;

    protected String directorCheckDate;

    protected String directorOrg;

    protected String remark;

    protected String rflag;

    protected String createDate;

    /** Default empty constructor. */
    public PunishDraftForm() {}

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

    public String getWritContent()
    {
        return this.writContent;
    }
   /**
    */

    public void setWritContent( String writContent )
    {
        this.writContent = writContent;
    }

    public String getDraftDate()
    {
        return this.draftDate;
    }
   /**
    */

    public void setDraftDate( String draftDate )
    {
        this.draftDate = draftDate;
    }

    public String getLawPartIdea()
    {
        return this.lawPartIdea;
    }
   /**
    */

    public void setLawPartIdea( String lawPartIdea )
    {
        this.lawPartIdea = lawPartIdea;
    }

    public String getLawPartMan()
    {
        return this.lawPartMan;
    }
   /**
    */

    public void setLawPartMan( String lawPartMan )
    {
        this.lawPartMan = lawPartMan;
    }

    public String getLawPartCheckDate()
    {
        return this.lawPartCheckDate;
    }
   /**
    */

    public void setLawPartCheckDate( String lawPartCheckDate )
    {
        this.lawPartCheckDate = lawPartCheckDate;
    }

    public String getLawPartOrg()
    {
        return this.lawPartOrg;
    }
   /**
    */

    public void setLawPartOrg( String lawPartOrg )
    {
        this.lawPartOrg = lawPartOrg;
    }

    public String getDirectorGeneralIdea()
    {
        return this.directorGeneralIdea;
    }
   /**
    */

    public void setDirectorGeneralIdea( String directorGeneralIdea )
    {
        this.directorGeneralIdea = directorGeneralIdea;
    }

    public String getDirectorGeneral()
    {
        return this.directorGeneral;
    }
   /**
    */

    public void setDirectorGeneral( String directorGeneral )
    {
        this.directorGeneral = directorGeneral;
    }

    public String getDirectorCheckDate()
    {
        return this.directorCheckDate;
    }
   /**
    */

    public void setDirectorCheckDate( String directorCheckDate )
    {
        this.directorCheckDate = directorCheckDate;
    }

    public String getDirectorOrg()
    {
        return this.directorOrg;
    }
   /**
    */

    public void setDirectorOrg( String directorOrg )
    {
        this.directorOrg = directorOrg;
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
           xdoclet-PunishDraftForm.java 
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
