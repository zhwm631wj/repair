package com.rosy.model;

// Generated 2008-10-21 16:35:41 by Hibernate Tools 3.1.0.beta4

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @struts.form include-all="true" extends="BaseForm"
 * @hibernate.class table="attachment"
 * 
 */

public class Attachment extends com.rosy.model.BaseObject implements
		java.io.Serializable {

	// Fields

	/**
	 * id
	 */
	private String id;
	private String fileName;
	//文件的完整路径
	private String fullPath;
	//文件的文件名
	private String path;
	//文件类型
	private String type;
	//上传的用户
	private String uploadUser;
	//对应表id
	private String tableId;
	private String tableName;
	private String tableField;
	private Date uploadTime;
    //状态
	private String status;
	//文件的详细说明
	private String remark;

	// Constructors

	public Attachment(String id, String fileName, String fullPath, String path,
			String type, String uploadUser, String tableId, String tableName,
			String tableField, Date uploadTime, String status, String remark) {
		this.id = id;
		this.fileName = fileName;
		this.fullPath = fullPath;
		this.path = path;
		this.type = type;
		this.uploadUser = uploadUser;
		this.tableId = tableId;
		this.tableName = tableName;
		this.tableField = tableField;
		this.uploadTime = uploadTime;
		this.status = status;
		this.remark = remark;
	}

	/** default constructor */
	public Attachment() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFullPath() {
		return fullPath;
	}

	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableField() {
		return tableField;
	}

	public void setTableField(String tableField) {
		this.tableField = tableField;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 10;
		result = prime * result
				+ ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result
				+ ((fullPath == null) ? 0 : fullPath.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
	
		if (this == obj)
			return true;
		if (!(obj instanceof Attachment)) 
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Attachment other = (Attachment) obj;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (fullPath == null) {
			if (other.fullPath != null)
				return false;
		} else if (!fullPath.equals(other.fullPath))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
	     return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
         .append("fileName", this.fileName)
         .append("fullPath", this.fullPath)
         .append("uploadTime",this.uploadTime)
         .append("uploadUser", this.uploadUser).toString();
	}

	public String getUploadUser() {
		return uploadUser;
	}

	public void setUploadUser(String uploadUser) {
		this.uploadUser = uploadUser;
	}

	

	

	


}
