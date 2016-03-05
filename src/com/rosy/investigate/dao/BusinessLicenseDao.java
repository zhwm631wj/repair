
package com.rosy.investigate.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.investigate.model.BusinessLicense;

public interface BusinessLicenseDao extends Dao {

    /**
     * Retrieves all of the businessLicenses
     */
    public List getBusinessLicenses(BusinessLicense businessLicense);

    /**
     * Gets businessLicense's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the businessLicense's id
     * @return businessLicense populated businessLicense object
     */
    public BusinessLicense getBusinessLicense(final String id);

    /**
     * Saves a businessLicense's information
     * @param businessLicense the object to be saved
     */    
    public void saveBusinessLicense(BusinessLicense businessLicense);

    /**
     * Removes a businessLicense from the database by id
     * @param id the businessLicense's id
     */
    public void removeBusinessLicense(final String id);
}

