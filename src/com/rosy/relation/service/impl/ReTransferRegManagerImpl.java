
package com.rosy.relation.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.relation.model.ReTransferReg;
import com.rosy.relation.dao.ReTransferRegDao;
import com.rosy.relation.service.ReTransferRegManager;

public class ReTransferRegManagerImpl extends BaseManager implements ReTransferRegManager {
    private ReTransferRegDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setReTransferRegDao(ReTransferRegDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.relation.service.ReTransferRegManager#getReTransferRegs(com.rosy.relation.model.ReTransferReg)
     */
    public List getReTransferRegs(final ReTransferReg reTransferReg) {
        return dao.getReTransferRegs(reTransferReg);
    }

    /**
     * @see com.rosy.relation.service.ReTransferRegManager#getReTransferReg(String id)
     */
    public ReTransferReg getReTransferReg(final String id) {
        return dao.getReTransferReg(new String(id));
    }

    /**
     * @see com.rosy.relation.service.ReTransferRegManager#saveReTransferReg(ReTransferReg reTransferReg)
     */
    public void saveReTransferReg(ReTransferReg reTransferReg) {
    	 if(StringUtils.isEmpty(reTransferReg.getId())){
    		 reTransferReg.setId(null);
    		 reTransferReg.setCreateDate(new Date(System.currentTimeMillis()));
    		 reTransferReg.setRflag(Constants.ACTION);
    	 }
    	dao.saveReTransferReg(reTransferReg);
    }

    /**
     * @see com.rosy.relation.service.ReTransferRegManager#removeReTransferReg(String id)
     */
    public void removeReTransferReg(final String id) {
        dao.removeReTransferReg(new String(id));
    }
}
