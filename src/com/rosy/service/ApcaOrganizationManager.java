
package com.rosy.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.model.ApcaOrganization;
import com.rosy.dao.ApcaOrganizationDao;

public interface ApcaOrganizationManager extends Manager {
    /**
     * Retrieves all of the apcaOrganizations
     */
    public List getApcaOrganizations(ApcaOrganization apcaOrganization);

    /**
     * Gets apcaOrganization's information based on id.
     * @param id the apcaOrganization's id
     * @return apcaOrganization populated apcaOrganization object
     */
    public ApcaOrganization getApcaOrganization(final String id);

    /**
     * Saves a apcaOrganization's information
     * @param apcaOrganization the object to be saved
     */
    public void saveApcaOrganization(ApcaOrganization apcaOrganization);

    /**
     * Removes a apcaOrganization from the database by id
     * @param id the apcaOrganization's id
     */
    public void removeApcaOrganization(final String id);
    
    /**
     * 根据单位等级 获得该级别的所有的单位
     * @param id
     * @param rank
     * @return
     */
    public List getUnitByRank(final String higherOrgId);
    
    /**
     * 根据单位等级 获得等最高级的单位
     * @param id
     * @param rank
     * @return
     */
    public List getFirstUnit();
}

