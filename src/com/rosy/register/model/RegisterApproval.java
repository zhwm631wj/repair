package com.rosy.register.model;

// Generated 2008-11-2 19:50:26 by Hibernate Tools 3.1.0.beta4

import java.util.Date;

/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class table="registerapproval"
 * 
 */

public class RegisterApproval extends com.rosy.model.BaseObject implements
		java.io.Serializable {

	// Fields

	private String id;
	private String caseName;
	private String caseWhere;
	private String caseFrom;
	private String caseAndGist;
	private String undertakePerson;
	private java.util.Date undertakeDate;
	private String undertakeIdea;
	private String undertakeOrg;
	private String superintendent;
	private java.util.Date ssignDate;
	private String regOrgIdea;
	private String regOrg;
	private String regOrgMan;
	private java.util.Date regDate;
	private String ministerIdea;
	private String minister;
	private String miniOrg;
	private java.util.Date checkDate;
	private String remark;
	private String rflag;
	private java.util.Date createDate;

	// Constructors

	/** default constructor */
	public RegisterApproval() {
	}

	/** full constructor */
	public RegisterApproval(String caseName, String caseWhere, String caseFrom,
			String caseAndGist, String undertakePerson,
			java.util.Date undertakeDate, String undertakeIdea,
			String undertakeOrg, String superintendent,
			java.util.Date ssignDate, String regOrgIdea, String regOrg,
			String regOrgMan, java.util.Date regDate, String ministerIdea,
			String minister, String miniOrg, java.util.Date checkDate,
			String remark, String rflag, java.util.Date createDate) {
		this.caseName = caseName;
		this.caseWhere = caseWhere;
		this.caseFrom = caseFrom;
		this.caseAndGist = caseAndGist;
		this.undertakePerson = undertakePerson;
		this.undertakeDate = undertakeDate;
		this.undertakeIdea = undertakeIdea;
		this.undertakeOrg = undertakeOrg;
		this.superintendent = superintendent;
		this.ssignDate = ssignDate;
		this.regOrgIdea = regOrgIdea;
		this.regOrg = regOrg;
		this.regOrgMan = regOrgMan;
		this.regDate = regDate;
		this.ministerIdea = ministerIdea;
		this.minister = minister;
		this.miniOrg = miniOrg;
		this.checkDate = checkDate;
		this.remark = remark;
		this.rflag = rflag;
		this.createDate = createDate;
	}

	// Property accessors
	/**
	 * *
	 * 
	 * @hibernate.id generator-class="native" type="java.lang.String"
	 *               column="ID"
	 * 
	 */

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="caseWhere" length="100"
	 * 
	 */

	public String getCaseWhere() {
		return this.caseWhere;
	}

	public void setCaseWhere(String caseWhere) {
		this.caseWhere = caseWhere;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="caseFrom" length="20"
	 * 
	 */

	public String getCaseFrom() {
		return this.caseFrom;
	}

	public void setCaseFrom(String caseFrom) {
		this.caseFrom = caseFrom;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="caseAndGist" length="2000"
	 * 
	 */

	public String getCaseAndGist() {
		return this.caseAndGist;
	}

	public void setCaseAndGist(String caseAndGist) {
		this.caseAndGist = caseAndGist;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="undertakePerson" length="50"
	 * 
	 */

	public String getUndertakePerson() {
		return this.undertakePerson;
	}

	public void setUndertakePerson(String undertakePerson) {
		this.undertakePerson = undertakePerson;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="undertakeDate" length="19"
	 * 
	 */

	public java.util.Date getUndertakeDate() {
		return this.undertakeDate;
	}

	public void setUndertakeDate(java.util.Date undertakeDate) {
		this.undertakeDate = undertakeDate;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="undertakeIdea" length="100"
	 * 
	 */

	public String getUndertakeIdea() {
		return this.undertakeIdea;
	}

	public void setUndertakeIdea(String undertakeIdea) {
		this.undertakeIdea = undertakeIdea;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="UndertakeOrg" length="50"
	 * 
	 */

	public String getUndertakeOrg() {
		return this.undertakeOrg;
	}

	public void setUndertakeOrg(String undertakeOrg) {
		this.undertakeOrg = undertakeOrg;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="superintendent" length="30"
	 * 
	 */

	public String getSuperintendent() {
		return this.superintendent;
	}

	public void setSuperintendent(String superintendent) {
		this.superintendent = superintendent;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="sSignDate" length="19"
	 * 
	 */

	public java.util.Date getSsignDate() {
		return this.ssignDate;
	}

	public void setSsignDate(java.util.Date ssignDate) {
		this.ssignDate = ssignDate;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="regOrgIdea" length="100"
	 * 
	 */

	public String getRegOrgIdea() {
		return this.regOrgIdea;
	}

	public void setRegOrgIdea(String regOrgIdea) {
		this.regOrgIdea = regOrgIdea;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="regOrg" length="50"
	 * 
	 */

	public String getRegOrg() {
		return this.regOrg;
	}

	public void setRegOrg(String regOrg) {
		this.regOrg = regOrg;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="regOrgMan" length="30"
	 * 
	 */

	public String getRegOrgMan() {
		return this.regOrgMan;
	}

	public void setRegOrgMan(String regOrgMan) {
		this.regOrgMan = regOrgMan;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="regDate" length="19"
	 * 
	 */

	public java.util.Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(java.util.Date regDate) {
		this.regDate = regDate;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="ministerIdea" length="100"
	 * 
	 */

	public String getMinisterIdea() {
		return this.ministerIdea;
	}

	public void setMinisterIdea(String ministerIdea) {
		this.ministerIdea = ministerIdea;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="minister" length="30"
	 * 
	 */

	public String getMinister() {
		return this.minister;
	}

	public void setMinister(String minister) {
		this.minister = minister;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="miniOrg" length="50"
	 * 
	 */

	public String getMiniOrg() {
		return this.miniOrg;
	}

	public void setMiniOrg(String miniOrg) {
		this.miniOrg = miniOrg;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="checkDate" length="19"
	 * 
	 */

	public java.util.Date getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(java.util.Date checkDate) {
		this.checkDate = checkDate;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="remark" length="200"
	 * 
	 */

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="rFlag" length="1"
	 * 
	 */

	public String getRflag() {
		return this.rflag;
	}

	public void setRflag(String rflag) {
		this.rflag = rflag;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="createDate" length="19"
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
	 * 
	 * @return String
	 */
	public String toString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(getClass().getName()).append("@").append(
				Integer.toHexString(hashCode())).append(" [");
		buffer.append("caseWhere").append("='").append(getCaseWhere()).append(
				"' ");
		buffer.append("caseFrom").append("='").append(getCaseFrom()).append(
				"' ");
		buffer.append("caseAndGist").append("='").append(getCaseAndGist())
				.append("' ");
		buffer.append("undertakePerson").append("='").append(
				getUndertakePerson()).append("' ");
		buffer.append("undertakeDate").append("='").append(getUndertakeDate())
				.append("' ");
		buffer.append("undertakeIdea").append("='").append(getUndertakeIdea())
				.append("' ");
		buffer.append("undertakeOrg").append("='").append(getUndertakeOrg())
				.append("' ");
		buffer.append("superintendent").append("='")
				.append(getSuperintendent()).append("' ");
		buffer.append("ssignDate").append("='").append(getSsignDate()).append(
				"' ");
		buffer.append("regOrgIdea").append("='").append(getRegOrgIdea())
				.append("' ");
		buffer.append("regOrg").append("='").append(getRegOrg()).append("' ");
		buffer.append("regOrgMan").append("='").append(getRegOrgMan()).append(
				"' ");
		buffer.append("regDate").append("='").append(getRegDate()).append("' ");
		buffer.append("ministerIdea").append("='").append(getMinisterIdea())
				.append("' ");
		buffer.append("minister").append("='").append(getMinister()).append(
				"' ");
		buffer.append("miniOrg").append("='").append(getMiniOrg()).append("' ");
		buffer.append("checkDate").append("='").append(getCheckDate()).append(
				"' ");
		buffer.append("remark").append("='").append(getRemark()).append("' ");
		buffer.append("rflag").append("='").append(getRflag()).append("' ");
		buffer.append("createDate").append("='").append(getCreateDate())
				.append("' ");
		buffer.append("]");

		return buffer.toString();
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RegisterApproval))
			return false;
		RegisterApproval castOther = (RegisterApproval) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getCaseWhere() == castOther.getCaseWhere()) || (this
						.getCaseWhere() != null
						&& castOther.getCaseWhere() != null && this
						.getCaseWhere().equals(castOther.getCaseWhere())))
				&& ((this.getCaseFrom() == castOther.getCaseFrom()) || (this
						.getCaseFrom() != null
						&& castOther.getCaseFrom() != null && this
						.getCaseFrom().equals(castOther.getCaseFrom())))
				&& ((this.getCaseAndGist() == castOther.getCaseAndGist()) || (this
						.getCaseAndGist() != null
						&& castOther.getCaseAndGist() != null && this
						.getCaseAndGist().equals(castOther.getCaseAndGist())))
				&& ((this.getUndertakePerson() == castOther
						.getUndertakePerson()) || (this.getUndertakePerson() != null
						&& castOther.getUndertakePerson() != null && this
						.getUndertakePerson().equals(
								castOther.getUndertakePerson())))
				&& ((this.getUndertakeDate() == castOther.getUndertakeDate()) || (this
						.getUndertakeDate() != null
						&& castOther.getUndertakeDate() != null && this
						.getUndertakeDate()
						.equals(castOther.getUndertakeDate())))
				&& ((this.getUndertakeIdea() == castOther.getUndertakeIdea()) || (this
						.getUndertakeIdea() != null
						&& castOther.getUndertakeIdea() != null && this
						.getUndertakeIdea()
						.equals(castOther.getUndertakeIdea())))
				&& ((this.getUndertakeOrg() == castOther.getUndertakeOrg()) || (this
						.getUndertakeOrg() != null
						&& castOther.getUndertakeOrg() != null && this
						.getUndertakeOrg().equals(castOther.getUndertakeOrg())))
				&& ((this.getSuperintendent() == castOther.getSuperintendent()) || (this
						.getSuperintendent() != null
						&& castOther.getSuperintendent() != null && this
						.getSuperintendent().equals(
								castOther.getSuperintendent())))
				&& ((this.getSsignDate() == castOther.getSsignDate()) || (this
						.getSsignDate() != null
						&& castOther.getSsignDate() != null && this
						.getSsignDate().equals(castOther.getSsignDate())))
				&& ((this.getRegOrgIdea() == castOther.getRegOrgIdea()) || (this
						.getRegOrgIdea() != null
						&& castOther.getRegOrgIdea() != null && this
						.getRegOrgIdea().equals(castOther.getRegOrgIdea())))
				&& ((this.getRegOrg() == castOther.getRegOrg()) || (this
						.getRegOrg() != null
						&& castOther.getRegOrg() != null && this.getRegOrg()
						.equals(castOther.getRegOrg())))
				&& ((this.getRegOrgMan() == castOther.getRegOrgMan()) || (this
						.getRegOrgMan() != null
						&& castOther.getRegOrgMan() != null && this
						.getRegOrgMan().equals(castOther.getRegOrgMan())))
				&& ((this.getRegDate() == castOther.getRegDate()) || (this
						.getRegDate() != null
						&& castOther.getRegDate() != null && this.getRegDate()
						.equals(castOther.getRegDate())))
				&& ((this.getMinisterIdea() == castOther.getMinisterIdea()) || (this
						.getMinisterIdea() != null
						&& castOther.getMinisterIdea() != null && this
						.getMinisterIdea().equals(castOther.getMinisterIdea())))
				&& ((this.getMinister() == castOther.getMinister()) || (this
						.getMinister() != null
						&& castOther.getMinister() != null && this
						.getMinister().equals(castOther.getMinister())))
				&& ((this.getMiniOrg() == castOther.getMiniOrg()) || (this
						.getMiniOrg() != null
						&& castOther.getMiniOrg() != null && this.getMiniOrg()
						.equals(castOther.getMiniOrg())))
				&& ((this.getCheckDate() == castOther.getCheckDate()) || (this
						.getCheckDate() != null
						&& castOther.getCheckDate() != null && this
						.getCheckDate().equals(castOther.getCheckDate())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark()
						.equals(castOther.getRemark())))
				&& ((this.getRflag() == castOther.getRflag()) || (this
						.getRflag() != null
						&& castOther.getRflag() != null && this.getRflag()
						.equals(castOther.getRflag())))
				&& ((this.getCreateDate() == castOther.getCreateDate()) || (this
						.getCreateDate() != null
						&& castOther.getCreateDate() != null && this
						.getCreateDate().equals(castOther.getCreateDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getCaseWhere() == null ? 0 : this.getCaseWhere().hashCode());
		result = 37 * result
				+ (getCaseFrom() == null ? 0 : this.getCaseFrom().hashCode());
		result = 37
				* result
				+ (getCaseAndGist() == null ? 0 : this.getCaseAndGist()
						.hashCode());
		result = 37
				* result
				+ (getUndertakePerson() == null ? 0 : this.getUndertakePerson()
						.hashCode());
		result = 37
				* result
				+ (getUndertakeDate() == null ? 0 : this.getUndertakeDate()
						.hashCode());
		result = 37
				* result
				+ (getUndertakeIdea() == null ? 0 : this.getUndertakeIdea()
						.hashCode());
		result = 37
				* result
				+ (getUndertakeOrg() == null ? 0 : this.getUndertakeOrg()
						.hashCode());
		result = 37
				* result
				+ (getSuperintendent() == null ? 0 : this.getSuperintendent()
						.hashCode());
		result = 37 * result
				+ (getSsignDate() == null ? 0 : this.getSsignDate().hashCode());
		result = 37
				* result
				+ (getRegOrgIdea() == null ? 0 : this.getRegOrgIdea()
						.hashCode());
		result = 37 * result
				+ (getRegOrg() == null ? 0 : this.getRegOrg().hashCode());
		result = 37 * result
				+ (getRegOrgMan() == null ? 0 : this.getRegOrgMan().hashCode());
		result = 37 * result
				+ (getRegDate() == null ? 0 : this.getRegDate().hashCode());
		result = 37
				* result
				+ (getMinisterIdea() == null ? 0 : this.getMinisterIdea()
						.hashCode());
		result = 37 * result
				+ (getMinister() == null ? 0 : this.getMinister().hashCode());
		result = 37 * result
				+ (getMiniOrg() == null ? 0 : this.getMiniOrg().hashCode());
		result = 37 * result
				+ (getCheckDate() == null ? 0 : this.getCheckDate().hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37 * result
				+ (getRflag() == null ? 0 : this.getRflag().hashCode());
		result = 37
				* result
				+ (getCreateDate() == null ? 0 : this.getCreateDate()
						.hashCode());
		return result;
	}

	public String getCaseName() {
		return caseName;
	}

	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

}
