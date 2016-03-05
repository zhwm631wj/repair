package com.rosy.relation.model;
// Generated 2008-11-17 20:13:56 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="re_forcewrit_receipt"
 *     
 */

public class ReForceWritReceipt extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String recId;
    private String forId;
    private String remark;
    private String rflag;
    private Date createDate;


    // Constructors

    /** default constructor */
    public ReForceWritReceipt() {
    }

	/** minimal constructor */
    public ReForceWritReceipt(String recId, String forId) {
        this.recId = recId;
        this.forId = forId;
    }
    
    /** full constructor */
    public ReForceWritReceipt(String recId, String forId, String remark, String rflag, Date createDate) {
        this.recId = recId;
        this.forId = forId;
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
     *             column="recID"
     *             length="48"
     *             not-null="true"
     *         
     */

    public String getRecId() {
        return this.recId;
    }
    
    public void setRecId(String recId) {
        this.recId = recId;
    }
    /**       
     *      *            @hibernate.property
     *             column="forID"
     *             length="48"
     *             not-null="true"
     *         
     */

    public String getForId() {
        return this.forId;
    }
    
    public void setForId(String forId) {
        this.forId = forId;
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
      buffer.append("recId").append("='").append(getRecId()).append("' ");			
      buffer.append("forId").append("='").append(getForId()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ReForceWritReceipt) ) return false;
		 ReForceWritReceipt castOther = ( ReForceWritReceipt ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getRecId()==castOther.getRecId()) || ( this.getRecId()!=null && castOther.getRecId()!=null && this.getRecId().equals(castOther.getRecId()) ) )
 && ( (this.getForId()==castOther.getForId()) || ( this.getForId()!=null && castOther.getForId()!=null && this.getForId().equals(castOther.getForId()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getRecId() == null ? 0 : this.getRecId().hashCode() );
         result = 37 * result + ( getForId() == null ? 0 : this.getForId().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
