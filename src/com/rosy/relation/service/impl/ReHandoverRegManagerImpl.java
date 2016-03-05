
package com.rosy.relation.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.relation.model.ReHandoverReg;
import com.rosy.relation.dao.ReHandoverRegDao;
import com.rosy.relation.service.ReHandoverRegManager;

public class ReHandoverRegManagerImpl extends BaseManager implements ReHandoverRegManager {
    private ReHandoverRegDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setReHandoverRegDao(ReHandoverRegDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.relation.service.ReHandoverRegManager#getReHandoverRegs(com.rosy.relation.model.ReHandoverReg)
     */
    public List getReHandoverRegs(final ReHandoverReg reHandoverReg) {
        return dao.getReHandoverRegs(reHandoverReg);
    }

    /**
     * @see com.rosy.relation.service.ReHandoverRegManager#getReHandoverReg(String id)
     */
    public ReHandoverReg getReHandoverReg(final String id) {
        return dao.getReHandoverReg(new String(id));
    }

    /**
     * @see com.rosy.relation.service.ReHandoverRegManager#saveReHandoverReg(ReHandoverReg reHandoverReg)
     */
    public void saveReHandoverReg(ReHandoverReg reHandoverReg) {
    	 if(StringUtils.isEmpty(reHandoverReg.getId())){
    		 reHandoverReg.setId(null);
    		 reHandoverReg.setCreateDate(new Date(System.currentTimeMillis()));
    		 reHandoverReg.setRflag(Constants.ACTION);
    	 }
    	dao.saveReHandoverReg(reHandoverReg);
    }

    /**
     * @see com.rosy.relation.service.ReHandoverRegManager#removeReHandoverReg(String id)
     */
    public void removeReHandoverReg(final String id) {
        dao.removeReHandoverReg(new String(id));
    }
}
