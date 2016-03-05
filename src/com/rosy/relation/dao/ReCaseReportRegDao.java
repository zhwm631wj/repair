
package com.rosy.relation.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.relation.model.ReCaseReportReg;

public interface ReCaseReportRegDao extends Dao {

    /**
     * Retrieves all of the reCaseReportRegs
     */
    public List getReCaseReportRegs(ReCaseReportReg reCaseReportReg);

    /**
     * Gets reCaseReportReg's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the reCaseReportReg's id
     * @return reCaseReportReg populated reCaseReportReg object
     */
    public ReCaseReportReg getReCaseReportReg(final String id);

    /**
     * Saves a reCaseReportReg's information
     * @param reCaseReportReg the object to be saved
     */    
    public void saveReCaseReportReg(ReCaseReportReg reCaseReportReg);

    /**
     * Removes a reCaseReportReg from the database by id
     * @param id the reCaseReportReg's id
     */
    public void removeReCaseReportReg(final String id);
}

