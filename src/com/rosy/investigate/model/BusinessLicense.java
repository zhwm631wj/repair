package com.rosy.investigate.model;
// Generated 2008-11-2 19:50:27 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="businesslicense"
 *     
 */

public class BusinessLicense extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String regCode;
    private String regName;
    private String dealInPerson;
    private String buildupWay;
    private String dealInWhere;
    private String dealInMode;
    private String dealInBound;
    private String mainDealIn;
    private String asideBusiness;
    private String issueCertOrg;
    private java.util.Date validStartDate;
    private java.util.Date validEndDate;
    private java.util.Date copyDate;
    private String copyWhere;
    private String witness;
    private java.util.Date witnessDate;
    private String remark;
    private String rflag;
    private java.util.Date createDate;


    // Constructors

    /** default constructor */
    public BusinessLicense() {
    }

    
    /** full constructor */
    public BusinessLicense(String regCode, String regName, String dealInPerson, String buildupWay, String dealInWhere, String dealInMode, String dealInBound, String mainDealIn, String asideBusiness, String issueCertOrg, java.util.Date validStartDate, java.util.Date validEndDate, java.util.Date copyDate, String copyWhere, String witness, java.util.Date witnessDate, String remark, String rflag, java.util.Date createDate) {
        this.regCode = regCode;
        this.regName = regName;
        this.dealInPerson = dealInPerson;
        this.buildupWay = buildupWay;
        this.dealInWhere = dealInWhere;
        this.dealInMode = dealInMode;
        this.dealInBound = dealInBound;
        this.mainDealIn = mainDealIn;
        this.asideBusiness = asideBusiness;
        this.issueCertOrg = issueCertOrg;
        this.validStartDate = validStartDate;
        this.validEndDate = validEndDate;
        this.copyDate = copyDate;
        this.copyWhere = copyWhere;
        this.witness = witness;
        this.witnessDate = witnessDate;
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
     *             column="regCode"
     *             length="30"
     *         
     */

    public String getRegCode() {
        return this.regCode;
    }
    
    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }
    /**       
     *      *            @hibernate.property
     *             column="regName"
     *             length="30"
     *         
     */

    public String getRegName() {
        return this.regName;
    }
    
    public void setRegName(String regName) {
        this.regName = regName;
    }
    /**       
     *      *            @hibernate.property
     *             column="dealInPerson"
     *             length="30"
     *         
     */

    public String getDealInPerson() {
        return this.dealInPerson;
    }
    
    public void setDealInPerson(String dealInPerson) {
        this.dealInPerson = dealInPerson;
    }
    /**       
     *      *            @hibernate.property
     *             column="buildupWay"
     *             length="30"
     *         
     */

    public String getBuildupWay() {
        return this.buildupWay;
    }
    
    public void setBuildupWay(String buildupWay) {
        this.buildupWay = buildupWay;
    }
    /**       
     *      *            @hibernate.property
     *             column="dealInWhere"
     *             length="50"
     *         
     */

    public String getDealInWhere() {
        return this.dealInWhere;
    }
    
    public void setDealInWhere(String dealInWhere) {
        this.dealInWhere = dealInWhere;
    }
    /**       
     *      *            @hibernate.property
     *             column="dealInMode"
     *             length="30"
     *         
     */

    public String getDealInMode() {
        return this.dealInMode;
    }
    
    public void setDealInMode(String dealInMode) {
        this.dealInMode = dealInMode;
    }
    /**       
     *      *            @hibernate.property
     *             column="dealInBound"
     *             length="200"
     *         
     */

    public String getDealInBound() {
        return this.dealInBound;
    }
    
    public void setDealInBound(String dealInBound) {
        this.dealInBound = dealInBound;
    }
    /**       
     *      *            @hibernate.property
     *             column="mainDealIn"
     *             length="200"
     *         
     */

    public String getMainDealIn() {
        return this.mainDealIn;
    }
    
    public void setMainDealIn(String mainDealIn) {
        this.mainDealIn = mainDealIn;
    }
    /**       
     *      *            @hibernate.property
     *             column="asideBusiness"
     *             length="200"
     *         
     */

    public String getAsideBusiness() {
        return this.asideBusiness;
    }
    
    public void setAsideBusiness(String asideBusiness) {
        this.asideBusiness = asideBusiness;
    }
    /**       
     *      *            @hibernate.property
     *             column="issueCertOrg"
     *             length="50"
     *         
     */

    public String getIssueCertOrg() {
        return this.issueCertOrg;
    }
    
    public void setIssueCertOrg(String issueCertOrg) {
        this.issueCertOrg = issueCertOrg;
    }
    /**       
     *      *            @hibernate.property
     *             column="validStartDate"
     *             length="19"
     *         
     */

    public java.util.Date getValidStartDate() {
        return this.validStartDate;
    }
    
    public void setValidStartDate(java.util.Date validStartDate) {
        this.validStartDate = validStartDate;
    }
    /**       
     *      *            @hibernate.property
     *             column="validEndDate"
     *             length="19"
     *         
     */

    public java.util.Date getValidEndDate() {
        return this.validEndDate;
    }
    
    public void setValidEndDate(java.util.Date validEndDate) {
        this.validEndDate = validEndDate;
    }
    /**       
     *      *            @hibernate.property
     *             column="copyDate"
     *             length="19"
     *         
     */

    public java.util.Date getCopyDate() {
        return this.copyDate;
    }
    
    public void setCopyDate(java.util.Date copyDate) {
        this.copyDate = copyDate;
    }
    /**       
     *      *            @hibernate.property
     *             column="copyWhere"
     *             length="100"
     *         
     */

    public String getCopyWhere() {
        return this.copyWhere;
    }
    
    public void setCopyWhere(String copyWhere) {
        this.copyWhere = copyWhere;
    }
    /**       
     *      *            @hibernate.property
     *             column="witness"
     *             length="30"
     *         
     */

    public String getWitness() {
        return this.witness;
    }
    
    public void setWitness(String witness) {
        this.witness = witness;
    }
    /**       
     *      *            @hibernate.property
     *             column="witnessDate"
     *             length="19"
     *         
     */

    public java.util.Date getWitnessDate() {
        return this.witnessDate;
    }
    
    public void setWitnessDate(java.util.Date witnessDate) {
        this.witnessDate = witnessDate;
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
      buffer.append("regCode").append("='").append(getRegCode()).append("' ");			
      buffer.append("regName").append("='").append(getRegName()).append("' ");			
      buffer.append("dealInPerson").append("='").append(getDealInPerson()).append("' ");			
      buffer.append("buildupWay").append("='").append(getBuildupWay()).append("' ");			
      buffer.append("dealInWhere").append("='").append(getDealInWhere()).append("' ");			
      buffer.append("dealInMode").append("='").append(getDealInMode()).append("' ");			
      buffer.append("dealInBound").append("='").append(getDealInBound()).append("' ");			
      buffer.append("mainDealIn").append("='").append(getMainDealIn()).append("' ");			
      buffer.append("asideBusiness").append("='").append(getAsideBusiness()).append("' ");			
      buffer.append("issueCertOrg").append("='").append(getIssueCertOrg()).append("' ");			
      buffer.append("validStartDate").append("='").append(getValidStartDate()).append("' ");			
      buffer.append("validEndDate").append("='").append(getValidEndDate()).append("' ");			
      buffer.append("copyDate").append("='").append(getCopyDate()).append("' ");			
      buffer.append("copyWhere").append("='").append(getCopyWhere()).append("' ");			
      buffer.append("witness").append("='").append(getWitness()).append("' ");			
      buffer.append("witnessDate").append("='").append(getWitnessDate()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BusinessLicense) ) return false;
		 BusinessLicense castOther = ( BusinessLicense ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getRegCode()==castOther.getRegCode()) || ( this.getRegCode()!=null && castOther.getRegCode()!=null && this.getRegCode().equals(castOther.getRegCode()) ) )
 && ( (this.getRegName()==castOther.getRegName()) || ( this.getRegName()!=null && castOther.getRegName()!=null && this.getRegName().equals(castOther.getRegName()) ) )
 && ( (this.getDealInPerson()==castOther.getDealInPerson()) || ( this.getDealInPerson()!=null && castOther.getDealInPerson()!=null && this.getDealInPerson().equals(castOther.getDealInPerson()) ) )
 && ( (this.getBuildupWay()==castOther.getBuildupWay()) || ( this.getBuildupWay()!=null && castOther.getBuildupWay()!=null && this.getBuildupWay().equals(castOther.getBuildupWay()) ) )
 && ( (this.getDealInWhere()==castOther.getDealInWhere()) || ( this.getDealInWhere()!=null && castOther.getDealInWhere()!=null && this.getDealInWhere().equals(castOther.getDealInWhere()) ) )
 && ( (this.getDealInMode()==castOther.getDealInMode()) || ( this.getDealInMode()!=null && castOther.getDealInMode()!=null && this.getDealInMode().equals(castOther.getDealInMode()) ) )
 && ( (this.getDealInBound()==castOther.getDealInBound()) || ( this.getDealInBound()!=null && castOther.getDealInBound()!=null && this.getDealInBound().equals(castOther.getDealInBound()) ) )
 && ( (this.getMainDealIn()==castOther.getMainDealIn()) || ( this.getMainDealIn()!=null && castOther.getMainDealIn()!=null && this.getMainDealIn().equals(castOther.getMainDealIn()) ) )
 && ( (this.getAsideBusiness()==castOther.getAsideBusiness()) || ( this.getAsideBusiness()!=null && castOther.getAsideBusiness()!=null && this.getAsideBusiness().equals(castOther.getAsideBusiness()) ) )
 && ( (this.getIssueCertOrg()==castOther.getIssueCertOrg()) || ( this.getIssueCertOrg()!=null && castOther.getIssueCertOrg()!=null && this.getIssueCertOrg().equals(castOther.getIssueCertOrg()) ) )
 && ( (this.getValidStartDate()==castOther.getValidStartDate()) || ( this.getValidStartDate()!=null && castOther.getValidStartDate()!=null && this.getValidStartDate().equals(castOther.getValidStartDate()) ) )
 && ( (this.getValidEndDate()==castOther.getValidEndDate()) || ( this.getValidEndDate()!=null && castOther.getValidEndDate()!=null && this.getValidEndDate().equals(castOther.getValidEndDate()) ) )
 && ( (this.getCopyDate()==castOther.getCopyDate()) || ( this.getCopyDate()!=null && castOther.getCopyDate()!=null && this.getCopyDate().equals(castOther.getCopyDate()) ) )
 && ( (this.getCopyWhere()==castOther.getCopyWhere()) || ( this.getCopyWhere()!=null && castOther.getCopyWhere()!=null && this.getCopyWhere().equals(castOther.getCopyWhere()) ) )
 && ( (this.getWitness()==castOther.getWitness()) || ( this.getWitness()!=null && castOther.getWitness()!=null && this.getWitness().equals(castOther.getWitness()) ) )
 && ( (this.getWitnessDate()==castOther.getWitnessDate()) || ( this.getWitnessDate()!=null && castOther.getWitnessDate()!=null && this.getWitnessDate().equals(castOther.getWitnessDate()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getRegCode() == null ? 0 : this.getRegCode().hashCode() );
         result = 37 * result + ( getRegName() == null ? 0 : this.getRegName().hashCode() );
         result = 37 * result + ( getDealInPerson() == null ? 0 : this.getDealInPerson().hashCode() );
         result = 37 * result + ( getBuildupWay() == null ? 0 : this.getBuildupWay().hashCode() );
         result = 37 * result + ( getDealInWhere() == null ? 0 : this.getDealInWhere().hashCode() );
         result = 37 * result + ( getDealInMode() == null ? 0 : this.getDealInMode().hashCode() );
         result = 37 * result + ( getDealInBound() == null ? 0 : this.getDealInBound().hashCode() );
         result = 37 * result + ( getMainDealIn() == null ? 0 : this.getMainDealIn().hashCode() );
         result = 37 * result + ( getAsideBusiness() == null ? 0 : this.getAsideBusiness().hashCode() );
         result = 37 * result + ( getIssueCertOrg() == null ? 0 : this.getIssueCertOrg().hashCode() );
         result = 37 * result + ( getValidStartDate() == null ? 0 : this.getValidStartDate().hashCode() );
         result = 37 * result + ( getValidEndDate() == null ? 0 : this.getValidEndDate().hashCode() );
         result = 37 * result + ( getCopyDate() == null ? 0 : this.getCopyDate().hashCode() );
         result = 37 * result + ( getCopyWhere() == null ? 0 : this.getCopyWhere().hashCode() );
         result = 37 * result + ( getWitness() == null ? 0 : this.getWitness().hashCode() );
         result = 37 * result + ( getWitnessDate() == null ? 0 : this.getWitnessDate().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
