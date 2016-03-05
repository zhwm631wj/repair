
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.CaseInvestEndReport;
import com.rosy.punish.dao.CaseInvestEndReportDao;
import com.rosy.punish.service.CaseInvestEndReportManager;

public class CaseInvestEndReportManagerImpl extends BaseManager implements CaseInvestEndReportManager {
    private CaseInvestEndReportDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setCaseInvestEndReportDao(CaseInvestEndReportDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.CaseInvestEndReportManager#getCaseInvestEndReports(com.rosy.punish.model.CaseInvestEndReport)
     */
    public List getCaseInvestEndReports(final CaseInvestEndReport caseInvestEndReport) {
        return dao.getCaseInvestEndReports(caseInvestEndReport);
    }

    /**
     * @see com.rosy.punish.service.CaseInvestEndReportManager#getCaseInvestEndReport(String id)
     */
    public CaseInvestEndReport getCaseInvestEndReport(final String id) {
        return dao.getCaseInvestEndReport(new String(id));
    }

    /**
     * @see com.rosy.punish.service.CaseInvestEndReportManager#saveCaseInvestEndReport(CaseInvestEndReport caseInvestEndReport)
     */
    public void saveCaseInvestEndReport(CaseInvestEndReport caseInvestEndReport) {
    	if(StringUtils.isEmpty(caseInvestEndReport.getId())){
    		caseInvestEndReport.setId(null);
    		caseInvestEndReport.setCreateDate(new Date(System.currentTimeMillis()));
    		caseInvestEndReport.setRflag(Constants.ACTION);
   	 }
    	dao.saveCaseInvestEndReport(caseInvestEndReport);
    }

    /**
     * @see com.rosy.punish.service.CaseInvestEndReportManager#removeCaseInvestEndReport(String id)
     */
    public void removeCaseInvestEndReport(final String id) {
        dao.removeCaseInvestEndReport(new String(id));
    }
}
