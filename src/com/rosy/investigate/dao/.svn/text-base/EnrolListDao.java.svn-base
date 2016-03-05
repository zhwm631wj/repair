
package com.rosy.investigate.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.investigate.model.EnrolList;

public interface EnrolListDao extends Dao {

    /**
     * Retrieves all of the enrolLists
     */
    public List getEnrolLists(EnrolList enrolList);

    /**
     * Gets enrolList's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the enrolList's id
     * @return enrolList populated enrolList object
     */
    public EnrolList getEnrolList(final String id);

    /**
     * Saves a enrolList's information
     * @param enrolList the object to be saved
     */    
    public void saveEnrolList(EnrolList enrolList);

    /**
     * Removes a enrolList from the database by id
     * @param id the enrolList's id
     */
    public void removeEnrolList(final String id);
}

