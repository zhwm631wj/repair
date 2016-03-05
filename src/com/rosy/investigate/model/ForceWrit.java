package com.rosy.investigate.model;
// Generated 2008-11-2 19:50:28 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="forcewrit"
 *     
 */

public class ForceWrit extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String depNum;
    private String adminOrder;
    private String keyWord;
    private String serialNum;
    private String spokesManOfParty;
    private String decisionContent;
    private String deciReasion;
    private String preRevivorOrg;
    private String sendOrderOrg;
    private java.util.Date orderDate;
    private String propertyList;
    private String remark;
    private String rflag;
    private java.util.Date createDate;
    private String affixKeeper;
    private String affixUndertakeMan;
    private String affixEyewitness;
    private java.util.Date eyewitnessDate;
    private java.util.Date affixDate;


    // Constructors

    /** default constructor */
    public ForceWrit() {
    }

    
    /** full constructor */
    public ForceWrit(String depNum, String adminOrder, String keyWord, String serialNum, String spokesManOfParty, String decisionContent, String deciReasion, String preRevivorOrg, String sendOrderOrg, java.util.Date orderDate, String propertyList, String remark, String rflag, java.util.Date createDate, String affixKeeper, String affixUndertakeMan, String affixEyewitness, java.util.Date eyewitnessDate, java.util.Date affixDate) {
        this.depNum = depNum;
        this.adminOrder = adminOrder;
        this.keyWord = keyWord;
        this.serialNum = serialNum;
        this.spokesManOfParty = spokesManOfParty;
        this.decisionContent = decisionContent;
        this.deciReasion = deciReasion;
        this.preRevivorOrg = preRevivorOrg;
        this.sendOrderOrg = sendOrderOrg;
        this.orderDate = orderDate;
        this.propertyList = propertyList;
        this.remark = remark;
        this.rflag = rflag;
        this.createDate = createDate;
        this.affixKeeper = affixKeeper;
        this.affixUndertakeMan = affixUndertakeMan;
        this.affixEyewitness = affixEyewitness;
        this.eyewitnessDate = eyewitnessDate;
        this.affixDate = affixDate;
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
     *             column="spokesManOfParty"
     *             length="30"
     *         
     */

    public String getSpokesManOfParty() {
        return this.spokesManOfParty;
    }
    
    public void setSpokesManOfParty(String spokesManOfParty) {
        this.spokesManOfParty = spokesManOfParty;
    }
    /**       
     *      *            @hibernate.property
     *             column="decisionContent"
     *             length="4000"
     *         
     */

    public String getDecisionContent() {
        return this.decisionContent;
    }
    
    public void setDecisionContent(String decisionContent) {
        this.decisionContent = decisionContent;
    }
    /**       
     *      *            @hibernate.property
     *             column="deciReasion"
     *             length="2"
     *         
     */

    public String getDeciReasion() {
        return this.deciReasion;
    }
    
    public void setDeciReasion(String deciReasion) {
        this.deciReasion = deciReasion;
    }
    /**       
     *      *            @hibernate.property
     *             column="preRevivorOrg"
     *             length="50"
     *         
     */

    public String getPreRevivorOrg() {
        return this.preRevivorOrg;
    }
    
    public void setPreRevivorOrg(String preRevivorOrg) {
        this.preRevivorOrg = preRevivorOrg;
    }
    /**       
     *      *            @hibernate.property
     *             column="sendOrderOrg"
     *             length="50"
     *         
     */

    public String getSendOrderOrg() {
        return this.sendOrderOrg;
    }
    
    public void setSendOrderOrg(String sendOrderOrg) {
        this.sendOrderOrg = sendOrderOrg;
    }
    /**       
     *      *            @hibernate.property
     *             column="orderDate"
     *             length="19"
     *         
     */

    public java.util.Date getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(java.util.Date orderDate) {
        this.orderDate = orderDate;
    }
    /**       
     *      *            @hibernate.property
     *             column="propertyList"
     *             length="255"
     *         
     */

    public String getPropertyList() {
        return this.propertyList;
    }
    
    public void setPropertyList(String propertyList) {
        this.propertyList = propertyList;
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
     *      *            @hibernate.property
     *             column="affixKeeper"
     *             length="30"
     *         
     */

    public String getAffixKeeper() {
        return this.affixKeeper;
    }
    
    public void setAffixKeeper(String affixKeeper) {
        this.affixKeeper = affixKeeper;
    }
    /**       
     *      *            @hibernate.property
     *             column="affixUndertakeMan"
     *             length="30"
     *         
     */

    public String getAffixUndertakeMan() {
        return this.affixUndertakeMan;
    }
    
    public void setAffixUndertakeMan(String affixUndertakeMan) {
        this.affixUndertakeMan = affixUndertakeMan;
    }
    /**       
     *      *            @hibernate.property
     *             column="affixEyewitness"
     *             length="30"
     *         
     */

    public String getAffixEyewitness() {
        return this.affixEyewitness;
    }
    
    public void setAffixEyewitness(String affixEyewitness) {
        this.affixEyewitness = affixEyewitness;
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
     *             column="affixDate"
     *             length="19"
     *         
     */

    public java.util.Date getAffixDate() {
        return this.affixDate;
    }
    
    public void setAffixDate(java.util.Date affixDate) {
        this.affixDate = affixDate;
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
      buffer.append("keyWord").append("='").append(getKeyWord()).append("' ");			
      buffer.append("serialNum").append("='").append(getSerialNum()).append("' ");			
      buffer.append("spokesManOfParty").append("='").append(getSpokesManOfParty()).append("' ");			
      buffer.append("decisionContent").append("='").append(getDecisionContent()).append("' ");			
      buffer.append("deciReasion").append("='").append(getDeciReasion()).append("' ");			
      buffer.append("preRevivorOrg").append("='").append(getPreRevivorOrg()).append("' ");			
      buffer.append("sendOrderOrg").append("='").append(getSendOrderOrg()).append("' ");			
      buffer.append("orderDate").append("='").append(getOrderDate()).append("' ");			
      buffer.append("propertyList").append("='").append(getPropertyList()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("affixKeeper").append("='").append(getAffixKeeper()).append("' ");			
      buffer.append("affixUndertakeMan").append("='").append(getAffixUndertakeMan()).append("' ");			
      buffer.append("affixEyewitness").append("='").append(getAffixEyewitness()).append("' ");			
      buffer.append("eyewitnessDate").append("='").append(getEyewitnessDate()).append("' ");			
      buffer.append("affixDate").append("='").append(getAffixDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ForceWrit) ) return false;
		 ForceWrit castOther = ( ForceWrit ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getDepNum()==castOther.getDepNum()) || ( this.getDepNum()!=null && castOther.getDepNum()!=null && this.getDepNum().equals(castOther.getDepNum()) ) )
 && ( (this.getAdminOrder()==castOther.getAdminOrder()) || ( this.getAdminOrder()!=null && castOther.getAdminOrder()!=null && this.getAdminOrder().equals(castOther.getAdminOrder()) ) )
 && ( (this.getKeyWord()==castOther.getKeyWord()) || ( this.getKeyWord()!=null && castOther.getKeyWord()!=null && this.getKeyWord().equals(castOther.getKeyWord()) ) )
 && ( (this.getSerialNum()==castOther.getSerialNum()) || ( this.getSerialNum()!=null && castOther.getSerialNum()!=null && this.getSerialNum().equals(castOther.getSerialNum()) ) )
 && ( (this.getSpokesManOfParty()==castOther.getSpokesManOfParty()) || ( this.getSpokesManOfParty()!=null && castOther.getSpokesManOfParty()!=null && this.getSpokesManOfParty().equals(castOther.getSpokesManOfParty()) ) )
 && ( (this.getDecisionContent()==castOther.getDecisionContent()) || ( this.getDecisionContent()!=null && castOther.getDecisionContent()!=null && this.getDecisionContent().equals(castOther.getDecisionContent()) ) )
 && ( (this.getDeciReasion()==castOther.getDeciReasion()) || ( this.getDeciReasion()!=null && castOther.getDeciReasion()!=null && this.getDeciReasion().equals(castOther.getDeciReasion()) ) )
 && ( (this.getPreRevivorOrg()==castOther.getPreRevivorOrg()) || ( this.getPreRevivorOrg()!=null && castOther.getPreRevivorOrg()!=null && this.getPreRevivorOrg().equals(castOther.getPreRevivorOrg()) ) )
 && ( (this.getSendOrderOrg()==castOther.getSendOrderOrg()) || ( this.getSendOrderOrg()!=null && castOther.getSendOrderOrg()!=null && this.getSendOrderOrg().equals(castOther.getSendOrderOrg()) ) )
 && ( (this.getOrderDate()==castOther.getOrderDate()) || ( this.getOrderDate()!=null && castOther.getOrderDate()!=null && this.getOrderDate().equals(castOther.getOrderDate()) ) )
 && ( (this.getPropertyList()==castOther.getPropertyList()) || ( this.getPropertyList()!=null && castOther.getPropertyList()!=null && this.getPropertyList().equals(castOther.getPropertyList()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) )
 && ( (this.getAffixKeeper()==castOther.getAffixKeeper()) || ( this.getAffixKeeper()!=null && castOther.getAffixKeeper()!=null && this.getAffixKeeper().equals(castOther.getAffixKeeper()) ) )
 && ( (this.getAffixUndertakeMan()==castOther.getAffixUndertakeMan()) || ( this.getAffixUndertakeMan()!=null && castOther.getAffixUndertakeMan()!=null && this.getAffixUndertakeMan().equals(castOther.getAffixUndertakeMan()) ) )
 && ( (this.getAffixEyewitness()==castOther.getAffixEyewitness()) || ( this.getAffixEyewitness()!=null && castOther.getAffixEyewitness()!=null && this.getAffixEyewitness().equals(castOther.getAffixEyewitness()) ) )
 && ( (this.getEyewitnessDate()==castOther.getEyewitnessDate()) || ( this.getEyewitnessDate()!=null && castOther.getEyewitnessDate()!=null && this.getEyewitnessDate().equals(castOther.getEyewitnessDate()) ) )
 && ( (this.getAffixDate()==castOther.getAffixDate()) || ( this.getAffixDate()!=null && castOther.getAffixDate()!=null && this.getAffixDate().equals(castOther.getAffixDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getDepNum() == null ? 0 : this.getDepNum().hashCode() );
         result = 37 * result + ( getAdminOrder() == null ? 0 : this.getAdminOrder().hashCode() );
         result = 37 * result + ( getKeyWord() == null ? 0 : this.getKeyWord().hashCode() );
         result = 37 * result + ( getSerialNum() == null ? 0 : this.getSerialNum().hashCode() );
         result = 37 * result + ( getSpokesManOfParty() == null ? 0 : this.getSpokesManOfParty().hashCode() );
         result = 37 * result + ( getDecisionContent() == null ? 0 : this.getDecisionContent().hashCode() );
         result = 37 * result + ( getDeciReasion() == null ? 0 : this.getDeciReasion().hashCode() );
         result = 37 * result + ( getPreRevivorOrg() == null ? 0 : this.getPreRevivorOrg().hashCode() );
         result = 37 * result + ( getSendOrderOrg() == null ? 0 : this.getSendOrderOrg().hashCode() );
         result = 37 * result + ( getOrderDate() == null ? 0 : this.getOrderDate().hashCode() );
         result = 37 * result + ( getPropertyList() == null ? 0 : this.getPropertyList().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         result = 37 * result + ( getAffixKeeper() == null ? 0 : this.getAffixKeeper().hashCode() );
         result = 37 * result + ( getAffixUndertakeMan() == null ? 0 : this.getAffixUndertakeMan().hashCode() );
         result = 37 * result + ( getAffixEyewitness() == null ? 0 : this.getAffixEyewitness().hashCode() );
         result = 37 * result + ( getEyewitnessDate() == null ? 0 : this.getEyewitnessDate().hashCode() );
         result = 37 * result + ( getAffixDate() == null ? 0 : this.getAffixDate().hashCode() );
         return result;
   }   





}
