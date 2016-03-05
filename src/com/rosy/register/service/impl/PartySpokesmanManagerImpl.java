
package com.rosy.register.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.register.model.PartySpokesman;
import com.rosy.register.dao.PartySpokesmanDao;
import com.rosy.register.service.PartySpokesmanManager;

public class PartySpokesmanManagerImpl extends BaseManager implements PartySpokesmanManager {
    private PartySpokesmanDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setPartySpokesmanDao(PartySpokesmanDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.register.service.PartySpokesmanManager#getPartySpokesmans(com.rosy.register.model.PartySpokesman)
     */
    public List getPartySpokesmans(final PartySpokesman partySpokesman) {
        return dao.getPartySpokesmans(partySpokesman);
    }

    /**
     * @see com.rosy.register.service.PartySpokesmanManager#getPartySpokesman(String id)
     */
    public PartySpokesman getPartySpokesman(final String id) {
        return dao.getPartySpokesman(new String(id));
    }

    /**
     * @see com.rosy.register.service.PartySpokesmanManager#savePartySpokesman(PartySpokesman partySpokesman)
     */
    public void savePartySpokesman(PartySpokesman partySpokesman) {
    	
    	 if(StringUtils.isEmpty(partySpokesman.getId())){
    		 partySpokesman.setId(null);
    		 partySpokesman.setCreateDate(new Date(System.currentTimeMillis()));
    		 partySpokesman.setRflag(Constants.ACTION);
    	 }
        dao.savePartySpokesman(partySpokesman);
    }

    /**
     * @see com.rosy.register.service.PartySpokesmanManager#removePartySpokesman(String id)
     */
    public void removePartySpokesman(final String id) {
        dao.removePartySpokesman(new String(id));
    }
}
