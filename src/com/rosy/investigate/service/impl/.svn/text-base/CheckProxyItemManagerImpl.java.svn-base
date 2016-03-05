
package com.rosy.investigate.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.investigate.model.CheckProxyItem;
import com.rosy.investigate.dao.CheckProxyItemDao;
import com.rosy.investigate.service.CheckProxyItemManager;

public class CheckProxyItemManagerImpl extends BaseManager implements CheckProxyItemManager {
    private CheckProxyItemDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setCheckProxyItemDao(CheckProxyItemDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.investigate.service.CheckProxyItemManager#getCheckProxyItems(com.rosy.investigate.model.CheckProxyItem)
     */
    public List getCheckProxyItems(final CheckProxyItem checkProxyItem) {
        return dao.getCheckProxyItems(checkProxyItem);
    }

    /**
     * @see com.rosy.investigate.service.CheckProxyItemManager#getCheckProxyItem(String id)
     */
    public CheckProxyItem getCheckProxyItem(final String id) {
        return dao.getCheckProxyItem(new String(id));
    }

    /**
     * @see com.rosy.investigate.service.CheckProxyItemManager#saveCheckProxyItem(CheckProxyItem checkProxyItem)
     */
    public void saveCheckProxyItem(CheckProxyItem checkProxyItem) {
    	if(StringUtils.isEmpty(checkProxyItem.getId())){
    		checkProxyItem.setId(null);
    		checkProxyItem.setCreateDate(new Date(System.currentTimeMillis()));
    		checkProxyItem.setRflag(Constants.ACTION);
      	 }
        dao.saveCheckProxyItem(checkProxyItem);
    }

    /**
     * @see com.rosy.investigate.service.CheckProxyItemManager#removeCheckProxyItem(String id)
     */
    public void removeCheckProxyItem(final String id) {
        dao.removeCheckProxyItem(new String(id));
    }
}
