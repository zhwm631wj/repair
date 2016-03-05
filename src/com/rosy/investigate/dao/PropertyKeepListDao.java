
package com.rosy.investigate.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.investigate.model.PropertyKeepList;

public interface PropertyKeepListDao extends Dao {

    /**
     * Retrieves all of the propertyKeepLists
     */
    public List getPropertyKeepLists(PropertyKeepList propertyKeepList);

    /**
     * Gets propertyKeepList's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the propertyKeepList's id
     * @return propertyKeepList populated propertyKeepList object
     */
    public PropertyKeepList getPropertyKeepList(final String id);

    /**
     * Saves a propertyKeepList's information
     * @param propertyKeepList the object to be saved
     */    
    public void savePropertyKeepList(PropertyKeepList propertyKeepList);

    /**
     * Removes a propertyKeepList from the database by id
     * @param id the propertyKeepList's id
     */
    public void removePropertyKeepList(final String id);
}

