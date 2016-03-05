
package com.rosy.investigate.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.investigate.model.ForceWrit;
import com.rosy.investigate.dao.ForceWritDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class ForceWritDaoHibernate extends BaseDaoHibernate implements ForceWritDao {

    /**
     * @see com.rosy.investigate.dao.ForceWritDao#getForceWrits(com.rosy.investigate.model.ForceWrit)
     */
    public List getForceWrits(final ForceWrit forceWrit) {
        return getHibernateTemplate().find("from ForceWrit");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (forceWrit == null) {
            return getHibernateTemplate().find("from ForceWrit");
        } else {
            // filter on properties set in the forceWrit
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(forceWrit).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ForceWrit.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.investigate.dao.ForceWritDao#getForceWrit(String id)
     */
    public ForceWrit getForceWrit(final String id) {
        ForceWrit forceWrit = (ForceWrit) getHibernateTemplate().get(ForceWrit.class, id);
        if (forceWrit == null) {
            log.warn("uh oh, forceWrit with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ForceWrit.class, id);
        }

        return forceWrit;
    }

    /**
     * @see com.rosy.investigate.dao.ForceWritDao#saveForceWrit(ForceWrit forceWrit)
     */    
    public void saveForceWrit(final ForceWrit forceWrit) {
        getHibernateTemplate().saveOrUpdate(forceWrit);
    }

    /**
     * @see com.rosy.investigate.dao.ForceWritDao#removeForceWrit(String id)
     */
    public void removeForceWrit(final String id) {
        getHibernateTemplate().delete(getForceWrit(id));
    }
}
