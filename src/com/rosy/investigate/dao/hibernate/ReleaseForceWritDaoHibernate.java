
package com.rosy.investigate.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.investigate.model.ReleaseForceWrit;
import com.rosy.investigate.dao.ReleaseForceWritDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class ReleaseForceWritDaoHibernate extends BaseDaoHibernate implements ReleaseForceWritDao {

    /**
     * @see com.rosy.investigate.dao.ReleaseForceWritDao#getReleaseForceWrits(com.rosy.investigate.model.ReleaseForceWrit)
     */
    public List getReleaseForceWrits(final ReleaseForceWrit releaseForceWrit) {
        return getHibernateTemplate().find("from ReleaseForceWrit");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (releaseForceWrit == null) {
            return getHibernateTemplate().find("from ReleaseForceWrit");
        } else {
            // filter on properties set in the releaseForceWrit
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(releaseForceWrit).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ReleaseForceWrit.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.investigate.dao.ReleaseForceWritDao#getReleaseForceWrit(String id)
     */
    public ReleaseForceWrit getReleaseForceWrit(final String id) {
        ReleaseForceWrit releaseForceWrit = (ReleaseForceWrit) getHibernateTemplate().get(ReleaseForceWrit.class, id);
        if (releaseForceWrit == null) {
            log.warn("uh oh, releaseForceWrit with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ReleaseForceWrit.class, id);
        }

        return releaseForceWrit;
    }

    /**
     * @see com.rosy.investigate.dao.ReleaseForceWritDao#saveReleaseForceWrit(ReleaseForceWrit releaseForceWrit)
     */    
    public void saveReleaseForceWrit(final ReleaseForceWrit releaseForceWrit) {
        getHibernateTemplate().saveOrUpdate(releaseForceWrit);
    }

    /**
     * @see com.rosy.investigate.dao.ReleaseForceWritDao#removeReleaseForceWrit(String id)
     */
    public void removeReleaseForceWrit(final String id) {
        getHibernateTemplate().delete(getReleaseForceWrit(id));
    }
}
