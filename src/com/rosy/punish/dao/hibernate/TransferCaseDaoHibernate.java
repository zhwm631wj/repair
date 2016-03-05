
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.TransferCase;
import com.rosy.punish.dao.TransferCaseDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class TransferCaseDaoHibernate extends BaseDaoHibernate implements TransferCaseDao {

    /**
     * @see com.rosy.punish.dao.TransferCaseDao#getTransferCases(com.rosy.punish.model.TransferCase)
     */
    public List getTransferCases(final TransferCase transferCase) {
        return getHibernateTemplate().find("from TransferCase");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (transferCase == null) {
            return getHibernateTemplate().find("from TransferCase");
        } else {
            // filter on properties set in the transferCase
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(transferCase).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(TransferCase.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.TransferCaseDao#getTransferCase(String id)
     */
    public TransferCase getTransferCase(final String id) {
        TransferCase transferCase = (TransferCase) getHibernateTemplate().get(TransferCase.class, id);
        if (transferCase == null) {
            log.warn("uh oh, transferCase with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(TransferCase.class, id);
        }

        return transferCase;
    }

    /**
     * @see com.rosy.punish.dao.TransferCaseDao#saveTransferCase(TransferCase transferCase)
     */    
    public void saveTransferCase(final TransferCase transferCase) {
        getHibernateTemplate().saveOrUpdate(transferCase);
    }

    /**
     * @see com.rosy.punish.dao.TransferCaseDao#removeTransferCase(String id)
     */
    public void removeTransferCase(final String id) {
        getHibernateTemplate().delete(getTransferCase(id));
    }
}
