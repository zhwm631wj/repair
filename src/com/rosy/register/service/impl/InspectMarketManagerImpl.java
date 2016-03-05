
package com.rosy.register.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.register.model.InspectMarket;
import com.rosy.register.dao.InspectMarketDao;
import com.rosy.register.service.InspectMarketManager;

public class InspectMarketManagerImpl extends BaseManager implements InspectMarketManager {
    private InspectMarketDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setInspectMarketDao(InspectMarketDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.register.service.InspectMarketManager#getInspectMarkets(com.rosy.register.model.InspectMarket)
     */
    public List getInspectMarkets(final InspectMarket inspectMarket) {
        return dao.getInspectMarkets(inspectMarket);
    }

    /**
     * @see com.rosy.register.service.InspectMarketManager#getInspectMarket(String id)
     */
    public InspectMarket getInspectMarket(final String id) {
        return dao.getInspectMarket(new String(id));
    }

    /**
     * @see com.rosy.register.service.InspectMarketManager#saveInspectMarket(InspectMarket inspectMarket)
     */
    public void saveInspectMarket(InspectMarket inspectMarket) {
    	 if(StringUtils.isEmpty(inspectMarket.getId())){
    		 inspectMarket.setId(null);
    		 inspectMarket.setCreateDate(new Date(System.currentTimeMillis()));
    		 inspectMarket.setRflag(Constants.ACTION);
    	 }
        dao.saveInspectMarket(inspectMarket);
    }

    /**
     * @see com.rosy.register.service.InspectMarketManager#removeInspectMarket(String id)
     */
    public void removeInspectMarket(final String id) {
        dao.removeInspectMarket(new String(id));
    }
}
