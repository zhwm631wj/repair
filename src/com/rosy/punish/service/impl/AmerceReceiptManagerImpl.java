
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.AmerceReceipt;
import com.rosy.punish.dao.AmerceReceiptDao;
import com.rosy.punish.service.AmerceReceiptManager;

public class AmerceReceiptManagerImpl extends BaseManager implements AmerceReceiptManager {
    private AmerceReceiptDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setAmerceReceiptDao(AmerceReceiptDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.AmerceReceiptManager#getAmerceReceipts(com.rosy.punish.model.AmerceReceipt)
     */
    public List getAmerceReceipts(final AmerceReceipt amerceReceipt) {
        return dao.getAmerceReceipts(amerceReceipt);
    }

    /**
     * @see com.rosy.punish.service.AmerceReceiptManager#getAmerceReceipt(String id)
     */
    public AmerceReceipt getAmerceReceipt(final String id) {
        return dao.getAmerceReceipt(new String(id));
    }

    /**
     * @see com.rosy.punish.service.AmerceReceiptManager#saveAmerceReceipt(AmerceReceipt amerceReceipt)
     */
    public void saveAmerceReceipt(AmerceReceipt amerceReceipt) {
    	if(StringUtils.isEmpty(amerceReceipt.getId())){
    		amerceReceipt.setId(null);
    		amerceReceipt.setCreateDate(new Date(System.currentTimeMillis()));
    		amerceReceipt.setRflag(Constants.ACTION);
   	 }
        dao.saveAmerceReceipt(amerceReceipt);
    }

    /**
     * @see com.rosy.punish.service.AmerceReceiptManager#removeAmerceReceipt(String id)
     */
    public void removeAmerceReceipt(final String id) {
        dao.removeAmerceReceipt(new String(id));
    }
}
