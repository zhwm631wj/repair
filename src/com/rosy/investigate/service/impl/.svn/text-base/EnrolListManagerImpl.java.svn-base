
package com.rosy.investigate.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.investigate.model.EnrolList;
import com.rosy.investigate.dao.EnrolListDao;
import com.rosy.investigate.service.EnrolListManager;

public class EnrolListManagerImpl extends BaseManager implements EnrolListManager {
    private EnrolListDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setEnrolListDao(EnrolListDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.investigate.service.EnrolListManager#getEnrolLists(com.rosy.investigate.model.EnrolList)
     */
    public List getEnrolLists(final EnrolList enrolList) {
        return dao.getEnrolLists(enrolList);
    }

    /**
     * @see com.rosy.investigate.service.EnrolListManager#getEnrolList(String id)
     */
    public EnrolList getEnrolList(final String id) {
        return dao.getEnrolList(new String(id));
    }

    /**
     * @see com.rosy.investigate.service.EnrolListManager#saveEnrolList(EnrolList enrolList)
     */
    public void saveEnrolList(EnrolList enrolList) {
    	if(StringUtils.isEmpty(enrolList.getId())){
    		enrolList.setId(null);
    		enrolList.setCreateDate(new Date(System.currentTimeMillis()));
    		enrolList.setRflag(Constants.ACTION);
      	 }
        dao.saveEnrolList(enrolList);
    }

    /**
     * @see com.rosy.investigate.service.EnrolListManager#removeEnrolList(String id)
     */
    public void removeEnrolList(final String id) {
        dao.removeEnrolList(new String(id));
    }
}
