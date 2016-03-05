
package com.rosy.punish.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.punish.model.PunishDecisionBook;

public interface PunishDecisionBookDao extends Dao {

    /**
     * Retrieves all of the punishDecisionBooks
     */
    public List getPunishDecisionBooks(PunishDecisionBook punishDecisionBook);

    /**
     * Gets punishDecisionBook's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the punishDecisionBook's id
     * @return punishDecisionBook populated punishDecisionBook object
     */
    public PunishDecisionBook getPunishDecisionBook(final String id);

    /**
     * Saves a punishDecisionBook's information
     * @param punishDecisionBook the object to be saved
     */    
    public void savePunishDecisionBook(PunishDecisionBook punishDecisionBook);

    /**
     * Removes a punishDecisionBook from the database by id
     * @param id the punishDecisionBook's id
     */
    public void removePunishDecisionBook(final String id);
}

