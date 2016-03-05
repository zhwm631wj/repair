
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.HearOfWitnesse;
import com.rosy.punish.dao.HearOfWitnesseDao;
import com.rosy.punish.service.HearOfWitnesseManager;

public class HearOfWitnesseManagerImpl extends BaseManager implements HearOfWitnesseManager {
    private HearOfWitnesseDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setHearOfWitnesseDao(HearOfWitnesseDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.HearOfWitnesseManager#getHearOfWitnesses(com.rosy.punish.model.HearOfWitnesse)
     */
    public List getHearOfWitnesses(final HearOfWitnesse hearOfWitnesse) {
        return dao.getHearOfWitnesses(hearOfWitnesse);
    }

    /**
     * @see com.rosy.punish.service.HearOfWitnesseManager#getHearOfWitnesse(String id)
     */
    public HearOfWitnesse getHearOfWitnesse(final String id) {
        return dao.getHearOfWitnesse(new String(id));
    }

    /**
     * @see com.rosy.punish.service.HearOfWitnesseManager#saveHearOfWitnesse(HearOfWitnesse hearOfWitnesse)
     */
    public void saveHearOfWitnesse(HearOfWitnesse hearOfWitnesse) {
    	if(StringUtils.isEmpty(hearOfWitnesse.getId())){
    		hearOfWitnesse.setId(null);
    		hearOfWitnesse.setCreateDate(new Date(System.currentTimeMillis()));
    		hearOfWitnesse.setRflag(Constants.ACTION);
      	 }
        dao.saveHearOfWitnesse(hearOfWitnesse);
    }

    /**
     * @see com.rosy.punish.service.HearOfWitnesseManager#removeHearOfWitnesse(String id)
     */
    public void removeHearOfWitnesse(final String id) {
        dao.removeHearOfWitnesse(new String(id));
    }
}
