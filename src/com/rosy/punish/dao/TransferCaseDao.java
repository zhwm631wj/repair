
package com.rosy.punish.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.punish.model.TransferCase;

public interface TransferCaseDao extends Dao {

    /**
     * Retrieves all of the transferCases
     */
    public List getTransferCases(TransferCase transferCase);

    /**
     * Gets transferCase's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the transferCase's id
     * @return transferCase populated transferCase object
     */
    public TransferCase getTransferCase(final String id);

    /**
     * Saves a transferCase's information
     * @param transferCase the object to be saved
     */    
    public void saveTransferCase(TransferCase transferCase);

    /**
     * Removes a transferCase from the database by id
     * @param id the transferCase's id
     */
    public void removeTransferCase(final String id);
}

