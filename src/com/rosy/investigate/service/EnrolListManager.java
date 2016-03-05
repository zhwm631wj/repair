
package com.rosy.investigate.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.investigate.model.EnrolList;
import com.rosy.investigate.dao.EnrolListDao;

public interface EnrolListManager extends Manager {
    /**
     * Retrieves all of the enrolLists
     */
    public List getEnrolLists(EnrolList enrolList);

    /**
     * Gets enrolList's information based on id.
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

