package com.rosy.relation.model;
// Generated 2008-11-17 20:13:55 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="re_inorout_proplist"
 *     
 */

public class ReInOrOutPropList extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String ioid;
    private String lisId;
    private String remark;
    private String rflag;
    private Date createDate;


    // Constructors

    /** default constructor */
    public ReInOrOutPropList() {
    }

	/** minimal constructor */
    public ReInOrOutPropList(String ioid, String lisId) {
        this.ioid = ioid;
        this.lisId = lisId;
    }
    
    /** full constructor */
    public ReInOrOutPropList(String ioid, String lisId, String remark, String rflag, Date createDate) {
        this.ioid = ioid;
        this.lisId = lisId;
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
     *             column="ioID"
     *             length="48"
     *             not-null="true"
     *         
     */

    public String getIoid() {
        return this.ioid;
    }
    
    public void setIoid(String ioid) {
        this.ioid = ioid;
    }
    /**       
     *      *            @hibernate.property
     *             column="lisID"
     *             length="48"
     *             not-null="true"
     *         
     */

    public String getLisId() {
        return this.lisId;
    }
    
    public void setLisId(String lisId) {
        this.lisId = lisId;
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
      buffer.append("ioid").append("='").append(getIoid()).append("' ");			
      buffer.append("lisId").append("='").append(getLisId()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ReInOrOutPropList) ) return false;
		 ReInOrOutPropList castOther = ( ReInOrOutPropList ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getIoid()==castOther.getIoid()) || ( this.getIoid()!=null && castOther.getIoid()!=null && this.getIoid().equals(castOther.getIoid()) ) )
 && ( (this.getLisId()==castOther.getLisId()) || ( this.getLisId()!=null && castOther.getLisId()!=null && this.getLisId().equals(castOther.getLisId()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getIoid() == null ? 0 : this.getIoid().hashCode() );
         result = 37 * result + ( getLisId() == null ? 0 : this.getLisId().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
