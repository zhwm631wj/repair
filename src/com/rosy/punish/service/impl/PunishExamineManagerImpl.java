
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.PunishExamine;
import com.rosy.punish.dao.PunishExamineDao;
import com.rosy.punish.service.PunishExamineManager;

public class PunishExamineManagerImpl extends BaseManager implements PunishExamineManager {
    private PunishExamineDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setPunishExamineDao(PunishExamineDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.PunishExamineManager#getPunishExamines(com.rosy.punish.model.PunishExamine)
     */
    public List getPunishExamines(final PunishExamine punishExamine) {
        return dao.getPunishExamines(punishExamine);
    }

    /**
     * @see com.rosy.punish.service.PunishExamineManager#getPunishExamine(String id)
     */
    public PunishExamine getPunishExamine(final String id) {
        return dao.getPunishExamine(new String(id));
    }

    /**
     * @see com.rosy.punish.service.PunishExamineManager#savePunishExamine(PunishExamine punishExamine)
     */
    public void savePunishExamine(PunishExamine punishExamine) {
    	if(StringUtils.isEmpty(punishExamine.getId())){
    		punishExamine.setId(null);
    		punishExamine.setCreateDate(new Date(System.currentTimeMillis()));
    		punishExamine.setRflag(Constants.ACTION);
      	 }
        dao.savePunishExamine(punishExamine);
    }

    /**
     * @see com.rosy.punish.service.PunishExamineManager#removePunishExamine(String id)
     */
    public void removePunishExamine(final String id) {
        dao.removePunishExamine(new String(id));
    }
}
