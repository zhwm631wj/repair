
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.DiscussCaseRec;
import com.rosy.punish.dao.DiscussCaseRecDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class DiscussCaseRecDaoHibernate extends BaseDaoHibernate implements DiscussCaseRecDao {

    /**
     * @see com.rosy.punish.dao.DiscussCaseRecDao#getDiscussCaseRecs(com.rosy.punish.model.DiscussCaseRec)
     */
    public List getDiscussCaseRecs(final DiscussCaseRec discussCaseRec) {
        return getHibernateTemplate().find("from DiscussCaseRec");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (discussCaseRec == null) {
            return getHibernateTemplate().find("from DiscussCaseRec");
        } else {
            // filter on properties set in the discussCaseRec
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(discussCaseRec).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(DiscussCaseRec.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.DiscussCaseRecDao#getDiscussCaseRec(String id)
     */
    public DiscussCaseRec getDiscussCaseRec(final String id) {
        DiscussCaseRec discussCaseRec = (DiscussCaseRec) getHibernateTemplate().get(DiscussCaseRec.class, id);
        if (discussCaseRec == null) {
            log.warn("uh oh, discussCaseRec with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(DiscussCaseRec.class, id);
        }

        return discussCaseRec;
    }

    /**
     * @see com.rosy.punish.dao.DiscussCaseRecDao#saveDiscussCaseRec(DiscussCaseRec discussCaseRec)
     */    
    public void saveDiscussCaseRec(final DiscussCaseRec discussCaseRec) {
        getHibernateTemplate().saveOrUpdate(discussCaseRec);
    }

    /**
     * @see com.rosy.punish.dao.DiscussCaseRecDao#removeDiscussCaseRec(String id)
     */
    public void removeDiscussCaseRec(final String id) {
        getHibernateTemplate().delete(getDiscussCaseRec(id));
    }
}
