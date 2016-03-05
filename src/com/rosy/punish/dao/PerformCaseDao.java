
package com.rosy.punish.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.punish.model.PerformCase;

public interface PerformCaseDao extends Dao {

    /**
     * Retrieves all of the performCases
     */
    public List getPerformCases(PerformCase performCase);

    /**
     * Gets performCase's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the performCase's id
     * @return performCase populated performCase object
     */
    public PerformCase getPerformCase(final String id);

    /**
     * Saves a performCase's information
     * @param performCase the object to be saved
     */    
    public void savePerformCase(PerformCase performCase);

    /**
     * Removes a performCase from the database by id
     * @param id the performCase's id
     */
    public void removePerformCase(final String id);
}

