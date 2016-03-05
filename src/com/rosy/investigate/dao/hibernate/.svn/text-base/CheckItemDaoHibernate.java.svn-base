
package com.rosy.investigate.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.investigate.model.CheckItem;
import com.rosy.investigate.dao.CheckItemDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class CheckItemDaoHibernate extends BaseDaoHibernate implements CheckItemDao {

    /**
     * @see com.rosy.investigate.dao.CheckItemDao#getCheckItems(com.rosy.investigate.model.CheckItem)
     */
    public List getCheckItems(final CheckItem checkItem) {
        return getHibernateTemplate().find("from CheckItem");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (checkItem == null) {
            return getHibernateTemplate().find("from CheckItem");
        } else {
            // filter on properties set in the checkItem
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(checkItem).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(CheckItem.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.investigate.dao.CheckItemDao#getCheckItem(String id)
     */
    public CheckItem getCheckItem(final String id) {
        CheckItem checkItem = (CheckItem) getHibernateTemplate().get(CheckItem.class, id);
        if (checkItem == null) {
            log.warn("uh oh, checkItem with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(CheckItem.class, id);
        }

        return checkItem;
    }

    /**
     * @see com.rosy.investigate.dao.CheckItemDao#saveCheckItem(CheckItem checkItem)
     */    
    public void saveCheckItem(final CheckItem checkItem) {
        getHibernateTemplate().saveOrUpdate(checkItem);
    }

    /**
     * @see com.rosy.investigate.dao.CheckItemDao#removeCheckItem(String id)
     */
    public void removeCheckItem(final String id) {
        getHibernateTemplate().delete(getCheckItem(id));
    }
}
