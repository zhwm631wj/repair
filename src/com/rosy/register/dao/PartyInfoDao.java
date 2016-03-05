
package com.rosy.register.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.register.model.PartyInfo;

public interface PartyInfoDao extends Dao {

    /**
     * Retrieves all of the partyInfos
     */
    public List getPartyInfos(PartyInfo partyInfo);

    /**
     * Gets partyInfo's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the partyInfo's id
     * @return partyInfo populated partyInfo object
     */
    public PartyInfo getPartyInfo(final String id);

    /**
     * Saves a partyInfo's information
     * @param partyInfo the object to be saved
     */    
    public void savePartyInfo(PartyInfo partyInfo);

    /**
     * Removes a partyInfo from the database by id
     * @param id the partyInfo's id
     */
    public void removePartyInfo(final String id);
}

