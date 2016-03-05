
package com.rosy.punish.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.punish.model.PerformCase;
import com.rosy.punish.dao.PerformCaseDao;

public interface PerformCaseManager extends Manager {
    /**
     * Retrieves all of the performCases
     */
    public List getPerformCases(PerformCase performCase);

    /**
     * Gets performCase's information based on id.
     * @param id the performCase's id
     * @return performCase populated performCase object
     */
    public PerformCase getPerformCase(final String id);

    /**
     * Saves a performCase's information
     * @param performCase the object to be saved
     */
    public void savePerformCase(PerformCase performCase);

    /**
     * Removes a performCase from the database by id
     * @param id the performCase's id
     */
    public void removePerformCase(final String id);
}

