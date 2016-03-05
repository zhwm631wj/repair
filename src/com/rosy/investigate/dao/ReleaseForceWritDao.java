
package com.rosy.investigate.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.investigate.model.ReleaseForceWrit;

public interface ReleaseForceWritDao extends Dao {

    /**
     * Retrieves all of the releaseForceWrits
     */
    public List getReleaseForceWrits(ReleaseForceWrit releaseForceWrit);

    /**
     * Gets releaseForceWrit's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the releaseForceWrit's id
     * @return releaseForceWrit populated releaseForceWrit object
     */
    public ReleaseForceWrit getReleaseForceWrit(final String id);

    /**
     * Saves a releaseForceWrit's information
     * @param releaseForceWrit the object to be saved
     */    
    public void saveReleaseForceWrit(ReleaseForceWrit releaseForceWrit);

    /**
     * Removes a releaseForceWrit from the database by id
     * @param id the releaseForceWrit's id
     */
    public void removeReleaseForceWrit(final String id);
}

