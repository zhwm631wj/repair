
package com.rosy.investigate.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.investigate.model.BusinessLicense;
import com.rosy.investigate.dao.BusinessLicenseDao;
import com.rosy.investigate.service.BusinessLicenseManager;

public class BusinessLicenseManagerImpl extends BaseManager implements BusinessLicenseManager {
    private BusinessLicenseDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setBusinessLicenseDao(BusinessLicenseDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.investigate.service.BusinessLicenseManager#getBusinessLicenses(com.rosy.investigate.model.BusinessLicense)
     */
    public List getBusinessLicenses(final BusinessLicense businessLicense) {
        return dao.getBusinessLicenses(businessLicense);
    }

    /**
     * @see com.rosy.investigate.service.BusinessLicenseManager#getBusinessLicense(String id)
     */
    public BusinessLicense getBusinessLicense(final String id) {
        return dao.getBusinessLicense(new String(id));
    }

    /**
     * @see com.rosy.investigate.service.BusinessLicenseManager#saveBusinessLicense(BusinessLicense businessLicense)
     */
    public void saveBusinessLicense(BusinessLicense businessLicense) {
    	if(StringUtils.isEmpty(businessLicense.getId())){
    		businessLicense.setId(null);
    		businessLicense.setCreateDate(new Date(System.currentTimeMillis()));
    		businessLicense.setRflag(Constants.ACTION);
      	 }
        dao.saveBusinessLicense(businessLicense);
    }

    /**
     * @see com.rosy.investigate.service.BusinessLicenseManager#removeBusinessLicense(String id)
     */
    public void removeBusinessLicense(final String id) {
        dao.removeBusinessLicense(new String(id));
    }
}
