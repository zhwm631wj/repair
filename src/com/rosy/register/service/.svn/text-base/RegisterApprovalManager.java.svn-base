
package com.rosy.register.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.register.model.RegisterApproval;
import com.rosy.register.dao.RegisterApprovalDao;

public interface RegisterApprovalManager extends Manager {
    /**
     * Retrieves all of the registerApprovals
     */
    public List getRegisterApprovals(RegisterApproval registerApproval);

    /**
     * Gets registerApproval's information based on id.
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

