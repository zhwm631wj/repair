
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.AmerceReceipt;
import com.rosy.punish.dao.AmerceReceiptDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class AmerceReceiptDaoHibernate extends BaseDaoHibernate implements AmerceReceiptDao {

    /**
     * @see com.rosy.punish.dao.AmerceReceiptDao#getAmerceReceipts(com.rosy.punish.model.AmerceReceipt)
     */
    public List getAmerceReceipts(final AmerceReceipt amerceReceipt) {
        return getHibernateTemplate().find("from AmerceReceipt");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (amerceReceipt == null) {
            return getHibernateTemplate().find("from AmerceReceipt");
        } else {
            // filter on properties set in the amerceReceipt
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(amerceReceipt).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(AmerceReceipt.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.AmerceReceiptDao#getAmerceReceipt(String id)
     */
    public AmerceReceipt getAmerceReceipt(final String id) {
        AmerceReceipt amerceReceipt = (AmerceReceipt) getHibernateTemplate().get(AmerceReceipt.class, id);
        if (amerceReceipt == null) {
            log.warn("uh oh, amerceReceipt with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(AmerceReceipt.class, id);
        }

        return amerceReceipt;
    }

    /**
     * @see com.rosy.punish.dao.AmerceReceiptDao#saveAmerceReceipt(AmerceReceipt amerceReceipt)
     */    
    public void saveAmerceReceipt(final AmerceReceipt amerceReceipt) {
        getHibernateTemplate().saveOrUpdate(amerceReceipt);
    }

    /**
     * @see com.rosy.punish.dao.AmerceReceiptDao#removeAmerceReceipt(String id)
     */
    public void removeAmerceReceipt(final String id) {
        getHibernateTemplate().delete(getAmerceReceipt(id));
    }
}
