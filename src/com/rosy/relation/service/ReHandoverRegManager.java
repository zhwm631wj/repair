
package com.rosy.relation.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.relation.model.ReHandoverReg;
import com.rosy.relation.dao.ReHandoverRegDao;

public interface ReHandoverRegManager extends Manager {
    /**
     * Retrieves all of the reHandoverRegs
     */
    public List getReHandoverRegs(ReHandoverReg reHandoverReg);

    /**
     * Gets reHandoverReg's information based on id.
     * @param id the reHandoverReg's id
     * @return reHandoverReg populated reHandoverReg object
     */
    public ReHandoverReg getReHandoverReg(final String id);

    /**
     * Saves a reHandoverReg's information
     * @param reHandoverReg the object to be saved
     */
    public void saveReHandoverReg(ReHandoverReg reHandoverReg);

    /**
     * Removes a reHandoverReg from the database by id
     * @param id the reHandoverReg's id
     */
    public void removeReHandoverReg(final String id);
}

