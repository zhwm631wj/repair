
package com.rosy.investigate.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.investigate.model.TransmitReturnReceipt;
import com.rosy.investigate.dao.TransmitReturnReceiptDao;

public interface TransmitReturnReceiptManager extends Manager {
    /**
     * Retrieves all of the transmitReturnReceipts
     */
    public List getTransmitReturnReceipts(TransmitReturnReceipt transmitReturnReceipt);

    /**
     * Gets transmitReturnReceipt's information based on id.
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

