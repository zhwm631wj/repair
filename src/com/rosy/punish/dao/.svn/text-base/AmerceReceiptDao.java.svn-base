
package com.rosy.punish.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.punish.model.AmerceReceipt;

public interface AmerceReceiptDao extends Dao {

    /**
     * Retrieves all of the amerceReceipts
     */
    public List getAmerceReceipts(AmerceReceipt amerceReceipt);

    /**
     * Gets amerceReceipt's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the amerceReceipt's id
     * @return amerceReceipt populated amerceReceipt object
     */
    public AmerceReceipt getAmerceReceipt(final String id);

    /**
     * Saves a amerceReceipt's information
     * @param amerceReceipt the object to be saved
     */    
    public void saveAmerceReceipt(AmerceReceipt amerceReceipt);

    /**
     * Removes a amerceReceipt from the database by id
     * @param id the amerceReceipt's id
     */
    public void removeAmerceReceipt(final String id);
}

