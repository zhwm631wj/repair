
package com.rosy.investigate.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.investigate.model.CheckupProxy;
import com.rosy.investigate.dao.CheckupProxyDao;

public interface CheckupProxyManager extends Manager {
    /**
     * Retrieves all of the checkupProxys
     */
    public List getCheckupProxys(CheckupProxy checkupProxy);

    /**
     * Gets checkupProxy's information based on id.
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

