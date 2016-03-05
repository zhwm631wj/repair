
package com.rosy.investigate.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.investigate.model.PropertyList;
import com.rosy.investigate.dao.PropertyListDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class PropertyListDaoHibernate extends BaseDaoHibernate implements PropertyListDao {

    /**
     * @see com.rosy.investigate.dao.PropertyListDao#getPropertyLists(com.rosy.investigate.model.PropertyList)
     */
    public List getPropertyLists(final PropertyList propertyList) {
        return getHibernateTemplate().find("from PropertyList");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (propertyList == null) {
            return getHibernateTemplate().find("from PropertyList");
        } else {
            // filter on properties set in the propertyList
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(propertyList).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(PropertyList.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.investigate.dao.PropertyListDao#getPropertyList(String id)
     */
    public PropertyList getPropertyList(final String id) {
        PropertyList propertyList = (PropertyList) getHibernateTemplate().get(PropertyList.class, id);
        if (propertyList == null) {
            log.warn("uh oh, propertyList with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(PropertyList.class, id);
        }

        return propertyList;
    }

    /**
     * @see com.rosy.investigate.dao.PropertyListDao#savePropertyList(PropertyList propertyList)
     */    
    public void savePropertyList(final PropertyList propertyList) {
        getHibernateTemplate().saveOrUpdate(propertyList);
    }

    /**
     * @see com.rosy.investigate.dao.PropertyListDao#removePropertyList(String id)
     */
    public void removePropertyList(final String id) {
        getHibernateTemplate().delete(getPropertyList(id));
    }
}
