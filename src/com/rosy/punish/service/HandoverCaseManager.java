
package com.rosy.punish.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.punish.model.HandoverCase;
import com.rosy.punish.dao.HandoverCaseDao;

public interface HandoverCaseManager extends Manager {
    /**
     * Retrieves all of the handoverCases
     */
    public List getHandoverCases(HandoverCase handoverCase);

    /**
     * Gets handoverCase's information based on id.
     * @param id the handoverCase's id
     * @return handoverCase populated handoverCase object
     */
    public HandoverCase getHandoverCase(final String id);

    /**
     * Saves a handoverCase's information
     * @param handoverCase the object to be saved
     */
    public void saveHandoverCase(HandoverCase handoverCase);

    /**
     * Removes a handoverCase from the database by id
     * @param id the handoverCase's id
     */
    public void removeHandoverCase(final String id);
}

