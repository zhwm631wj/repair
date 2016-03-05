
package com.rosy.investigate.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.investigate.model.OtherCert;
import com.rosy.investigate.dao.OtherCertDao;

public interface OtherCertManager extends Manager {
    /**
     * Retrieves all of the otherCerts
     */
    public List getOtherCerts(OtherCert otherCert);

    /**
     * Gets otherCert's information based on id.
     * @param id the otherCert's id
     * @return otherCert populated otherCert object
     */
    public OtherCert getOtherCert(final String id);

    /**
     * Saves a otherCert's information
     * @param otherCert the object to be saved
     */
    public void saveOtherCert(OtherCert otherCert);

    /**
     * Removes a otherCert from the database by id
     * @param id the otherCert's id
     */
    public void removeOtherCert(final String id);
}

