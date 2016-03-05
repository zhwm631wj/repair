
package com.rosy.relation.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.relation.model.ReInspectReg;
import com.rosy.relation.dao.ReInspectRegDao;
import com.rosy.relation.service.ReInspectRegManager;

public class ReInspectRegManagerImpl extends BaseManager implements ReInspectRegManager {
    private ReInspectRegDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setReInspectRegDao(ReInspectRegDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.relation.service.ReInspectRegManager#getReInspectRegs(com.rosy.relation.model.ReInspectReg)
     */
    public List getReInspectRegs(final ReInspectReg reInspectReg) {
        return dao.getReInspectRegs(reInspectReg);
    }

    /**
     * @see com.rosy.relation.service.ReInspectRegManager#getReInspectReg(String id)
     */
    public ReInspectReg getReInspectReg(final String id) {
        return dao.getReInspectReg(new String(id));
    }

    /**
     * @see com.rosy.relation.service.ReInspectRegManager#saveReInspectReg(ReInspectReg reInspectReg)
     */
    public void saveReInspectReg(ReInspectReg reInspectReg) {
    	 if(StringUtils.isEmpty(reInspectReg.getId())){
    		 reInspectReg.setId(null);
    		 reInspectReg.setCreateDate(new Date(System.currentTimeMillis()));
    		 reInspectReg.setRflag(Constants.ACTION);
    	 }
    	dao.saveReInspectReg(reInspectReg);
    }

    /**
     * @see com.rosy.relation.service.ReInspectRegManager#removeReInspectReg(String id)
     */
    public void removeReInspectReg(final String id) {
        dao.removeReInspectReg(new String(id));
    }
}
