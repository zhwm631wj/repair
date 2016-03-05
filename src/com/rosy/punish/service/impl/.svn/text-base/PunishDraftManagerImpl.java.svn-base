
package com.rosy.punish.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.punish.model.PunishDraft;
import com.rosy.punish.dao.PunishDraftDao;
import com.rosy.punish.service.PunishDraftManager;

public class PunishDraftManagerImpl extends BaseManager implements PunishDraftManager {
    private PunishDraftDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setPunishDraftDao(PunishDraftDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.punish.service.PunishDraftManager#getPunishDrafts(com.rosy.punish.model.PunishDraft)
     */
    public List getPunishDrafts(final PunishDraft punishDraft) {
        return dao.getPunishDrafts(punishDraft);
    }

    /**
     * @see com.rosy.punish.service.PunishDraftManager#getPunishDraft(String id)
     */
    public PunishDraft getPunishDraft(final String id) {
        return dao.getPunishDraft(new String(id));
    }

    /**
     * @see com.rosy.punish.service.PunishDraftManager#savePunishDraft(PunishDraft punishDraft)
     */
    public void savePunishDraft(PunishDraft punishDraft) {
    	if(StringUtils.isEmpty(punishDraft.getId())){
    		punishDraft.setId(null);
    		punishDraft.setCreateDate(new Date(System.currentTimeMillis()));
    		punishDraft.setRflag(Constants.ACTION);
      	 }
        dao.savePunishDraft(punishDraft);
    }

    /**
     * @see com.rosy.punish.service.PunishDraftManager#removePunishDraft(String id)
     */
    public void removePunishDraft(final String id) {
        dao.removePunishDraft(new String(id));
    }
}
