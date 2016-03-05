
package com.rosy.investigate.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.investigate.model.PropertyList;

public interface PropertyListDao extends Dao {

    /**
     * Retrieves all of the propertyLists
     */
    public List getPropertyLists(PropertyList propertyList);

    /**
     * Gets propertyList's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

