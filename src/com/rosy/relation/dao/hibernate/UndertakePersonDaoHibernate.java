
package com.rosy.relation.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.relation.model.UndertakePerson;
import com.rosy.relation.dao.UndertakePersonDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class UndertakePersonDaoHibernate extends BaseDaoHibernate implements UndertakePersonDao {

    /**
     * @see com.rosy.relation.dao.UndertakePersonDao#getUndertakePersons(com.rosy.relation.model.UndertakePerson)
     */
    public List getUndertakePersons(final UndertakePerson undertakePerson) {
        return getHibernateTemplate().find("from UndertakePerson");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (undertakePerson == null) {
            return getHibernateTemplate().find("from UndertakePerson");
        } else {
            // filter on properties set in the undertakePerson
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(undertakePerson).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(UndertakePerson.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.relation.dao.UndertakePersonDao#getUndertakePerson(String id)
     */
    public UndertakePerson getUndertakePerson(final String id) {
        UndertakePerson undertakePerson = (UndertakePerson) getHibernateTemplate().get(UndertakePerson.class, id);
        if (undertakePerson == null) {
            log.warn("uh oh, undertakePerson with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(UndertakePerson.class, id);
        }

        return undertakePerson;
    }

    /**
     * @see com.rosy.relation.dao.UndertakePersonDao#saveUndertakePerson(UndertakePerson undertakePerson)
     */    
    public void saveUndertakePerson(final UndertakePerson undertakePerson) {
        getHibernateTemplate().saveOrUpdate(undertakePerson);
    }

    /**
     * @see com.rosy.relation.dao.UndertakePersonDao#removeUndertakePerson(String id)
     */
    public void removeUndertakePerson(final String id) {
        getHibernateTemplate().delete(getUndertakePerson(id));
    }
}
