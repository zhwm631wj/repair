
package com.rosy.relation.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.relation.model.ReAdminApprizeReceipt;
import com.rosy.relation.dao.ReAdminApprizeReceiptDao;

public interface ReAdminApprizeReceiptManager extends Manager {
    /**
     * Retrieves all of the reAdminApprizeReceipts
     */
    public List getReAdminApprizeReceipts(ReAdminApprizeReceipt reAdminApprizeReceipt);

    /**
     * Gets reAdminApprizeReceipt's information based on id.
     * @param id the reAdminApprizeReceipt's id
     * @return reAdminApprizeReceipt populated reAdminApprizeReceipt object
     */
    public ReAdminApprizeReceipt getReAdminApprizeReceipt(final String id);

    /**
     * Saves a reAdminApprizeReceipt's information
     * @param reAdminApprizeReceipt the object to be saved
     */
    public void saveReAdminApprizeReceipt(ReAdminApprizeReceipt reAdminApprizeReceipt);

    /**
     * Removes a reAdminApprizeReceipt from the database by id
     * @param id the reAdminApprizeReceipt's id
     */
    public void removeReAdminApprizeReceipt(final String id);
}

