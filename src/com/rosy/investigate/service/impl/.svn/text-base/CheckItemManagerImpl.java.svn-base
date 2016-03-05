
package com.rosy.investigate.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.investigate.model.CheckItem;
import com.rosy.investigate.dao.CheckItemDao;
import com.rosy.investigate.service.CheckItemManager;

public class CheckItemManagerImpl extends BaseManager implements CheckItemManager {
    private CheckItemDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setCheckItemDao(CheckItemDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.investigate.service.CheckItemManager#getCheckItems(com.rosy.investigate.model.CheckItem)
     */
    public List getCheckItems(final CheckItem checkItem) {
        return dao.getCheckItems(checkItem);
    }

    /**
     * @see com.rosy.investigate.service.CheckItemManager#getCheckItem(String id)
     */
    public CheckItem getCheckItem(final String id) {
        return dao.getCheckItem(new String(id));
    }

    /**
     * @see com.rosy.investigate.service.CheckItemManager#saveCheckItem(CheckItem checkItem)
     */
    public void saveCheckItem(CheckItem checkItem) {
    	if(StringUtils.isEmpty(checkItem.getId())){
    		checkItem.setId(null);
    		checkItem.setCreateDate(new Date(System.currentTimeMillis()));
    		checkItem.setRflag(Constants.ACTION);
      	 }
        dao.saveCheckItem(checkItem);
    }

    /**
     * @see com.rosy.investigate.service.CheckItemManager#removeCheckItem(String id)
     */
    public void removeCheckItem(final String id) {
        dao.removeCheckItem(new String(id));
    }
}
