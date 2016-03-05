
package com.rosy.relation.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.relation.model.ReAdminApprizeReceipt;

public interface ReAdminApprizeReceiptDao extends Dao {

    /**
     * Retrieves all of the reAdminApprizeReceipts
     */
    public List getReAdminApprizeReceipts(ReAdminApprizeReceipt reAdminApprizeReceipt);

    /**
     * Gets reAdminApprizeReceipt's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

