
package com.rosy.relation.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.relation.model.ReReleaseReceipt;
import com.rosy.relation.dao.ReReleaseReceiptDao;

public interface ReReleaseReceiptManager extends Manager {
    /**
     * Retrieves all of the reReleaseReceipts
     */
    public List getReReleaseReceipts(ReReleaseReceipt reReleaseReceipt);

    /**
     * Gets reReleaseReceipt's information based on id.
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

