package com.rosy.investigate.model;
// Generated 2008-11-5 12:00:44 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="checkproxyitem"
 *     
 */

public class CheckProxyItem extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String checkItem;
    private String specNum;
    private String unit;
    private Integer amount;
    private String remark;
    private String rflag;
    private Date createDate;


    // Constructors

    /** default constructor */
    public CheckProxyItem() {
    }

    
    /** full constructor */
    public CheckProxyItem(String checkItem, String specNum, String unit, Integer amount, String remark, String rflag, Date createDate) {
        this.checkItem = checkItem;
        this.specNum = specNum;
        this.unit = unit;
        this.amount = amount;
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
     *             column="checkItem"
     *             length="100"
     *         
     */

    public String getCheckItem() {
        return this.checkItem;
    }
    
    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }
    /**       
     *      *            @hibernate.property
     *             column="specNum"
     *             length="50"
     *         
     */

    public String getSpecNum() {
        return this.specNum;
    }
    
    public void setSpecNum(String specNum) {
        this.specNum = specNum;
    }
    /**       
     *      *            @hibernate.property
     *             column="unit"
     *             length="10"
     *         
     */

    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
    /**       
     *      *            @hibernate.property
     *             column="amount"
     *             length="11"
     *         
     */

    public Integer getAmount() {
        return this.amount;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
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
      buffer.append("checkItem").append("='").append(getCheckItem()).append("' ");			
      buffer.append("specNum").append("='").append(getSpecNum()).append("' ");			
      buffer.append("unit").append("='").append(getUnit()).append("' ");			
      buffer.append("amount").append("='").append(getAmount()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CheckProxyItem) ) return false;
		 CheckProxyItem castOther = ( CheckProxyItem ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getCheckItem()==castOther.getCheckItem()) || ( this.getCheckItem()!=null && castOther.getCheckItem()!=null && this.getCheckItem().equals(castOther.getCheckItem()) ) )
 && ( (this.getSpecNum()==castOther.getSpecNum()) || ( this.getSpecNum()!=null && castOther.getSpecNum()!=null && this.getSpecNum().equals(castOther.getSpecNum()) ) )
 && ( (this.getUnit()==castOther.getUnit()) || ( this.getUnit()!=null && castOther.getUnit()!=null && this.getUnit().equals(castOther.getUnit()) ) )
 && ( (this.getAmount()==castOther.getAmount()) || ( this.getAmount()!=null && castOther.getAmount()!=null && this.getAmount().equals(castOther.getAmount()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getCheckItem() == null ? 0 : this.getCheckItem().hashCode() );
         result = 37 * result + ( getSpecNum() == null ? 0 : this.getSpecNum().hashCode() );
         result = 37 * result + ( getUnit() == null ? 0 : this.getUnit().hashCode() );
         result = 37 * result + ( getAmount() == null ? 0 : this.getAmount().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
