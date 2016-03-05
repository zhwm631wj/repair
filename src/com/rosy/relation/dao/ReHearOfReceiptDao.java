
package com.rosy.relation.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.relation.model.ReHearOfReceipt;

public interface ReHearOfReceiptDao extends Dao {

    /**
     * Retrieves all of the reHearOfReceipts
     */
    public List getReHearOfReceipts(ReHearOfReceipt reHearOfReceipt);

    /**
     * Gets reHearOfReceipt's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the reHearOfReceipt's id
     * @return reHearOfReceipt populated reHearOfReceipt object
     */
    public ReHearOfReceipt getReHearOfReceipt(final String id);

    /**
     * Saves a reHearOfReceipt's information
     * @param reHearOfReceipt the object to be saved
     */    
    public void saveReHearOfReceipt(ReHearOfReceipt reHearOfReceipt);

    /**
     * Removes a reHearOfReceipt from the database by id
     * @param id the reHearOfReceipt's id
     */
    public void removeReHearOfReceipt(final String id);
}

