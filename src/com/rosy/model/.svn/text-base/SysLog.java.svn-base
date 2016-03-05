package com.rosy.model;
// Generated 2008-11-5 10:20:57 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="syslog"
 *     
 */

public class SysLog extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String caseId;
    private String endTime;
    private String startTime;
    private Date timePoint;
    private String userId;
    private String username;
    private String orgNum;
    private String orgName;
    private String description;
    private String rflag;
    private Date createDate;


    // Constructors

    /** default constructor */
    public SysLog() {
    }

	/** minimal constructor */
    public SysLog(String caseId, Date timePoint) {
        this.caseId = caseId;
        this.timePoint = timePoint;
    }
    
    /** full constructor */
    public SysLog(String caseId, String endTime, String startTime, Date timePoint, String userId, String username, String orgNum, String orgName, String description, String rflag, Date createDate) {
        this.caseId = caseId;
        this.endTime = endTime;
        this.startTime = startTime;
        this.timePoint = timePoint;
        this.userId = userId;
        this.username = username;
        this.orgNum = orgNum;
        this.orgName = orgName;
        this.description = description;
        this.rflag = rflag;
        this.createDate = createDate;
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
     *             column="caseID"
     *             length="48"
     *             not-null="true"
     *         
     */

    public String getCaseId() {
        return this.caseId;
    }
    
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }
    /**       
     *      *            @hibernate.property
     *             column="endTime"
     *             length="100"
     *         
     */

    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    /**       
     *      *            @hibernate.property
     *             column="startTime"
     *             length="100"
     *         
     */

    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    /**       
     *      *            @hibernate.property
     *             column="timePoint"
     *             length="19"
     *             not-null="true"
     *         
     */

    public Date getTimePoint() {
        return this.timePoint;
    }
    
    public void setTimePoint(Date timePoint) {
        this.timePoint = timePoint;
    }
    /**       
     *      *            @hibernate.property
     *             column="userID"
     *             length="30"
     *         
     */

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**       
     *      *            @hibernate.property
     *             column="username"
     *             length="30"
     *         
     */

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    /**       
     *      *            @hibernate.property
     *             column="orgNum"
     *             length="30"
     *         
     */

    public String getOrgNum() {
        return this.orgNum;
    }
    
    public void setOrgNum(String orgNum) {
        this.orgNum = orgNum;
    }
    /**       
     *      *            @hibernate.property
     *             column="orgName"
     *             length="50"
     *         
     */

    public String getOrgName() {
        return this.orgName;
    }
    
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    /**       
     *      *            @hibernate.property
     *             column="description"
     *             length="4000"
     *         
     */

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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

    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
   

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("caseId").append("='").append(getCaseId()).append("' ");			
      buffer.append("endTime").append("='").append(getEndTime()).append("' ");			
      buffer.append("startTime").append("='").append(getStartTime()).append("' ");			
      buffer.append("timePoint").append("='").append(getTimePoint()).append("' ");			
      buffer.append("userId").append("='").append(getUserId()).append("' ");			
      buffer.append("username").append("='").append(getUsername()).append("' ");			
      buffer.append("orgNum").append("='").append(getOrgNum()).append("' ");			
      buffer.append("orgName").append("='").append(getOrgName()).append("' ");			
      buffer.append("description").append("='").append(getDescription()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SysLog) ) return false;
		 SysLog castOther = ( SysLog ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getCaseId()==castOther.getCaseId()) || ( this.getCaseId()!=null && castOther.getCaseId()!=null && this.getCaseId().equals(castOther.getCaseId()) ) )
 && ( (this.getEndTime()==castOther.getEndTime()) || ( this.getEndTime()!=null && castOther.getEndTime()!=null && this.getEndTime().equals(castOther.getEndTime()) ) )
 && ( (this.getStartTime()==castOther.getStartTime()) || ( this.getStartTime()!=null && castOther.getStartTime()!=null && this.getStartTime().equals(castOther.getStartTime()) ) )
 && ( (this.getTimePoint()==castOther.getTimePoint()) || ( this.getTimePoint()!=null && castOther.getTimePoint()!=null && this.getTimePoint().equals(castOther.getTimePoint()) ) )
 && ( (this.getUserId()==castOther.getUserId()) || ( this.getUserId()!=null && castOther.getUserId()!=null && this.getUserId().equals(castOther.getUserId()) ) )
 && ( (this.getUsername()==castOther.getUsername()) || ( this.getUsername()!=null && castOther.getUsername()!=null && this.getUsername().equals(castOther.getUsername()) ) )
 && ( (this.getOrgNum()==castOther.getOrgNum()) || ( this.getOrgNum()!=null && castOther.getOrgNum()!=null && this.getOrgNum().equals(castOther.getOrgNum()) ) )
 && ( (this.getOrgName()==castOther.getOrgName()) || ( this.getOrgName()!=null && castOther.getOrgName()!=null && this.getOrgName().equals(castOther.getOrgName()) ) )
 && ( (this.getDescription()==castOther.getDescription()) || ( this.getDescription()!=null && castOther.getDescription()!=null && this.getDescription().equals(castOther.getDescription()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getCaseId() == null ? 0 : this.getCaseId().hashCode() );
         result = 37 * result + ( getEndTime() == null ? 0 : this.getEndTime().hashCode() );
         result = 37 * result + ( getStartTime() == null ? 0 : this.getStartTime().hashCode() );
         result = 37 * result + ( getTimePoint() == null ? 0 : this.getTimePoint().hashCode() );
         result = 37 * result + ( getUserId() == null ? 0 : this.getUserId().hashCode() );
         result = 37 * result + ( getUsername() == null ? 0 : this.getUsername().hashCode() );
         result = 37 * result + ( getOrgNum() == null ? 0 : this.getOrgNum().hashCode() );
         result = 37 * result + ( getOrgName() == null ? 0 : this.getOrgName().hashCode() );
         result = 37 * result + ( getDescription() == null ? 0 : this.getDescription().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
