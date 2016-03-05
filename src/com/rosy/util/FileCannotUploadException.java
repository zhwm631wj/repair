package com.rosy.util;

public class  FileCannotUploadException extends Exception {
	 /**
	  * 错误信息
	  */
	 private String msg;

	public FileCannotUploadException(String msg) {
		super();
		this.msg = msg;
	}

	public FileCannotUploadException(String msg, Throwable cause) {
		super(msg, cause);
		this.msg = msg;
	}

	/**
	 * 显示的错误信息
	 */
	public String toString() {
		
		return "FileCannotUpload! Error Info: " +msg;
	}
}
	