package com.rosy.investigate.model;
// Generated 2008-11-2 19:50:25 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="othercert"
 *     
 */

public class OtherCert extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String certName;
    private String certNo;
    private String cname;
    private String pbound;
    private String dealInWhere;
    private String dealInMode;
    private java.util.Date validStartDate;
    private java.util.Date validEndDate;
    private String issueCertOrg;
    private java.util.Date issueDate;
    private String remark;
    private String rflag;
    private java.util.Date createDate;


    // Constructors

    /** default constructor */
    public OtherCert() {
    }

    
    /** full constructor */
    public OtherCert(String certName, String certNo, String cname, String pbound, String dealInWhere, String dealInMode, java.util.Date validStartDate, java.util.Date validEndDate, String issueCertOrg, java.util.Date issueDate, String remark, String rflag, java.util.Date createDate) {
        this.certName = certName;
        this.certNo = certNo;
        this.cname = cname;
        this.pbound = pbound;
        this.dealInWhere = dealInWhere;
        this.dealInMode = dealInMode;
        this.validStartDate = validStartDate;
        this.validEndDate = validEndDate;
        this.issueCertOrg = issueCertOrg;
        this.issueDate = issueDate;
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
     *             column="certName"
     *             length="50"
     *         
     */

    public String getCertName() {
        return this.certName;
    }
    
    public void setCertName(String certName) {
        this.certName = certName;
    }
    /**       
     *      *            @hibernate.property
     *             column="certNO"
     *             length="30"
     *         
     */

    public String getCertNo() {
        return this.certNo;
    }
    
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }
    /**       
     *      *            @hibernate.property
     *             column="cName"
     *             length="50"
     *         
     */

    public String getCname() {
        return this.cname;
    }
    
    public void setCname(String cname) {
        this.cname = cname;
    }
    /**       
     *      *            @hibernate.property
     *             column="pBound"
     *             length="200"
     *         
     */

    public String getPbound() {
        return this.pbound;
    }
    
    public void setPbound(String pbound) {
        this.pbound = pbound;
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
     *             column="issueCertOrg"
     *             length="100"
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
     *             column="issueDate"
     *             length="19"
     *         
     */

    public java.util.Date getIssueDate() {
        return this.issueDate;
    }
    
    public void setIssueDate(java.util.Date issueDate) {
        this.issueDate = issueDate;
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
      buffer.append("certName").append("='").append(getCertName()).append("' ");			
      buffer.append("certNo").append("='").append(getCertNo()).append("' ");			
      buffer.append("cname").append("='").append(getCname()).append("' ");			
      buffer.append("pbound").append("='").append(getPbound()).append("' ");			
      buffer.append("dealInWhere").append("='").append(getDealInWhere()).append("' ");			
      buffer.append("dealInMode").append("='").append(getDealInMode()).append("' ");			
      buffer.append("validStartDate").append("='").append(getValidStartDate()).append("' ");			
      buffer.append("validEndDate").append("='").append(getValidEndDate()).append("' ");			
      buffer.append("issueCertOrg").append("='").append(getIssueCertOrg()).append("' ");			
      buffer.append("issueDate").append("='").append(getIssueDate()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OtherCert) ) return false;
		 OtherCert castOther = ( OtherCert ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getCertName()==castOther.getCertName()) || ( this.getCertName()!=null && castOther.getCertName()!=null && this.getCertName().equals(castOther.getCertName()) ) )
 && ( (this.getCertNo()==castOther.getCertNo()) || ( this.getCertNo()!=null && castOther.getCertNo()!=null && this.getCertNo().equals(castOther.getCertNo()) ) )
 && ( (this.getCname()==castOther.getCname()) || ( this.getCname()!=null && castOther.getCname()!=null && this.getCname().equals(castOther.getCname()) ) )
 && ( (this.getPbound()==castOther.getPbound()) || ( this.getPbound()!=null && castOther.getPbound()!=null && this.getPbound().equals(castOther.getPbound()) ) )
 && ( (this.getDealInWhere()==castOther.getDealInWhere()) || ( this.getDealInWhere()!=null && castOther.getDealInWhere()!=null && this.getDealInWhere().equals(castOther.getDealInWhere()) ) )
 && ( (this.getDealInMode()==castOther.getDealInMode()) || ( this.getDealInMode()!=null && castOther.getDealInMode()!=null && this.getDealInMode().equals(castOther.getDealInMode()) ) )
 && ( (this.getValidStartDate()==castOther.getValidStartDate()) || ( this.getValidStartDate()!=null && castOther.getValidStartDate()!=null && this.getValidStartDate().equals(castOther.getValidStartDate()) ) )
 && ( (this.getValidEndDate()==castOther.getValidEndDate()) || ( this.getValidEndDate()!=null && castOther.getValidEndDate()!=null && this.getValidEndDate().equals(castOther.getValidEndDate()) ) )
 && ( (this.getIssueCertOrg()==castOther.getIssueCertOrg()) || ( this.getIssueCertOrg()!=null && castOther.getIssueCertOrg()!=null && this.getIssueCertOrg().equals(castOther.getIssueCertOrg()) ) )
 && ( (this.getIssueDate()==castOther.getIssueDate()) || ( this.getIssueDate()!=null && castOther.getIssueDate()!=null && this.getIssueDate().equals(castOther.getIssueDate()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getCertName() == null ? 0 : this.getCertName().hashCode() );
         result = 37 * result + ( getCertNo() == null ? 0 : this.getCertNo().hashCode() );
         result = 37 * result + ( getCname() == null ? 0 : this.getCname().hashCode() );
         result = 37 * result + ( getPbound() == null ? 0 : this.getPbound().hashCode() );
         result = 37 * result + ( getDealInWhere() == null ? 0 : this.getDealInWhere().hashCode() );
         result = 37 * result + ( getDealInMode() == null ? 0 : this.getDealInMode().hashCode() );
         result = 37 * result + ( getValidStartDate() == null ? 0 : this.getValidStartDate().hashCode() );
         result = 37 * result + ( getValidEndDate() == null ? 0 : this.getValidEndDate().hashCode() );
         result = 37 * result + ( getIssueCertOrg() == null ? 0 : this.getIssueCertOrg().hashCode() );
         result = 37 * result + ( getIssueDate() == null ? 0 : this.getIssueDate().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
