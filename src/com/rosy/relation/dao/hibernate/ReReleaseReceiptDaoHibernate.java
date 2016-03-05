
package com.rosy.relation.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.relation.model.ReReleaseReceipt;
import com.rosy.relation.dao.ReReleaseReceiptDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class ReReleaseReceiptDaoHibernate extends BaseDaoHibernate implements ReReleaseReceiptDao {

    /**
     * @see com.rosy.relation.dao.ReReleaseReceiptDao#getReReleaseReceipts(com.rosy.relation.model.ReReleaseReceipt)
     */
    public List getReReleaseReceipts(final ReReleaseReceipt reReleaseReceipt) {
        return getHibernateTemplate().find("from ReReleaseReceipt");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (reReleaseReceipt == null) {
            return getHibernateTemplate().find("from ReReleaseReceipt");
        } else {
            // filter on properties set in the reReleaseReceipt
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(reReleaseReceipt).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ReReleaseReceipt.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.relation.dao.ReReleaseReceiptDao#getReReleaseReceipt(String id)
     */
    public ReReleaseReceipt getReReleaseReceipt(final String id) {
        ReReleaseReceipt reReleaseReceipt = (ReReleaseReceipt) getHibernateTemplate().get(ReReleaseReceipt.class, id);
        if (reReleaseReceipt == null) {
            log.warn("uh oh, reReleaseReceipt with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ReReleaseReceipt.class, id);
        }

        return reReleaseReceipt;
    }

    /**
     * @see com.rosy.relation.dao.ReReleaseReceiptDao#saveReReleaseReceipt(ReReleaseReceipt reReleaseReceipt)
     */    
    public void saveReReleaseReceipt(final ReReleaseReceipt reReleaseReceipt) {
        getHibernateTemplate().saveOrUpdate(reReleaseReceipt);
    }

    /**
     * @see com.rosy.relation.dao.ReReleaseReceiptDao#removeReReleaseReceipt(String id)
     */
    public void removeReReleaseReceipt(final String id) {
        getHibernateTemplate().delete(getReReleaseReceipt(id));
    }
}
