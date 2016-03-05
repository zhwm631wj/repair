
package com.rosy.investigate.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.investigate.model.EnrolList;
import com.rosy.investigate.dao.EnrolListDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class EnrolListDaoHibernate extends BaseDaoHibernate implements EnrolListDao {

    /**
     * @see com.rosy.investigate.dao.EnrolListDao#getEnrolLists(com.rosy.investigate.model.EnrolList)
     */
    public List getEnrolLists(final EnrolList enrolList) {
        return getHibernateTemplate().find("from EnrolList");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (enrolList == null) {
            return getHibernateTemplate().find("from EnrolList");
        } else {
            // filter on properties set in the enrolList
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(enrolList).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(EnrolList.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.investigate.dao.EnrolListDao#getEnrolList(String id)
     */
    public EnrolList getEnrolList(final String id) {
        EnrolList enrolList = (EnrolList) getHibernateTemplate().get(EnrolList.class, id);
        if (enrolList == null) {
            log.warn("uh oh, enrolList with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(EnrolList.class, id);
        }

        return enrolList;
    }

    /**
     * @see com.rosy.investigate.dao.EnrolListDao#saveEnrolList(EnrolList enrolList)
     */    
    public void saveEnrolList(final EnrolList enrolList) {
        getHibernateTemplate().saveOrUpdate(enrolList);
    }

    /**
     * @see com.rosy.investigate.dao.EnrolListDao#removeEnrolList(String id)
     */
    public void removeEnrolList(final String id) {
        getHibernateTemplate().delete(getEnrolList(id));
    }
}
