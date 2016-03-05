package com.rosy.investigate.model;
// Generated 2008-11-2 19:50:26 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="propertylist"
 *     
 */

public class PropertyList extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String eventId;
    private String thnum;
    private Integer serialNum;
    private String propName;
    private String specNum;
    private String unit;
    private Integer amount;
    private String characteristic;
    private String inflag;
    private String remark;
    private String rflag;
    private java.util.Date createDate;


    // Constructors

    /** default constructor */
    public PropertyList() {
    }

	/** minimal constructor */
    public PropertyList(String eventId) {
        this.eventId = eventId;
    }
    
    /** full constructor */
    public PropertyList(String eventId, String thnum, Integer serialNum, String propName, String specNum, String unit, Integer amount, String characteristic, String inflag, String remark, String rflag, java.util.Date createDate) {
        this.eventId = eventId;
        this.thnum = thnum;
        this.serialNum = serialNum;
        this.propName = propName;
        this.specNum = specNum;
        this.unit = unit;
        this.amount = amount;
        this.characteristic = characteristic;
        this.inflag = inflag;
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
     *             column="eventID"
     *             length="48"
     *             not-null="true"
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
     *             column="thNum"
     *             length="4"
     *         
     */

    public String getThnum() {
        return this.thnum;
    }
    
    public void setThnum(String thnum) {
        this.thnum = thnum;
    }
    /**       
     *      *            @hibernate.property
     *             column="serialNum"
     *             length="11"
     *         
     */

    public Integer getSerialNum() {
        return this.serialNum;
    }
    
    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }
    /**       
     *      *            @hibernate.property
     *             column="propName"
     *             length="100"
     *         
     */

    public String getPropName() {
        return this.propName;
    }
    
    public void setPropName(String propName) {
        this.propName = propName;
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
     *             column="characteristic"
     *             length="200"
     *         
     */

    public String getCharacteristic() {
        return this.characteristic;
    }
    
    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }
    /**       
     *      *            @hibernate.property
     *             column="inFlag"
     *             length="1"
     *         
     */

    public String getInflag() {
        return this.inflag;
    }
    
    public void setInflag(String inflag) {
        this.inflag = inflag;
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
      buffer.append("eventId").append("='").append(getEventId()).append("' ");			
      buffer.append("thnum").append("='").append(getThnum()).append("' ");			
      buffer.append("serialNum").append("='").append(getSerialNum()).append("' ");			
      buffer.append("propName").append("='").append(getPropName()).append("' ");			
      buffer.append("specNum").append("='").append(getSpecNum()).append("' ");			
      buffer.append("unit").append("='").append(getUnit()).append("' ");			
      buffer.append("amount").append("='").append(getAmount()).append("' ");			
      buffer.append("characteristic").append("='").append(getCharacteristic()).append("' ");			
      buffer.append("inflag").append("='").append(getInflag()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PropertyList) ) return false;
		 PropertyList castOther = ( PropertyList ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getEventId()==castOther.getEventId()) || ( this.getEventId()!=null && castOther.getEventId()!=null && this.getEventId().equals(castOther.getEventId()) ) )
 && ( (this.getThnum()==castOther.getThnum()) || ( this.getThnum()!=null && castOther.getThnum()!=null && this.getThnum().equals(castOther.getThnum()) ) )
 && ( (this.getSerialNum()==castOther.getSerialNum()) || ( this.getSerialNum()!=null && castOther.getSerialNum()!=null && this.getSerialNum().equals(castOther.getSerialNum()) ) )
 && ( (this.getPropName()==castOther.getPropName()) || ( this.getPropName()!=null && castOther.getPropName()!=null && this.getPropName().equals(castOther.getPropName()) ) )
 && ( (this.getSpecNum()==castOther.getSpecNum()) || ( this.getSpecNum()!=null && castOther.getSpecNum()!=null && this.getSpecNum().equals(castOther.getSpecNum()) ) )
 && ( (this.getUnit()==castOther.getUnit()) || ( this.getUnit()!=null && castOther.getUnit()!=null && this.getUnit().equals(castOther.getUnit()) ) )
 && ( (this.getAmount()==castOther.getAmount()) || ( this.getAmount()!=null && castOther.getAmount()!=null && this.getAmount().equals(castOther.getAmount()) ) )
 && ( (this.getCharacteristic()==castOther.getCharacteristic()) || ( this.getCharacteristic()!=null && castOther.getCharacteristic()!=null && this.getCharacteristic().equals(castOther.getCharacteristic()) ) )
 && ( (this.getInflag()==castOther.getInflag()) || ( this.getInflag()!=null && castOther.getInflag()!=null && this.getInflag().equals(castOther.getInflag()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getEventId() == null ? 0 : this.getEventId().hashCode() );
         result = 37 * result + ( getThnum() == null ? 0 : this.getThnum().hashCode() );
         result = 37 * result + ( getSerialNum() == null ? 0 : this.getSerialNum().hashCode() );
         result = 37 * result + ( getPropName() == null ? 0 : this.getPropName().hashCode() );
         result = 37 * result + ( getSpecNum() == null ? 0 : this.getSpecNum().hashCode() );
         result = 37 * result + ( getUnit() == null ? 0 : this.getUnit().hashCode() );
         result = 37 * result + ( getAmount() == null ? 0 : this.getAmount().hashCode() );
         result = 37 * result + ( getCharacteristic() == null ? 0 : this.getCharacteristic().hashCode() );
         result = 37 * result + ( getInflag() == null ? 0 : this.getInflag().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
