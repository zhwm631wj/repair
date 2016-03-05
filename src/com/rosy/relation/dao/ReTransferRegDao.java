
package com.rosy.relation.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.relation.model.ReTransferReg;

public interface ReTransferRegDao extends Dao {

    /**
     * Retrieves all of the reTransferRegs
     */
    public List getReTransferRegs(ReTransferReg reTransferReg);

    /**
     * Gets reTransferReg's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

