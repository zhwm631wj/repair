
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.AffixToPunish;
import com.rosy.punish.dao.AffixToPunishDao;
import com.rosy.punish.service.AffixToPunishManager;

public class AffixToPunishManagerImpl extends BaseManager implements AffixToPunishManager {
    private AffixToPunishDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setAffixToPunishDao(AffixToPunishDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.AffixToPunishManager#getAffixToPunishs(com.rosy.punish.model.AffixToPunish)
     */
    public List getAffixToPunishs(final AffixToPunish affixToPunish) {
        return dao.getAffixToPunishs(affixToPunish);
    }

    /**
     * @see com.rosy.punish.service.AffixToPunishManager#getAffixToPunish(String id)
     */
    public AffixToPunish getAffixToPunish(final String id) {
        return dao.getAffixToPunish(new String(id));
    }

    /**
     * @see com.rosy.punish.service.AffixToPunishManager#saveAffixToPunish(AffixToPunish affixToPunish)
     */
    public void saveAffixToPunish(AffixToPunish affixToPunish) {
    	if(StringUtils.isEmpty(affixToPunish.getId())){
    		affixToPunish.setId(null);
    		affixToPunish.setCreateDate(new Date(System.currentTimeMillis()));
    		affixToPunish.setRflag(Constants.ACTION);
   	 }
        dao.saveAffixToPunish(affixToPunish);
    }

    /**
     * @see com.rosy.punish.service.AffixToPunishManager#removeAffixToPunish(String id)
     */
    public void removeAffixToPunish(final String id) {
        dao.removeAffixToPunish(new String(id));
    }
}
