
package com.rosy.register.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.register.model.CaseReport;
import com.rosy.register.dao.CaseReportDao;

public interface CaseReportManager extends Manager {
    /**
     * Retrieves all of the caseReports
     */
    public List getCaseReports(CaseReport caseReport);

    /**
     * Gets caseReport's information based on id.
     * @param id the caseReport's id
     * @return caseReport populated caseReport object
     */
    public CaseReport getCaseReport(final String id);

    /**
     * Saves a caseReport's information
     * @param caseReport the object to be saved
     */
    public void saveCaseReport(CaseReport caseReport);

    /**
     * Removes a caseReport from the database by id
     * @param id the caseReport's id
     */
    public void removeCaseReport(final String id);
}

