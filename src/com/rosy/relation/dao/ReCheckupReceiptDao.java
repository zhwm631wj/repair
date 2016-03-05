
package com.rosy.relation.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.relation.model.ReCheckupReceipt;

public interface ReCheckupReceiptDao extends Dao {

    /**
     * Retrieves all of the reCheckupReceipts
     */
    public List getReCheckupReceipts(ReCheckupReceipt reCheckupReceipt);

    /**
     * Gets reCheckupReceipt's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the reCheckupReceipt's id
     * @return reCheckupReceipt populated reCheckupReceipt object
     */
    public ReCheckupReceipt getReCheckupReceipt(final String id);

    /**
     * Saves a reCheckupReceipt's information
     * @param reCheckupReceipt the object to be saved
     */    
    public void saveReCheckupReceipt(ReCheckupReceipt reCheckupReceipt);

    /**
     * Removes a reCheckupReceipt from the database by id
     * @param id the reCheckupReceipt's id
     */
    public void removeReCheckupReceipt(final String id);
}

