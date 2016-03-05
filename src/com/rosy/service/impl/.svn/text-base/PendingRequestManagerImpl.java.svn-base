
package com.rosy.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.model.PendingRequest;
import com.rosy.dao.PendingRequestDao;
import com.rosy.service.PendingRequestManager;

public class PendingRequestManagerImpl extends BaseManager implements PendingRequestManager {
    private PendingRequestDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setPendingRequestDao(PendingRequestDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.service.PendingRequestManager#getPendingRequests(com.rosy.model.PendingRequest)
     */
    public List getPendingRequests(final PendingRequest pendingRequest) {
        return dao.getPendingRequests(pendingRequest);
    }

    /**
     * @see com.rosy.service.PendingRequestManager#getPendingRequest(String id)
     */
    public PendingRequest getPendingRequest(final String id) {
        return dao.getPendingRequest(new String(id));
    }

    /**
     * @see com.rosy.service.PendingRequestManager#savePendingRequest(PendingRequest pendingRequest)
     */
    public void savePendingRequest(PendingRequest pendingRequest) {
    	 if(StringUtils.isEmpty(pendingRequest.getId())){
    		 pendingRequest.setId(null);
    		 pendingRequest.setCreateDate(new Date(System.currentTimeMillis()));
    		 pendingRequest.setRflag(Constants.ACTION);
    	 }
        dao.savePendingRequest(pendingRequest);
    }

    /**
     * @see com.rosy.service.PendingRequestManager#removePendingRequest(String id)
     */
    public void removePendingRequest(final String id) {
        dao.removePendingRequest(new String(id));
    }
}
