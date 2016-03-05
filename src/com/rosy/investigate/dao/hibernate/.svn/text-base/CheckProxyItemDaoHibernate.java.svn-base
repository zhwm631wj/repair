
package com.rosy.investigate.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.investigate.model.CheckProxyItem;
import com.rosy.investigate.dao.CheckProxyItemDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class CheckProxyItemDaoHibernate extends BaseDaoHibernate implements CheckProxyItemDao {

    /**
     * @see com.rosy.investigate.dao.CheckProxyItemDao#getCheckProxyItems(com.rosy.investigate.model.CheckProxyItem)
     */
    public List getCheckProxyItems(final CheckProxyItem checkProxyItem) {
        return getHibernateTemplate().find("from CheckProxyItem");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (checkProxyItem == null) {
            return getHibernateTemplate().find("from CheckProxyItem");
        } else {
            // filter on properties set in the checkProxyItem
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(checkProxyItem).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(CheckProxyItem.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.investigate.dao.CheckProxyItemDao#getCheckProxyItem(String id)
     */
    public CheckProxyItem getCheckProxyItem(final String id) {
        CheckProxyItem checkProxyItem = (CheckProxyItem) getHibernateTemplate().get(CheckProxyItem.class, id);
        if (checkProxyItem == null) {
            log.warn("uh oh, checkProxyItem with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(CheckProxyItem.class, id);
        }

        return checkProxyItem;
    }

    /**
     * @see com.rosy.investigate.dao.CheckProxyItemDao#saveCheckProxyItem(CheckProxyItem checkProxyItem)
     */    
    public void saveCheckProxyItem(final CheckProxyItem checkProxyItem) {
        getHibernateTemplate().saveOrUpdate(checkProxyItem);
    }

    /**
     * @see com.rosy.investigate.dao.CheckProxyItemDao#removeCheckProxyItem(String id)
     */
    public void removeCheckProxyItem(final String id) {
        getHibernateTemplate().delete(getCheckProxyItem(id));
    }
}
