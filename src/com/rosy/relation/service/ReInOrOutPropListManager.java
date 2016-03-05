
package com.rosy.relation.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.relation.model.ReInOrOutPropList;
import com.rosy.relation.dao.ReInOrOutPropListDao;

public interface ReInOrOutPropListManager extends Manager {
    /**
     * Retrieves all of the reInOrOutPropLists
     */
    public List getReInOrOutPropLists(ReInOrOutPropList reInOrOutPropList);

    /**
     * Gets reInOrOutPropList's information based on id.
     * @param id the reInOrOutPropList's id
     * @return reInOrOutPropList populated reInOrOutPropList object
     */
    public ReInOrOutPropList getReInOrOutPropList(final String id);

    /**
     * Saves a reInOrOutPropList's information
     * @param reInOrOutPropList the object to be saved
     */
    public void saveReInOrOutPropList(ReInOrOutPropList reInOrOutPropList);

    /**
     * Removes a reInOrOutPropList from the database by id
     * @param id the reInOrOutPropList's id
     */
    public void removeReInOrOutPropList(final String id);
}

