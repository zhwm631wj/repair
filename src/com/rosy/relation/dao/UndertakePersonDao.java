
package com.rosy.relation.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.relation.model.UndertakePerson;

public interface UndertakePersonDao extends Dao {

    /**
     * Retrieves all of the undertakePersons
     */
    public List getUndertakePersons(UndertakePerson undertakePerson);

    /**
     * Gets undertakePerson's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the undertakePerson's id
     * @return undertakePerson populated undertakePerson object
     */
    public UndertakePerson getUndertakePerson(final String id);

    /**
     * Saves a undertakePerson's information
     * @param undertakePerson the object to be saved
     */    
    public void saveUndertakePerson(UndertakePerson undertakePerson);

    /**
     * Removes a undertakePerson from the database by id
     * @param id the undertakePerson's id
     */
    public void removeUndertakePerson(final String id);
}

