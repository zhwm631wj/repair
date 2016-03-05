
package com.rosy.relation.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.relation.model.ReAdminApprizeReceipt;
import com.rosy.relation.dao.ReAdminApprizeReceiptDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class ReAdminApprizeReceiptDaoHibernate extends BaseDaoHibernate implements ReAdminApprizeReceiptDao {

    /**
     * @see com.rosy.relation.dao.ReAdminApprizeReceiptDao#getReAdminApprizeReceipts(com.rosy.relation.model.ReAdminApprizeReceipt)
     */
    public List getReAdminApprizeReceipts(final ReAdminApprizeReceipt reAdminApprizeReceipt) {
        return getHibernateTemplate().find("from ReAdminApprizeReceipt");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (reAdminApprizeReceipt == null) {
            return getHibernateTemplate().find("from ReAdminApprizeReceipt");
        } else {
            // filter on properties set in the reAdminApprizeReceipt
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(reAdminApprizeReceipt).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ReAdminApprizeReceipt.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.relation.dao.ReAdminApprizeReceiptDao#getReAdminApprizeReceipt(String id)
     */
    public ReAdminApprizeReceipt getReAdminApprizeReceipt(final String id) {
        ReAdminApprizeReceipt reAdminApprizeReceipt = (ReAdminApprizeReceipt) getHibernateTemplate().get(ReAdminApprizeReceipt.class, id);
        if (reAdminApprizeReceipt == null) {
            log.warn("uh oh, reAdminApprizeReceipt with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ReAdminApprizeReceipt.class, id);
        }

        return reAdminApprizeReceipt;
    }

    /**
     * @see com.rosy.relation.dao.ReAdminApprizeReceiptDao#saveReAdminApprizeReceipt(ReAdminApprizeReceipt reAdminApprizeReceipt)
     */    
    public void saveReAdminApprizeReceipt(final ReAdminApprizeReceipt reAdminApprizeReceipt) {
        getHibernateTemplate().saveOrUpdate(reAdminApprizeReceipt);
    }

    /**
     * @see com.rosy.relation.dao.ReAdminApprizeReceiptDao#removeReAdminApprizeReceipt(String id)
     */
    public void removeReAdminApprizeReceipt(final String id) {
        getHibernateTemplate().delete(getReAdminApprizeReceipt(id));
    }
}
