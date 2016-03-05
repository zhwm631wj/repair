
package com.rosy.investigate.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.investigate.model.PropertyList;
import com.rosy.investigate.dao.PropertyListDao;
import com.rosy.investigate.service.PropertyListManager;

public class PropertyListManagerImpl extends BaseManager implements PropertyListManager {
    private PropertyListDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setPropertyListDao(PropertyListDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.investigate.service.PropertyListManager#getPropertyLists(com.rosy.investigate.model.PropertyList)
     */
    public List getPropertyLists(final PropertyList propertyList) {
        return dao.getPropertyLists(propertyList);
    }

    /**
     * @see com.rosy.investigate.service.PropertyListManager#getPropertyList(String id)
     */
    public PropertyList getPropertyList(final String id) {
        return dao.getPropertyList(new String(id));
    }

    /**
     * @see com.rosy.investigate.service.PropertyListManager#savePropertyList(PropertyList propertyList)
     */
    public void savePropertyList(PropertyList propertyList) {
    	if(StringUtils.isEmpty(propertyList.getId())){
    		propertyList.setId(null);
    		propertyList.setCreateDate(new Date(System.currentTimeMillis()));
    		propertyList.setRflag(Constants.ACTION);
      	 }
        dao.savePropertyList(propertyList);
    }

    /**
     * @see com.rosy.investigate.service.PropertyListManager#removePropertyList(String id)
     */
    public void removePropertyList(final String id) {
        dao.removePropertyList(new String(id));
    }
}
