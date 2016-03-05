
package com.rosy.relation.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.relation.model.ReCaseReportReg;
import com.rosy.relation.dao.ReCaseReportRegDao;
import com.rosy.relation.service.ReCaseReportRegManager;

public class ReCaseReportRegManagerImpl extends BaseManager implements ReCaseReportRegManager {
    private ReCaseReportRegDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setReCaseReportRegDao(ReCaseReportRegDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.relation.service.ReCaseReportRegManager#getReCaseReportRegs(com.rosy.relation.model.ReCaseReportReg)
     */
    public List getReCaseReportRegs(final ReCaseReportReg reCaseReportReg) {
        return dao.getReCaseReportRegs(reCaseReportReg);
    }

    /**
     * @see com.rosy.relation.service.ReCaseReportRegManager#getReCaseReportReg(String id)
     */
    public ReCaseReportReg getReCaseReportReg(final String id) {
        return dao.getReCaseReportReg(new String(id));
    }

    /**
     * @see com.rosy.relation.service.ReCaseReportRegManager#saveReCaseReportReg(ReCaseReportReg reCaseReportReg)
     */
    public void saveReCaseReportReg(ReCaseReportReg reCaseReportReg) {
    	 if(StringUtils.isEmpty(reCaseReportReg.getId())){
    		 reCaseReportReg.setId(null);
    		 reCaseReportReg.setCreateDate(new Date(System.currentTimeMillis()));
    		 reCaseReportReg.setRflag(Constants.ACTION);
    	 }
    	dao.saveReCaseReportReg(reCaseReportReg);
    }

    /**
     * @see com.rosy.relation.service.ReCaseReportRegManager#removeReCaseReportReg(String id)
     */
    public void removeReCaseReportReg(final String id) {
        dao.removeReCaseReportReg(new String(id));
    }
}
