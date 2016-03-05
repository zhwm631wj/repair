package com.rosy.punish.model;
// Generated 2008-11-2 19:50:27 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="punishdecisionbook"
 *     
 */

public class PunishDecisionBook extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String depNum;
    private String adminOrder;
    private String writContent;
    private String remark;
    private String rflag;
    private java.util.Date createDate;


    // Constructors

    /** default constructor */
    public PunishDecisionBook() {
    }

    
    /** full constructor */
    public PunishDecisionBook(String depNum, String adminOrder, String writContent, String remark, String rflag, java.util.Date createDate) {
        this.depNum = depNum;
        this.adminOrder = adminOrder;
        this.writContent = writContent;
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
     *             column="depNum"
     *             length="12"
     *         
     */

    public String getDepNum() {
        return this.depNum;
    }
    
    public void setDepNum(String depNum) {
        this.depNum = depNum;
    }
    /**       
     *      *            @hibernate.property
     *             column="adminOrder"
     *             length="2"
     *         
     */

    public String getAdminOrder() {
        return this.adminOrder;
    }
    
    public void setAdminOrder(String adminOrder) {
        this.adminOrder = adminOrder;
    }
    /**       
     *      *            @hibernate.property
     *             column="writContent"
     *             length="6000"
     *         
     */

    public String getWritContent() {
        return this.writContent;
    }
    
    public void setWritContent(String writContent) {
        this.writContent = writContent;
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
      buffer.append("depNum").append("='").append(getDepNum()).append("' ");			
      buffer.append("adminOrder").append("='").append(getAdminOrder()).append("' ");			
      buffer.append("writContent").append("='").append(getWritContent()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PunishDecisionBook) ) return false;
		 PunishDecisionBook castOther = ( PunishDecisionBook ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getDepNum()==castOther.getDepNum()) || ( this.getDepNum()!=null && castOther.getDepNum()!=null && this.getDepNum().equals(castOther.getDepNum()) ) )
 && ( (this.getAdminOrder()==castOther.getAdminOrder()) || ( this.getAdminOrder()!=null && castOther.getAdminOrder()!=null && this.getAdminOrder().equals(castOther.getAdminOrder()) ) )
 && ( (this.getWritContent()==castOther.getWritContent()) || ( this.getWritContent()!=null && castOther.getWritContent()!=null && this.getWritContent().equals(castOther.getWritContent()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getDepNum() == null ? 0 : this.getDepNum().hashCode() );
         result = 37 * result + ( getAdminOrder() == null ? 0 : this.getAdminOrder().hashCode() );
         result = 37 * result + ( getWritContent() == null ? 0 : this.getWritContent().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
