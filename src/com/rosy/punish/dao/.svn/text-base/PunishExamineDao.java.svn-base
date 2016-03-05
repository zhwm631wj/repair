
package com.rosy.punish.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.punish.model.PunishExamine;

public interface PunishExamineDao extends Dao {

    /**
     * Retrieves all of the punishExamines
     */
    public List getPunishExamines(PunishExamine punishExamine);

    /**
     * Gets punishExamine's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the punishExamine's id
     * @return punishExamine populated punishExamine object
     */
    public PunishExamine getPunishExamine(final String id);

    /**
     * Saves a punishExamine's information
     * @param punishExamine the object to be saved
     */    
    public void savePunishExamine(PunishExamine punishExamine);

    /**
     * Removes a punishExamine from the database by id
     * @param id the punishExamine's id
     */
    public void removePunishExamine(final String id);
}

