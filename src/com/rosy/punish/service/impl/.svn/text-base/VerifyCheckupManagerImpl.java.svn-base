
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.VerifyCheckup;
import com.rosy.punish.dao.VerifyCheckupDao;
import com.rosy.punish.service.VerifyCheckupManager;

public class VerifyCheckupManagerImpl extends BaseManager implements VerifyCheckupManager {
    private VerifyCheckupDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setVerifyCheckupDao(VerifyCheckupDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.VerifyCheckupManager#getVerifyCheckups(com.rosy.punish.model.VerifyCheckup)
     */
    public List getVerifyCheckups(final VerifyCheckup verifyCheckup) {
        return dao.getVerifyCheckups(verifyCheckup);
    }

    /**
     * @see com.rosy.punish.service.VerifyCheckupManager#getVerifyCheckup(String id)
     */
    public VerifyCheckup getVerifyCheckup(final String id) {
        return dao.getVerifyCheckup(new String(id));
    }

    /**
     * @see com.rosy.punish.service.VerifyCheckupManager#saveVerifyCheckup(VerifyCheckup verifyCheckup)
     */
    public void saveVerifyCheckup(VerifyCheckup verifyCheckup) {
    	if(StringUtils.isEmpty(verifyCheckup.getId())){
    		verifyCheckup.setId(null);
    		verifyCheckup.setCreateDate(new Date(System.currentTimeMillis()));
    		verifyCheckup.setRflag(Constants.ACTION);
      	 }
        dao.saveVerifyCheckup(verifyCheckup);
    }

    /**
     * @see com.rosy.punish.service.VerifyCheckupManager#removeVerifyCheckup(String id)
     */
    public void removeVerifyCheckup(final String id) {
        dao.removeVerifyCheckup(new String(id));
    }
}
