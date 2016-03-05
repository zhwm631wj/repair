
package com.rosy.investigate.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.investigate.model.PropertyList;
import com.rosy.investigate.dao.PropertyListDao;

public interface PropertyListManager extends Manager {
    /**
     * Retrieves all of the propertyLists
     */
    public List getPropertyLists(PropertyList propertyList);

    /**
     * Gets propertyList's information based on id.
     * @param id the propertyList's id
     * @return propertyList populated propertyList object
     */
    public PropertyList getPropertyList(final String id);

    /**
     * Saves a propertyList's information
     * @param propertyList the object to be saved
     */
    public void savePropertyList(PropertyList propertyList);

    /**
     * Removes a propertyList from the database by id
     * @param id the propertyList's id
     */
    public void removePropertyList(final String id);
}

