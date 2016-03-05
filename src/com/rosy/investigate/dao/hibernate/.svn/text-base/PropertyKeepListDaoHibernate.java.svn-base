
package com.rosy.investigate.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.investigate.model.PropertyKeepList;
import com.rosy.investigate.dao.PropertyKeepListDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class PropertyKeepListDaoHibernate extends BaseDaoHibernate implements PropertyKeepListDao {

    /**
     * @see com.rosy.investigate.dao.PropertyKeepListDao#getPropertyKeepLists(com.rosy.investigate.model.PropertyKeepList)
     */
    public List getPropertyKeepLists(final PropertyKeepList propertyKeepList) {
        return getHibernateTemplate().find("from PropertyKeepList");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (propertyKeepList == null) {
            return getHibernateTemplate().find("from PropertyKeepList");
        } else {
            // filter on properties set in the propertyKeepList
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(propertyKeepList).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(PropertyKeepList.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.investigate.dao.PropertyKeepListDao#getPropertyKeepList(String id)
     */
    public PropertyKeepList getPropertyKeepList(final String id) {
        PropertyKeepList propertyKeepList = (PropertyKeepList) getHibernateTemplate().get(PropertyKeepList.class, id);
        if (propertyKeepList == null) {
            log.warn("uh oh, propertyKeepList with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(PropertyKeepList.class, id);
        }

        return propertyKeepList;
    }

    /**
     * @see com.rosy.investigate.dao.PropertyKeepListDao#savePropertyKeepList(PropertyKeepList propertyKeepList)
     */    
    public void savePropertyKeepList(final PropertyKeepList propertyKeepList) {
        getHibernateTemplate().saveOrUpdate(propertyKeepList);
    }

    /**
     * @see com.rosy.investigate.dao.PropertyKeepListDao#removePropertyKeepList(String id)
     */
    public void removePropertyKeepList(final String id) {
        getHibernateTemplate().delete(getPropertyKeepList(id));
    }
}
