
package com.rosy.investigate.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.investigate.model.CheckupProxy;

public interface CheckupProxyDao extends Dao {

    /**
     * Retrieves all of the checkupProxys
     */
    public List getCheckupProxys(CheckupProxy checkupProxy);

    /**
     * Gets checkupProxy's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the checkupProxy's id
     * @return checkupProxy populated checkupProxy object
     */
    public CheckupProxy getCheckupProxy(final String id);

    /**
     * Saves a checkupProxy's information
     * @param checkupProxy the object to be saved
     */    
    public void saveCheckupProxy(CheckupProxy checkupProxy);

    /**
     * Removes a checkupProxy from the database by id
     * @param id the checkupProxy's id
     */
    public void removeCheckupProxy(final String id);
}

