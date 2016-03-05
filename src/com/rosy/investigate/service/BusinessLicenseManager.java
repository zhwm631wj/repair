
package com.rosy.investigate.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.investigate.model.BusinessLicense;
import com.rosy.investigate.dao.BusinessLicenseDao;

public interface BusinessLicenseManager extends Manager {
    /**
     * Retrieves all of the businessLicenses
     */
    public List getBusinessLicenses(BusinessLicense businessLicense);

    /**
     * Gets businessLicense's information based on id.
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

