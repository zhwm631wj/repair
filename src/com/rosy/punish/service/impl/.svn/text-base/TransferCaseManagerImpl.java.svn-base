
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.TransferCase;
import com.rosy.punish.dao.TransferCaseDao;
import com.rosy.punish.service.TransferCaseManager;

public class TransferCaseManagerImpl extends BaseManager implements TransferCaseManager {
    private TransferCaseDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setTransferCaseDao(TransferCaseDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.TransferCaseManager#getTransferCases(com.rosy.punish.model.TransferCase)
     */
    public List getTransferCases(final TransferCase transferCase) {
        return dao.getTransferCases(transferCase);
    }

    /**
     * @see com.rosy.punish.service.TransferCaseManager#getTransferCase(String id)
     */
    public TransferCase getTransferCase(final String id) {
        return dao.getTransferCase(new String(id));
    }

    /**
     * @see com.rosy.punish.service.TransferCaseManager#saveTransferCase(TransferCase transferCase)
     */
    public void saveTransferCase(TransferCase transferCase) {
    	if(StringUtils.isEmpty(transferCase.getId())){
    		transferCase.setId(null);
    		transferCase.setCreateDate(new Date(System.currentTimeMillis()));
    		transferCase.setRflag(Constants.ACTION);
      	 }
        dao.saveTransferCase(transferCase);
    }

    /**
     * @see com.rosy.punish.service.TransferCaseManager#removeTransferCase(String id)
     */
    public void removeTransferCase(final String id) {
        dao.removeTransferCase(new String(id));
    }
}
