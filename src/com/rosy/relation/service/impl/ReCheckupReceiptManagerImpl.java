
package com.rosy.relation.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.relation.model.ReCheckupReceipt;
import com.rosy.relation.dao.ReCheckupReceiptDao;
import com.rosy.relation.service.ReCheckupReceiptManager;

public class ReCheckupReceiptManagerImpl extends BaseManager implements ReCheckupReceiptManager {
    private ReCheckupReceiptDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setReCheckupReceiptDao(ReCheckupReceiptDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.relation.service.ReCheckupReceiptManager#getReCheckupReceipts(com.rosy.relation.model.ReCheckupReceipt)
     */
    public List getReCheckupReceipts(final ReCheckupReceipt reCheckupReceipt) {
        return dao.getReCheckupReceipts(reCheckupReceipt);
    }

    /**
     * @see com.rosy.relation.service.ReCheckupReceiptManager#getReCheckupReceipt(String id)
     */
    public ReCheckupReceipt getReCheckupReceipt(final String id) {
        return dao.getReCheckupReceipt(new String(id));
    }

    /**
     * @see com.rosy.relation.service.ReCheckupReceiptManager#saveReCheckupReceipt(ReCheckupReceipt reCheckupReceipt)
     */
    public void saveReCheckupReceipt(ReCheckupReceipt reCheckupReceipt) {
    	 if(StringUtils.isEmpty(reCheckupReceipt.getId())){
    		 reCheckupReceipt.setId(null);
    		 reCheckupReceipt.setCreateDate(new Date(System.currentTimeMillis()));
    		 reCheckupReceipt.setRflag(Constants.ACTION);
    	 }
    	dao.saveReCheckupReceipt(reCheckupReceipt);
    }

    /**
     * @see com.rosy.relation.service.ReCheckupReceiptManager#removeReCheckupReceipt(String id)
     */
    public void removeReCheckupReceipt(final String id) {
        dao.removeReCheckupReceipt(new String(id));
    }
}
