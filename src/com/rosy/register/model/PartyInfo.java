package com.rosy.register.model;
// Generated 2008-11-2 19:50:27 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="partyinfo"
 *     
 */

public class PartyInfo extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String idcard;
    private String regIdorg;
    private java.util.Date regDate;
    private Integer effectPeriod;
    private String pname;
    private String phone;
    private String sex;
    private java.util.Date birthday;
    private String married;
    private String metier;
    private String regAddress;
    private String regPostalcode;
    private String bideAddress;
    private String bidePostcode;
    private String corporatePerson;
    private String address;
    private String remark;
    private String rflag;
    private java.util.Date createDate;
    private String caseStatus;


    // Constructors

    /** default constructor */
    public PartyInfo() {
    }

    
    /** full constructor */
    public PartyInfo(String idcard, String regIdorg, java.util.Date regDate, Integer effectPeriod, String pname, String phone, String sex, java.util.Date birthday, String married, String metier, String regAddress, String regPostalcode, String bideAddress, String bidePostcode, String corporatePerson, String address, String remark, String rflag, java.util.Date createDate, String caseStatus) {
        this.idcard = idcard;
        this.regIdorg = regIdorg;
        this.regDate = regDate;
        this.effectPeriod = effectPeriod;
        this.pname = pname;
        this.phone = phone;
        this.sex = sex;
        this.birthday = birthday;
        this.married = married;
        this.metier = metier;
        this.regAddress = regAddress;
        this.regPostalcode = regPostalcode;
        this.bideAddress = bideAddress;
        this.bidePostcode = bidePostcode;
        this.corporatePerson = corporatePerson;
        this.address = address;
        this.remark = remark;
        this.rflag = rflag;
        this.createDate = createDate;
        this.caseStatus = caseStatus;
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
     *             column="idCard"
     *             length="18"
     *         
     */

    public String getIdcard() {
        return this.idcard;
    }
    
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
    /**       
     *      *            @hibernate.property
     *             column="regIDOrg"
     *             length="100"
     *         
     */

    public String getRegIdorg() {
        return this.regIdorg;
    }
    
    public void setRegIdorg(String regIdorg) {
        this.regIdorg = regIdorg;
    }
    /**       
     *      *            @hibernate.property
     *             column="regDate"
     *             length="19"
     *         
     */

    public java.util.Date getRegDate() {
        return this.regDate;
    }
    
    public void setRegDate(java.util.Date regDate) {
        this.regDate = regDate;
    }
    /**       
     *      *            @hibernate.property
     *             column="effectPeriod"
     *             length="11"
     *         
     */

    public Integer getEffectPeriod() {
        return this.effectPeriod;
    }
    
    public void setEffectPeriod(Integer effectPeriod) {
        this.effectPeriod = effectPeriod;
    }
    /**       
     *      *            @hibernate.property
     *             column="pName"
     *             length="50"
     *         
     */

    public String getPname() {
        return this.pname;
    }
    
    public void setPname(String pname) {
        this.pname = pname;
    }
    /**       
     *      *            @hibernate.property
     *             column="phone"
     *             length="30"
     *         
     */

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**       
     *      *            @hibernate.property
     *             column="sex"
     *             length="1"
     *         
     */

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    /**       
     *      *            @hibernate.property
     *             column="birthday"
     *             length="19"
     *         
     */

    public java.util.Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(java.util.Date birthday) {
        this.birthday = birthday;
    }
    /**       
     *      *            @hibernate.property
     *             column="married"
     *             length="2"
     *         
     */

    public String getMarried() {
        return this.married;
    }
    
    public void setMarried(String married) {
        this.married = married;
    }
    /**       
     *      *            @hibernate.property
     *             column="metier"
     *             length="50"
     *         
     */

    public String getMetier() {
        return this.metier;
    }
    
    public void setMetier(String metier) {
        this.metier = metier;
    }
    /**       
     *      *            @hibernate.property
     *             column="regAddress"
     *             length="100"
     *         
     */

    public String getRegAddress() {
        return this.regAddress;
    }
    
    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress;
    }
    /**       
     *      *            @hibernate.property
     *             column="regPostalcode"
     *             length="15"
     *         
     */

    public String getRegPostalcode() {
        return this.regPostalcode;
    }
    
    public void setRegPostalcode(String regPostalcode) {
        this.regPostalcode = regPostalcode;
    }
    /**       
     *      *            @hibernate.property
     *             column="bideAddress"
     *             length="100"
     *         
     */

    public String getBideAddress() {
        return this.bideAddress;
    }
    
    public void setBideAddress(String bideAddress) {
        this.bideAddress = bideAddress;
    }
    /**       
     *      *            @hibernate.property
     *             column="bidePostcode"
     *             length="15"
     *         
     */

    public String getBidePostcode() {
        return this.bidePostcode;
    }
    
    public void setBidePostcode(String bidePostcode) {
        this.bidePostcode = bidePostcode;
    }
    /**       
     *      *            @hibernate.property
     *             column="corporatePerson"
     *             length="50"
     *         
     */

    public String getCorporatePerson() {
        return this.corporatePerson;
    }
    
    public void setCorporatePerson(String corporatePerson) {
        this.corporatePerson = corporatePerson;
    }
    /**       
     *      *            @hibernate.property
     *             column="address"
     *             length="100"
     *         
     */

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
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
     *             column="caseStatus"
     *             length="1"
     *         
     */

    public String getCaseStatus() {
        return this.caseStatus;
    }
    
    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }
   

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("idcard").append("='").append(getIdcard()).append("' ");			
      buffer.append("regIdorg").append("='").append(getRegIdorg()).append("' ");			
      buffer.append("regDate").append("='").append(getRegDate()).append("' ");			
      buffer.append("effectPeriod").append("='").append(getEffectPeriod()).append("' ");			
      buffer.append("pname").append("='").append(getPname()).append("' ");			
      buffer.append("phone").append("='").append(getPhone()).append("' ");			
      buffer.append("sex").append("='").append(getSex()).append("' ");			
      buffer.append("birthday").append("='").append(getBirthday()).append("' ");			
      buffer.append("married").append("='").append(getMarried()).append("' ");			
      buffer.append("metier").append("='").append(getMetier()).append("' ");			
      buffer.append("regAddress").append("='").append(getRegAddress()).append("' ");			
      buffer.append("regPostalcode").append("='").append(getRegPostalcode()).append("' ");			
      buffer.append("bideAddress").append("='").append(getBideAddress()).append("' ");			
      buffer.append("bidePostcode").append("='").append(getBidePostcode()).append("' ");			
      buffer.append("corporatePerson").append("='").append(getCorporatePerson()).append("' ");			
      buffer.append("address").append("='").append(getAddress()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("caseStatus").append("='").append(getCaseStatus()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PartyInfo) ) return false;
		 PartyInfo castOther = ( PartyInfo ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getIdcard()==castOther.getIdcard()) || ( this.getIdcard()!=null && castOther.getIdcard()!=null && this.getIdcard().equals(castOther.getIdcard()) ) )
 && ( (this.getRegIdorg()==castOther.getRegIdorg()) || ( this.getRegIdorg()!=null && castOther.getRegIdorg()!=null && this.getRegIdorg().equals(castOther.getRegIdorg()) ) )
 && ( (this.getRegDate()==castOther.getRegDate()) || ( this.getRegDate()!=null && castOther.getRegDate()!=null && this.getRegDate().equals(castOther.getRegDate()) ) )
 && ( (this.getEffectPeriod()==castOther.getEffectPeriod()) || ( this.getEffectPeriod()!=null && castOther.getEffectPeriod()!=null && this.getEffectPeriod().equals(castOther.getEffectPeriod()) ) )
 && ( (this.getPname()==castOther.getPname()) || ( this.getPname()!=null && castOther.getPname()!=null && this.getPname().equals(castOther.getPname()) ) )
 && ( (this.getPhone()==castOther.getPhone()) || ( this.getPhone()!=null && castOther.getPhone()!=null && this.getPhone().equals(castOther.getPhone()) ) )
 && ( (this.getSex()==castOther.getSex()) || ( this.getSex()!=null && castOther.getSex()!=null && this.getSex().equals(castOther.getSex()) ) )
 && ( (this.getBirthday()==castOther.getBirthday()) || ( this.getBirthday()!=null && castOther.getBirthday()!=null && this.getBirthday().equals(castOther.getBirthday()) ) )
 && ( (this.getMarried()==castOther.getMarried()) || ( this.getMarried()!=null && castOther.getMarried()!=null && this.getMarried().equals(castOther.getMarried()) ) )
 && ( (this.getMetier()==castOther.getMetier()) || ( this.getMetier()!=null && castOther.getMetier()!=null && this.getMetier().equals(castOther.getMetier()) ) )
 && ( (this.getRegAddress()==castOther.getRegAddress()) || ( this.getRegAddress()!=null && castOther.getRegAddress()!=null && this.getRegAddress().equals(castOther.getRegAddress()) ) )
 && ( (this.getRegPostalcode()==castOther.getRegPostalcode()) || ( this.getRegPostalcode()!=null && castOther.getRegPostalcode()!=null && this.getRegPostalcode().equals(castOther.getRegPostalcode()) ) )
 && ( (this.getBideAddress()==castOther.getBideAddress()) || ( this.getBideAddress()!=null && castOther.getBideAddress()!=null && this.getBideAddress().equals(castOther.getBideAddress()) ) )
 && ( (this.getBidePostcode()==castOther.getBidePostcode()) || ( this.getBidePostcode()!=null && castOther.getBidePostcode()!=null && this.getBidePostcode().equals(castOther.getBidePostcode()) ) )
 && ( (this.getCorporatePerson()==castOther.getCorporatePerson()) || ( this.getCorporatePerson()!=null && castOther.getCorporatePerson()!=null && this.getCorporatePerson().equals(castOther.getCorporatePerson()) ) )
 && ( (this.getAddress()==castOther.getAddress()) || ( this.getAddress()!=null && castOther.getAddress()!=null && this.getAddress().equals(castOther.getAddress()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) )
 && ( (this.getCaseStatus()==castOther.getCaseStatus()) || ( this.getCaseStatus()!=null && castOther.getCaseStatus()!=null && this.getCaseStatus().equals(castOther.getCaseStatus()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getIdcard() == null ? 0 : this.getIdcard().hashCode() );
         result = 37 * result + ( getRegIdorg() == null ? 0 : this.getRegIdorg().hashCode() );
         result = 37 * result + ( getRegDate() == null ? 0 : this.getRegDate().hashCode() );
         result = 37 * result + ( getEffectPeriod() == null ? 0 : this.getEffectPeriod().hashCode() );
         result = 37 * result + ( getPname() == null ? 0 : this.getPname().hashCode() );
         result = 37 * result + ( getPhone() == null ? 0 : this.getPhone().hashCode() );
         result = 37 * result + ( getSex() == null ? 0 : this.getSex().hashCode() );
         result = 37 * result + ( getBirthday() == null ? 0 : this.getBirthday().hashCode() );
         result = 37 * result + ( getMarried() == null ? 0 : this.getMarried().hashCode() );
         result = 37 * result + ( getMetier() == null ? 0 : this.getMetier().hashCode() );
         result = 37 * result + ( getRegAddress() == null ? 0 : this.getRegAddress().hashCode() );
         result = 37 * result + ( getRegPostalcode() == null ? 0 : this.getRegPostalcode().hashCode() );
         result = 37 * result + ( getBideAddress() == null ? 0 : this.getBideAddress().hashCode() );
         result = 37 * result + ( getBidePostcode() == null ? 0 : this.getBidePostcode().hashCode() );
         result = 37 * result + ( getCorporatePerson() == null ? 0 : this.getCorporatePerson().hashCode() );
         result = 37 * result + ( getAddress() == null ? 0 : this.getAddress().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         result = 37 * result + ( getCaseStatus() == null ? 0 : this.getCaseStatus().hashCode() );
         return result;
   }   





}
