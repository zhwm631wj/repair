
package com.rosy.punish.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.punish.model.AdminApprize;
import com.rosy.punish.dao.AdminApprizeDao;

public interface AdminApprizeManager extends Manager {
    /**
     * Retrieves all of the adminApprizes
     */
    public List getAdminApprizes(AdminApprize adminApprize);

    /**
     * Gets adminApprize's information based on id.
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

