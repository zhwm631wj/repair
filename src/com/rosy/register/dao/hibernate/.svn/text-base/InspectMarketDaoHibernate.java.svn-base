
package com.rosy.register.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.register.model.InspectMarket;
import com.rosy.register.dao.InspectMarketDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class InspectMarketDaoHibernate extends BaseDaoHibernate implements InspectMarketDao {

    /**
     * @see com.rosy.register.dao.InspectMarketDao#getInspectMarkets(com.rosy.register.model.InspectMarket)
     */
    public List getInspectMarkets(final InspectMarket inspectMarket) {
        return getHibernateTemplate().find("from InspectMarket");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (inspectMarket == null) {
            return getHibernateTemplate().find("from InspectMarket");
        } else {
            // filter on properties set in the inspectMarket
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(inspectMarket).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(InspectMarket.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.register.dao.InspectMarketDao#getInspectMarket(String id)
     */
    public InspectMarket getInspectMarket(final String id) {
        InspectMarket inspectMarket = (InspectMarket) getHibernateTemplate().get(InspectMarket.class, id);
        if (inspectMarket == null) {
            log.warn("uh oh, inspectMarket with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(InspectMarket.class, id);
        }

        return inspectMarket;
    }

    /**
     * @see com.rosy.register.dao.InspectMarketDao#saveInspectMarket(InspectMarket inspectMarket)
     */    
    public void saveInspectMarket(final InspectMarket inspectMarket) {
        getHibernateTemplate().saveOrUpdate(inspectMarket);
    }

    /**
     * @see com.rosy.register.dao.InspectMarketDao#removeInspectMarket(String id)
     */
    public void removeInspectMarket(final String id) {
        getHibernateTemplate().delete(getInspectMarket(id));
    }
}
