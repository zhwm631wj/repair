
package com.rosy.relation.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.relation.model.ReReleaseReceipt;
import com.rosy.relation.dao.ReReleaseReceiptDao;
import com.rosy.relation.service.ReReleaseReceiptManager;

public class ReReleaseReceiptManagerImpl extends BaseManager implements ReReleaseReceiptManager {
    private ReReleaseReceiptDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setReReleaseReceiptDao(ReReleaseReceiptDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.relation.service.ReReleaseReceiptManager#getReReleaseReceipts(com.rosy.relation.model.ReReleaseReceipt)
     */
    public List getReReleaseReceipts(final ReReleaseReceipt reReleaseReceipt) {
        return dao.getReReleaseReceipts(reReleaseReceipt);
    }

    /**
     * @see com.rosy.relation.service.ReReleaseReceiptManager#getReReleaseReceipt(String id)
     */
    public ReReleaseReceipt getReReleaseReceipt(final String id) {
        return dao.getReReleaseReceipt(new String(id));
    }

    /**
     * @see com.rosy.relation.service.ReReleaseReceiptManager#saveReReleaseReceipt(ReReleaseReceipt reReleaseReceipt)
     */
    public void saveReReleaseReceipt(ReReleaseReceipt reReleaseReceipt) {
    	 if(StringUtils.isEmpty(reReleaseReceipt.getId())){
    		 reReleaseReceipt.setId(null);
    		 reReleaseReceipt.setCreateDate(new Date(System.currentTimeMillis()));
    		 reReleaseReceipt.setRflag(Constants.ACTION);
    	 }
    	dao.saveReReleaseReceipt(reReleaseReceipt);
    }

    /**
     * @see com.rosy.relation.service.ReReleaseReceiptManager#removeReReleaseReceipt(String id)
     */
    public void removeReReleaseReceipt(final String id) {
        dao.removeReReleaseReceipt(new String(id));
    }
}
