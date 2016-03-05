
package com.rosy.investigate.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.investigate.model.ForceWrit;

public interface ForceWritDao extends Dao {

    /**
     * Retrieves all of the forceWrits
     */
    public List getForceWrits(ForceWrit forceWrit);

    /**
     * Gets forceWrit's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the forceWrit's id
     * @return forceWrit populated forceWrit object
     */
    public ForceWrit getForceWrit(final String id);

    /**
     * Saves a forceWrit's information
     * @param forceWrit the object to be saved
     */    
    public void saveForceWrit(ForceWrit forceWrit);

    /**
     * Removes a forceWrit from the database by id
     * @param id the forceWrit's id
     */
    public void removeForceWrit(final String id);
}

