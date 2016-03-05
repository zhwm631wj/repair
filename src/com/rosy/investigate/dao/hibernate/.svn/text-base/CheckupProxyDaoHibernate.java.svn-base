
package com.rosy.investigate.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.investigate.model.CheckupProxy;
import com.rosy.investigate.dao.CheckupProxyDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class CheckupProxyDaoHibernate extends BaseDaoHibernate implements CheckupProxyDao {

    /**
     * @see com.rosy.investigate.dao.CheckupProxyDao#getCheckupProxys(com.rosy.investigate.model.CheckupProxy)
     */
    public List getCheckupProxys(final CheckupProxy checkupProxy) {
        return getHibernateTemplate().find("from CheckupProxy");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (checkupProxy == null) {
            return getHibernateTemplate().find("from CheckupProxy");
        } else {
            // filter on properties set in the checkupProxy
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(checkupProxy).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(CheckupProxy.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.investigate.dao.CheckupProxyDao#getCheckupProxy(String id)
     */
    public CheckupProxy getCheckupProxy(final String id) {
        CheckupProxy checkupProxy = (CheckupProxy) getHibernateTemplate().get(CheckupProxy.class, id);
        if (checkupProxy == null) {
            log.warn("uh oh, checkupProxy with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(CheckupProxy.class, id);
        }

        return checkupProxy;
    }

    /**
     * @see com.rosy.investigate.dao.CheckupProxyDao#saveCheckupProxy(CheckupProxy checkupProxy)
     */    
    public void saveCheckupProxy(final CheckupProxy checkupProxy) {
        getHibernateTemplate().saveOrUpdate(checkupProxy);
    }

    /**
     * @see com.rosy.investigate.dao.CheckupProxyDao#removeCheckupProxy(String id)
     */
    public void removeCheckupProxy(final String id) {
        getHibernateTemplate().delete(getCheckupProxy(id));
    }
}
