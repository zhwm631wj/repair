
package com.rosy.investigate.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.investigate.model.CheckupProxy;
import com.rosy.investigate.dao.CheckupProxyDao;
import com.rosy.investigate.service.CheckupProxyManager;

public class CheckupProxyManagerImpl extends BaseManager implements CheckupProxyManager {
    private CheckupProxyDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setCheckupProxyDao(CheckupProxyDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.investigate.service.CheckupProxyManager#getCheckupProxys(com.rosy.investigate.model.CheckupProxy)
     */
    public List getCheckupProxys(final CheckupProxy checkupProxy) {
        return dao.getCheckupProxys(checkupProxy);
    }

    /**
     * @see com.rosy.investigate.service.CheckupProxyManager#getCheckupProxy(String id)
     */
    public CheckupProxy getCheckupProxy(final String id) {
        return dao.getCheckupProxy(new String(id));
    }

    /**
     * @see com.rosy.investigate.service.CheckupProxyManager#saveCheckupProxy(CheckupProxy checkupProxy)
     */
    public void saveCheckupProxy(CheckupProxy checkupProxy) {
    	if(StringUtils.isEmpty(checkupProxy.getId())){
    		checkupProxy.setId(null);
    		checkupProxy.setCreateDate(new Date(System.currentTimeMillis()));
    		checkupProxy.setRflag(Constants.ACTION);
      	 }
        dao.saveCheckupProxy(checkupProxy);
    }

    /**
     * @see com.rosy.investigate.service.CheckupProxyManager#removeCheckupProxy(String id)
     */
    public void removeCheckupProxy(final String id) {
        dao.removeCheckupProxy(new String(id));
    }
}
