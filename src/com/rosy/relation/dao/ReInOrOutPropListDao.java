
package com.rosy.relation.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.relation.model.ReInOrOutPropList;

public interface ReInOrOutPropListDao extends Dao {

    /**
     * Retrieves all of the reInOrOutPropLists
     */
    public List getReInOrOutPropLists(ReInOrOutPropList reInOrOutPropList);

    /**
     * Gets reInOrOutPropList's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

