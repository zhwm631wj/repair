
package com.rosy.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.model.ApcaOrganization;
import com.rosy.dao.ApcaOrganizationDao;
import com.rosy.service.ApcaOrganizationManager;

public class ApcaOrganizationManagerImpl extends BaseManager implements ApcaOrganizationManager {
    private ApcaOrganizationDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setApcaOrganizationDao(ApcaOrganizationDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.service.ApcaOrganizationManager#getApcaOrganizations(com.rosy.model.ApcaOrganization)
     */
    public List getApcaOrganizations(final ApcaOrganization apcaOrganization) {
        return dao.getApcaOrganizations(apcaOrganization);
    }

    /**
     * @see com.rosy.service.ApcaOrganizationManager#getApcaOrganization(String id)
     */
    public ApcaOrganization getApcaOrganization(final String id) {
        return dao.getApcaOrganization(new String(id));
    }

    /**
     * @see com.rosy.service.ApcaOrganizationManager#saveApcaOrganization(ApcaOrganization apcaOrganization)
     */
    public void saveApcaOrganization(ApcaOrganization apcaOrganization) {
    	 if(StringUtils.isEmpty(apcaOrganization.getId())){
    		 apcaOrganization.setId(null);
    		 apcaOrganization.setCreateDate(new Date(System.currentTimeMillis()));
    		 apcaOrganization.setRflag(Constants.ACTION);
    	 }
        dao.saveApcaOrganization(apcaOrganization);
    }

    /**
     * @see com.rosy.service.ApcaOrganizationManager#removeApcaOrganization(String id)
     */
    public void removeApcaOrganization(final String id) {
    
        dao.removeApcaOrganization(new String(id));
    }

    /**
     * 根据单位等级 获得等最高级的单位
     * @param id
     * @param rank
     * @return
     */
	public List getFirstUnit() {
		ApcaOrganization apcaOrganization =new ApcaOrganization();
		apcaOrganization.setOrgRank("0");
		apcaOrganization.setRflag(Constants.ACTION);
		return dao.getApcaOrganizationsByQuery(apcaOrganization);
	}

    /**
     * 根据单位等级 获得该级别的所有的单位
     * @param id
     * @param rank
     * @return
     */
	public List getUnitByRank(String higherOrgId) {
		ApcaOrganization apcaOrganization =new ApcaOrganization();
		//apcaOrganization.setOrgRank(rank);
		apcaOrganization.setHigherOrg(higherOrgId);
		apcaOrganization.setRflag(Constants.ACTION);
		return dao.getApcaOrganizationsByQuery(apcaOrganization);
	}
}
