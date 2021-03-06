
package com.rosy.register.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.register.model.InspectMarket;

public interface InspectMarketDao extends Dao {

    /**
     * Retrieves all of the inspectMarkets
     */
    public List getInspectMarkets(InspectMarket inspectMarket);

    /**
     * Gets inspectMarket's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the inspectMarket's id
     * @return inspectMarket populated inspectMarket object
     */
    public InspectMarket getInspectMarket(final String id);

    /**
     * Saves a inspectMarket's information
     * @param inspectMarket the object to be saved
     */    
    public void saveInspectMarket(InspectMarket inspectMarket);

    /**
     * Removes a inspectMarket from the database by id
     * @param id the inspectMarket's id
     */
    public void removeInspectMarket(final String id);
}

