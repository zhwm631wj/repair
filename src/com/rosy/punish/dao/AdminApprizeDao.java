
package com.rosy.punish.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.punish.model.AdminApprize;

public interface AdminApprizeDao extends Dao {

    /**
     * Retrieves all of the adminApprizes
     */
    public List getAdminApprizes(AdminApprize adminApprize);

    /**
     * Gets adminApprize's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the adminApprize's id
     * @return adminApprize populated adminApprize object
     */
    public AdminApprize getAdminApprize(final String id);

    /**
     * Saves a adminApprize's information
     * @param adminApprize the object to be saved
     */    
    public void saveAdminApprize(AdminApprize adminApprize);

    /**
     * Removes a adminApprize from the database by id
     * @param id the adminApprize's id
     */
    public void removeAdminApprize(final String id);
}

