
package com.rosy.investigate.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.investigate.model.CheckupReport;
import com.rosy.investigate.dao.CheckupReportDao;

public interface CheckupReportManager extends Manager {
    /**
     * Retrieves all of the checkupReports
     */
    public List getCheckupReports(CheckupReport checkupReport);

    /**
     * Gets checkupReport's information based on id.
     * @param id the checkupReport's id
     * @return checkupReport populated checkupReport object
     */
    public CheckupReport getCheckupReport(final String id);

    /**
     * Saves a checkupReport's information
     * @param checkupReport the object to be saved
     */
    public void saveCheckupReport(CheckupReport checkupReport);

    /**
     * Removes a checkupReport from the database by id
     * @param id the checkupReport's id
     */
    public void removeCheckupReport(final String id);
}

