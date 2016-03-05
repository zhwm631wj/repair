
package com.rosy.register.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.register.model.PartyInfo;
import com.rosy.register.dao.PartyInfoDao;
import com.rosy.register.service.PartyInfoManager;

public class PartyInfoManagerImpl extends BaseManager implements PartyInfoManager {
    private PartyInfoDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setPartyInfoDao(PartyInfoDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.register.service.PartyInfoManager#getPartyInfos(com.rosy.register.model.PartyInfo)
     */
    public List getPartyInfos(final PartyInfo partyInfo) {
        return dao.getPartyInfos(partyInfo);
    }

    /**
     * @see com.rosy.register.service.PartyInfoManager#getPartyInfo(String id)
     */
    public PartyInfo getPartyInfo(final String id) {
        return dao.getPartyInfo(new String(id));
    }

    /**
     * @see com.rosy.register.service.PartyInfoManager#savePartyInfo(PartyInfo partyInfo)
     */
    public void savePartyInfo(PartyInfo partyInfo) {
    	 if(StringUtils.isEmpty(partyInfo.getId())){
    		 partyInfo.setId(null);
    		 partyInfo.setCreateDate(new Date(System.currentTimeMillis()));
    		 partyInfo.setRflag(Constants.ACTION);
    	 }
        dao.savePartyInfo(partyInfo);
    }

    /**
     * @see com.rosy.register.service.PartyInfoManager#removePartyInfo(String id)
     */
    public void removePartyInfo(final String id) {
        dao.removePartyInfo(new String(id));
    }
}
