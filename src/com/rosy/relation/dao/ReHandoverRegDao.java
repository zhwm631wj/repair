
package com.rosy.relation.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.relation.model.ReHandoverReg;

public interface ReHandoverRegDao extends Dao {

    /**
     * Retrieves all of the reHandoverRegs
     */
    public List getReHandoverRegs(ReHandoverReg reHandoverReg);

    /**
     * Gets reHandoverReg's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

