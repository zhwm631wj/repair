
package com.rosy.investigate.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.investigate.model.ReleaseForceWrit;
import com.rosy.investigate.dao.ReleaseForceWritDao;
import com.rosy.investigate.service.ReleaseForceWritManager;

public class ReleaseForceWritManagerImpl extends BaseManager implements ReleaseForceWritManager {
    private ReleaseForceWritDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setReleaseForceWritDao(ReleaseForceWritDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.investigate.service.ReleaseForceWritManager#getReleaseForceWrits(com.rosy.investigate.model.ReleaseForceWrit)
     */
    public List getReleaseForceWrits(final ReleaseForceWrit releaseForceWrit) {
        return dao.getReleaseForceWrits(releaseForceWrit);
    }

    /**
     * @see com.rosy.investigate.service.ReleaseForceWritManager#getReleaseForceWrit(String id)
     */
    public ReleaseForceWrit getReleaseForceWrit(final String id) {
        return dao.getReleaseForceWrit(new String(id));
    }

    /**
     * @see com.rosy.investigate.service.ReleaseForceWritManager#saveReleaseForceWrit(ReleaseForceWrit releaseForceWrit)
     */
    public void saveReleaseForceWrit(ReleaseForceWrit releaseForceWrit) {
    	if(StringUtils.isEmpty(releaseForceWrit.getId())){
    		releaseForceWrit.setId(null);
    		releaseForceWrit.setCreateDate(new Date(System.currentTimeMillis()));
    		releaseForceWrit.setRflag(Constants.ACTION);
      	 }
        dao.saveReleaseForceWrit(releaseForceWrit);
    }

    /**
     * @see com.rosy.investigate.service.ReleaseForceWritManager#removeReleaseForceWrit(String id)
     */
    public void removeReleaseForceWrit(final String id) {
        dao.removeReleaseForceWrit(new String(id));
    }
}
