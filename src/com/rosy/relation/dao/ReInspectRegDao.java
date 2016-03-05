
package com.rosy.relation.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.relation.model.ReInspectReg;

public interface ReInspectRegDao extends Dao {

    /**
     * Retrieves all of the reInspectRegs
     */
    public List getReInspectRegs(ReInspectReg reInspectReg);

    /**
     * Gets reInspectReg's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the reInspectReg's id
     * @return reInspectReg populated reInspectReg object
     */
    public ReInspectReg getReInspectReg(final String id);

    /**
     * Saves a reInspectReg's information
     * @param reInspectReg the object to be saved
     */    
    public void saveReInspectReg(ReInspectReg reInspectReg);

    /**
     * Removes a reInspectReg from the database by id
     * @param id the reInspectReg's id
     */
    public void removeReInspectReg(final String id);
}

