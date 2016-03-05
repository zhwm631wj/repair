
package com.rosy.relation.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.relation.model.ReForceWritReceipt;
import com.rosy.relation.dao.ReForceWritReceiptDao;
import com.rosy.relation.service.ReForceWritReceiptManager;

public class ReForceWritReceiptManagerImpl extends BaseManager implements ReForceWritReceiptManager {
    private ReForceWritReceiptDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setReForceWritReceiptDao(ReForceWritReceiptDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.relation.service.ReForceWritReceiptManager#getReForceWritReceipts(com.rosy.relation.model.ReForceWritReceipt)
     */
    public List getReForceWritReceipts(final ReForceWritReceipt reForceWritReceipt) {
        return dao.getReForceWritReceipts(reForceWritReceipt);
    }

    /**
     * @see com.rosy.relation.service.ReForceWritReceiptManager#getReForceWritReceipt(String id)
     */
    public ReForceWritReceipt getReForceWritReceipt(final String id) {
        return dao.getReForceWritReceipt(new String(id));
    }

    /**
     * @see com.rosy.relation.service.ReForceWritReceiptManager#saveReForceWritReceipt(ReForceWritReceipt reForceWritReceipt)
     */
    public void saveReForceWritReceipt(ReForceWritReceipt reForceWritReceipt) {
    	 if(StringUtils.isEmpty(reForceWritReceipt.getId())){
    		 reForceWritReceipt.setId(null);
    		 reForceWritReceipt.setCreateDate(new Date(System.currentTimeMillis()));
    		 reForceWritReceipt.setRflag(Constants.ACTION);
    	 }
    	dao.saveReForceWritReceipt(reForceWritReceipt);
    }

    /**
     * @see com.rosy.relation.service.ReForceWritReceiptManager#removeReForceWritReceipt(String id)
     */
    public void removeReForceWritReceipt(final String id) {
        dao.removeReForceWritReceipt(new String(id));
    }
}
