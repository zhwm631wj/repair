
package com.rosy.relation.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.relation.model.ReForceWritReceipt;
import com.rosy.relation.dao.ReForceWritReceiptDao;

public interface ReForceWritReceiptManager extends Manager {
    /**
     * Retrieves all of the reForceWritReceipts
     */
    public List getReForceWritReceipts(ReForceWritReceipt reForceWritReceipt);

    /**
     * Gets reForceWritReceipt's information based on id.
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

