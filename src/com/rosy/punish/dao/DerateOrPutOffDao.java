
package com.rosy.punish.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.punish.model.DerateOrPutOff;

public interface DerateOrPutOffDao extends Dao {

    /**
     * Retrieves all of the derateOrPutOffs
     */
    public List getDerateOrPutOffs(DerateOrPutOff derateOrPutOff);

    /**
     * Gets derateOrPutOff's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the derateOrPutOff's id
     * @return derateOrPutOff populated derateOrPutOff object
     */
    public DerateOrPutOff getDerateOrPutOff(final String id);

    /**
     * Saves a derateOrPutOff's information
     * @param derateOrPutOff the object to be saved
     */    
    public void saveDerateOrPutOff(DerateOrPutOff derateOrPutOff);

    /**
     * Removes a derateOrPutOff from the database by id
     * @param id the derateOrPutOff's id
     */
    public void removeDerateOrPutOff(final String id);
}

