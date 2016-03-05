
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.PerformCase;
import com.rosy.punish.dao.PerformCaseDao;
import com.rosy.punish.service.PerformCaseManager;

public class PerformCaseManagerImpl extends BaseManager implements PerformCaseManager {
    private PerformCaseDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setPerformCaseDao(PerformCaseDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.PerformCaseManager#getPerformCases(com.rosy.punish.model.PerformCase)
     */
    public List getPerformCases(final PerformCase performCase) {
        return dao.getPerformCases(performCase);
    }

    /**
     * @see com.rosy.punish.service.PerformCaseManager#getPerformCase(String id)
     */
    public PerformCase getPerformCase(final String id) {
        return dao.getPerformCase(new String(id));
    }

    /**
     * @see com.rosy.punish.service.PerformCaseManager#savePerformCase(PerformCase performCase)
     */
    public void savePerformCase(PerformCase performCase) {
    	if(StringUtils.isEmpty(performCase.getId())){
    		performCase.setId(null);
      		performCase.setCreateDate(new Date(System.currentTimeMillis()));
      		performCase.setRflag(Constants.ACTION);
      	 }
        dao.savePerformCase(performCase);
    }

    /**
     * @see com.rosy.punish.service.PerformCaseManager#removePerformCase(String id)
     */
    public void removePerformCase(final String id) {
        dao.removePerformCase(new String(id));
    }
}
