
package com.rosy.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.model.ApcaOrganization;

public interface ApcaOrganizationDao extends Dao {

    /**
     * Retrieves all of the apcaOrganizations
     */
    public List getApcaOrganizations(ApcaOrganization apcaOrganization);

    /**
     * Gets apcaOrganization's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the apcaOrganization's id
     * @return apcaOrganization populated apcaOrganization object
     */
    public ApcaOrganization getApcaOrganization(final String id);

    /**
     * Saves a apcaOrganization's information
     * @param apcaOrganization the object to be saved
     */    
    public void saveApcaOrganization(ApcaOrganization apcaOrganization);

    /**
     * Removes a apcaOrganization from the database by id
     * @param id the apcaOrganization's id
     */
    public void removeApcaOrganization(final String id);
    

    /**
     * Removes a apcaOrganization from the database by id
     * @param id the apcaOrganization's id
     */
    public List getApcaOrganizationsByQuery(final ApcaOrganization apcaOrganization);
}

