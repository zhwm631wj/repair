
package com.rosy.register.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.register.model.CaseReport;

public interface CaseReportDao extends Dao {

    /**
     * Retrieves all of the caseReports
     */
    public List getCaseReports(CaseReport caseReport);

    /**
     * Gets caseReport's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

