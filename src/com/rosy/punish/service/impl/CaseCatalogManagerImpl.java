
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.CaseCatalog;
import com.rosy.punish.dao.CaseCatalogDao;
import com.rosy.punish.service.CaseCatalogManager;

public class CaseCatalogManagerImpl extends BaseManager implements CaseCatalogManager {
    private CaseCatalogDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setCaseCatalogDao(CaseCatalogDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.CaseCatalogManager#getCaseCatalogs(com.rosy.punish.model.CaseCatalog)
     */
    public List getCaseCatalogs(final CaseCatalog caseCatalog) {
        return dao.getCaseCatalogs(caseCatalog);
    }

    /**
     * @see com.rosy.punish.service.CaseCatalogManager#getCaseCatalog(String id)
     */
    public CaseCatalog getCaseCatalog(final String id) {
        return dao.getCaseCatalog(new String(id));
    }

    /**
     * @see com.rosy.punish.service.CaseCatalogManager#saveCaseCatalog(CaseCatalog caseCatalog)
     */
    public void saveCaseCatalog(CaseCatalog caseCatalog) {
    	if(StringUtils.isEmpty(caseCatalog.getId())){
    		caseCatalog.setId(null);
    		caseCatalog.setCreateDate(new Date(System.currentTimeMillis()));
    		caseCatalog.setRflag(Constants.ACTION);
   	 }
        dao.saveCaseCatalog(caseCatalog);
    }

    /**
     * @see com.rosy.punish.service.CaseCatalogManager#removeCaseCatalog(String id)
     */
    public void removeCaseCatalog(final String id) {
        dao.removeCaseCatalog(new String(id));
    }
}
