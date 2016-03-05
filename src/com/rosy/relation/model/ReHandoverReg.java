package com.rosy.relation.model;
// Generated 2008-11-17 20:13:56 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="re_handover_reg"
 *     
 */

public class ReHandoverReg extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String regId;
    private String havId;
    private String remark;
    private String rflag;
    private Date createDate;


    // Constructors

    /** default constructor */
    public ReHandoverReg() {
    }

	/** minimal constructor */
    public ReHandoverReg(String regId, String havId) {
        this.regId = regId;
        this.havId = havId;
    }
    
    /** full constructor */
    public ReHandoverReg(String regId, String havId, String remark, String rflag, Date createDate) {
        this.regId = regId;
        this.havId = havId;
        this.remark = remark;
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
     *             column="regID"
     *             length="48"
     *             not-null="true"
     *         
     */

    public String getRegId() {
        return this.regId;
    }
    
    public void setRegId(String regId) {
        this.regId = regId;
    }
    /**       
     *      *            @hibernate.property
     *             column="havID"
     *             length="48"
     *             not-null="true"
     *         
     */

    public String getHavId() {
        return this.havId;
    }
    
    public void setHavId(String havId) {
        this.havId = havId;
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
      buffer.append("regId").append("='").append(getRegId()).append("' ");			
      buffer.append("havId").append("='").append(getHavId()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ReHandoverReg) ) return false;
		 ReHandoverReg castOther = ( ReHandoverReg ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getRegId()==castOther.getRegId()) || ( this.getRegId()!=null && castOther.getRegId()!=null && this.getRegId().equals(castOther.getRegId()) ) )
 && ( (this.getHavId()==castOther.getHavId()) || ( this.getHavId()!=null && castOther.getHavId()!=null && this.getHavId().equals(castOther.getHavId()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getRegId() == null ? 0 : this.getRegId().hashCode() );
         result = 37 * result + ( getHavId() == null ? 0 : this.getHavId().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
