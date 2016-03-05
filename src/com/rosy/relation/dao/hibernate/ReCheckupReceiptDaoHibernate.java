
package com.rosy.relation.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.relation.model.ReCheckupReceipt;
import com.rosy.relation.dao.ReCheckupReceiptDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class ReCheckupReceiptDaoHibernate extends BaseDaoHibernate implements ReCheckupReceiptDao {

    /**
     * @see com.rosy.relation.dao.ReCheckupReceiptDao#getReCheckupReceipts(com.rosy.relation.model.ReCheckupReceipt)
     */
    public List getReCheckupReceipts(final ReCheckupReceipt reCheckupReceipt) {
        return getHibernateTemplate().find("from ReCheckupReceipt");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (reCheckupReceipt == null) {
            return getHibernateTemplate().find("from ReCheckupReceipt");
        } else {
            // filter on properties set in the reCheckupReceipt
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(reCheckupReceipt).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ReCheckupReceipt.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.relation.dao.ReCheckupReceiptDao#getReCheckupReceipt(String id)
     */
    public ReCheckupReceipt getReCheckupReceipt(final String id) {
        ReCheckupReceipt reCheckupReceipt = (ReCheckupReceipt) getHibernateTemplate().get(ReCheckupReceipt.class, id);
        if (reCheckupReceipt == null) {
            log.warn("uh oh, reCheckupReceipt with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ReCheckupReceipt.class, id);
        }

        return reCheckupReceipt;
    }

    /**
     * @see com.rosy.relation.dao.ReCheckupReceiptDao#saveReCheckupReceipt(ReCheckupReceipt reCheckupReceipt)
     */    
    public void saveReCheckupReceipt(final ReCheckupReceipt reCheckupReceipt) {
        getHibernateTemplate().saveOrUpdate(reCheckupReceipt);
    }

    /**
     * @see com.rosy.relation.dao.ReCheckupReceiptDao#removeReCheckupReceipt(String id)
     */
    public void removeReCheckupReceipt(final String id) {
        getHibernateTemplate().delete(getReCheckupReceipt(id));
    }
}
