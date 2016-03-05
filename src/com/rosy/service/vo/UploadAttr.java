/**
 * 
 */
package com.rosy.service.vo;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;

/**
 * @author 631wj
 *
 */
public class UploadAttr {
	
	private String encoding = "UTF-8";

	/**
	 * 
	 * The maximum size permitted for the complete request, as opposed to
	 * 
	 * {@link #fileSizeMax}. A value of -1 indicates no maximum.
	 * 
	 */
	private long sizeMax = -1;

	private int sizeThreshold = DiskFileItemFactory.DEFAULT_SIZE_THRESHOLD;
	
	private String fileType ="common";
	
	private String rootPath =Constants.FILE_SEP;
	
	private String tempPath;

	public String getTempPath() {
		 if(StringUtils.isNotEmpty(rootPath)){
			 tempPath = rootPath +Constants.TEMP_PATH;
		 }
		return tempPath;
	}

	public void setTempPath(String tempPath) {
		this.tempPath = tempPath;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public long getSizeMax() {
		return sizeMax;
	}

	public void setSizeMax(long sizeMax) {
		this.sizeMax = sizeMax;
	}

	public int getSizeThreshold() {
		return sizeThreshold;
	}

	public void setSizeThreshold(int sizeThreshold) {
		this.sizeThreshold = sizeThreshold;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getRootPath() {
		return rootPath;
	}

	public void setRootPath(String rootPath) {
		this.rootPath = rootPath;
	}


}
