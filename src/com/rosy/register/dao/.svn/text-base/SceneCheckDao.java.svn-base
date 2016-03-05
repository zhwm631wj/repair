
package com.rosy.register.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.register.model.SceneCheck;

public interface SceneCheckDao extends Dao {

    /**
     * Retrieves all of the sceneChecks
     */
    public List getSceneChecks(SceneCheck sceneCheck);

    /**
     * Gets sceneCheck's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

