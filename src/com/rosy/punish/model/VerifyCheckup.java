package com.rosy.punish.model;
// Generated 2008-11-2 19:50:26 by Hibernate Tools 3.1.0.beta4



/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="verifycheckup"
 *     
 */

public class VerifyCheckup extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private java.util.Date sendVerifyDate;
    private String lawPartIdea;
    private String lawPartMan;
    private java.util.Date lawPartCheckDate;
    private String directorGeneralIdea;
    private String directorGeneral;
    private String directorOrg;
    private java.util.Date directorCheckDate;
    private String remark;
    private String rflag;
    private java.util.Date createDate;


    // Constructors

    /** default constructor */
    public VerifyCheckup() {
    }

    
    /** full constructor */
    public VerifyCheckup(java.util.Date sendVerifyDate, String lawPartIdea, String lawPartMan, java.util.Date lawPartCheckDate, String directorGeneralIdea, String directorGeneral, String directorOrg, java.util.Date directorCheckDate, String remark, String rflag, java.util.Date createDate) {
        this.sendVerifyDate = sendVerifyDate;
        this.lawPartIdea = lawPartIdea;
        this.lawPartMan = lawPartMan;
        this.lawPartCheckDate = lawPartCheckDate;
        this.directorGeneralIdea = directorGeneralIdea;
        this.directorGeneral = directorGeneral;
        this.directorOrg = directorOrg;
        this.directorCheckDate = directorCheckDate;
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
     *             column="sendVerifyDate"
     *             length="19"
     *         
     */

    public java.util.Date getSendVerifyDate() {
        return this.sendVerifyDate;
    }
    
    public void setSendVerifyDate(java.util.Date sendVerifyDate) {
        this.sendVerifyDate = sendVerifyDate;
    }
    /**       
     *      *            @hibernate.property
     *             column="lawPartIdea"
     *             length="1000"
     *         
     */

    public String getLawPartIdea() {
        return this.lawPartIdea;
    }
    
    public void setLawPartIdea(String lawPartIdea) {
        this.lawPartIdea = lawPartIdea;
    }
    /**       
     *      *            @hibernate.property
     *             column="lawPartMan"
     *             length="30"
     *         
     */

    public String getLawPartMan() {
        return this.lawPartMan;
    }
    
    public void setLawPartMan(String lawPartMan) {
        this.lawPartMan = lawPartMan;
    }
    /**       
     *      *            @hibernate.property
     *             column="lawPartCheckDate"
     *             length="19"
     *         
     */

    public java.util.Date getLawPartCheckDate() {
        return this.lawPartCheckDate;
    }
    
    public void setLawPartCheckDate(java.util.Date lawPartCheckDate) {
        this.lawPartCheckDate = lawPartCheckDate;
    }
    /**       
     *      *            @hibernate.property
     *             column="directorGeneralIdea"
     *             length="400"
     *         
     */

    public String getDirectorGeneralIdea() {
        return this.directorGeneralIdea;
    }
    
    public void setDirectorGeneralIdea(String directorGeneralIdea) {
        this.directorGeneralIdea = directorGeneralIdea;
    }
    /**       
     *      *            @hibernate.property
     *             column="directorGeneral"
     *             length="30"
     *         
     */

    public String getDirectorGeneral() {
        return this.directorGeneral;
    }
    
    public void setDirectorGeneral(String directorGeneral) {
        this.directorGeneral = directorGeneral;
    }
    /**       
     *      *            @hibernate.property
     *             column="directorOrg"
     *             length="50"
     *         
     */

    public String getDirectorOrg() {
        return this.directorOrg;
    }
    
    public void setDirectorOrg(String directorOrg) {
        this.directorOrg = directorOrg;
    }
    /**       
     *      *            @hibernate.property
     *             column="directorCheckDate"
     *             length="19"
     *         
     */

    public java.util.Date getDirectorCheckDate() {
        return this.directorCheckDate;
    }
    
    public void setDirectorCheckDate(java.util.Date directorCheckDate) {
        this.directorCheckDate = directorCheckDate;
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
      buffer.append("sendVerifyDate").append("='").append(getSendVerifyDate()).append("' ");			
      buffer.append("lawPartIdea").append("='").append(getLawPartIdea()).append("' ");			
      buffer.append("lawPartMan").append("='").append(getLawPartMan()).append("' ");			
      buffer.append("lawPartCheckDate").append("='").append(getLawPartCheckDate()).append("' ");			
      buffer.append("directorGeneralIdea").append("='").append(getDirectorGeneralIdea()).append("' ");			
      buffer.append("directorGeneral").append("='").append(getDirectorGeneral()).append("' ");			
      buffer.append("directorOrg").append("='").append(getDirectorOrg()).append("' ");			
      buffer.append("directorCheckDate").append("='").append(getDirectorCheckDate()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VerifyCheckup) ) return false;
		 VerifyCheckup castOther = ( VerifyCheckup ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getSendVerifyDate()==castOther.getSendVerifyDate()) || ( this.getSendVerifyDate()!=null && castOther.getSendVerifyDate()!=null && this.getSendVerifyDate().equals(castOther.getSendVerifyDate()) ) )
 && ( (this.getLawPartIdea()==castOther.getLawPartIdea()) || ( this.getLawPartIdea()!=null && castOther.getLawPartIdea()!=null && this.getLawPartIdea().equals(castOther.getLawPartIdea()) ) )
 && ( (this.getLawPartMan()==castOther.getLawPartMan()) || ( this.getLawPartMan()!=null && castOther.getLawPartMan()!=null && this.getLawPartMan().equals(castOther.getLawPartMan()) ) )
 && ( (this.getLawPartCheckDate()==castOther.getLawPartCheckDate()) || ( this.getLawPartCheckDate()!=null && castOther.getLawPartCheckDate()!=null && this.getLawPartCheckDate().equals(castOther.getLawPartCheckDate()) ) )
 && ( (this.getDirectorGeneralIdea()==castOther.getDirectorGeneralIdea()) || ( this.getDirectorGeneralIdea()!=null && castOther.getDirectorGeneralIdea()!=null && this.getDirectorGeneralIdea().equals(castOther.getDirectorGeneralIdea()) ) )
 && ( (this.getDirectorGeneral()==castOther.getDirectorGeneral()) || ( this.getDirectorGeneral()!=null && castOther.getDirectorGeneral()!=null && this.getDirectorGeneral().equals(castOther.getDirectorGeneral()) ) )
 && ( (this.getDirectorOrg()==castOther.getDirectorOrg()) || ( this.getDirectorOrg()!=null && castOther.getDirectorOrg()!=null && this.getDirectorOrg().equals(castOther.getDirectorOrg()) ) )
 && ( (this.getDirectorCheckDate()==castOther.getDirectorCheckDate()) || ( this.getDirectorCheckDate()!=null && castOther.getDirectorCheckDate()!=null && this.getDirectorCheckDate().equals(castOther.getDirectorCheckDate()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getSendVerifyDate() == null ? 0 : this.getSendVerifyDate().hashCode() );
         result = 37 * result + ( getLawPartIdea() == null ? 0 : this.getLawPartIdea().hashCode() );
         result = 37 * result + ( getLawPartMan() == null ? 0 : this.getLawPartMan().hashCode() );
         result = 37 * result + ( getLawPartCheckDate() == null ? 0 : this.getLawPartCheckDate().hashCode() );
         result = 37 * result + ( getDirectorGeneralIdea() == null ? 0 : this.getDirectorGeneralIdea().hashCode() );
         result = 37 * result + ( getDirectorGeneral() == null ? 0 : this.getDirectorGeneral().hashCode() );
         result = 37 * result + ( getDirectorOrg() == null ? 0 : this.getDirectorOrg().hashCode() );
         result = 37 * result + ( getDirectorCheckDate() == null ? 0 : this.getDirectorCheckDate().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
