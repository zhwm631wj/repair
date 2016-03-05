
package com.rosy.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.model.SysLog;
import com.rosy.dao.SysLogDao;
import com.rosy.service.SysLogManager;

public class SysLogManagerImpl extends BaseManager implements SysLogManager {
    private SysLogDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setSysLogDao(SysLogDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.service.SysLogManager#getSysLogs(com.rosy.model.SysLog)
     */
    public List getSysLogs(final SysLog sysLog) {
        return dao.getSysLogs(sysLog);
    }

    /**
     * @see com.rosy.service.SysLogManager#getSysLog(String id)
     */
    public SysLog getSysLog(final String id) {
        return dao.getSysLog(new String(id));
    }

    /**
     * @see com.rosy.service.SysLogManager#saveSysLog(SysLog sysLog)
     */
    public void saveSysLog(SysLog sysLog) {
    	 if(StringUtils.isEmpty(sysLog.getId())){
    		 sysLog.setId(null);
    		 sysLog.setCreateDate(new Date(System.currentTimeMillis()));
    		 sysLog.setRflag(Constants.ACTION);
    	 }
        dao.saveSysLog(sysLog);
    }

    /**
     * @see com.rosy.service.SysLogManager#removeSysLog(String id)
     */
    public void removeSysLog(final String id) {
        dao.removeSysLog(new String(id));
    }
}
