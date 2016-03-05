
package com.rosy.investigate.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.investigate.model.CheckupReport;

public interface CheckupReportDao extends Dao {

    /**
     * Retrieves all of the checkupReports
     */
    public List getCheckupReports(CheckupReport checkupReport);

    /**
     * Gets checkupReport's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

