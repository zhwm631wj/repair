
package com.rosy.relation.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.relation.model.UndertakePerson;
import com.rosy.relation.dao.UndertakePersonDao;

public interface UndertakePersonManager extends Manager {
    /**
     * Retrieves all of the undertakePersons
     */
    public List getUndertakePersons(UndertakePerson undertakePerson);

    /**
     * Gets undertakePerson's information based on id.
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

