
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.PunishDecisionBook;
import com.rosy.punish.dao.PunishDecisionBookDao;
import com.rosy.punish.service.PunishDecisionBookManager;

public class PunishDecisionBookManagerImpl extends BaseManager implements PunishDecisionBookManager {
    private PunishDecisionBookDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setPunishDecisionBookDao(PunishDecisionBookDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.PunishDecisionBookManager#getPunishDecisionBooks(com.rosy.punish.model.PunishDecisionBook)
     */
    public List getPunishDecisionBooks(final PunishDecisionBook punishDecisionBook) {
        return dao.getPunishDecisionBooks(punishDecisionBook);
    }

    /**
     * @see com.rosy.punish.service.PunishDecisionBookManager#getPunishDecisionBook(String id)
     */
    public PunishDecisionBook getPunishDecisionBook(final String id) {
        return dao.getPunishDecisionBook(new String(id));
    }

    /**
     * @see com.rosy.punish.service.PunishDecisionBookManager#savePunishDecisionBook(PunishDecisionBook punishDecisionBook)
     */
    public void savePunishDecisionBook(PunishDecisionBook punishDecisionBook) {
    	if(StringUtils.isEmpty(punishDecisionBook.getId())){
    		punishDecisionBook.setId(null);
      		punishDecisionBook.setCreateDate(new Date(System.currentTimeMillis()));
      		punishDecisionBook.setRflag(Constants.ACTION);
      	 }
        dao.savePunishDecisionBook(punishDecisionBook);
    }

    /**
     * @see com.rosy.punish.service.PunishDecisionBookManager#removePunishDecisionBook(String id)
     */
    public void removePunishDecisionBook(final String id) {
        dao.removePunishDecisionBook(new String(id));
    }
}
