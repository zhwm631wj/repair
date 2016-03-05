
package com.rosy.punish.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.punish.model.HearOfWitnesse;
import com.rosy.punish.dao.HearOfWitnesseDao;

public interface HearOfWitnesseManager extends Manager {
    /**
     * Retrieves all of the hearOfWitnesses
     */
    public List getHearOfWitnesses(HearOfWitnesse hearOfWitnesse);

    /**
     * Gets hearOfWitnesse's information based on id.
     * @param id the hearOfWitnesse's id
     * @return hearOfWitnesse populated hearOfWitnesse object
     */
    public HearOfWitnesse getHearOfWitnesse(final String id);

    /**
     * Saves a hearOfWitnesse's information
     * @param hearOfWitnesse the object to be saved
     */
    public void saveHearOfWitnesse(HearOfWitnesse hearOfWitnesse);

    /**
     * Removes a hearOfWitnesse from the database by id
     * @param id the hearOfWitnesse's id
     */
    public void removeHearOfWitnesse(final String id);
}

