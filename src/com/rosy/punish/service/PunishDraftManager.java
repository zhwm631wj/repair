
package com.rosy.punish.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.punish.model.PunishDraft;
import com.rosy.punish.dao.PunishDraftDao;

public interface PunishDraftManager extends Manager {
    /**
     * Retrieves all of the punishDrafts
     */
    public List getPunishDrafts(PunishDraft punishDraft);

    /**
     * Gets punishDraft's information based on id.
     * @param id the punishDraft's id
     * @return punishDraft populated punishDraft object
     */
    public PunishDraft getPunishDraft(final String id);

    /**
     * Saves a punishDraft's information
     * @param punishDraft the object to be saved
     */
    public void savePunishDraft(PunishDraft punishDraft);

    /**
     * Removes a punishDraft from the database by id
     * @param id the punishDraft's id
     */
    public void removePunishDraft(final String id);
}

