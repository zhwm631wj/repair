
package com.rosy.register.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.register.model.CaseReport;
import com.rosy.register.dao.CaseReportDao;
import com.rosy.register.service.CaseReportManager;

public class CaseReportManagerImpl extends BaseManager implements CaseReportManager {
    private CaseReportDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setCaseReportDao(CaseReportDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.register.service.CaseReportManager#getCaseReports(com.rosy.register.model.CaseReport)
     */
    public List getCaseReports(final CaseReport caseReport) {
        return dao.getCaseReports(caseReport);
    }

    /**
     * @see com.rosy.register.service.CaseReportManager#getCaseReport(String id)
     */
    public CaseReport getCaseReport(final String id) {
        return dao.getCaseReport(new String(id));
    }

    /**
     * @see com.rosy.register.service.CaseReportManager#saveCaseReport(CaseReport caseReport)
     */
    public void saveCaseReport(CaseReport caseReport) {
    	 if(StringUtils.isEmpty(caseReport.getId())){
    		 caseReport.setId(null);
    		 caseReport.setCreateDate(new Date(System.currentTimeMillis()));
    		 caseReport.setRflag(Constants.ACTION);
    	 }
        dao.saveCaseReport(caseReport);
    }

    /**
     * @see com.rosy.register.service.CaseReportManager#removeCaseReport(String id)
     */
    public void removeCaseReport(final String id) {
        dao.removeCaseReport(new String(id));
    }
}
