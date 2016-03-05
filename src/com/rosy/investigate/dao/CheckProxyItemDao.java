
package com.rosy.investigate.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.investigate.model.CheckProxyItem;

public interface CheckProxyItemDao extends Dao {

    /**
     * Retrieves all of the checkProxyItems
     */
    public List getCheckProxyItems(CheckProxyItem checkProxyItem);

    /**
     * Gets checkProxyItem's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the checkProxyItem's id
     * @return checkProxyItem populated checkProxyItem object
     */
    public CheckProxyItem getCheckProxyItem(final String id);

    /**
     * Saves a checkProxyItem's information
     * @param checkProxyItem the object to be saved
     */    
    public void saveCheckProxyItem(CheckProxyItem checkProxyItem);

    /**
     * Removes a checkProxyItem from the database by id
     * @param id the checkProxyItem's id
     */
    public void removeCheckProxyItem(final String id);
}

