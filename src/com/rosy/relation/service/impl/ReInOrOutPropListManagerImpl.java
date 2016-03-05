
package com.rosy.relation.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.relation.model.ReInOrOutPropList;
import com.rosy.relation.dao.ReInOrOutPropListDao;
import com.rosy.relation.service.ReInOrOutPropListManager;

public class ReInOrOutPropListManagerImpl extends BaseManager implements ReInOrOutPropListManager {
    private ReInOrOutPropListDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setReInOrOutPropListDao(ReInOrOutPropListDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.relation.service.ReInOrOutPropListManager#getReInOrOutPropLists(com.rosy.relation.model.ReInOrOutPropList)
     */
    public List getReInOrOutPropLists(final ReInOrOutPropList reInOrOutPropList) {
        return dao.getReInOrOutPropLists(reInOrOutPropList);
    }

    /**
     * @see com.rosy.relation.service.ReInOrOutPropListManager#getReInOrOutPropList(String id)
     */
    public ReInOrOutPropList getReInOrOutPropList(final String id) {
        return dao.getReInOrOutPropList(new String(id));
    }

    /**
     * @see com.rosy.relation.service.ReInOrOutPropListManager#saveReInOrOutPropList(ReInOrOutPropList reInOrOutPropList)
     */
    public void saveReInOrOutPropList(ReInOrOutPropList reInOrOutPropList) {
    	 if(StringUtils.isEmpty(reInOrOutPropList.getId())){
    		 reInOrOutPropList.setId(null);
    		 reInOrOutPropList.setCreateDate(new Date(System.currentTimeMillis()));
    		 reInOrOutPropList.setRflag(Constants.ACTION);
    	 }
    	dao.saveReInOrOutPropList(reInOrOutPropList);
    }

    /**
     * @see com.rosy.relation.service.ReInOrOutPropListManager#removeReInOrOutPropList(String id)
     */
    public void removeReInOrOutPropList(final String id) {
        dao.removeReInOrOutPropList(new String(id));
    }
}
