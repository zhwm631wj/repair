
package com.rosy.investigate.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.investigate.model.ForceWrit;
import com.rosy.investigate.dao.ForceWritDao;

public interface ForceWritManager extends Manager {
    /**
     * Retrieves all of the forceWrits
     */
    public List getForceWrits(ForceWrit forceWrit);

    /**
     * Gets forceWrit's information based on id.
     * @param id the forceWrit's id
     * @return forceWrit populated forceWrit object
     */
    public ForceWrit getForceWrit(final String id);

    /**
     * Saves a forceWrit's information
     * @param forceWrit the object to be saved
     */
    public void saveForceWrit(ForceWrit forceWrit);

    /**
     * Removes a forceWrit from the database by id
     * @param id the forceWrit's id
     */
    public void removeForceWrit(final String id);
}

