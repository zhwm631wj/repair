
package com.rosy.punish.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.punish.model.PunishExamine;
import com.rosy.punish.dao.PunishExamineDao;

public interface PunishExamineManager extends Manager {
    /**
     * Retrieves all of the punishExamines
     */
    public List getPunishExamines(PunishExamine punishExamine);

    /**
     * Gets punishExamine's information based on id.
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

