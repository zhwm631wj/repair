
package com.rosy.register.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.register.model.RegisterApproval;
import com.rosy.register.dao.RegisterApprovalDao;
import com.rosy.register.service.RegisterApprovalManager;

public class RegisterApprovalManagerImpl extends BaseManager implements RegisterApprovalManager {
    private RegisterApprovalDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setRegisterApprovalDao(RegisterApprovalDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.register.service.RegisterApprovalManager#getRegisterApprovals(com.rosy.register.model.RegisterApproval)
     */
    public List getRegisterApprovals(final RegisterApproval registerApproval) {
        return dao.getRegisterApprovals(registerApproval);
    }

    /**
     * @see com.rosy.register.service.RegisterApprovalManager#getRegisterApproval(String id)
     */
    public RegisterApproval getRegisterApproval(final String id) {
        return dao.getRegisterApproval(new String(id));
    }

    /**
     * @see com.rosy.register.service.RegisterApprovalManager#saveRegisterApproval(RegisterApproval registerApproval)
     */
    public void saveRegisterApproval(RegisterApproval registerApproval) {
    	 if(StringUtils.isEmpty(registerApproval.getId())){
    		 registerApproval.setId(null);
    		 registerApproval.setCreateDate(new Date(System.currentTimeMillis()));
    		 registerApproval.setRflag(Constants.ACTION);
    	 }
        dao.saveRegisterApproval(registerApproval);
    }

    /**
     * @see com.rosy.register.service.RegisterApprovalManager#removeRegisterApproval(String id)
     */
    public void removeRegisterApproval(final String id) {
        dao.removeRegisterApproval(new String(id));
    }
}
