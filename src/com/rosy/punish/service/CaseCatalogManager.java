
package com.rosy.punish.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.punish.model.CaseCatalog;
import com.rosy.punish.dao.CaseCatalogDao;

public interface CaseCatalogManager extends Manager {
    /**
     * Retrieves all of the caseCatalogs
     */
    public List getCaseCatalogs(CaseCatalog caseCatalog);

    /**
     * Gets caseCatalog's information based on id.
     * @param id the caseCatalog's id
     * @return caseCatalog populated caseCatalog object
     */
    public CaseCatalog getCaseCatalog(final String id);

    /**
     * Saves a caseCatalog's information
     * @param caseCatalog the object to be saved
     */
    public void saveCaseCatalog(CaseCatalog caseCatalog);

    /**
     * Removes a caseCatalog from the database by id
     * @param id the caseCatalog's id
     */
    public void removeCaseCatalog(final String id);
}

