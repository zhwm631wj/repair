package com.rosy.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.rosy.model.Attachment;
import com.rosy.service.AttachmentManager;
import com.rosy.service.UserExistsException;
import com.rosy.service.UserManager;
import com.rosy.service.vo.UploadAttr;
import com.rosy.util.FileCannotUploadException;
import com.rosy.util.UploadFile;
import com.rosy.webapp.util.UserUtil;

public class FileUpload extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public FileUpload() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 * @author 631wj
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AttachmentManager mgr = (AttachmentManager) getBean("attachmentManager");
		UserManager mgrUserManager = (UserManager) getBean("userManager");
		UploadAttr uploadAttr =new UploadAttr();
		uploadAttr.setRootPath(UploadFile.getAppRootPath(request));
		Attachment attachment = new Attachment();
		try {
			attachment=UploadFile.uploadFile(request, uploadAttr);
			String currentUser=mgrUserManager.getCurrentUserName();
			attachment.setUploadUser(currentUser);
			mgr.saveAttachment(attachment);
			request.setAttribute("upattachment", attachment);
			request.getRequestDispatcher("../attachments.html?method=fileCache").forward(request, response); 
		} catch (FileCannotUploadException e) {
			e.printStackTrace();
		} catch (UserExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
    public Object getBean(String name) {
        ApplicationContext ctx = 
            WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
        return ctx.getBean(name);
    }

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
