
package com.rosy.investigate.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.investigate.model.PropertyKeepList;
import com.rosy.investigate.dao.PropertyKeepListDao;
import com.rosy.investigate.service.PropertyKeepListManager;

public class PropertyKeepListManagerImpl extends BaseManager implements PropertyKeepListManager {
    private PropertyKeepListDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setPropertyKeepListDao(PropertyKeepListDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.investigate.service.PropertyKeepListManager#getPropertyKeepLists(com.rosy.investigate.model.PropertyKeepList)
     */
    public List getPropertyKeepLists(final PropertyKeepList propertyKeepList) {
        return dao.getPropertyKeepLists(propertyKeepList);
    }

    /**
     * @see com.rosy.investigate.service.PropertyKeepListManager#getPropertyKeepList(String id)
     */
    public PropertyKeepList getPropertyKeepList(final String id) {
        return dao.getPropertyKeepList(new String(id));
    }

    /**
     * @see com.rosy.investigate.service.PropertyKeepListManager#savePropertyKeepList(PropertyKeepList propertyKeepList)
     */
    public void savePropertyKeepList(PropertyKeepList propertyKeepList) {
    	if(StringUtils.isEmpty(propertyKeepList.getId())){
    		propertyKeepList.setId(null);
    		propertyKeepList.setCreateDate(new Date(System.currentTimeMillis()));
    		propertyKeepList.setRflag(Constants.ACTION);
      	 }
        dao.savePropertyKeepList(propertyKeepList);
    }

    /**
     * @see com.rosy.investigate.service.PropertyKeepListManager#removePropertyKeepList(String id)
     */
    public void removePropertyKeepList(final String id) {
        dao.removePropertyKeepList(new String(id));
    }
}
