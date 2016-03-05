package com.rosy.model;

// Generated 2008-10-29 12:26:27 by Hibernate Tools 3.1.0.beta4

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class table="apca_organization"
 * 
 */

public class ApcaOrganization extends com.rosy.model.BaseObject implements
		java.io.Serializable {

	// Fields

	private String id;
	private String orgCode;
	private String orgName;
	private String orgSatrap;
	private String orgProperty;
	private String higherOrg;
	private String orgRank;
	private String remark;
	private String rflag;
	private Date createDate;
	private ApcaOrganization organization;
	protected Set organizations = new HashSet();

	// Constructors

	/** default constructor */
	public ApcaOrganization() {
	}

	/** full constructor */
	public ApcaOrganization(String id, String orgCode, String orgName,
			ApcaOrganization organization, Set organizations, String orgSatrap,
			String orgProperty, String higherOrg, String orgRank,
			String remark, String rflag, Date createDate) {
		this.id = id;
		this.orgCode = orgCode;
		this.orgName = orgName;
		this.orgSatrap = orgSatrap;
		this.orgProperty = orgProperty;
		this.higherOrg = higherOrg;
		this.orgRank = orgRank;
		this.remark = remark;
		this.rflag = rflag;
		this.createDate = createDate;
		this.organization = organization;
		this.organizations = organizations;
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
	 * @hibernate.property column="org_Code" length="50"
	 * 
	 */

	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="org_Name" length="45"
	 * 
	 */

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="org_Satrap" length="10"
	 * 
	 */

	public String getOrgSatrap() {
		return this.orgSatrap;
	}

	public void setOrgSatrap(String orgSatrap) {
		this.orgSatrap = orgSatrap;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="org_Property" length="30"
	 * 
	 */

	public String getOrgProperty() {
		return this.orgProperty;
	}

	public void setOrgProperty(String orgProperty) {
		this.orgProperty = orgProperty;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="higher_org" length="48"
	 * 
	 */

	public String getHigherOrg() {
		return this.higherOrg;
	}

	public void setHigherOrg(String higherOrg) {
		this.higherOrg = higherOrg;
	}

	/**
	 * *
	 * 
	 * @hibernate.property column="org_rank" length="2"
	 * 
	 */

	public String getOrgRank() {
		return this.orgRank;
	}

	public void setOrgRank(String orgRank) {
		this.orgRank = orgRank;
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

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
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
		buffer.append("orgCode").append("='").append(getOrgCode()).append("' ");
		buffer.append("orgName").append("='").append(getOrgName()).append("' ");
		buffer.append("orgSatrap").append("='").append(getOrgSatrap()).append(
				"' ");
		buffer.append("orgProperty").append("='").append(getOrgProperty())
				.append("' ");
		buffer.append("higherOrg").append("='").append(getHigherOrg()).append(
				"' ");
		buffer.append("orgRank").append("='").append(getOrgRank()).append("' ");
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
		if (!(other instanceof ApcaOrganization))
			return false;
		ApcaOrganization castOther = (ApcaOrganization) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getOrgCode() == castOther.getOrgCode()) || (this
						.getOrgCode() != null
						&& castOther.getOrgCode() != null && this.getOrgCode()
						.equals(castOther.getOrgCode())))
				&& ((this.getOrgName() == castOther.getOrgName()) || (this
						.getOrgName() != null
						&& castOther.getOrgName() != null && this.getOrgName()
						.equals(castOther.getOrgName())))
				&& ((this.getOrgSatrap() == castOther.getOrgSatrap()) || (this
						.getOrgSatrap() != null
						&& castOther.getOrgSatrap() != null && this
						.getOrgSatrap().equals(castOther.getOrgSatrap())))
				&& ((this.getOrgProperty() == castOther.getOrgProperty()) || (this
						.getOrgProperty() != null
						&& castOther.getOrgProperty() != null && this
						.getOrgProperty().equals(castOther.getOrgProperty())))
				&& ((this.getHigherOrg() == castOther.getHigherOrg()) || (this
						.getHigherOrg() != null
						&& castOther.getHigherOrg() != null && this
						.getHigherOrg().equals(castOther.getHigherOrg())))
				&& ((this.getOrgRank() == castOther.getOrgRank()) || (this
						.getOrgRank() != null
						&& castOther.getOrgRank() != null && this.getOrgRank()
						.equals(castOther.getOrgRank())))
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
				+ (getOrgCode() == null ? 0 : this.getOrgCode().hashCode());
		result = 37 * result
				+ (getOrgName() == null ? 0 : this.getOrgName().hashCode());
		result = 37 * result
				+ (getOrgSatrap() == null ? 0 : this.getOrgSatrap().hashCode());
		result = 37
				* result
				+ (getOrgProperty() == null ? 0 : this.getOrgProperty()
						.hashCode());
		result = 37 * result
				+ (getHigherOrg() == null ? 0 : this.getHigherOrg().hashCode());
		result = 37 * result
				+ (getOrgRank() == null ? 0 : this.getOrgRank().hashCode());
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

	public ApcaOrganization getOrganization() {
		return organization;
	}

	public void setOrganization(ApcaOrganization organization) {
		if (organization != null)
			this.organization = organization;
	}

	public Set getOrganizations() {
		return organizations;
	}

	public void setOrganizations(Set organizations) {
		this.organizations = organizations;
	}

}
