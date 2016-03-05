/**
 * 
 */
package com.rosy.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rosy.Constants;
import com.rosy.model.Attachment;
import com.rosy.service.vo.UploadAttr;

/**
 * @author 631wj
 * 
 */
public class UploadFile {

	private static Log log = LogFactory.getLog(UploadFile.class);

	/**
	 * 上传文件,提供上传文件需要的request
	 * 
	 * @author 631wj
	 * @param request
	 * @param fileType
	 * @return
	 * @throws FileCannotUploadException
	 */
	public static Attachment uploadFile(HttpServletRequest request,
			UploadAttr uploadAttr) throws FileCannotUploadException {
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if (!isMultipart) {
			log
					.error("Can not upload :please use post method and use multipart/form-data");
			throw new FileCannotUploadException(
					"please use post method and use multipart/form-data");
		}
		// 附件表
		Attachment attachment = new Attachment();
		// 保存普通form表单域
		Map<String, String> parameters = new HashMap<String, String>();
		// 保存上传的文件
		Map<String, FileItem> files = new HashMap<String, FileItem>();
		// Create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// Set factory constraints
		factory.setSizeThreshold(uploadAttr.getSizeThreshold());
		factory.setRepository(new File(uploadAttr.getTempPath()));
		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setSizeMax(uploadAttr.getSizeMax());
		upload.setHeaderEncoding(uploadAttr.getEncoding());
		// Parse the request
		try {
			List<FileItem> items = upload.parseRequest(request);
			// 这是文件的那个表单
			FileItem fileItem = null;
			for (FileItem item : items) {
				// 如果是普通的表单
				if (item.isFormField()) {
					// 表单名
					String fieldName = item.getFieldName();
					// 表单值
					String value = item.getString();
					// 将这些属性保存到附件表中;
					BeanUtils.copyProperty(attachment, fieldName, value);
				} else {
					// 得到文件表单
					fileItem = item;
				}
			}
			String type = attachment.getType();
			if (StringUtils.isEmpty(type)) {
				attachment.setType(uploadAttr.getFileType());
			}
			// 处理上传
			String filePath = processUploadedFile(fileItem,
					getAppRootPath(request), attachment.getType());
			attachment.setPath(getFileName(fileItem));
			attachment.setFullPath(filePath);
		} catch (FileUploadException e) {
			log.error("Can not upload :", e);
			// 抛出文件上传失败
			throw new FileCannotUploadException(e.toString());
		} catch (IllegalAccessException e) {
			log.error("Can not upload :", e);
			// 抛出文件上传失败
			throw new FileCannotUploadException(e.toString());
		} catch (InvocationTargetException e) {
			log.error("Can not upload :", e);
			// 抛出文件上传失败
			throw new FileCannotUploadException(e.toString());
		}
		return attachment;

	}
	
	
	/**
	 * 下载文件
	 * @param request
	 * @param response
	 * @param attachment
	 * @return
	 * @throws IOException 
	 */
	public static boolean downloadFile(HttpServletRequest request,
			HttpServletResponse response, Attachment attachment) throws IOException {
		InputStream fileInput = null;
		OutputStream filetoClient = null;
		try {
			// 设置下载的文件名
			StringBuffer downloadFileName = new StringBuffer();
			if (StringUtils.isEmpty(attachment.getFileName()))
				// 这是上传时刻的文件名
				downloadFileName.append(attachment.getPath());
			else {
				// 这是以用户填写的用户名作为下载
				downloadFileName.append(attachment.getFileName());
				downloadFileName.append(".").append(getFileExtension(attachment.getPath()));
			}
			
			response.reset();
			 //设置文件下载头
			response.setHeader("Content-Disposition", "attachment; filename=\""
					+ URLEncoder.encode(downloadFileName.toString(), "UTF-8")
					+ "\"");
			//流的形式
			response.setContentType("application/octet-stream");
			// 得到文件的存储实际全路径
			StringBuffer filePath = new StringBuffer();
			filePath.append(getAppRootPath(request)).append(
					attachment.getFullPath());
			//文件输入流
			fileInput = new BufferedInputStream(new FileInputStream(filePath
					.toString()));
			//输出流
			filetoClient = new BufferedOutputStream(response.getOutputStream());
			byte[] buffer = new byte[1024];
			int len=0;
			// 写入输出流
			while((len=fileInput.read(buffer, 0, buffer.length))!=-1 ){
				filetoClient.write(buffer, 0, len);	
			}
		} catch (IOException e) {
			log.error("can not download", e);
			response.sendError(405, "File cannot found!");
			return false;
		} finally {
			try {
				if (fileInput != null) {
					fileInput.close();
				}
				fileInput = null;
				
				if (filetoClient != null) {
					filetoClient.close();
				}
				filetoClient =null;
			} catch (IOException e) {
				log.error("can not download", e);
				response.sendError(405, "download error!");
				return false;
			}
		}

		return true;

	}
	/**
	 * 下载文件
	 * @param request
	 * @param response
	 * @param attachment
	 * @return
	 * @throws IOException 
	 */
	public static boolean downloadFileByWriter(HttpServletRequest request,
			HttpServletResponse response, Attachment attachment) throws IOException {
		Reader fileReader = null;
		Writer filetoClient = null;
		try {
			StringBuffer downloadFileName = new StringBuffer();
			if (StringUtils.isEmpty(attachment.getFileName()))
				downloadFileName.append(attachment.getPath());
			else {
				downloadFileName.append(attachment.getFileName());
				downloadFileName.append(".").append(getFileExtension(attachment.getPath()));
			}
			
			response.reset();
			response.setHeader("Content-Disposition", "attachment; filename=\""
					+ URLEncoder.encode(downloadFileName.toString(), "UTF-8")
					+ "\"");
			response.setContentType("application/octet-stream");
			StringBuffer filePath = new StringBuffer();
			filePath.append(getAppRootPath(request)).append(
					attachment.getFullPath());
			fileReader = new BufferedReader(new FileReader(filePath
					.toString()));
			filetoClient = new BufferedWriter(response.getWriter());
			char[] buffer = new char[1024];
			int len=0;
			while((len=fileReader.read(buffer, 0, buffer.length))!=-1 ){
				filetoClient.write(buffer, 0, len);	
			}
		} catch (IOException e) {
			log.error("can not download", e);
			e.printStackTrace();
			response.sendError(405, "File cannot found!");
			return false;
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
				fileReader = null;
				
				if (filetoClient != null) {
					filetoClient.flush();
					filetoClient.close();
				}
				filetoClient =null;
			} catch (IOException e) {
				log.error("can not download", e);
				e.printStackTrace();
				response.sendError(405, "download error!");
				return false;
			}
		}

		return true;

	}

	/**
	 * 将文件存入服务器指定文件夹
	 * 
	 * @param item
	 *            file信息
	 * @param rootPath
	 *            根目录
	 * @return filePath 文件的路径/除根目录
	 * @throws FileCannotUploadException
	 */
	private static String processUploadedFile(FileItem item, String rootPath,
			String type) throws FileCannotUploadException {
		// 得到文件后缀名
		String fileExtension = getFileExtension(item);
		// 产生随机数
		Random random = new Random();
		// 设置文件全路径
		StringBuffer fileNameBuffer = new StringBuffer();
		fileNameBuffer.append(Constants.UPLOAD_PATH).append(type).append(
				Constants.FILE_SEP);
		// 重新设置文件名
		fileNameBuffer.append(System.currentTimeMillis()).append(
				random.nextLong()).append(".").append(fileExtension);
		String filePath = fileNameBuffer.toString();
		File uploadedFile = new File(rootPath, filePath);
		FileUtil.makeDirectory(uploadedFile);
		try {
			item.write(uploadedFile);
		} catch (Exception e) {
			log.error("canno copy file in :" + item.getFieldName());
			throw new FileCannotUploadException(e.toString());
		}
		return filePath;
	}

	/**
	 * 得到根目录
	 * 
	 * @param request
	 * @return
	 */
	public static String getAppRootPath(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		StringBuffer rootPath = new StringBuffer();
		rootPath.append(session.getServletContext().getRealPath("/"));
		return rootPath.toString();
	}

	/**
	 * 得到上传文件的文件名
	 * 
	 * @param item
	 * @return
	 */
	private static String getFileName(FileItem item) {

		String fileName = item.getName();
		if (fileName != null) {
			fileName = FilenameUtils.getName(fileName);
		}

		return fileName;

	}

	/**
	 * 得到上传文件的后缀名
	 * 
	 * @param item
	 * @return
	 */
	private static String getFileExtension(FileItem item) {
		String fileName = item.getName();
		String extension = "";
		if (fileName != null) {
			extension = FilenameUtils.getExtension(fileName);
		}
		return extension;

	}

	/**
	 * 得到上传文件的后缀名
	 * 
	 * @param item
	 * @return
	 */
	private static String getFileExtension(String fileName) {
		String extension = "";
		if (fileName != null) {
			extension = FilenameUtils.getExtension(fileName);
		}
		return extension;

	}

	public String deleteFile() {
		// TODO Auto-generated method stub
		return null;
	}

}