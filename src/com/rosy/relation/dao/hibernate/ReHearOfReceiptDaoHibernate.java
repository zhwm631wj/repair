
package com.rosy.relation.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.relation.model.ReHearOfReceipt;
import com.rosy.relation.dao.ReHearOfReceiptDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class ReHearOfReceiptDaoHibernate extends BaseDaoHibernate implements ReHearOfReceiptDao {

    /**
     * @see com.rosy.relation.dao.ReHearOfReceiptDao#getReHearOfReceipts(com.rosy.relation.model.ReHearOfReceipt)
     */
    public List getReHearOfReceipts(final ReHearOfReceipt reHearOfReceipt) {
        return getHibernateTemplate().find("from ReHearOfReceipt");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (reHearOfReceipt == null) {
            return getHibernateTemplate().find("from ReHearOfReceipt");
        } else {
            // filter on properties set in the reHearOfReceipt
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(reHearOfReceipt).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ReHearOfReceipt.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.relation.dao.ReHearOfReceiptDao#getReHearOfReceipt(String id)
     */
    public ReHearOfReceipt getReHearOfReceipt(final String id) {
        ReHearOfReceipt reHearOfReceipt = (ReHearOfReceipt) getHibernateTemplate().get(ReHearOfReceipt.class, id);
        if (reHearOfReceipt == null) {
            log.warn("uh oh, reHearOfReceipt with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ReHearOfReceipt.class, id);
        }

        return reHearOfReceipt;
    }

    /**
     * @see com.rosy.relation.dao.ReHearOfReceiptDao#saveReHearOfReceipt(ReHearOfReceipt reHearOfReceipt)
     */    
    public void saveReHearOfReceipt(final ReHearOfReceipt reHearOfReceipt) {
        getHibernateTemplate().saveOrUpdate(reHearOfReceipt);
    }

    /**
     * @see com.rosy.relation.dao.ReHearOfReceiptDao#removeReHearOfReceipt(String id)
     */
    public void removeReHearOfReceipt(final String id) {
        getHibernateTemplate().delete(getReHearOfReceipt(id));
    }
}
