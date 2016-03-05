
package com.rosy.relation.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.relation.model.ReHearOfReceipt;
import com.rosy.relation.dao.ReHearOfReceiptDao;
import com.rosy.relation.service.ReHearOfReceiptManager;

public class ReHearOfReceiptManagerImpl extends BaseManager implements ReHearOfReceiptManager {
    private ReHearOfReceiptDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setReHearOfReceiptDao(ReHearOfReceiptDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.relation.service.ReHearOfReceiptManager#getReHearOfReceipts(com.rosy.relation.model.ReHearOfReceipt)
     */
    public List getReHearOfReceipts(final ReHearOfReceipt reHearOfReceipt) {
        return dao.getReHearOfReceipts(reHearOfReceipt);
    }

    /**
     * @see com.rosy.relation.service.ReHearOfReceiptManager#getReHearOfReceipt(String id)
     */
    public ReHearOfReceipt getReHearOfReceipt(final String id) {
        return dao.getReHearOfReceipt(new String(id));
    }

    /**
     * @see com.rosy.relation.service.ReHearOfReceiptManager#saveReHearOfReceipt(ReHearOfReceipt reHearOfReceipt)
     */
    public void saveReHearOfReceipt(ReHearOfReceipt reHearOfReceipt) {
    	 if(StringUtils.isEmpty(reHearOfReceipt.getId())){
    		 reHearOfReceipt.setId(null);
    		 reHearOfReceipt.setCreateDate(new Date(System.currentTimeMillis()));
    		 reHearOfReceipt.setRflag(Constants.ACTION);
    	 }
    	dao.saveReHearOfReceipt(reHearOfReceipt);
    }

    /**
     * @see com.rosy.relation.service.ReHearOfReceiptManager#removeReHearOfReceipt(String id)
     */
    public void removeReHearOfReceipt(final String id) {
        dao.removeReHearOfReceipt(new String(id));
    }
}
