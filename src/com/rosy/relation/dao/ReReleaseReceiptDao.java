
package com.rosy.relation.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.relation.model.ReReleaseReceipt;

public interface ReReleaseReceiptDao extends Dao {

    /**
     * Retrieves all of the reReleaseReceipts
     */
    public List getReReleaseReceipts(ReReleaseReceipt reReleaseReceipt);

    /**
     * Gets reReleaseReceipt's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the reReleaseReceipt's id
     * @return reReleaseReceipt populated reReleaseReceipt object
     */
    public ReReleaseReceipt getReReleaseReceipt(final String id);

    /**
     * Saves a reReleaseReceipt's information
     * @param reReleaseReceipt the object to be saved
     */    
    public void saveReReleaseReceipt(ReReleaseReceipt reReleaseReceipt);

    /**
     * Removes a reReleaseReceipt from the database by id
     * @param id the reReleaseReceipt's id
     */
    public void removeReReleaseReceipt(final String id);
}

