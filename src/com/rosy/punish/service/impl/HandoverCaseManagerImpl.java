
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.HandoverCase;
import com.rosy.punish.dao.HandoverCaseDao;
import com.rosy.punish.service.HandoverCaseManager;

public class HandoverCaseManagerImpl extends BaseManager implements HandoverCaseManager {
    private HandoverCaseDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setHandoverCaseDao(HandoverCaseDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.HandoverCaseManager#getHandoverCases(com.rosy.punish.model.HandoverCase)
     */
    public List getHandoverCases(final HandoverCase handoverCase) {
        return dao.getHandoverCases(handoverCase);
    }

    /**
     * @see com.rosy.punish.service.HandoverCaseManager#getHandoverCase(String id)
     */
    public HandoverCase getHandoverCase(final String id) {
        return dao.getHandoverCase(new String(id));
    }

    /**
     * @see com.rosy.punish.service.HandoverCaseManager#saveHandoverCase(HandoverCase handoverCase)
     */
    public void saveHandoverCase(HandoverCase handoverCase) {
    	if(StringUtils.isEmpty(handoverCase.getId())){
    		handoverCase.setId(null);
    		handoverCase.setCreateDate(new Date(System.currentTimeMillis()));
    		handoverCase.setRflag(Constants.ACTION);
      	 }
        dao.saveHandoverCase(handoverCase);
    }

    /**
     * @see com.rosy.punish.service.HandoverCaseManager#removeHandoverCase(String id)
     */
    public void removeHandoverCase(final String id) {
        dao.removeHandoverCase(new String(id));
    }
}
