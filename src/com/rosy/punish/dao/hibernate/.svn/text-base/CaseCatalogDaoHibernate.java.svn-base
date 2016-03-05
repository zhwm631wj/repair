
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.CaseCatalog;
import com.rosy.punish.dao.CaseCatalogDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class CaseCatalogDaoHibernate extends BaseDaoHibernate implements CaseCatalogDao {

    /**
     * @see com.rosy.punish.dao.CaseCatalogDao#getCaseCatalogs(com.rosy.punish.model.CaseCatalog)
     */
    public List getCaseCatalogs(final CaseCatalog caseCatalog) {
        return getHibernateTemplate().find("from CaseCatalog");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (caseCatalog == null) {
            return getHibernateTemplate().find("from CaseCatalog");
        } else {
            // filter on properties set in the caseCatalog
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(caseCatalog).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(CaseCatalog.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.CaseCatalogDao#getCaseCatalog(String id)
     */
    public CaseCatalog getCaseCatalog(final String id) {
        CaseCatalog caseCatalog = (CaseCatalog) getHibernateTemplate().get(CaseCatalog.class, id);
        if (caseCatalog == null) {
            log.warn("uh oh, caseCatalog with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(CaseCatalog.class, id);
        }

        return caseCatalog;
    }

    /**
     * @see com.rosy.punish.dao.CaseCatalogDao#saveCaseCatalog(CaseCatalog caseCatalog)
     */    
    public void saveCaseCatalog(final CaseCatalog caseCatalog) {
        getHibernateTemplate().saveOrUpdate(caseCatalog);
    }

    /**
     * @see com.rosy.punish.dao.CaseCatalogDao#removeCaseCatalog(String id)
     */
    public void removeCaseCatalog(final String id) {
        getHibernateTemplate().delete(getCaseCatalog(id));
    }
}
