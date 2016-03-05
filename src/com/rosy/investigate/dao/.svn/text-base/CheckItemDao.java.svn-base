
package com.rosy.investigate.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.investigate.model.CheckItem;

public interface CheckItemDao extends Dao {

    /**
     * Retrieves all of the checkItems
     */
    public List getCheckItems(CheckItem checkItem);

    /**
     * Gets checkItem's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the checkItem's id
     * @return checkItem populated checkItem object
     */
    public CheckItem getCheckItem(final String id);

    /**
     * Saves a checkItem's information
     * @param checkItem the object to be saved
     */    
    public void saveCheckItem(CheckItem checkItem);

    /**
     * Removes a checkItem from the database by id
     * @param id the checkItem's id
     */
    public void removeCheckItem(final String id);
}

