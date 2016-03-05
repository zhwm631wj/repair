
package com.rosy.punish.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.punish.model.PunishDraft;

public interface PunishDraftDao extends Dao {

    /**
     * Retrieves all of the punishDrafts
     */
    public List getPunishDrafts(PunishDraft punishDraft);

    /**
     * Gets punishDraft's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

