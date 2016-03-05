
package com.rosy.punish.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.punish.model.TransferCase;
import com.rosy.punish.dao.TransferCaseDao;

public interface TransferCaseManager extends Manager {
    /**
     * Retrieves all of the transferCases
     */
    public List getTransferCases(TransferCase transferCase);

    /**
     * Gets transferCase's information based on id.
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

