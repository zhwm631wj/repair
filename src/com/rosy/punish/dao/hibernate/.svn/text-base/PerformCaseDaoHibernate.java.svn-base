
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.PerformCase;
import com.rosy.punish.dao.PerformCaseDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class PerformCaseDaoHibernate extends BaseDaoHibernate implements PerformCaseDao {

    /**
     * @see com.rosy.punish.dao.PerformCaseDao#getPerformCases(com.rosy.punish.model.PerformCase)
     */
    public List getPerformCases(final PerformCase performCase) {
        return getHibernateTemplate().find("from PerformCase");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (performCase == null) {
            return getHibernateTemplate().find("from PerformCase");
        } else {
            // filter on properties set in the performCase
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(performCase).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(PerformCase.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.PerformCaseDao#getPerformCase(String id)
     */
    public PerformCase getPerformCase(final String id) {
        PerformCase performCase = (PerformCase) getHibernateTemplate().get(PerformCase.class, id);
        if (performCase == null) {
            log.warn("uh oh, performCase with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(PerformCase.class, id);
        }

        return performCase;
    }

    /**
     * @see com.rosy.punish.dao.PerformCaseDao#savePerformCase(PerformCase performCase)
     */    
    public void savePerformCase(final PerformCase performCase) {
        getHibernateTemplate().saveOrUpdate(performCase);
    }

    /**
     * @see com.rosy.punish.dao.PerformCaseDao#removePerformCase(String id)
     */
    public void removePerformCase(final String id) {
        getHibernateTemplate().delete(getPerformCase(id));
    }
}
