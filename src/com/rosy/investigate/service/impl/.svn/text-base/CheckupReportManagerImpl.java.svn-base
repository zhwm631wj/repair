
package com.rosy.investigate.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.investigate.model.CheckupReport;
import com.rosy.investigate.dao.CheckupReportDao;
import com.rosy.investigate.service.CheckupReportManager;

public class CheckupReportManagerImpl extends BaseManager implements CheckupReportManager {
    private CheckupReportDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setCheckupReportDao(CheckupReportDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.investigate.service.CheckupReportManager#getCheckupReports(com.rosy.investigate.model.CheckupReport)
     */
    public List getCheckupReports(final CheckupReport checkupReport) {
        return dao.getCheckupReports(checkupReport);
    }

    /**
     * @see com.rosy.investigate.service.CheckupReportManager#getCheckupReport(String id)
     */
    public CheckupReport getCheckupReport(final String id) {
        return dao.getCheckupReport(new String(id));
    }

    /**
     * @see com.rosy.investigate.service.CheckupReportManager#saveCheckupReport(CheckupReport checkupReport)
     */
    public void saveCheckupReport(CheckupReport checkupReport) {
    	if(StringUtils.isEmpty(checkupReport.getId())){
    		checkupReport.setId(null);
      		checkupReport.setCreateDate(new Date(System.currentTimeMillis()));
      		checkupReport.setRflag(Constants.ACTION);
      	 }
        dao.saveCheckupReport(checkupReport);
    }

    /**
     * @see com.rosy.investigate.service.CheckupReportManager#removeCheckupReport(String id)
     */
    public void removeCheckupReport(final String id) {
        dao.removeCheckupReport(new String(id));
    }
}
