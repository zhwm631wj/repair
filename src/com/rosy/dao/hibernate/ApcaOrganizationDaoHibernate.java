
package com.rosy.dao.hibernate;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.rosy.dao.ApcaOrganizationDao;
import com.rosy.model.ApcaOrganization;

public class ApcaOrganizationDaoHibernate extends BaseDaoHibernate implements ApcaOrganizationDao {

    /**
     * @see com.rosy.dao.ApcaOrganizationDao#getApcaOrganizations(com.rosy.model.ApcaOrganization)
     */
    public List getApcaOrganizations(final ApcaOrganization apcaOrganization) {
        return getHibernateTemplate().find("from ApcaOrganization");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (apcaOrganization == null) {
            return getHibernateTemplate().find("from ApcaOrganization");
        } else {
            // filter on properties set in the apcaOrganization
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(apcaOrganization).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ApcaOrganization.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.dao.ApcaOrganizationDao#getApcaOrganization(String id)
     */
    public ApcaOrganization getApcaOrganization(final String id) {
        ApcaOrganization apcaOrganization = (ApcaOrganization) getHibernateTemplate().get(ApcaOrganization.class, id);
        if (apcaOrganization == null) {
            log.warn("uh oh, apcaOrganization with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ApcaOrganization.class, id);
        }

        return apcaOrganization;
    }

    /**
     * @see com.rosy.dao.ApcaOrganizationDao#saveApcaOrganization(ApcaOrganization apcaOrganization)
     */    
    public void saveApcaOrganization(final ApcaOrganization apcaOrganization) {
        getHibernateTemplate().saveOrUpdate(apcaOrganization);
    }

    /**
     * @see com.rosy.dao.ApcaOrganizationDao#removeApcaOrganization(String id)
     */
    public void removeApcaOrganization(final String id) {
        getHibernateTemplate().delete(getApcaOrganization(id));
    }

	public List getApcaOrganizationsByQuery(final ApcaOrganization apcaOrganization) {

        if (apcaOrganization == null) {
            return getHibernateTemplate().find("from ApcaOrganization");
        } else {
            // filter on properties set in the apcaOrganization
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(apcaOrganization).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ApcaOrganization.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }        
		
	}
	
}
