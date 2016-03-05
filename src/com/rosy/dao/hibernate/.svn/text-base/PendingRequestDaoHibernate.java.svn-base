
package com.rosy.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.model.PendingRequest;
import com.rosy.dao.PendingRequestDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class PendingRequestDaoHibernate extends BaseDaoHibernate implements PendingRequestDao {

    /**
     * @see com.rosy.dao.PendingRequestDao#getPendingRequests(com.rosy.model.PendingRequest)
     */
    public List getPendingRequests(final PendingRequest pendingRequest) {
        return getHibernateTemplate().find("from PendingRequest");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (pendingRequest == null) {
            return getHibernateTemplate().find("from PendingRequest");
        } else {
            // filter on properties set in the pendingRequest
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(pendingRequest).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(PendingRequest.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.dao.PendingRequestDao#getPendingRequest(String id)
     */
    public PendingRequest getPendingRequest(final String id) {
        PendingRequest pendingRequest = (PendingRequest) getHibernateTemplate().get(PendingRequest.class, id);
        if (pendingRequest == null) {
            log.warn("uh oh, pendingRequest with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(PendingRequest.class, id);
        }

        return pendingRequest;
    }

    /**
     * @see com.rosy.dao.PendingRequestDao#savePendingRequest(PendingRequest pendingRequest)
     */    
    public void savePendingRequest(final PendingRequest pendingRequest) {
        getHibernateTemplate().saveOrUpdate(pendingRequest);
    }

    /**
     * @see com.rosy.dao.PendingRequestDao#removePendingRequest(String id)
     */
    public void removePendingRequest(final String id) {
        getHibernateTemplate().delete(getPendingRequest(id));
    }
}
