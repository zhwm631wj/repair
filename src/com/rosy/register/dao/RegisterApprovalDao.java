
package com.rosy.register.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.register.model.RegisterApproval;

public interface RegisterApprovalDao extends Dao {

    /**
     * Retrieves all of the registerApprovals
     */
    public List getRegisterApprovals(RegisterApproval registerApproval);

    /**
     * Gets registerApproval's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the registerApproval's id
     * @return registerApproval populated registerApproval object
     */
    public RegisterApproval getRegisterApproval(final String id);

    /**
     * Saves a registerApproval's information
     * @param registerApproval the object to be saved
     */    
    public void saveRegisterApproval(RegisterApproval registerApproval);

    /**
     * Removes a registerApproval from the database by id
     * @param id the registerApproval's id
     */
    public void removeRegisterApproval(final String id);
}

