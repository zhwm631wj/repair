package com.rosy.punish.model;
// Generated 2008-11-2 19:50:25 by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class
 *         table="punishexamine"
 *     
 */

public class PunishExamine extends com.rosy.model.BaseObject implements java.io.Serializable {


    // Fields    

    private String id;
    private String caseKind;
    private java.util.Date regCaseDate;
    private String punishContent;
    private java.util.Date signatureDate;
    private String undertakeOrgIdea;
    private String superintendent;
    private java.util.Date supeExamDate;
    private String lawPartidea;
    private String lawPartMan;
    private java.util.Date lawPartCheckDate;
    private String lawPartOrg;
    private String directorGeneralIdea;
    private String directorGeneral;
    private String direGenBureaux;
    private java.util.Date direGenExamDate;
    private String remark;
    private String rflag;
    private java.util.Date createDate;


    // Constructors

    /** default constructor */
    public PunishExamine() {
    }

    
    /** full constructor */
    public PunishExamine(String caseKind, java.util.Date regCaseDate, String punishContent, java.util.Date signatureDate, String undertakeOrgIdea, String superintendent, java.util.Date supeExamDate, String lawPartidea, String lawPartMan, java.util.Date lawPartCheckDate, String lawPartOrg, String directorGeneralIdea, String directorGeneral, String direGenBureaux, java.util.Date direGenExamDate, String remark, String rflag, java.util.Date createDate) {
        this.caseKind = caseKind;
        this.regCaseDate = regCaseDate;
        this.punishContent = punishContent;
        this.signatureDate = signatureDate;
        this.undertakeOrgIdea = undertakeOrgIdea;
        this.superintendent = superintendent;
        this.supeExamDate = supeExamDate;
        this.lawPartidea = lawPartidea;
        this.lawPartMan = lawPartMan;
        this.lawPartCheckDate = lawPartCheckDate;
        this.lawPartOrg = lawPartOrg;
        this.directorGeneralIdea = directorGeneralIdea;
        this.directorGeneral = directorGeneral;
        this.direGenBureaux = direGenBureaux;
        this.direGenExamDate = direGenExamDate;
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
     *             column="caseKind"
     *             length="2"
     *         
     */

    public String getCaseKind() {
        return this.caseKind;
    }
    
    public void setCaseKind(String caseKind) {
        this.caseKind = caseKind;
    }
    /**       
     *      *            @hibernate.property
     *             column="regCaseDate"
     *             length="19"
     *         
     */

    public java.util.Date getRegCaseDate() {
        return this.regCaseDate;
    }
    
    public void setRegCaseDate(java.util.Date regCaseDate) {
        this.regCaseDate = regCaseDate;
    }
    /**       
     *      *            @hibernate.property
     *             column="punishContent"
     *             length="8000"
     *         
     */

    public String getPunishContent() {
        return this.punishContent;
    }
    
    public void setPunishContent(String punishContent) {
        this.punishContent = punishContent;
    }
    /**       
     *      *            @hibernate.property
     *             column="signatureDate"
     *             length="19"
     *         
     */

    public java.util.Date getSignatureDate() {
        return this.signatureDate;
    }
    
    public void setSignatureDate(java.util.Date signatureDate) {
        this.signatureDate = signatureDate;
    }
    /**       
     *      *            @hibernate.property
     *             column="undertakeOrgIdea"
     *             length="400"
     *         
     */

    public String getUndertakeOrgIdea() {
        return this.undertakeOrgIdea;
    }
    
    public void setUndertakeOrgIdea(String undertakeOrgIdea) {
        this.undertakeOrgIdea = undertakeOrgIdea;
    }
    /**       
     *      *            @hibernate.property
     *             column="superintendent"
     *             length="30"
     *         
     */

    public String getSuperintendent() {
        return this.superintendent;
    }
    
    public void setSuperintendent(String superintendent) {
        this.superintendent = superintendent;
    }
    /**       
     *      *            @hibernate.property
     *             column="supeExamDate"
     *             length="19"
     *         
     */

    public java.util.Date getSupeExamDate() {
        return this.supeExamDate;
    }
    
    public void setSupeExamDate(java.util.Date supeExamDate) {
        this.supeExamDate = supeExamDate;
    }
    /**       
     *      *            @hibernate.property
     *             column="lawPartidea"
     *             length="400"
     *         
     */

    public String getLawPartidea() {
        return this.lawPartidea;
    }
    
    public void setLawPartidea(String lawPartidea) {
        this.lawPartidea = lawPartidea;
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
     *             column="lawPartOrg"
     *             length="50"
     *         
     */

    public String getLawPartOrg() {
        return this.lawPartOrg;
    }
    
    public void setLawPartOrg(String lawPartOrg) {
        this.lawPartOrg = lawPartOrg;
    }
    /**       
     *      *            @hibernate.property
     *             column="directorGeneralIdea"
     *             length="200"
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
     *             column="direGenBureaux"
     *             length="50"
     *         
     */

    public String getDireGenBureaux() {
        return this.direGenBureaux;
    }
    
    public void setDireGenBureaux(String direGenBureaux) {
        this.direGenBureaux = direGenBureaux;
    }
    /**       
     *      *            @hibernate.property
     *             column="direGenExamDate"
     *             length="19"
     *         
     */

    public java.util.Date getDireGenExamDate() {
        return this.direGenExamDate;
    }
    
    public void setDireGenExamDate(java.util.Date direGenExamDate) {
        this.direGenExamDate = direGenExamDate;
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
      buffer.append("caseKind").append("='").append(getCaseKind()).append("' ");			
      buffer.append("regCaseDate").append("='").append(getRegCaseDate()).append("' ");			
      buffer.append("punishContent").append("='").append(getPunishContent()).append("' ");			
      buffer.append("signatureDate").append("='").append(getSignatureDate()).append("' ");			
      buffer.append("undertakeOrgIdea").append("='").append(getUndertakeOrgIdea()).append("' ");			
      buffer.append("superintendent").append("='").append(getSuperintendent()).append("' ");			
      buffer.append("supeExamDate").append("='").append(getSupeExamDate()).append("' ");			
      buffer.append("lawPartidea").append("='").append(getLawPartidea()).append("' ");			
      buffer.append("lawPartMan").append("='").append(getLawPartMan()).append("' ");			
      buffer.append("lawPartCheckDate").append("='").append(getLawPartCheckDate()).append("' ");			
      buffer.append("lawPartOrg").append("='").append(getLawPartOrg()).append("' ");			
      buffer.append("directorGeneralIdea").append("='").append(getDirectorGeneralIdea()).append("' ");			
      buffer.append("directorGeneral").append("='").append(getDirectorGeneral()).append("' ");			
      buffer.append("direGenBureaux").append("='").append(getDireGenBureaux()).append("' ");			
      buffer.append("direGenExamDate").append("='").append(getDireGenExamDate()).append("' ");			
      buffer.append("remark").append("='").append(getRemark()).append("' ");			
      buffer.append("rflag").append("='").append(getRflag()).append("' ");			
      buffer.append("createDate").append("='").append(getCreateDate()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PunishExamine) ) return false;
		 PunishExamine castOther = ( PunishExamine ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getCaseKind()==castOther.getCaseKind()) || ( this.getCaseKind()!=null && castOther.getCaseKind()!=null && this.getCaseKind().equals(castOther.getCaseKind()) ) )
 && ( (this.getRegCaseDate()==castOther.getRegCaseDate()) || ( this.getRegCaseDate()!=null && castOther.getRegCaseDate()!=null && this.getRegCaseDate().equals(castOther.getRegCaseDate()) ) )
 && ( (this.getPunishContent()==castOther.getPunishContent()) || ( this.getPunishContent()!=null && castOther.getPunishContent()!=null && this.getPunishContent().equals(castOther.getPunishContent()) ) )
 && ( (this.getSignatureDate()==castOther.getSignatureDate()) || ( this.getSignatureDate()!=null && castOther.getSignatureDate()!=null && this.getSignatureDate().equals(castOther.getSignatureDate()) ) )
 && ( (this.getUndertakeOrgIdea()==castOther.getUndertakeOrgIdea()) || ( this.getUndertakeOrgIdea()!=null && castOther.getUndertakeOrgIdea()!=null && this.getUndertakeOrgIdea().equals(castOther.getUndertakeOrgIdea()) ) )
 && ( (this.getSuperintendent()==castOther.getSuperintendent()) || ( this.getSuperintendent()!=null && castOther.getSuperintendent()!=null && this.getSuperintendent().equals(castOther.getSuperintendent()) ) )
 && ( (this.getSupeExamDate()==castOther.getSupeExamDate()) || ( this.getSupeExamDate()!=null && castOther.getSupeExamDate()!=null && this.getSupeExamDate().equals(castOther.getSupeExamDate()) ) )
 && ( (this.getLawPartidea()==castOther.getLawPartidea()) || ( this.getLawPartidea()!=null && castOther.getLawPartidea()!=null && this.getLawPartidea().equals(castOther.getLawPartidea()) ) )
 && ( (this.getLawPartMan()==castOther.getLawPartMan()) || ( this.getLawPartMan()!=null && castOther.getLawPartMan()!=null && this.getLawPartMan().equals(castOther.getLawPartMan()) ) )
 && ( (this.getLawPartCheckDate()==castOther.getLawPartCheckDate()) || ( this.getLawPartCheckDate()!=null && castOther.getLawPartCheckDate()!=null && this.getLawPartCheckDate().equals(castOther.getLawPartCheckDate()) ) )
 && ( (this.getLawPartOrg()==castOther.getLawPartOrg()) || ( this.getLawPartOrg()!=null && castOther.getLawPartOrg()!=null && this.getLawPartOrg().equals(castOther.getLawPartOrg()) ) )
 && ( (this.getDirectorGeneralIdea()==castOther.getDirectorGeneralIdea()) || ( this.getDirectorGeneralIdea()!=null && castOther.getDirectorGeneralIdea()!=null && this.getDirectorGeneralIdea().equals(castOther.getDirectorGeneralIdea()) ) )
 && ( (this.getDirectorGeneral()==castOther.getDirectorGeneral()) || ( this.getDirectorGeneral()!=null && castOther.getDirectorGeneral()!=null && this.getDirectorGeneral().equals(castOther.getDirectorGeneral()) ) )
 && ( (this.getDireGenBureaux()==castOther.getDireGenBureaux()) || ( this.getDireGenBureaux()!=null && castOther.getDireGenBureaux()!=null && this.getDireGenBureaux().equals(castOther.getDireGenBureaux()) ) )
 && ( (this.getDireGenExamDate()==castOther.getDireGenExamDate()) || ( this.getDireGenExamDate()!=null && castOther.getDireGenExamDate()!=null && this.getDireGenExamDate().equals(castOther.getDireGenExamDate()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRflag()==castOther.getRflag()) || ( this.getRflag()!=null && castOther.getRflag()!=null && this.getRflag().equals(castOther.getRflag()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getCaseKind() == null ? 0 : this.getCaseKind().hashCode() );
         result = 37 * result + ( getRegCaseDate() == null ? 0 : this.getRegCaseDate().hashCode() );
         result = 37 * result + ( getPunishContent() == null ? 0 : this.getPunishContent().hashCode() );
         result = 37 * result + ( getSignatureDate() == null ? 0 : this.getSignatureDate().hashCode() );
         result = 37 * result + ( getUndertakeOrgIdea() == null ? 0 : this.getUndertakeOrgIdea().hashCode() );
         result = 37 * result + ( getSuperintendent() == null ? 0 : this.getSuperintendent().hashCode() );
         result = 37 * result + ( getSupeExamDate() == null ? 0 : this.getSupeExamDate().hashCode() );
         result = 37 * result + ( getLawPartidea() == null ? 0 : this.getLawPartidea().hashCode() );
         result = 37 * result + ( getLawPartMan() == null ? 0 : this.getLawPartMan().hashCode() );
         result = 37 * result + ( getLawPartCheckDate() == null ? 0 : this.getLawPartCheckDate().hashCode() );
         result = 37 * result + ( getLawPartOrg() == null ? 0 : this.getLawPartOrg().hashCode() );
         result = 37 * result + ( getDirectorGeneralIdea() == null ? 0 : this.getDirectorGeneralIdea().hashCode() );
         result = 37 * result + ( getDirectorGeneral() == null ? 0 : this.getDirectorGeneral().hashCode() );
         result = 37 * result + ( getDireGenBureaux() == null ? 0 : this.getDireGenBureaux().hashCode() );
         result = 37 * result + ( getDireGenExamDate() == null ? 0 : this.getDireGenExamDate().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRflag() == null ? 0 : this.getRflag().hashCode() );
         result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
         return result;
   }   





}
