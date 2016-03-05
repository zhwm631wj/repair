
package com.rosy.relation.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.relation.model.ReAdminApprizeReceipt;
import com.rosy.relation.dao.ReAdminApprizeReceiptDao;
import com.rosy.relation.service.ReAdminApprizeReceiptManager;

public class ReAdminApprizeReceiptManagerImpl extends BaseManager implements ReAdminApprizeReceiptManager {
    private ReAdminApprizeReceiptDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setReAdminApprizeReceiptDao(ReAdminApprizeReceiptDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.relation.service.ReAdminApprizeReceiptManager#getReAdminApprizeReceipts(com.rosy.relation.model.ReAdminApprizeReceipt)
     */
    public List getReAdminApprizeReceipts(final ReAdminApprizeReceipt reAdminApprizeReceipt) {
        return dao.getReAdminApprizeReceipts(reAdminApprizeReceipt);
    }

    /**
     * @see com.rosy.relation.service.ReAdminApprizeReceiptManager#getReAdminApprizeReceipt(String id)
     */
    public ReAdminApprizeReceipt getReAdminApprizeReceipt(final String id) {
        return dao.getReAdminApprizeReceipt(new String(id));
    }

    /**
     * @see com.rosy.relation.service.ReAdminApprizeReceiptManager#saveReAdminApprizeReceipt(ReAdminApprizeReceipt reAdminApprizeReceipt)
     */
    public void saveReAdminApprizeReceipt(ReAdminApprizeReceipt reAdminApprizeReceipt) {
    	 if(StringUtils.isEmpty(reAdminApprizeReceipt.getId())){
    		 reAdminApprizeReceipt.setId(null);
    		 reAdminApprizeReceipt.setCreateDate(new Date(System.currentTimeMillis()));
    		 reAdminApprizeReceipt.setRflag(Constants.ACTION);
    	 }
    	dao.saveReAdminApprizeReceipt(reAdminApprizeReceipt);
    }

    /**
     * @see com.rosy.relation.service.ReAdminApprizeReceiptManager#removeReAdminApprizeReceipt(String id)
     */
    public void removeReAdminApprizeReceipt(final String id) {
        dao.removeReAdminApprizeReceipt(new String(id));
    }
}
