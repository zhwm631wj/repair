package com.rosy.register.model;
// Generated 2008-11-2 19:50:27 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="scenecheck"
 *     
 */

public class SceneCheck extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String eventId;
    private java.util.Date startTime;
    private java.util.Date endTime;
    private String checkWhere;
    private String checkMan;
    private String party;
    private String checkPurpose;
    private String checkInstance;
    private String eyewithness;
    private String notesKey;
    private String remark;
    private String rflag;
    private java.util.Date createDate;
    private String caseStatus;


    // Constructors

    /** default constructor */
    public SceneCheck() {
    }

    
    /** full constructor */
    public SceneCheck(String eventId, java.util.Date startTime, java.util.Date endTime, String checkWhere, String checkMan, String party, String checkPurpose,String checkInstance, String eyewithness, String notesKey, String remark, String rflag, java.util.Date createDate, String caseStatus) {
        this.eventId = eventId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.checkWhere = checkWhere;
        this.checkMan = checkMan;
        this.party = party;
        this.checkPurpose = checkPurpose;
        this.checkInstance = checkInstance;
        this.eyewithness = eyewithness;
        this.notesKey = notesKey;
        this.remark = remark;
        this.rflag = rflag;
        this.createDate = createDate;
        this.caseStatus = caseStatus;
    }
    

   
    // Property accessors
    /**       
     *      *            @hibernate.id
     *             generator-class="native"
     *             type="java.lang.String"
     *             column="ID"
     *         
     */

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    /**       
     *      *            @hibernate.property
     *             column="eventID"
     *             length="48"
     *         
     */

    public String getEventId() {
        return this.eventId;
    }
    
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    /**       
     *      *            @hibernate.property
     *             column="startTime"
     *             length="19"
     *         
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    /**       
     *      *            @hibernate.property
     *             column="endTime"
     *             length="19"
     *         
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    /**       
     *      *            @hibernate.property
     *             column="checkWhere"
     *             length="100"
     *         
     */

    public String getCheckWhere() {
        return this.checkWhere;
    }
    
    public void setCheckWhere(String checkWhere) {
        this.checkWhere = checkWhere;
    }
    /**       
     *      *            @hibernate.property
     *             column="checkMan"
     *             length="100"
     *         
     */

    public String getCheckMan() {
        return this.checkMan;
    }
    
    public void setCheckMan(String checkMan) {
        this.checkMan = checkMan;
    }
    /**       
     *      *            @hibernate.property
     *             column="party"
     *             length="30"
     *         
     */

    public String getParty() {
        return this.party;
    }
    
    public void setParty(String party) {
        this.party = party;
    }
    /**       
     *      *            @hibernate.property
     *             column="checkPurpose"
     *             length="100"
     *         
     */

    public String getCheckPurpose() {
        return this.checkPurpose;
    }
    
    public void setCheckPurpose(String checkPurpose) {
        this.checkPurpose = checkPurpose;
    }
    /**       
     *      *            @hibernate.property
     *             column="checkInstance"
     *             length="1000"
     *         
     */

    public String getCheckInstance() {
        return this.checkInstance;
    }
    
    public void setCheckInstance(String checkInstance) {
        this.checkInstance = checkInstance;
    }
    /**       
     *      *            @hibernate.property
     *             column="eyewithness"
     *             length="30"
     *         
     */

    public String getEyewithness() {
        return this.eyewithness;
    }
    
    public void setEyewithness(String eyewithness) {
        this.eyewithness = eyewithness;
    }
    /**       
     *      *            @hibernate.property
     *             column="notesKey"
     *             length="48"
     *         
     */

    public String getNotesKey() {
        return this.notesKey;
    }
    
    public void setNotesKey(String notesKey) {
        this.notesKey = notesKey;
    }
    /**       
     *      *            @hibernate.property
     *             column="remark"
     *             length="200"
     *         
     */

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    /**       
     *      *            @hibernate.property
     *             column="rFlag"
     *             length="1"
     *         
     */

    public String getRflag() {
        return this.rflag;
    }
    
    public void setRflag(String rflag) {
        this.rflag = rflag;
    }
    /**       
     *      *            @hibernate.property
     *             column="createDate"
     *             length="19"
     *         
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    /**       
     *      *            @hibernate.property
     *             column="caseStatus"
     *             length="1"
     *         
     */

    public String getCaseStatus() {
        return this.caseStatus;
    }
    
    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }
   

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("eventId").append("='").append(getEventId()).append("' ");			
      buffer.append("startTime").append("='").append(getStartTime()).append("' ");			
      buffer.append("endTime").append("='").append(getEndTime()).append("' ");			
      buffer.append("checkWhere").append("='").append(getCheckWhere()).append("' ");			
      buffer.append("checkMan").append("='").append(getCheckMan()).append("' ");			
      buffer.append("party").append("='").append(getParty()).append("' ");			
      buffer.append("checkPurpose").append("='").append(getCheckPurpose()).append("' ");			
      buffer.append("checkInstance").append("='").append(getCheckInstance()).append("' ");			
      buffer.append("eyewithness").append("='").append(getEyewithness()).append("' ");			
      buffer.append("notesKey").append("='").append(getNotesKey()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("caseStatus").append("='").append(getCaseStatus()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SceneCheck) ) return false;
		 SceneCheck castOther = ( SceneCheck ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getEventId()==castOther.getEventId()) || ( this.getEventId()!=null && castOther.getEventId()!=null && this.getEventId().equals(castOther.getEventId()) ) )
 && ( (this.getStartTime()==castOther.getStartTime()) || ( this.getStartTime()!=null && castOther.getStartTime()!=null && this.getStartTime().equals(castOther.getStartTime()) ) )
 && ( (this.getEndTime()==castOther.getEndTime()) || ( this.getEndTime()!=null && castOther.getEndTime()!=null && this.getEndTime().equals(castOther.getEndTime()) ) )
 && ( (this.getCheckWhere()==castOther.getCheckWhere()) || ( this.getCheckWhere()!=null && castOther.getCheckWhere()!=null && this.getCheckWhere().equals(castOther.getCheckWhere()) ) )
 && ( (this.getCheckMan()==castOther.getCheckMan()) || ( this.getCheckMan()!=null && castOther.getCheckMan()!=null && this.getCheckMan().equals(castOther.getCheckMan()) ) )
 && ( (this.getParty()==castOther.getParty()) || ( this.getParty()!=null && castOther.getParty()!=null && this.getParty().equals(castOther.getParty()) ) )
 && ( (this.getCheckPurpose()==castOther.getCheckPurpose()) || ( this.getCheckPurpose()!=null && castOther.getCheckPurpose()!=null && this.getCheckPurpose().equals(castOther.getCheckPurpose()) ) )
 && ( (this.getCheckInstance()==castOther.getCheckInstance()) || ( this.getCheckInstance()!=null && castOther.getCheckInstance()!=null && this.getCheckInstance().equals(castOther.getCheckInstance()) ) )
 && ( (this.getEyewithness()==castOther.getEyewithness()) || ( this.getEyewithness()!=null && castOther.getEyewithness()!=null && this.getEyewithness().equals(castOther.getEyewithness()) ) )
 && ( (this.getNotesKey()==castOther.getNotesKey()) || ( this.getNotesKey()!=null && castOther.getNotesKey()!=null && this.getNotesKey().equals(castOther.getNotesKey()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) )
 && ( (this.getCaseStatus()==castOther.getCaseStatus()) || ( this.getCaseStatus()!=null && castOther.getCaseStatus()!=null && this.getCaseStatus().equals(castOther.getCaseStatus()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getEventId() == null ? 0 : this.getEventId().hashCode() );
         result = 37 * result + ( getStartTime() == null ? 0 : this.getStartTime().hashCode() );
         result = 37 * result + ( getEndTime() == null ? 0 : this.getEndTime().hashCode() );
         result = 37 * result + ( getCheckWhere() == null ? 0 : this.getCheckWhere().hashCode() );
         result = 37 * result + ( getCheckMan() == null ? 0 : this.getCheckMan().hashCode() );
         result = 37 * result + ( getParty() == null ? 0 : this.getParty().hashCode() );
         result = 37 * result + ( getCheckPurpose() == null ? 0 : this.getCheckPurpose().hashCode() );
         result = 37 * result + ( getCheckInstance() == null ? 0 : this.getCheckInstance().hashCode() );
         result = 37 * result + ( getEyewithness() == null ? 0 : this.getEyewithness().hashCode() );
         result = 37 * result + ( getNotesKey() == null ? 0 : this.getNotesKey().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         result = 37 * result + ( getCaseStatus() == null ? 0 : this.getCaseStatus().hashCode() );
         return result;
   }   





}
