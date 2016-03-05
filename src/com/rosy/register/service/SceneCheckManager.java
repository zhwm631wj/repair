
package com.rosy.register.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.register.model.SceneCheck;
import com.rosy.register.dao.SceneCheckDao;

public interface SceneCheckManager extends Manager {
    /**
     * Retrieves all of the sceneChecks
     */
    public List getSceneChecks(SceneCheck sceneCheck);

    /**
     * Gets sceneCheck's information based on id.
     * @param id the sceneCheck's id
     * @return sceneCheck populated sceneCheck object
     */
    public SceneCheck getSceneCheck(final String id);

    /**
     * Saves a sceneCheck's information
     * @param sceneCheck the object to be saved
     */
    public void saveSceneCheck(SceneCheck sceneCheck);

    /**
     * Removes a sceneCheck from the database by id
     * @param id the sceneCheck's id
     */
    public void removeSceneCheck(final String id);
}

