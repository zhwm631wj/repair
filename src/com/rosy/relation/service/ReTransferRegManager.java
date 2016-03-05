
package com.rosy.relation.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.relation.model.ReTransferReg;
import com.rosy.relation.dao.ReTransferRegDao;

public interface ReTransferRegManager extends Manager {
    /**
     * Retrieves all of the reTransferRegs
     */
    public List getReTransferRegs(ReTransferReg reTransferReg);

    /**
     * Gets reTransferReg's information based on id.
     * @param id the reTransferReg's id
     * @return reTransferReg populated reTransferReg object
     */
    public ReTransferReg getReTransferReg(final String id);

    /**
     * Saves a reTransferReg's information
     * @param reTransferReg the object to be saved
     */
    public void saveReTransferReg(ReTransferReg reTransferReg);

    /**
     * Removes a reTransferReg from the database by id
     * @param id the reTransferReg's id
     */
    public void removeReTransferReg(final String id);
}

