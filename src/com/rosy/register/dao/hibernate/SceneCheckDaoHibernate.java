
package com.rosy.register.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.register.model.SceneCheck;
import com.rosy.register.dao.SceneCheckDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class SceneCheckDaoHibernate extends BaseDaoHibernate implements SceneCheckDao {

    /**
     * @see com.rosy.register.dao.SceneCheckDao#getSceneChecks(com.rosy.register.model.SceneCheck)
     */
    public List getSceneChecks(final SceneCheck sceneCheck) {
        return getHibernateTemplate().find("from SceneCheck");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (sceneCheck == null) {
            return getHibernateTemplate().find("from SceneCheck");
        } else {
            // filter on properties set in the sceneCheck
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(sceneCheck).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(SceneCheck.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.register.dao.SceneCheckDao#getSceneCheck(String id)
     */
    public SceneCheck getSceneCheck(final String id) {
        SceneCheck sceneCheck = (SceneCheck) getHibernateTemplate().get(SceneCheck.class, id);
        if (sceneCheck == null) {
            log.warn("uh oh, sceneCheck with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(SceneCheck.class, id);
        }

        return sceneCheck;
    }

    /**
     * @see com.rosy.register.dao.SceneCheckDao#saveSceneCheck(SceneCheck sceneCheck)
     */    
    public void saveSceneCheck(final SceneCheck sceneCheck) {
        getHibernateTemplate().saveOrUpdate(sceneCheck);
    }

    /**
     * @see com.rosy.register.dao.SceneCheckDao#removeSceneCheck(String id)
     */
    public void removeSceneCheck(final String id) {
        getHibernateTemplate().delete(getSceneCheck(id));
    }
}
