
package com.rosy.relation.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.relation.model.ReHearOfReceipt;
import com.rosy.relation.dao.ReHearOfReceiptDao;

public interface ReHearOfReceiptManager extends Manager {
    /**
     * Retrieves all of the reHearOfReceipts
     */
    public List getReHearOfReceipts(ReHearOfReceipt reHearOfReceipt);

    /**
     * Gets reHearOfReceipt's information based on id.
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

