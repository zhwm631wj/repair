
package com.rosy.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.model.SysLog;
import com.rosy.dao.SysLogDao;

public interface SysLogManager extends Manager {
    /**
     * Retrieves all of the sysLogs
     */
    public List getSysLogs(SysLog sysLog);

    /**
     * Gets sysLog's information based on id.
     * @param id the sysLog's id
     * @return sysLog populated sysLog object
     */
    public SysLog getSysLog(final String id);

    /**
     * Saves a sysLog's information
     * @param sysLog the object to be saved
     */
    public void saveSysLog(SysLog sysLog);

    /**
     * Removes a sysLog from the database by id
     * @param id the sysLog's id
     */
    public void removeSysLog(final String id);
}

