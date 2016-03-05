
package com.rosy.register.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.register.model.PartySpokesman;

public interface PartySpokesmanDao extends Dao {

    /**
     * Retrieves all of the partySpokesmans
     */
    public List getPartySpokesmans(PartySpokesman partySpokesman);

    /**
     * Gets partySpokesman's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

