package com.rosy.investigate.model;
// Generated 2008-11-2 21:48:13 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="checkupreport"
 *     
 */

public class CheckupReport extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String repNum;
    private String productName;
    private String spec;
    private String brand;
    private String productionOrg;
    private String sellOrg;
    private String checkResult;
    private String checkOrg;
    private java.util.Date markDate;
    private String remark;
    private String rflag;
    private java.util.Date createDate;


    // Constructors

    /** default constructor */
    public CheckupReport() {
    }

    
    /** full constructor */
    public CheckupReport(String repNum, String productName, String spec, String brand, String productionOrg, String sellOrg, String checkResult, String checkOrg, java.util.Date markDate, String remark, String rflag, java.util.Date createDate) {
        this.repNum = repNum;
        this.productName = productName;
        this.spec = spec;
        this.brand = brand;
        this.productionOrg = productionOrg;
        this.sellOrg = sellOrg;
        this.checkResult = checkResult;
        this.checkOrg = checkOrg;
        this.markDate = markDate;
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
     *             column="repNum"
     *             length="100"
     *         
     */

    public String getRepNum() {
        return this.repNum;
    }
    
    public void setRepNum(String repNum) {
        this.repNum = repNum;
    }
    /**       
     *      *            @hibernate.property
     *             column="productName"
     *             length="200"
     *         
     */

    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    /**       
     *      *            @hibernate.property
     *             column="spec"
     *             length="50"
     *         
     */

    public String getSpec() {
        return this.spec;
    }
    
    public void setSpec(String spec) {
        this.spec = spec;
    }
    /**       
     *      *            @hibernate.property
     *             column="brand"
     *             length="100"
     *         
     */

    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**       
     *      *            @hibernate.property
     *             column="productionOrg"
     *             length="100"
     *         
     */

    public String getProductionOrg() {
        return this.productionOrg;
    }
    
    public void setProductionOrg(String productionOrg) {
        this.productionOrg = productionOrg;
    }
    /**       
     *      *            @hibernate.property
     *             column="sellOrg"
     *             length="100"
     *         
     */

    public String getSellOrg() {
        return this.sellOrg;
    }
    
    public void setSellOrg(String sellOrg) {
        this.sellOrg = sellOrg;
    }
    /**       
     *      *            @hibernate.property
     *             column="checkResult"
     *             length="8000"
     *         
     */

    public String getCheckResult() {
        return this.checkResult;
    }
    
    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }
    /**       
     *      *            @hibernate.property
     *             column="checkOrg"
     *             length="100"
     *         
     */

    public String getCheckOrg() {
        return this.checkOrg;
    }
    
    public void setCheckOrg(String checkOrg) {
        this.checkOrg = checkOrg;
    }
    /**       
     *      *            @hibernate.property
     *             column="markDate"
     *             length="19"
     *         
     */

    public java.util.Date getMarkDate() {
        return this.markDate;
    }
    
    public void setMarkDate(java.util.Date markDate) {
        this.markDate = markDate;
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
      buffer.append("repNum").append("='").append(getRepNum()).append("' ");			
      buffer.append("productName").append("='").append(getProductName()).append("' ");			
      buffer.append("spec").append("='").append(getSpec()).append("' ");			
      buffer.append("brand").append("='").append(getBrand()).append("' ");			
      buffer.append("productionOrg").append("='").append(getProductionOrg()).append("' ");			
      buffer.append("sellOrg").append("='").append(getSellOrg()).append("' ");			
      buffer.append("checkResult").append("='").append(getCheckResult()).append("' ");			
      buffer.append("checkOrg").append("='").append(getCheckOrg()).append("' ");			
      buffer.append("markDate").append("='").append(getMarkDate()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CheckupReport) ) return false;
		 CheckupReport castOther = ( CheckupReport ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getRepNum()==castOther.getRepNum()) || ( this.getRepNum()!=null && castOther.getRepNum()!=null && this.getRepNum().equals(castOther.getRepNum()) ) )
 && ( (this.getProductName()==castOther.getProductName()) || ( this.getProductName()!=null && castOther.getProductName()!=null && this.getProductName().equals(castOther.getProductName()) ) )
 && ( (this.getSpec()==castOther.getSpec()) || ( this.getSpec()!=null && castOther.getSpec()!=null && this.getSpec().equals(castOther.getSpec()) ) )
 && ( (this.getBrand()==castOther.getBrand()) || ( this.getBrand()!=null && castOther.getBrand()!=null && this.getBrand().equals(castOther.getBrand()) ) )
 && ( (this.getProductionOrg()==castOther.getProductionOrg()) || ( this.getProductionOrg()!=null && castOther.getProductionOrg()!=null && this.getProductionOrg().equals(castOther.getProductionOrg()) ) )
 && ( (this.getSellOrg()==castOther.getSellOrg()) || ( this.getSellOrg()!=null && castOther.getSellOrg()!=null && this.getSellOrg().equals(castOther.getSellOrg()) ) )
 && ( (this.getCheckResult()==castOther.getCheckResult()) || ( this.getCheckResult()!=null && castOther.getCheckResult()!=null && this.getCheckResult().equals(castOther.getCheckResult()) ) )
 && ( (this.getCheckOrg()==castOther.getCheckOrg()) || ( this.getCheckOrg()!=null && castOther.getCheckOrg()!=null && this.getCheckOrg().equals(castOther.getCheckOrg()) ) )
 && ( (this.getMarkDate()==castOther.getMarkDate()) || ( this.getMarkDate()!=null && castOther.getMarkDate()!=null && this.getMarkDate().equals(castOther.getMarkDate()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getRepNum() == null ? 0 : this.getRepNum().hashCode() );
         result = 37 * result + ( getProductName() == null ? 0 : this.getProductName().hashCode() );
         result = 37 * result + ( getSpec() == null ? 0 : this.getSpec().hashCode() );
         result = 37 * result + ( getBrand() == null ? 0 : this.getBrand().hashCode() );
         result = 37 * result + ( getProductionOrg() == null ? 0 : this.getProductionOrg().hashCode() );
         result = 37 * result + ( getSellOrg() == null ? 0 : this.getSellOrg().hashCode() );
         result = 37 * result + ( getCheckResult() == null ? 0 : this.getCheckResult().hashCode() );
         result = 37 * result + ( getCheckOrg() == null ? 0 : this.getCheckOrg().hashCode() );
         result = 37 * result + ( getMarkDate() == null ? 0 : this.getMarkDate().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
