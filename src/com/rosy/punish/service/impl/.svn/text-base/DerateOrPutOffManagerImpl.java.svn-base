
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.DerateOrPutOff;
import com.rosy.punish.dao.DerateOrPutOffDao;
import com.rosy.punish.service.DerateOrPutOffManager;

public class DerateOrPutOffManagerImpl extends BaseManager implements DerateOrPutOffManager {
    private DerateOrPutOffDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setDerateOrPutOffDao(DerateOrPutOffDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.DerateOrPutOffManager#getDerateOrPutOffs(com.rosy.punish.model.DerateOrPutOff)
     */
    public List getDerateOrPutOffs(final DerateOrPutOff derateOrPutOff) {
        return dao.getDerateOrPutOffs(derateOrPutOff);
    }

    /**
     * @see com.rosy.punish.service.DerateOrPutOffManager#getDerateOrPutOff(String id)
     */
    public DerateOrPutOff getDerateOrPutOff(final String id) {
        return dao.getDerateOrPutOff(new String(id));
    }

    /**
     * @see com.rosy.punish.service.DerateOrPutOffManager#saveDerateOrPutOff(DerateOrPutOff derateOrPutOff)
     */
    public void saveDerateOrPutOff(DerateOrPutOff derateOrPutOff) {

    	if(StringUtils.isEmpty(derateOrPutOff.getId())){
    		derateOrPutOff.setId(null);
    		derateOrPutOff.setCreateDate(new Date(System.currentTimeMillis()));
    		derateOrPutOff.setRflag(Constants.ACTION);
      	 }
        dao.saveDerateOrPutOff(derateOrPutOff);
    }

    /**
     * @see com.rosy.punish.service.DerateOrPutOffManager#removeDerateOrPutOff(String id)
     */
    public void removeDerateOrPutOff(final String id) {
        dao.removeDerateOrPutOff(new String(id));
    }
}
