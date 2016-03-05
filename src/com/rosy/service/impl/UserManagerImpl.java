package com.rosy.service.impl;

import java.util.List;

import org.acegisecurity.Authentication;
import org.acegisecurity.context.SecurityContext;
import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.userdetails.UserDetails;
import org.acegisecurity.userdetails.UsernameNotFoundException;
import org.apache.commons.lang.StringUtils;

import com.rosy.dao.UserDao;
import com.rosy.model.User;
import com.rosy.service.UserExistsException;
import com.rosy.service.UserManager;
import org.springframework.dao.DataIntegrityViolationException;


/**
 * Implementation of UserManager interface.</p>
 * 
 * <p>
 * <a href="UserManagerImpl.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public class UserManagerImpl extends BaseManager implements UserManager {
    private UserDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setUserDao(UserDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.service.UserManager#getUser(java.lang.String)
     */
    public User getUser(String userId) {
        return dao.getUser(new String(userId));
    }

    /**
     * @see com.rosy.service.UserManager#getUsers(com.rosy.model.User)
     */
    public List getUsers(User user) {
        return dao.getUsers(user);
    }

    /**
     * @see com.rosy.service.UserManager#saveUser(com.rosy.model.User)
     */
    public void saveUser(User user) throws UserExistsException {
    	// if new user, lowercase userId
    	if (user.getVersion() == null) {
            user.setUsername(user.getUsername().toLowerCase());
    	}
        try {
            dao.saveUser(user);
        } catch (DataIntegrityViolationException e) {
            throw new UserExistsException("User '" + user.getUsername() + "' already exists!");
        }
    }

    /**
     * @see com.rosy.service.UserManager#removeUser(java.lang.String)
     */
    public void removeUser(String userId) {
        if (log.isDebugEnabled()) {
            log.debug("removing user: " + userId);
        }

        dao.removeUser(new String(userId));
    }

    public User getUserByUsername(String username) throws UsernameNotFoundException {
        return (User) dao.loadUserByUsername(username);
    }
    
    /**
     * 获得当前用户的信息
     * @return
     * @throws UsernameNotFoundException
     */
    public  User getCurrentUser()  throws UserExistsException{
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
	            user=getUserByUsername(currentUser);
		   }
		   if(user==null){
			   throw new UserExistsException("CurrentUser not found...");
		   }else{
			   return user;
		   }
		   
	   }
    /**
     * 获得当前用户的用户名
     * @return
     * @throws UsernameNotFoundException
     */
	   public  String getCurrentUserName() throws UserExistsException{
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
			   throw new UserExistsException("CurrentUser not found...");
		   }else{
			   return currentUser;
		   }
		   
	   }
}
