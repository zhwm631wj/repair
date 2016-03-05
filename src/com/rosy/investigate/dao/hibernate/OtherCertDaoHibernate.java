
package com.rosy.investigate.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.investigate.model.OtherCert;
import com.rosy.investigate.dao.OtherCertDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class OtherCertDaoHibernate extends BaseDaoHibernate implements OtherCertDao {

    /**
     * @see com.rosy.investigate.dao.OtherCertDao#getOtherCerts(com.rosy.investigate.model.OtherCert)
     */
    public List getOtherCerts(final OtherCert otherCert) {
        return getHibernateTemplate().find("from OtherCert");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (otherCert == null) {
            return getHibernateTemplate().find("from OtherCert");
        } else {
            // filter on properties set in the otherCert
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(otherCert).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(OtherCert.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.investigate.dao.OtherCertDao#getOtherCert(String id)
     */
    public OtherCert getOtherCert(final String id) {
        OtherCert otherCert = (OtherCert) getHibernateTemplate().get(OtherCert.class, id);
        if (otherCert == null) {
            log.warn("uh oh, otherCert with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(OtherCert.class, id);
        }

        return otherCert;
    }

    /**
     * @see com.rosy.investigate.dao.OtherCertDao#saveOtherCert(OtherCert otherCert)
     */    
    public void saveOtherCert(final OtherCert otherCert) {
        getHibernateTemplate().saveOrUpdate(otherCert);
    }

    /**
     * @see com.rosy.investigate.dao.OtherCertDao#removeOtherCert(String id)
     */
    public void removeOtherCert(final String id) {
        getHibernateTemplate().delete(getOtherCert(id));
    }
}
