
package com.rosy.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.model.PendingRequest;
import com.rosy.dao.PendingRequestDao;

public interface PendingRequestManager extends Manager {
    /**
     * Retrieves all of the pendingRequests
     */
    public List getPendingRequests(PendingRequest pendingRequest);

    /**
     * Gets pendingRequest's information based on id.
     * @param id the pendingRequest's id
     * @return pendingRequest populated pendingRequest object
     */
    public PendingRequest getPendingRequest(final String id);

    /**
     * Saves a pendingRequest's information
     * @param pendingRequest the object to be saved
     */
    public void savePendingRequest(PendingRequest pendingRequest);

    /**
     * Removes a pendingRequest from the database by id
     * @param id the pendingRequest's id
     */
    public void removePendingRequest(final String id);
}

