package com.rosy.punish.model;
// Generated 2008-11-2 19:50:26 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="caseinvestendreport"
 *     
 */

public class CaseInvestEndReport extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String repContent;
    private java.util.Date finishDate;
    private String remark;
    private String rflag;
    private java.util.Date createDate;


    // Constructors

    /** default constructor */
    public CaseInvestEndReport() {
    }

    
    /** full constructor */
    public CaseInvestEndReport(String repContent, java.util.Date finishDate, String remark, String rflag, java.util.Date createDate) {
        this.repContent = repContent;
        this.finishDate = finishDate;
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
     *             column="repContent"
     *             length="8000"
     *         
     */

    public String getRepContent() {
        return this.repContent;
    }
    
    public void setRepContent(String repContent) {
        this.repContent = repContent;
    }
    /**       
     *      *            @hibernate.property
     *             column="finishDate"
     *             length="19"
     *         
     */

    public java.util.Date getFinishDate() {
        return this.finishDate;
    }
    
    public void setFinishDate(java.util.Date finishDate) {
        this.finishDate = finishDate;
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
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("repContent").append("='").append(getRepContent()).append("' ");			
      buffer.append("finishDate").append("='").append(getFinishDate()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CaseInvestEndReport) ) return false;
		 CaseInvestEndReport castOther = ( CaseInvestEndReport ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getRepContent()==castOther.getRepContent()) || ( this.getRepContent()!=null && castOther.getRepContent()!=null && this.getRepContent().equals(castOther.getRepContent()) ) )
 && ( (this.getFinishDate()==castOther.getFinishDate()) || ( this.getFinishDate()!=null && castOther.getFinishDate()!=null && this.getFinishDate().equals(castOther.getFinishDate()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getRepContent() == null ? 0 : this.getRepContent().hashCode() );
         result = 37 * result + ( getFinishDate() == null ? 0 : this.getFinishDate().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
