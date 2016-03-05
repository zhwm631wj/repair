
package com.rosy.relation.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.relation.model.ReCaseReportReg;
import com.rosy.relation.dao.ReCaseReportRegDao;

public interface ReCaseReportRegManager extends Manager {
    /**
     * Retrieves all of the reCaseReportRegs
     */
    public List getReCaseReportRegs(ReCaseReportReg reCaseReportReg);

    /**
     * Gets reCaseReportReg's information based on id.
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

