
package com.rosy.punish.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.punish.model.HearOfWitnesse;

public interface HearOfWitnesseDao extends Dao {

    /**
     * Retrieves all of the hearOfWitnesses
     */
    public List getHearOfWitnesses(HearOfWitnesse hearOfWitnesse);

    /**
     * Gets hearOfWitnesse's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

