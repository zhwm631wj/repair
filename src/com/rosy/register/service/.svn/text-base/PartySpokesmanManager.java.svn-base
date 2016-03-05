
package com.rosy.register.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.register.model.PartySpokesman;
import com.rosy.register.dao.PartySpokesmanDao;

public interface PartySpokesmanManager extends Manager {
    /**
     * Retrieves all of the partySpokesmans
     */
    public List getPartySpokesmans(PartySpokesman partySpokesman);

    /**
     * Gets partySpokesman's information based on id.
     * @param id the partySpokesman's id
     * @return partySpokesman populated partySpokesman object
     */
    public PartySpokesman getPartySpokesman(final String id);

    /**
     * Saves a partySpokesman's information
     * @param partySpokesman the object to be saved
     */
    public void savePartySpokesman(PartySpokesman partySpokesman);

    /**
     * Removes a partySpokesman from the database by id
     * @param id the partySpokesman's id
     */
    public void removePartySpokesman(final String id);
}

