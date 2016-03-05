
package com.rosy.investigate.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.investigate.dao.OtherCertDao;
import com.rosy.investigate.model.OtherCert;
import com.rosy.investigate.service.OtherCertManager;
import com.rosy.service.impl.BaseManager;

public class OtherCertManagerImpl extends BaseManager implements OtherCertManager {
    private OtherCertDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setOtherCertDao(OtherCertDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.investigate.service.OtherCertManager#getOtherCerts(com.rosy.investigate.model.OtherCert)
     */
    public List getOtherCerts(final OtherCert otherCert) {
        return dao.getOtherCerts(otherCert);
    }

    /**
     * @see com.rosy.investigate.service.OtherCertManager#getOtherCert(String id)
     */
    public OtherCert getOtherCert(final String id) {
        return dao.getOtherCert(new String(id));
    }

    /**
     * @see com.rosy.investigate.service.OtherCertManager#saveOtherCert(OtherCert otherCert)
     */
    public void saveOtherCert(OtherCert otherCert) {
    	if(StringUtils.isEmpty(otherCert.getId())){
    		otherCert.setId(null);
    		otherCert.setCreateDate(new Date(System.currentTimeMillis()));
    		otherCert.setRflag(Constants.ACTION);
      	 }
        dao.saveOtherCert(otherCert);
    }

    /**
     * @see com.rosy.investigate.service.OtherCertManager#removeOtherCert(String id)
     */
    public void removeOtherCert(final String id) {
        dao.removeOtherCert(new String(id));
    }
}
