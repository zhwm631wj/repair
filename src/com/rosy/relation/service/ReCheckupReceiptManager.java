
package com.rosy.relation.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.relation.model.ReCheckupReceipt;
import com.rosy.relation.dao.ReCheckupReceiptDao;

public interface ReCheckupReceiptManager extends Manager {
    /**
     * Retrieves all of the reCheckupReceipts
     */
    public List getReCheckupReceipts(ReCheckupReceipt reCheckupReceipt);

    /**
     * Gets reCheckupReceipt's information based on id.
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

