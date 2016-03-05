/**
 * 
 */
package com.rosy.webapp.util;

import org.acegisecurity.Authentication;
import org.acegisecurity.context.SecurityContext;
import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.userdetails.UserDetails;
import org.acegisecurity.userdetails.UsernameNotFoundException;
import org.apache.commons.lang.StringUtils;

import com.rosy.model.User;
import com.rosy.service.UserManager;
import com.rosy.service.impl.UserManagerImpl;

/**
 * @author 631wj
 *
 */
public class UserUtil {
	
	
	   public static User getCurrentUser() throws UsernameNotFoundException{
		   UserManager mrgUser=  new UserManagerImpl();
		   User user =null;
		   SecurityContext ctx = SecurityContextHolder.getContext();
		   if (ctx.getAuthentication() != null) {
	            Authentication auth = ctx.getAuthentication();
	            String currentUser ="";
	            if (auth.getPrincipal() instanceof UserDetails) {
	                currentUser = ((UserDetails) auth.getPrincipal()).getUsername();
	            } else {
	                currentUser = String.valueOf(auth.getPrincipal());
	            }		
	            user=mrgUser.getUserByUsername(currentUser);
		   }
		   if(user==null){
			   throw new UsernameNotFoundException("user not found...");
		   }else{
			   return user;
		   }
		   
	   }
	   public static String getCurrentUserName() throws UsernameNotFoundException{
		   String currentUser ="";
		   SecurityContext ctx = SecurityContextHolder.getContext();
		   if (ctx.getAuthentication() != null) {
	            Authentication auth = ctx.getAuthentication();
	            if (auth.getPrincipal() instanceof UserDetails) {
	                currentUser = ((UserDetails) auth.getPrincipal()).getUsername();
	            } else {
	                currentUser = String.valueOf(auth.getPrincipal());
	            }		
	         
		   }
		   if(StringUtils.isEmpty(currentUser)){
			   throw new UsernameNotFoundException("user not found...");
		   }else{
			   return currentUser;
		   }
		   
	   }
   
}
