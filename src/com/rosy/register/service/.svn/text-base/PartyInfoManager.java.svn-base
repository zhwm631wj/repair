
package com.rosy.register.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.register.model.PartyInfo;
import com.rosy.register.dao.PartyInfoDao;

public interface PartyInfoManager extends Manager {
    /**
     * Retrieves all of the partyInfos
     */
    public List getPartyInfos(PartyInfo partyInfo);

    /**
     * Gets partyInfo's information based on id.
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

