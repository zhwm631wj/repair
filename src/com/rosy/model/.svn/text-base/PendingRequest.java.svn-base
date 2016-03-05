package com.rosy.model;
// Generated 2008-11-5 10:54:20 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="pendingrequest"
 *     
 */

public class PendingRequest extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String caseId;
    private String flowNum;
    private String stepNum;
    private String handleRoles;
    private String rflag;
    private Date createDate;


    // Constructors

    /** default constructor */
    public PendingRequest() {
    }

	/** minimal constructor */
    public PendingRequest(String caseId) {
        this.caseId = caseId;
    }
    
    /** full constructor */
    public PendingRequest(String caseId, String flowNum, String stepNum, String handleRoles, String rflag, Date createDate) {
        this.caseId = caseId;
        this.flowNum = flowNum;
        this.stepNum = stepNum;
        this.handleRoles = handleRoles;
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
     *             column="flowNum"
     *             length="100"
     *         
     */

    public String getFlowNum() {
        return this.flowNum;
    }
    
    public void setFlowNum(String flowNum) {
        this.flowNum = flowNum;
    }
    /**       
     *      *            @hibernate.property
     *             column="stepNum"
     *             length="100"
     *         
     */

    public String getStepNum() {
        return this.stepNum;
    }
    
    public void setStepNum(String stepNum) {
        this.stepNum = stepNum;
    }
    /**       
     *      *            @hibernate.property
     *             column="handleRoles"
     *             length="30"
     *         
     */

    public String getHandleRoles() {
        return this.handleRoles;
    }
    
    public void setHandleRoles(String handleRoles) {
        this.handleRoles = handleRoles;
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
      buffer.append("flowNum").append("='").append(getFlowNum()).append("' ");			
      buffer.append("stepNum").append("='").append(getStepNum()).append("' ");			
      buffer.append("handleRoles").append("='").append(getHandleRoles()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PendingRequest) ) return false;
		 PendingRequest castOther = ( PendingRequest ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getCaseId()==castOther.getCaseId()) || ( this.getCaseId()!=null && castOther.getCaseId()!=null && this.getCaseId().equals(castOther.getCaseId()) ) )
 && ( (this.getFlowNum()==castOther.getFlowNum()) || ( this.getFlowNum()!=null && castOther.getFlowNum()!=null && this.getFlowNum().equals(castOther.getFlowNum()) ) )
 && ( (this.getStepNum()==castOther.getStepNum()) || ( this.getStepNum()!=null && castOther.getStepNum()!=null && this.getStepNum().equals(castOther.getStepNum()) ) )
 && ( (this.getHandleRoles()==castOther.getHandleRoles()) || ( this.getHandleRoles()!=null && castOther.getHandleRoles()!=null && this.getHandleRoles().equals(castOther.getHandleRoles()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getCaseId() == null ? 0 : this.getCaseId().hashCode() );
         result = 37 * result + ( getFlowNum() == null ? 0 : this.getFlowNum().hashCode() );
         result = 37 * result + ( getStepNum() == null ? 0 : this.getStepNum().hashCode() );
         result = 37 * result + ( getHandleRoles() == null ? 0 : this.getHandleRoles().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
