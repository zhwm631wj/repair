
package com.rosy.investigate.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.investigate.model.TransmitReturnReceipt;
import com.rosy.investigate.dao.TransmitReturnReceiptDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class TransmitReturnReceiptDaoHibernate extends BaseDaoHibernate implements TransmitReturnReceiptDao {

    /**
     * @see com.rosy.investigate.dao.TransmitReturnReceiptDao#getTransmitReturnReceipts(com.rosy.investigate.model.TransmitReturnReceipt)
     */
    public List getTransmitReturnReceipts(final TransmitReturnReceipt transmitReturnReceipt) {
        return getHibernateTemplate().find("from TransmitReturnReceipt");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (transmitReturnReceipt == null) {
            return getHibernateTemplate().find("from TransmitReturnReceipt");
        } else {
            // filter on properties set in the transmitReturnReceipt
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(transmitReturnReceipt).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(TransmitReturnReceipt.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.investigate.dao.TransmitReturnReceiptDao#getTransmitReturnReceipt(String id)
     */
    public TransmitReturnReceipt getTransmitReturnReceipt(final String id) {
        TransmitReturnReceipt transmitReturnReceipt = (TransmitReturnReceipt) getHibernateTemplate().get(TransmitReturnReceipt.class, id);
        if (transmitReturnReceipt == null) {
            log.warn("uh oh, transmitReturnReceipt with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(TransmitReturnReceipt.class, id);
        }

        return transmitReturnReceipt;
    }

    /**
     * @see com.rosy.investigate.dao.TransmitReturnReceiptDao#saveTransmitReturnReceipt(TransmitReturnReceipt transmitReturnReceipt)
     */    
    public void saveTransmitReturnReceipt(final TransmitReturnReceipt transmitReturnReceipt) {
        getHibernateTemplate().saveOrUpdate(transmitReturnReceipt);
    }

    /**
     * @see com.rosy.investigate.dao.TransmitReturnReceiptDao#removeTransmitReturnReceipt(String id)
     */
    public void removeTransmitReturnReceipt(final String id) {
        getHibernateTemplate().delete(getTransmitReturnReceipt(id));
    }
}
