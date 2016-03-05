
package com.rosy.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.model.PendingRequest;

public interface PendingRequestDao extends Dao {

    /**
     * Retrieves all of the pendingRequests
     */
    public List getPendingRequests(PendingRequest pendingRequest);

    /**
     * Gets pendingRequest's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

