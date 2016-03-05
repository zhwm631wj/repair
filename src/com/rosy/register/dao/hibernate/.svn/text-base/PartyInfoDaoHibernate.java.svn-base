
package com.rosy.register.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.register.model.PartyInfo;
import com.rosy.register.dao.PartyInfoDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class PartyInfoDaoHibernate extends BaseDaoHibernate implements PartyInfoDao {

    /**
     * @see com.rosy.register.dao.PartyInfoDao#getPartyInfos(com.rosy.register.model.PartyInfo)
     */
    public List getPartyInfos(final PartyInfo partyInfo) {
        return getHibernateTemplate().find("from PartyInfo");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (partyInfo == null) {
            return getHibernateTemplate().find("from PartyInfo");
        } else {
            // filter on properties set in the partyInfo
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(partyInfo).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(PartyInfo.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.register.dao.PartyInfoDao#getPartyInfo(String id)
     */
    public PartyInfo getPartyInfo(final String id) {
        PartyInfo partyInfo = (PartyInfo) getHibernateTemplate().get(PartyInfo.class, id);
        if (partyInfo == null) {
            log.warn("uh oh, partyInfo with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(PartyInfo.class, id);
        }

        return partyInfo;
    }

    /**
     * @see com.rosy.register.dao.PartyInfoDao#savePartyInfo(PartyInfo partyInfo)
     */    
    public void savePartyInfo(final PartyInfo partyInfo) {
        getHibernateTemplate().saveOrUpdate(partyInfo);
    }

    /**
     * @see com.rosy.register.dao.PartyInfoDao#removePartyInfo(String id)
     */
    public void removePartyInfo(final String id) {
        getHibernateTemplate().delete(getPartyInfo(id));
    }
}
