package com.rosy.investigate.model;
// Generated 2008-11-2 19:50:24 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="enrollist"
 *     
 */

public class EnrolList extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String listId;
    private String depNum;
    private String adminOrder;
    private String keyWord;
    private String serialNum;
    private String problemDescribe;
    private String keepedBy;
    private String keepPlace;
    private String keeper;
    private java.util.Date keepDate;
    private java.util.Date createDate;
    private String rflag;
    private String remark;


    // Constructors

    /** default constructor */
    public EnrolList() {
    }

    
    /** full constructor */
    public EnrolList(String listId, String depNum, String adminOrder, String keyWord, String serialNum, String problemDescribe, String keepedBy, String keepPlace, String keeper, java.util.Date keepDate, java.util.Date createDate, String rflag, String remark) {
        this.listId = listId;
        this.depNum = depNum;
        this.adminOrder = adminOrder;
        this.keyWord = keyWord;
        this.serialNum = serialNum;
        this.problemDescribe = problemDescribe;
        this.keepedBy = keepedBy;
        this.keepPlace = keepPlace;
        this.keeper = keeper;
        this.keepDate = keepDate;
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
     *             column="listID"
     *             length="48"
     *         
     */

    public String getListId() {
        return this.listId;
    }
    
    public void setListId(String listId) {
        this.listId = listId;
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
     *             column="problemDescribe"
     *             length="2000"
     *         
     */

    public String getProblemDescribe() {
        return this.problemDescribe;
    }
    
    public void setProblemDescribe(String problemDescribe) {
        this.problemDescribe = problemDescribe;
    }
    /**       
     *      *            @hibernate.property
     *             column="keepedBy"
     *             length="2000"
     *         
     */

    public String getKeepedBy() {
        return this.keepedBy;
    }
    
    public void setKeepedBy(String keepedBy) {
        this.keepedBy = keepedBy;
    }
    /**       
     *      *            @hibernate.property
     *             column="keepPlace"
     *             length="200"
     *         
     */

    public String getKeepPlace() {
        return this.keepPlace;
    }
    
    public void setKeepPlace(String keepPlace) {
        this.keepPlace = keepPlace;
    }
    /**       
     *      *            @hibernate.property
     *             column="keeper"
     *             length="30"
     *         
     */

    public String getKeeper() {
        return this.keeper;
    }
    
    public void setKeeper(String keeper) {
        this.keeper = keeper;
    }
    /**       
     *      *            @hibernate.property
     *             column="keepDate"
     *             length="19"
     *         
     */

    public java.util.Date getKeepDate() {
        return this.keepDate;
    }
    
    public void setKeepDate(java.util.Date keepDate) {
        this.keepDate = keepDate;
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
      buffer.append("listId").append("='").append(getListId()).append("' ");			
      buffer.append("depNum").append("='").append(getDepNum()).append("' ");			
      buffer.append("adminOrder").append("='").append(getAdminOrder()).append("' ");			
      buffer.append("keyWord").append("='").append(getKeyWord()).append("' ");			
      buffer.append("serialNum").append("='").append(getSerialNum()).append("' ");			
      buffer.append("problemDescribe").append("='").append(getProblemDescribe()).append("' ");			
      buffer.append("keepedBy").append("='").append(getKeepedBy()).append("' ");			
      buffer.append("keepPlace").append("='").append(getKeepPlace()).append("' ");			
      buffer.append("keeper").append("='").append(getKeeper()).append("' ");			
      buffer.append("keepDate").append("='").append(getKeepDate()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EnrolList) ) return false;
		 EnrolList castOther = ( EnrolList ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getListId()==castOther.getListId()) || ( this.getListId()!=null && castOther.getListId()!=null && this.getListId().equals(castOther.getListId()) ) )
 && ( (this.getDepNum()==castOther.getDepNum()) || ( this.getDepNum()!=null && castOther.getDepNum()!=null && this.getDepNum().equals(castOther.getDepNum()) ) )
 && ( (this.getAdminOrder()==castOther.getAdminOrder()) || ( this.getAdminOrder()!=null && castOther.getAdminOrder()!=null && this.getAdminOrder().equals(castOther.getAdminOrder()) ) )
 && ( (this.getKeyWord()==castOther.getKeyWord()) || ( this.getKeyWord()!=null && castOther.getKeyWord()!=null && this.getKeyWord().equals(castOther.getKeyWord()) ) )
 && ( (this.getSerialNum()==castOther.getSerialNum()) || ( this.getSerialNum()!=null && castOther.getSerialNum()!=null && this.getSerialNum().equals(castOther.getSerialNum()) ) )
 && ( (this.getProblemDescribe()==castOther.getProblemDescribe()) || ( this.getProblemDescribe()!=null && castOther.getProblemDescribe()!=null && this.getProblemDescribe().equals(castOther.getProblemDescribe()) ) )
 && ( (this.getKeepedBy()==castOther.getKeepedBy()) || ( this.getKeepedBy()!=null && castOther.getKeepedBy()!=null && this.getKeepedBy().equals(castOther.getKeepedBy()) ) )
 && ( (this.getKeepPlace()==castOther.getKeepPlace()) || ( this.getKeepPlace()!=null && castOther.getKeepPlace()!=null && this.getKeepPlace().equals(castOther.getKeepPlace()) ) )
 && ( (this.getKeeper()==castOther.getKeeper()) || ( this.getKeeper()!=null && castOther.getKeeper()!=null && this.getKeeper().equals(castOther.getKeeper()) ) )
 && ( (this.getKeepDate()==castOther.getKeepDate()) || ( this.getKeepDate()!=null && castOther.getKeepDate()!=null && this.getKeepDate().equals(castOther.getKeepDate()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getListId() == null ? 0 : this.getListId().hashCode() );
         result = 37 * result + ( getDepNum() == null ? 0 : this.getDepNum().hashCode() );
         result = 37 * result + ( getAdminOrder() == null ? 0 : this.getAdminOrder().hashCode() );
         result = 37 * result + ( getKeyWord() == null ? 0 : this.getKeyWord().hashCode() );
         result = 37 * result + ( getSerialNum() == null ? 0 : this.getSerialNum().hashCode() );
         result = 37 * result + ( getProblemDescribe() == null ? 0 : this.getProblemDescribe().hashCode() );
         result = 37 * result + ( getKeepedBy() == null ? 0 : this.getKeepedBy().hashCode() );
         result = 37 * result + ( getKeepPlace() == null ? 0 : this.getKeepPlace().hashCode() );
         result = 37 * result + ( getKeeper() == null ? 0 : this.getKeeper().hashCode() );
         result = 37 * result + ( getKeepDate() == null ? 0 : this.getKeepDate().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         return result;
   }   





}
