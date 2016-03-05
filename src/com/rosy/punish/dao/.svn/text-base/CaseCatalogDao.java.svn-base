
package com.rosy.punish.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.punish.model.CaseCatalog;

public interface CaseCatalogDao extends Dao {

    /**
     * Retrieves all of the caseCatalogs
     */
    public List getCaseCatalogs(CaseCatalog caseCatalog);

    /**
     * Gets caseCatalog's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

