
package com.rosy.investigate.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.investigate.model.TransmitReturnReceipt;

public interface TransmitReturnReceiptDao extends Dao {

    /**
     * Retrieves all of the transmitReturnReceipts
     */
    public List getTransmitReturnReceipts(TransmitReturnReceipt transmitReturnReceipt);

    /**
     * Gets transmitReturnReceipt's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the transmitReturnReceipt's id
     * @return transmitReturnReceipt populated transmitReturnReceipt object
     */
    public TransmitReturnReceipt getTransmitReturnReceipt(final String id);

    /**
     * Saves a transmitReturnReceipt's information
     * @param transmitReturnReceipt the object to be saved
     */    
    public void saveTransmitReturnReceipt(TransmitReturnReceipt transmitReturnReceipt);

    /**
     * Removes a transmitReturnReceipt from the database by id
     * @param id the transmitReturnReceipt's id
     */
    public void removeTransmitReturnReceipt(final String id);
}

