
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.HandoverCase;
import com.rosy.punish.dao.HandoverCaseDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class HandoverCaseDaoHibernate extends BaseDaoHibernate implements HandoverCaseDao {

    /**
     * @see com.rosy.punish.dao.HandoverCaseDao#getHandoverCases(com.rosy.punish.model.HandoverCase)
     */
    public List getHandoverCases(final HandoverCase handoverCase) {
        return getHibernateTemplate().find("from HandoverCase");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (handoverCase == null) {
            return getHibernateTemplate().find("from HandoverCase");
        } else {
            // filter on properties set in the handoverCase
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(handoverCase).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(HandoverCase.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.HandoverCaseDao#getHandoverCase(String id)
     */
    public HandoverCase getHandoverCase(final String id) {
        HandoverCase handoverCase = (HandoverCase) getHibernateTemplate().get(HandoverCase.class, id);
        if (handoverCase == null) {
            log.warn("uh oh, handoverCase with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(HandoverCase.class, id);
        }

        return handoverCase;
    }

    /**
     * @see com.rosy.punish.dao.HandoverCaseDao#saveHandoverCase(HandoverCase handoverCase)
     */    
    public void saveHandoverCase(final HandoverCase handoverCase) {
        getHibernateTemplate().saveOrUpdate(handoverCase);
    }

    /**
     * @see com.rosy.punish.dao.HandoverCaseDao#removeHandoverCase(String id)
     */
    public void removeHandoverCase(final String id) {
        getHibernateTemplate().delete(getHandoverCase(id));
    }
}
