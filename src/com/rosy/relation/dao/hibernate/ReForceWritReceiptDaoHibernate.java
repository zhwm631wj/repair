
package com.rosy.relation.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.relation.model.ReForceWritReceipt;
import com.rosy.relation.dao.ReForceWritReceiptDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class ReForceWritReceiptDaoHibernate extends BaseDaoHibernate implements ReForceWritReceiptDao {

    /**
     * @see com.rosy.relation.dao.ReForceWritReceiptDao#getReForceWritReceipts(com.rosy.relation.model.ReForceWritReceipt)
     */
    public List getReForceWritReceipts(final ReForceWritReceipt reForceWritReceipt) {
        return getHibernateTemplate().find("from ReForceWritReceipt");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (reForceWritReceipt == null) {
            return getHibernateTemplate().find("from ReForceWritReceipt");
        } else {
            // filter on properties set in the reForceWritReceipt
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(reForceWritReceipt).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ReForceWritReceipt.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.relation.dao.ReForceWritReceiptDao#getReForceWritReceipt(String id)
     */
    public ReForceWritReceipt getReForceWritReceipt(final String id) {
        ReForceWritReceipt reForceWritReceipt = (ReForceWritReceipt) getHibernateTemplate().get(ReForceWritReceipt.class, id);
        if (reForceWritReceipt == null) {
            log.warn("uh oh, reForceWritReceipt with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ReForceWritReceipt.class, id);
        }

        return reForceWritReceipt;
    }

    /**
     * @see com.rosy.relation.dao.ReForceWritReceiptDao#saveReForceWritReceipt(ReForceWritReceipt reForceWritReceipt)
     */    
    public void saveReForceWritReceipt(final ReForceWritReceipt reForceWritReceipt) {
        getHibernateTemplate().saveOrUpdate(reForceWritReceipt);
    }

    /**
     * @see com.rosy.relation.dao.ReForceWritReceiptDao#removeReForceWritReceipt(String id)
     */
    public void removeReForceWritReceipt(final String id) {
        getHibernateTemplate().delete(getReForceWritReceipt(id));
    }
}
