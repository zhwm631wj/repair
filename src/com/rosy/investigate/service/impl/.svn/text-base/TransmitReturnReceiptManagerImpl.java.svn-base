
package com.rosy.investigate.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.investigate.model.TransmitReturnReceipt;
import com.rosy.investigate.dao.TransmitReturnReceiptDao;
import com.rosy.investigate.service.TransmitReturnReceiptManager;

public class TransmitReturnReceiptManagerImpl extends BaseManager implements TransmitReturnReceiptManager {
    private TransmitReturnReceiptDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setTransmitReturnReceiptDao(TransmitReturnReceiptDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.investigate.service.TransmitReturnReceiptManager#getTransmitReturnReceipts(com.rosy.investigate.model.TransmitReturnReceipt)
     */
    public List getTransmitReturnReceipts(final TransmitReturnReceipt transmitReturnReceipt) {
        return dao.getTransmitReturnReceipts(transmitReturnReceipt);
    }

    /**
     * @see com.rosy.investigate.service.TransmitReturnReceiptManager#getTransmitReturnReceipt(String id)
     */
    public TransmitReturnReceipt getTransmitReturnReceipt(final String id) {
        return dao.getTransmitReturnReceipt(new String(id));
    }

    /**
     * @see com.rosy.investigate.service.TransmitReturnReceiptManager#saveTransmitReturnReceipt(TransmitReturnReceipt transmitReturnReceipt)
     */
    public void saveTransmitReturnReceipt(TransmitReturnReceipt transmitReturnReceipt) {
    	if(StringUtils.isEmpty(transmitReturnReceipt.getId())){
    		transmitReturnReceipt.setId(null);
    		transmitReturnReceipt.setCreateDate(new Date(System.currentTimeMillis()));
    		transmitReturnReceipt.setRflag(Constants.ACTION);
      	 }
    	dao.saveTransmitReturnReceipt(transmitReturnReceipt);
    }

    /**
     * @see com.rosy.investigate.service.TransmitReturnReceiptManager#removeTransmitReturnReceipt(String id)
     */
    public void removeTransmitReturnReceipt(final String id) {
        dao.removeTransmitReturnReceipt(new String(id));
    }
}
