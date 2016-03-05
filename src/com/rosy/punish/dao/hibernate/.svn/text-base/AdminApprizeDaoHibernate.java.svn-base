
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.AdminApprize;
import com.rosy.punish.dao.AdminApprizeDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class AdminApprizeDaoHibernate extends BaseDaoHibernate implements AdminApprizeDao {

    /**
     * @see com.rosy.punish.dao.AdminApprizeDao#getAdminApprizes(com.rosy.punish.model.AdminApprize)
     */
    public List getAdminApprizes(final AdminApprize adminApprize) {
        return getHibernateTemplate().find("from AdminApprize");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (adminApprize == null) {
            return getHibernateTemplate().find("from AdminApprize");
        } else {
            // filter on properties set in the adminApprize
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(adminApprize).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(AdminApprize.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.AdminApprizeDao#getAdminApprize(String id)
     */
    public AdminApprize getAdminApprize(final String id) {
        AdminApprize adminApprize = (AdminApprize) getHibernateTemplate().get(AdminApprize.class, id);
        if (adminApprize == null) {
            log.warn("uh oh, adminApprize with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(AdminApprize.class, id);
        }

        return adminApprize;
    }

    /**
     * @see com.rosy.punish.dao.AdminApprizeDao#saveAdminApprize(AdminApprize adminApprize)
     */    
    public void saveAdminApprize(final AdminApprize adminApprize) {
        getHibernateTemplate().saveOrUpdate(adminApprize);
    }

    /**
     * @see com.rosy.punish.dao.AdminApprizeDao#removeAdminApprize(String id)
     */
    public void removeAdminApprize(final String id) {
        getHibernateTemplate().delete(getAdminApprize(id));
    }
}
