package com.rosy.punish.model;
// Generated 2008-11-5 10:54:18 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="discusscaserec"
 *     
 */

public class DiscussCaseRec extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String discussContent;
    private String discussResult;
    private String joinPersonnel;
    private Date meetingDate;
    private Date createDate;
    private String rflag;
    private String remark;


    // Constructors

    /** default constructor */
    public DiscussCaseRec() {
    }

    
    /** full constructor */
    public DiscussCaseRec(String discussContent, String discussResult, String joinPersonnel, Date meetingDate, Date createDate, String rflag, String remark) {
        this.discussContent = discussContent;
        this.discussResult = discussResult;
        this.joinPersonnel = joinPersonnel;
        this.meetingDate = meetingDate;
        this.createDate = createDate;
        this.rflag = rflag;
        this.remark = remark;
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
     *             column="discussContent"
     *             length="8000"
     *         
     */

    public String getDiscussContent() {
        return this.discussContent;
    }
    
    public void setDiscussContent(String discussContent) {
        this.discussContent = discussContent;
    }
    /**       
     *      *            @hibernate.property
     *             column="discussResult"
     *             length="1000"
     *         
     */

    public String getDiscussResult() {
        return this.discussResult;
    }
    
    public void setDiscussResult(String discussResult) {
        this.discussResult = discussResult;
    }
    /**       
     *      *            @hibernate.property
     *             column="joinPersonnel"
     *             length="1000"
     *         
     */

    public String getJoinPersonnel() {
        return this.joinPersonnel;
    }
    
    public void setJoinPersonnel(String joinPersonnel) {
        this.joinPersonnel = joinPersonnel;
    }
    /**       
     *      *            @hibernate.property
     *             column="meetingDate"
     *             length="19"
     *         
     */

    public Date getMeetingDate() {
        return this.meetingDate;
    }
    
    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
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
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("discussContent").append("='").append(getDiscussContent()).append("' ");			
      buffer.append("discussResult").append("='").append(getDiscussResult()).append("' ");			
      buffer.append("joinPersonnel").append("='").append(getJoinPersonnel()).append("' ");			
      buffer.append("meetingDate").append("='").append(getMeetingDate()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DiscussCaseRec) ) return false;
		 DiscussCaseRec castOther = ( DiscussCaseRec ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getDiscussContent()==castOther.getDiscussContent()) || ( this.getDiscussContent()!=null && castOther.getDiscussContent()!=null && this.getDiscussContent().equals(castOther.getDiscussContent()) ) )
 && ( (this.getDiscussResult()==castOther.getDiscussResult()) || ( this.getDiscussResult()!=null && castOther.getDiscussResult()!=null && this.getDiscussResult().equals(castOther.getDiscussResult()) ) )
 && ( (this.getJoinPersonnel()==castOther.getJoinPersonnel()) || ( this.getJoinPersonnel()!=null && castOther.getJoinPersonnel()!=null && this.getJoinPersonnel().equals(castOther.getJoinPersonnel()) ) )
 && ( (this.getMeetingDate()==castOther.getMeetingDate()) || ( this.getMeetingDate()!=null && castOther.getMeetingDate()!=null && this.getMeetingDate().equals(castOther.getMeetingDate()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getDiscussContent() == null ? 0 : this.getDiscussContent().hashCode() );
         result = 37 * result + ( getDiscussResult() == null ? 0 : this.getDiscussResult().hashCode() );
         result = 37 * result + ( getJoinPersonnel() == null ? 0 : this.getJoinPersonnel().hashCode() );
         result = 37 * result + ( getMeetingDate() == null ? 0 : this.getMeetingDate().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         return result;
   }   





}
