
package com.rosy.investigate.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.investigate.model.ForceWrit;
import com.rosy.investigate.dao.ForceWritDao;
import com.rosy.investigate.service.ForceWritManager;

public class ForceWritManagerImpl extends BaseManager implements ForceWritManager {
    private ForceWritDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setForceWritDao(ForceWritDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.investigate.service.ForceWritManager#getForceWrits(com.rosy.investigate.model.ForceWrit)
     */
    public List getForceWrits(final ForceWrit forceWrit) {
        return dao.getForceWrits(forceWrit);
    }

    /**
     * @see com.rosy.investigate.service.ForceWritManager#getForceWrit(String id)
     */
    public ForceWrit getForceWrit(final String id) {
        return dao.getForceWrit(new String(id));
    }

    /**
     * @see com.rosy.investigate.service.ForceWritManager#saveForceWrit(ForceWrit forceWrit)
     */
    public void saveForceWrit(ForceWrit forceWrit) {
    	if(StringUtils.isEmpty(forceWrit.getId())){
    		forceWrit.setId(null);
    		forceWrit.setCreateDate(new Date(System.currentTimeMillis()));
    		forceWrit.setRflag(Constants.ACTION);
      	 }
        dao.saveForceWrit(forceWrit);
    }

    /**
     * @see com.rosy.investigate.service.ForceWritManager#removeForceWrit(String id)
     */
    public void removeForceWrit(final String id) {
        dao.removeForceWrit(new String(id));
    }
}
