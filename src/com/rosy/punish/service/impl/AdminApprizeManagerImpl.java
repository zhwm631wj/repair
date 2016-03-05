
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.AdminApprize;
import com.rosy.punish.dao.AdminApprizeDao;
import com.rosy.punish.service.AdminApprizeManager;

public class AdminApprizeManagerImpl extends BaseManager implements AdminApprizeManager {
    private AdminApprizeDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setAdminApprizeDao(AdminApprizeDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.AdminApprizeManager#getAdminApprizes(com.rosy.punish.model.AdminApprize)
     */
    public List getAdminApprizes(final AdminApprize adminApprize) {
        return dao.getAdminApprizes(adminApprize);
    }

    /**
     * @see com.rosy.punish.service.AdminApprizeManager#getAdminApprize(String id)
     */
    public AdminApprize getAdminApprize(final String id) {
        return dao.getAdminApprize(new String(id));
    }

    /**
     * @see com.rosy.punish.service.AdminApprizeManager#saveAdminApprize(AdminApprize adminApprize)
     */
    public void saveAdminApprize(AdminApprize adminApprize) {
    	if(StringUtils.isEmpty(adminApprize.getId())){
    		adminApprize.setId(null);
    		adminApprize.setCreateDate(new Date(System.currentTimeMillis()));
    		adminApprize.setRflag(Constants.ACTION);
   	 }
        dao.saveAdminApprize(adminApprize);
    }

    /**
     * @see com.rosy.punish.service.AdminApprizeManager#removeAdminApprize(String id)
     */
    public void removeAdminApprize(final String id) {
        dao.removeAdminApprize(new String(id));
    }
}
