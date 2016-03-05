
package com.rosy.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.model.SysLog;

public interface SysLogDao extends Dao {

    /**
     * Retrieves all of the sysLogs
     */
    public List getSysLogs(SysLog sysLog);

    /**
     * Gets sysLog's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

