
package com.rosy.investigate.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.investigate.model.CheckItem;
import com.rosy.investigate.dao.CheckItemDao;

public interface CheckItemManager extends Manager {
    /**
     * Retrieves all of the checkItems
     */
    public List getCheckItems(CheckItem checkItem);

    /**
     * Gets checkItem's information based on id.
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

