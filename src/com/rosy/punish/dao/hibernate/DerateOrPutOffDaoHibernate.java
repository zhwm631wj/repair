
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.DerateOrPutOff;
import com.rosy.punish.dao.DerateOrPutOffDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class DerateOrPutOffDaoHibernate extends BaseDaoHibernate implements DerateOrPutOffDao {

    /**
     * @see com.rosy.punish.dao.DerateOrPutOffDao#getDerateOrPutOffs(com.rosy.punish.model.DerateOrPutOff)
     */
    public List getDerateOrPutOffs(final DerateOrPutOff derateOrPutOff) {
        return getHibernateTemplate().find("from DerateOrPutOff");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (derateOrPutOff == null) {
            return getHibernateTemplate().find("from DerateOrPutOff");
        } else {
            // filter on properties set in the derateOrPutOff
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(derateOrPutOff).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(DerateOrPutOff.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.DerateOrPutOffDao#getDerateOrPutOff(String id)
     */
    public DerateOrPutOff getDerateOrPutOff(final String id) {
        DerateOrPutOff derateOrPutOff = (DerateOrPutOff) getHibernateTemplate().get(DerateOrPutOff.class, id);
        if (derateOrPutOff == null) {
            log.warn("uh oh, derateOrPutOff with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(DerateOrPutOff.class, id);
        }

        return derateOrPutOff;
    }

    /**
     * @see com.rosy.punish.dao.DerateOrPutOffDao#saveDerateOrPutOff(DerateOrPutOff derateOrPutOff)
     */    
    public void saveDerateOrPutOff(final DerateOrPutOff derateOrPutOff) {
        getHibernateTemplate().saveOrUpdate(derateOrPutOff);
    }

    /**
     * @see com.rosy.punish.dao.DerateOrPutOffDao#removeDerateOrPutOff(String id)
     */
    public void removeDerateOrPutOff(final String id) {
        getHibernateTemplate().delete(getDerateOrPutOff(id));
    }
}
