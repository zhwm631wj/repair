
package com.rosy.investigate.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.investigate.model.BusinessLicense;
import com.rosy.investigate.dao.BusinessLicenseDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class BusinessLicenseDaoHibernate extends BaseDaoHibernate implements BusinessLicenseDao {

    /**
     * @see com.rosy.investigate.dao.BusinessLicenseDao#getBusinessLicenses(com.rosy.investigate.model.BusinessLicense)
     */
    public List getBusinessLicenses(final BusinessLicense businessLicense) {
        return getHibernateTemplate().find("from BusinessLicense");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (businessLicense == null) {
            return getHibernateTemplate().find("from BusinessLicense");
        } else {
            // filter on properties set in the businessLicense
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(businessLicense).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(BusinessLicense.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.investigate.dao.BusinessLicenseDao#getBusinessLicense(String id)
     */
    public BusinessLicense getBusinessLicense(final String id) {
        BusinessLicense businessLicense = (BusinessLicense) getHibernateTemplate().get(BusinessLicense.class, id);
        if (businessLicense == null) {
            log.warn("uh oh, businessLicense with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(BusinessLicense.class, id);
        }

        return businessLicense;
    }

    /**
     * @see com.rosy.investigate.dao.BusinessLicenseDao#saveBusinessLicense(BusinessLicense businessLicense)
     */    
    public void saveBusinessLicense(final BusinessLicense businessLicense) {
        getHibernateTemplate().saveOrUpdate(businessLicense);
    }

    /**
     * @see com.rosy.investigate.dao.BusinessLicenseDao#removeBusinessLicense(String id)
     */
    public void removeBusinessLicense(final String id) {
        getHibernateTemplate().delete(getBusinessLicense(id));
    }
}
