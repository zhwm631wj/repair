
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.VerifyCheckup;
import com.rosy.punish.dao.VerifyCheckupDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class VerifyCheckupDaoHibernate extends BaseDaoHibernate implements VerifyCheckupDao {

    /**
     * @see com.rosy.punish.dao.VerifyCheckupDao#getVerifyCheckups(com.rosy.punish.model.VerifyCheckup)
     */
    public List getVerifyCheckups(final VerifyCheckup verifyCheckup) {
        return getHibernateTemplate().find("from VerifyCheckup");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (verifyCheckup == null) {
            return getHibernateTemplate().find("from VerifyCheckup");
        } else {
            // filter on properties set in the verifyCheckup
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(verifyCheckup).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(VerifyCheckup.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.VerifyCheckupDao#getVerifyCheckup(String id)
     */
    public VerifyCheckup getVerifyCheckup(final String id) {
        VerifyCheckup verifyCheckup = (VerifyCheckup) getHibernateTemplate().get(VerifyCheckup.class, id);
        if (verifyCheckup == null) {
            log.warn("uh oh, verifyCheckup with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(VerifyCheckup.class, id);
        }

        return verifyCheckup;
    }

    /**
     * @see com.rosy.punish.dao.VerifyCheckupDao#saveVerifyCheckup(VerifyCheckup verifyCheckup)
     */    
    public void saveVerifyCheckup(final VerifyCheckup verifyCheckup) {
        getHibernateTemplate().saveOrUpdate(verifyCheckup);
    }

    /**
     * @see com.rosy.punish.dao.VerifyCheckupDao#removeVerifyCheckup(String id)
     */
    public void removeVerifyCheckup(final String id) {
        getHibernateTemplate().delete(getVerifyCheckup(id));
    }
}
