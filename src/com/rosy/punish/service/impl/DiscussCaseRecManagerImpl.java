
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.DiscussCaseRec;
import com.rosy.punish.dao.DiscussCaseRecDao;
import com.rosy.punish.service.DiscussCaseRecManager;

public class DiscussCaseRecManagerImpl extends BaseManager implements DiscussCaseRecManager {
    private DiscussCaseRecDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setDiscussCaseRecDao(DiscussCaseRecDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.DiscussCaseRecManager#getDiscussCaseRecs(com.rosy.punish.model.DiscussCaseRec)
     */
    public List getDiscussCaseRecs(final DiscussCaseRec discussCaseRec) {
        return dao.getDiscussCaseRecs(discussCaseRec);
    }

    /**
     * @see com.rosy.punish.service.DiscussCaseRecManager#getDiscussCaseRec(String id)
     */
    public DiscussCaseRec getDiscussCaseRec(final String id) {
        return dao.getDiscussCaseRec(new String(id));
    }

    /**
     * @see com.rosy.punish.service.DiscussCaseRecManager#saveDiscussCaseRec(DiscussCaseRec discussCaseRec)
     */
    public void saveDiscussCaseRec(DiscussCaseRec discussCaseRec) {
    	if(StringUtils.isEmpty(discussCaseRec.getId())){
    		discussCaseRec.setId(null);
    		discussCaseRec.setCreateDate(new Date(System.currentTimeMillis()));
    		discussCaseRec.setRflag(Constants.ACTION);
      	 }
        dao.saveDiscussCaseRec(discussCaseRec);
    }

    /**
     * @see com.rosy.punish.service.DiscussCaseRecManager#removeDiscussCaseRec(String id)
     */
    public void removeDiscussCaseRec(final String id) {
        dao.removeDiscussCaseRec(new String(id));
    }
}
