
package com.rosy.register.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.register.model.PartySpokesman;
import com.rosy.register.dao.PartySpokesmanDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class PartySpokesmanDaoHibernate extends BaseDaoHibernate implements PartySpokesmanDao {

    /**
     * @see com.rosy.register.dao.PartySpokesmanDao#getPartySpokesmans(com.rosy.register.model.PartySpokesman)
     */
    public List getPartySpokesmans(final PartySpokesman partySpokesman) {
        return getHibernateTemplate().find("from PartySpokesman");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (partySpokesman == null) {
            return getHibernateTemplate().find("from PartySpokesman");
        } else {
            // filter on properties set in the partySpokesman
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(partySpokesman).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(PartySpokesman.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.register.dao.PartySpokesmanDao#getPartySpokesman(String id)
     */
    public PartySpokesman getPartySpokesman(final String id) {
        PartySpokesman partySpokesman = (PartySpokesman) getHibernateTemplate().get(PartySpokesman.class, id);
        if (partySpokesman == null) {
            log.warn("uh oh, partySpokesman with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(PartySpokesman.class, id);
        }

        return partySpokesman;
    }

    /**
     * @see com.rosy.register.dao.PartySpokesmanDao#savePartySpokesman(PartySpokesman partySpokesman)
     */    
    public void savePartySpokesman(final PartySpokesman partySpokesman) {
        getHibernateTemplate().saveOrUpdate(partySpokesman);
    }

    /**
     * @see com.rosy.register.dao.PartySpokesmanDao#removePartySpokesman(String id)
     */
    public void removePartySpokesman(final String id) {
        getHibernateTemplate().delete(getPartySpokesman(id));
    }
}
