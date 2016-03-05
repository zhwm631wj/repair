
package com.rosy.punish.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.punish.model.HandoverCase;

public interface HandoverCaseDao extends Dao {

    /**
     * Retrieves all of the handoverCases
     */
    public List getHandoverCases(HandoverCase handoverCase);

    /**
     * Gets handoverCase's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the handoverCase's id
     * @return handoverCase populated handoverCase object
     */
    public HandoverCase getHandoverCase(final String id);

    /**
     * Saves a handoverCase's information
     * @param handoverCase the object to be saved
     */    
    public void saveHandoverCase(HandoverCase handoverCase);

    /**
     * Removes a handoverCase from the database by id
     * @param id the handoverCase's id
     */
    public void removeHandoverCase(final String id);
}

