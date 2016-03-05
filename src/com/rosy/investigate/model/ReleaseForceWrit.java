package com.rosy.investigate.model;
// Generated 2008-11-2 19:50:27 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="releaseforcewrit"
 *     
 */

public class ReleaseForceWrit extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String depNum;
    private String adminOrder;
    private String keyWord;
    private String serialNum;
    private String ntitle;
    private java.util.Date rdate;
    private java.util.Date ndate;
    private String norg;
    private java.util.Date createDate;
    private String rflag;
    private String remark;


    // Constructors

    /** default constructor */
    public ReleaseForceWrit() {
    }

    
    /** full constructor */
    public ReleaseForceWrit(String depNum, String adminOrder, String keyWord, String serialNum, String ntitle, java.util.Date rdate, java.util.Date ndate, String norg, java.util.Date createDate, String rflag, String remark) {
        this.depNum = depNum;
        this.adminOrder = adminOrder;
        this.keyWord = keyWord;
        this.serialNum = serialNum;
        this.ntitle = ntitle;
        this.rdate = rdate;
        this.ndate = ndate;
        this.norg = norg;
        this.createDate = createDate;
        this.rflag = rflag;
        this.remark = remark;
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
     *             column="nTitle"
     *             length="50"
     *         
     */

    public String getNtitle() {
        return this.ntitle;
    }
    
    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }
    /**       
     *      *            @hibernate.property
     *             column="rDate"
     *             length="19"
     *         
     */

    public java.util.Date getRdate() {
        return this.rdate;
    }
    
    public void setRdate(java.util.Date rdate) {
        this.rdate = rdate;
    }
    /**       
     *      *            @hibernate.property
     *             column="nDate"
     *             length="19"
     *         
     */

    public java.util.Date getNdate() {
        return this.ndate;
    }
    
    public void setNdate(java.util.Date ndate) {
        this.ndate = ndate;
    }
    /**       
     *      *            @hibernate.property
     *             column="nOrg"
     *             length="50"
     *         
     */

    public String getNorg() {
        return this.norg;
    }
    
    public void setNorg(String norg) {
        this.norg = norg;
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
      buffer.append("ntitle").append("='").append(getNtitle()).append("' ");			
      buffer.append("rdate").append("='").append(getRdate()).append("' ");			
      buffer.append("ndate").append("='").append(getNdate()).append("' ");			
      buffer.append("norg").append("='").append(getNorg()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ReleaseForceWrit) ) return false;
		 ReleaseForceWrit castOther = ( ReleaseForceWrit ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getDepNum()==castOther.getDepNum()) || ( this.getDepNum()!=null && castOther.getDepNum()!=null && this.getDepNum().equals(castOther.getDepNum()) ) )
 && ( (this.getAdminOrder()==castOther.getAdminOrder()) || ( this.getAdminOrder()!=null && castOther.getAdminOrder()!=null && this.getAdminOrder().equals(castOther.getAdminOrder()) ) )
 && ( (this.getKeyWord()==castOther.getKeyWord()) || ( this.getKeyWord()!=null && castOther.getKeyWord()!=null && this.getKeyWord().equals(castOther.getKeyWord()) ) )
 && ( (this.getSerialNum()==castOther.getSerialNum()) || ( this.getSerialNum()!=null && castOther.getSerialNum()!=null && this.getSerialNum().equals(castOther.getSerialNum()) ) )
 && ( (this.getNtitle()==castOther.getNtitle()) || ( this.getNtitle()!=null && castOther.getNtitle()!=null && this.getNtitle().equals(castOther.getNtitle()) ) )
 && ( (this.getRdate()==castOther.getRdate()) || ( this.getRdate()!=null && castOther.getRdate()!=null && this.getRdate().equals(castOther.getRdate()) ) )
 && ( (this.getNdate()==castOther.getNdate()) || ( this.getNdate()!=null && castOther.getNdate()!=null && this.getNdate().equals(castOther.getNdate()) ) )
 && ( (this.getNorg()==castOther.getNorg()) || ( this.getNorg()!=null && castOther.getNorg()!=null && this.getNorg().equals(castOther.getNorg()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getDepNum() == null ? 0 : this.getDepNum().hashCode() );
         result = 37 * result + ( getAdminOrder() == null ? 0 : this.getAdminOrder().hashCode() );
         result = 37 * result + ( getKeyWord() == null ? 0 : this.getKeyWord().hashCode() );
         result = 37 * result + ( getSerialNum() == null ? 0 : this.getSerialNum().hashCode() );
         result = 37 * result + ( getNtitle() == null ? 0 : this.getNtitle().hashCode() );
         result = 37 * result + ( getRdate() == null ? 0 : this.getRdate().hashCode() );
         result = 37 * result + ( getNdate() == null ? 0 : this.getNdate().hashCode() );
         result = 37 * result + ( getNorg() == null ? 0 : this.getNorg().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         return result;
   }   





}
