
package com.rosy.relation.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.relation.model.ReForceWritReceipt;

public interface ReForceWritReceiptDao extends Dao {

    /**
     * Retrieves all of the reForceWritReceipts
     */
    public List getReForceWritReceipts(ReForceWritReceipt reForceWritReceipt);

    /**
     * Gets reForceWritReceipt's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the reForceWritReceipt's id
     * @return reForceWritReceipt populated reForceWritReceipt object
     */
    public ReForceWritReceipt getReForceWritReceipt(final String id);

    /**
     * Saves a reForceWritReceipt's information
     * @param reForceWritReceipt the object to be saved
     */    
    public void saveReForceWritReceipt(ReForceWritReceipt reForceWritReceipt);

    /**
     * Removes a reForceWritReceipt from the database by id
     * @param id the reForceWritReceipt's id
     */
    public void removeReForceWritReceipt(final String id);
}

