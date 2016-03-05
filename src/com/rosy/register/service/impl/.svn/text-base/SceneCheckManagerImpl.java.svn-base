
package com.rosy.register.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.register.model.SceneCheck;
import com.rosy.register.dao.SceneCheckDao;
import com.rosy.register.service.SceneCheckManager;

public class SceneCheckManagerImpl extends BaseManager implements SceneCheckManager {
    private SceneCheckDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setSceneCheckDao(SceneCheckDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.register.service.SceneCheckManager#getSceneChecks(com.rosy.register.model.SceneCheck)
     */
    public List getSceneChecks(final SceneCheck sceneCheck) {
        return dao.getSceneChecks(sceneCheck);
    }

    /**
     * @see com.rosy.register.service.SceneCheckManager#getSceneCheck(String id)
     */
    public SceneCheck getSceneCheck(final String id) {
        return dao.getSceneCheck(new String(id));
    }

    /**
     * @see com.rosy.register.service.SceneCheckManager#saveSceneCheck(SceneCheck sceneCheck)
     */
    public void saveSceneCheck(SceneCheck sceneCheck) {
    	 if(StringUtils.isEmpty(sceneCheck.getId())){
    		 sceneCheck.setId(null);
    		 sceneCheck.setCreateDate(new Date(System.currentTimeMillis()));
    		 sceneCheck.setRflag(Constants.ACTION);
    	 }
        dao.saveSceneCheck(sceneCheck);
    }

    /**
     * @see com.rosy.register.service.SceneCheckManager#removeSceneCheck(String id)
     */
    public void removeSceneCheck(final String id) {
        dao.removeSceneCheck(new String(id));
    }
}
