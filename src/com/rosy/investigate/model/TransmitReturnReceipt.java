package com.rosy.investigate.model;
// Generated 2008-11-2 19:50:25 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="transmitreturnreceipt"
 *     
 */

public class TransmitReturnReceipt extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String eventId;
    private String depNum;
    private String adminOrder;
    private String keyWord;
    private String serialNum;
    private String writName;
    private String wirtNo;
    private String inceptMan;
    private java.util.Date transDate;
    private String transWhere;
    private String transWay;
    private String inceptManVisa;
    private String transMan;
    private String eyewitness;
    private java.util.Date eyewitnessDate;
    private String remark;
    private String rflag;
    private java.util.Date createDate;


    // Constructors

    /** default constructor */
    public TransmitReturnReceipt() {
    }

	/** minimal constructor */
    public TransmitReturnReceipt(String eventId) {
        this.eventId = eventId;
    }
    
    /** full constructor */
    public TransmitReturnReceipt(String eventId, String depNum, String adminOrder, String keyWord, String serialNum, String writName, String wirtNo, String inceptMan, java.util.Date transDate, String transWhere, String transWay, String inceptManVisa, String transMan, String eyewitness, java.util.Date eyewitnessDate, String remark, String rflag, java.util.Date createDate) {
        this.eventId = eventId;
        this.depNum = depNum;
        this.adminOrder = adminOrder;
        this.keyWord = keyWord;
        this.serialNum = serialNum;
        this.writName = writName;
        this.wirtNo = wirtNo;
        this.inceptMan = inceptMan;
        this.transDate = transDate;
        this.transWhere = transWhere;
        this.transWay = transWay;
        this.inceptManVisa = inceptManVisa;
        this.transMan = transMan;
        this.eyewitness = eyewitness;
        this.eyewitnessDate = eyewitnessDate;
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
     *             column="keyWord"
     *             length="4"
     *         
     */

    public String getKeyWord() {
        return this.keyWord;
    }
    
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
    /**       
     *      *            @hibernate.property
     *             column="serialNum"
     *             length="4"
     *         
     */

    public String getSerialNum() {
        return this.serialNum;
    }
    
    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }
    /**       
     *      *            @hibernate.property
     *             column="writName"
     *             length="50"
     *         
     */

    public String getWritName() {
        return this.writName;
    }
    
    public void setWritName(String writName) {
        this.writName = writName;
    }
    /**       
     *      *            @hibernate.property
     *             column="wirtNO"
     *             length="50"
     *         
     */

    public String getWirtNo() {
        return this.wirtNo;
    }
    
    public void setWirtNo(String wirtNo) {
        this.wirtNo = wirtNo;
    }
    /**       
     *      *            @hibernate.property
     *             column="inceptMan"
     *             length="30"
     *         
     */

    public String getInceptMan() {
        return this.inceptMan;
    }
    
    public void setInceptMan(String inceptMan) {
        this.inceptMan = inceptMan;
    }
    /**       
     *      *            @hibernate.property
     *             column="transDate"
     *             length="19"
     *         
     */

    public java.util.Date getTransDate() {
        return this.transDate;
    }
    
    public void setTransDate(java.util.Date transDate) {
        this.transDate = transDate;
    }
    /**       
     *      *            @hibernate.property
     *             column="transWhere"
     *             length="50"
     *         
     */

    public String getTransWhere() {
        return this.transWhere;
    }
    
    public void setTransWhere(String transWhere) {
        this.transWhere = transWhere;
    }
    /**       
     *      *            @hibernate.property
     *             column="transWay"
     *             length="2"
     *         
     */

    public String getTransWay() {
        return this.transWay;
    }
    
    public void setTransWay(String transWay) {
        this.transWay = transWay;
    }
    /**       
     *      *            @hibernate.property
     *             column="inceptManVisa"
     *             length="30"
     *         
     */

    public String getInceptManVisa() {
        return this.inceptManVisa;
    }
    
    public void setInceptManVisa(String inceptManVisa) {
        this.inceptManVisa = inceptManVisa;
    }
    /**       
     *      *            @hibernate.property
     *             column="transMan"
     *             length="50"
     *         
     */

    public String getTransMan() {
        return this.transMan;
    }
    
    public void setTransMan(String transMan) {
        this.transMan = transMan;
    }
    /**       
     *      *            @hibernate.property
     *             column="eyewitness"
     *             length="30"
     *         
     */

    public String getEyewitness() {
        return this.eyewitness;
    }
    
    public void setEyewitness(String eyewitness) {
        this.eyewitness = eyewitness;
    }
    /**       
     *      *            @hibernate.property
     *             column="eyewitnessDate"
     *             length="19"
     *         
     */

    public java.util.Date getEyewitnessDate() {
        return this.eyewitnessDate;
    }
    
    public void setEyewitnessDate(java.util.Date eyewitnessDate) {
        this.eyewitnessDate = eyewitnessDate;
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
      buffer.append("depNum").append("='").append(getDepNum()).append("' ");			
      buffer.append("adminOrder").append("='").append(getAdminOrder()).append("' ");			
      buffer.append("keyWord").append("='").append(getKeyWord()).append("' ");			
      buffer.append("serialNum").append("='").append(getSerialNum()).append("' ");			
      buffer.append("writName").append("='").append(getWritName()).append("' ");			
      buffer.append("wirtNo").append("='").append(getWirtNo()).append("' ");			
      buffer.append("inceptMan").append("='").append(getInceptMan()).append("' ");			
      buffer.append("transDate").append("='").append(getTransDate()).append("' ");			
      buffer.append("transWhere").append("='").append(getTransWhere()).append("' ");			
      buffer.append("transWay").append("='").append(getTransWay()).append("' ");			
      buffer.append("inceptManVisa").append("='").append(getInceptManVisa()).append("' ");			
      buffer.append("transMan").append("='").append(getTransMan()).append("' ");			
      buffer.append("eyewitness").append("='").append(getEyewitness()).append("' ");			
      buffer.append("eyewitnessDate").append("='").append(getEyewitnessDate()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TransmitReturnReceipt) ) return false;
		 TransmitReturnReceipt castOther = ( TransmitReturnReceipt ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getEventId()==castOther.getEventId()) || ( this.getEventId()!=null && castOther.getEventId()!=null && this.getEventId().equals(castOther.getEventId()) ) )
 && ( (this.getDepNum()==castOther.getDepNum()) || ( this.getDepNum()!=null && castOther.getDepNum()!=null && this.getDepNum().equals(castOther.getDepNum()) ) )
 && ( (this.getAdminOrder()==castOther.getAdminOrder()) || ( this.getAdminOrder()!=null && castOther.getAdminOrder()!=null && this.getAdminOrder().equals(castOther.getAdminOrder()) ) )
 && ( (this.getKeyWord()==castOther.getKeyWord()) || ( this.getKeyWord()!=null && castOther.getKeyWord()!=null && this.getKeyWord().equals(castOther.getKeyWord()) ) )
 && ( (this.getSerialNum()==castOther.getSerialNum()) || ( this.getSerialNum()!=null && castOther.getSerialNum()!=null && this.getSerialNum().equals(castOther.getSerialNum()) ) )
 && ( (this.getWritName()==castOther.getWritName()) || ( this.getWritName()!=null && castOther.getWritName()!=null && this.getWritName().equals(castOther.getWritName()) ) )
 && ( (this.getWirtNo()==castOther.getWirtNo()) || ( this.getWirtNo()!=null && castOther.getWirtNo()!=null && this.getWirtNo().equals(castOther.getWirtNo()) ) )
 && ( (this.getInceptMan()==castOther.getInceptMan()) || ( this.getInceptMan()!=null && castOther.getInceptMan()!=null && this.getInceptMan().equals(castOther.getInceptMan()) ) )
 && ( (this.getTransDate()==castOther.getTransDate()) || ( this.getTransDate()!=null && castOther.getTransDate()!=null && this.getTransDate().equals(castOther.getTransDate()) ) )
 && ( (this.getTransWhere()==castOther.getTransWhere()) || ( this.getTransWhere()!=null && castOther.getTransWhere()!=null && this.getTransWhere().equals(castOther.getTransWhere()) ) )
 && ( (this.getTransWay()==castOther.getTransWay()) || ( this.getTransWay()!=null && castOther.getTransWay()!=null && this.getTransWay().equals(castOther.getTransWay()) ) )
 && ( (this.getInceptManVisa()==castOther.getInceptManVisa()) || ( this.getInceptManVisa()!=null && castOther.getInceptManVisa()!=null && this.getInceptManVisa().equals(castOther.getInceptManVisa()) ) )
 && ( (this.getTransMan()==castOther.getTransMan()) || ( this.getTransMan()!=null && castOther.getTransMan()!=null && this.getTransMan().equals(castOther.getTransMan()) ) )
 && ( (this.getEyewitness()==castOther.getEyewitness()) || ( this.getEyewitness()!=null && castOther.getEyewitness()!=null && this.getEyewitness().equals(castOther.getEyewitness()) ) )
 && ( (this.getEyewitnessDate()==castOther.getEyewitnessDate()) || ( this.getEyewitnessDate()!=null && castOther.getEyewitnessDate()!=null && this.getEyewitnessDate().equals(castOther.getEyewitnessDate()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getEventId() == null ? 0 : this.getEventId().hashCode() );
         result = 37 * result + ( getDepNum() == null ? 0 : this.getDepNum().hashCode() );
         result = 37 * result + ( getAdminOrder() == null ? 0 : this.getAdminOrder().hashCode() );
         result = 37 * result + ( getKeyWord() == null ? 0 : this.getKeyWord().hashCode() );
         result = 37 * result + ( getSerialNum() == null ? 0 : this.getSerialNum().hashCode() );
         result = 37 * result + ( getWritName() == null ? 0 : this.getWritName().hashCode() );
         result = 37 * result + ( getWirtNo() == null ? 0 : this.getWirtNo().hashCode() );
         result = 37 * result + ( getInceptMan() == null ? 0 : this.getInceptMan().hashCode() );
         result = 37 * result + ( getTransDate() == null ? 0 : this.getTransDate().hashCode() );
         result = 37 * result + ( getTransWhere() == null ? 0 : this.getTransWhere().hashCode() );
         result = 37 * result + ( getTransWay() == null ? 0 : this.getTransWay().hashCode() );
         result = 37 * result + ( getInceptManVisa() == null ? 0 : this.getInceptManVisa().hashCode() );
         result = 37 * result + ( getTransMan() == null ? 0 : this.getTransMan().hashCode() );
         result = 37 * result + ( getEyewitness() == null ? 0 : this.getEyewitness().hashCode() );
         result = 37 * result + ( getEyewitnessDate() == null ? 0 : this.getEyewitnessDate().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
