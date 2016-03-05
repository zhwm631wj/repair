
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.AffixToPunish;
import com.rosy.punish.dao.AffixToPunishDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class AffixToPunishDaoHibernate extends BaseDaoHibernate implements AffixToPunishDao {

    /**
     * @see com.rosy.punish.dao.AffixToPunishDao#getAffixToPunishs(com.rosy.punish.model.AffixToPunish)
     */
    public List getAffixToPunishs(final AffixToPunish affixToPunish) {
        return getHibernateTemplate().find("from AffixToPunish");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (affixToPunish == null) {
            return getHibernateTemplate().find("from AffixToPunish");
        } else {
            // filter on properties set in the affixToPunish
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(affixToPunish).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(AffixToPunish.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.AffixToPunishDao#getAffixToPunish(String id)
     */
    public AffixToPunish getAffixToPunish(final String id) {
        AffixToPunish affixToPunish = (AffixToPunish) getHibernateTemplate().get(AffixToPunish.class, id);
        if (affixToPunish == null) {
            log.warn("uh oh, affixToPunish with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(AffixToPunish.class, id);
        }

        return affixToPunish;
    }

    /**
     * @see com.rosy.punish.dao.AffixToPunishDao#saveAffixToPunish(AffixToPunish affixToPunish)
     */    
    public void saveAffixToPunish(final AffixToPunish affixToPunish) {
        getHibernateTemplate().saveOrUpdate(affixToPunish);
    }

    /**
     * @see com.rosy.punish.dao.AffixToPunishDao#removeAffixToPunish(String id)
     */
    public void removeAffixToPunish(final String id) {
        getHibernateTemplate().delete(getAffixToPunish(id));
    }
}
