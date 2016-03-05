package com.rosy.punish.model;
// Generated 2008-11-5 11:29:28 by Hibernate Tools 3.1.0.beta4

import java.math.BigDecimal;
import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="performcase"
 *     
 */

public class PerformCase extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private BigDecimal caseFine;
    private String confiscateProperty;
    private BigDecimal infine;
    private BigDecimal notInFine;
    private String confiscateState;
    private String propertyKeep;
    private String decideMeasure;
    private String remark;
    private String rflag;
    private Date createDate;


    // Constructors

    /** default constructor */
    public PerformCase() {
    }

    
    /** full constructor */
    public PerformCase(BigDecimal caseFine, String confiscateProperty, BigDecimal infine, BigDecimal notInFine, String confiscateState, String propertyKeep, String decideMeasure, String remark, String rflag, Date createDate) {
        this.caseFine = caseFine;
        this.confiscateProperty = confiscateProperty;
        this.infine = infine;
        this.notInFine = notInFine;
        this.confiscateState = confiscateState;
        this.propertyKeep = propertyKeep;
        this.decideMeasure = decideMeasure;
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
     *             column="caseFine"
     *             length="11"
     *         
     */

    public BigDecimal getCaseFine() {
        return this.caseFine;
    }
    
    public void setCaseFine(BigDecimal caseFine) {
        this.caseFine = caseFine;
    }
    /**       
     *      *            @hibernate.property
     *             column="confiscateProperty"
     *             length="2000"
     *         
     */

    public String getConfiscateProperty() {
        return this.confiscateProperty;
    }
    
    public void setConfiscateProperty(String confiscateProperty) {
        this.confiscateProperty = confiscateProperty;
    }
    /**       
     *      *            @hibernate.property
     *             column="inFine"
     *             length="11"
     *         
     */

    public BigDecimal getInfine() {
        return this.infine;
    }
    
    public void setInfine(BigDecimal infine) {
        this.infine = infine;
    }
    /**       
     *      *            @hibernate.property
     *             column="notInFine"
     *             length="11"
     *         
     */

    public BigDecimal getNotInFine() {
        return this.notInFine;
    }
    
    public void setNotInFine(BigDecimal notInFine) {
        this.notInFine = notInFine;
    }
    /**       
     *      *            @hibernate.property
     *             column="confiscateState"
     *             length="1"
     *         
     */

    public String getConfiscateState() {
        return this.confiscateState;
    }
    
    public void setConfiscateState(String confiscateState) {
        this.confiscateState = confiscateState;
    }
    /**       
     *      *            @hibernate.property
     *             column="propertyKeep"
     *             length="400"
     *         
     */

    public String getPropertyKeep() {
        return this.propertyKeep;
    }
    
    public void setPropertyKeep(String propertyKeep) {
        this.propertyKeep = propertyKeep;
    }
    /**       
     *      *            @hibernate.property
     *             column="decideMeasure"
     *             length="1"
     *         
     */

    public String getDecideMeasure() {
        return this.decideMeasure;
    }
    
    public void setDecideMeasure(String decideMeasure) {
        this.decideMeasure = decideMeasure;
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
      buffer.append("caseFine").append("='").append(getCaseFine()).append("' ");			
      buffer.append("confiscateProperty").append("='").append(getConfiscateProperty()).append("' ");			
      buffer.append("infine").append("='").append(getInfine()).append("' ");			
      buffer.append("notInFine").append("='").append(getNotInFine()).append("' ");			
      buffer.append("confiscateState").append("='").append(getConfiscateState()).append("' ");			
      buffer.append("propertyKeep").append("='").append(getPropertyKeep()).append("' ");			
      buffer.append("decideMeasure").append("='").append(getDecideMeasure()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PerformCase) ) return false;
		 PerformCase castOther = ( PerformCase ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getCaseFine()==castOther.getCaseFine()) || ( this.getCaseFine()!=null && castOther.getCaseFine()!=null && this.getCaseFine().equals(castOther.getCaseFine()) ) )
 && ( (this.getConfiscateProperty()==castOther.getConfiscateProperty()) || ( this.getConfiscateProperty()!=null && castOther.getConfiscateProperty()!=null && this.getConfiscateProperty().equals(castOther.getConfiscateProperty()) ) )
 && ( (this.getInfine()==castOther.getInfine()) || ( this.getInfine()!=null && castOther.getInfine()!=null && this.getInfine().equals(castOther.getInfine()) ) )
 && ( (this.getNotInFine()==castOther.getNotInFine()) || ( this.getNotInFine()!=null && castOther.getNotInFine()!=null && this.getNotInFine().equals(castOther.getNotInFine()) ) )
 && ( (this.getConfiscateState()==castOther.getConfiscateState()) || ( this.getConfiscateState()!=null && castOther.getConfiscateState()!=null && this.getConfiscateState().equals(castOther.getConfiscateState()) ) )
 && ( (this.getPropertyKeep()==castOther.getPropertyKeep()) || ( this.getPropertyKeep()!=null && castOther.getPropertyKeep()!=null && this.getPropertyKeep().equals(castOther.getPropertyKeep()) ) )
 && ( (this.getDecideMeasure()==castOther.getDecideMeasure()) || ( this.getDecideMeasure()!=null && castOther.getDecideMeasure()!=null && this.getDecideMeasure().equals(castOther.getDecideMeasure()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getCaseFine() == null ? 0 : this.getCaseFine().hashCode() );
         result = 37 * result + ( getConfiscateProperty() == null ? 0 : this.getConfiscateProperty().hashCode() );
         result = 37 * result + ( getInfine() == null ? 0 : this.getInfine().hashCode() );
         result = 37 * result + ( getNotInFine() == null ? 0 : this.getNotInFine().hashCode() );
         result = 37 * result + ( getConfiscateState() == null ? 0 : this.getConfiscateState().hashCode() );
         result = 37 * result + ( getPropertyKeep() == null ? 0 : this.getPropertyKeep().hashCode() );
         result = 37 * result + ( getDecideMeasure() == null ? 0 : this.getDecideMeasure().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
