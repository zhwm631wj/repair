
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.HearOfWitnesse;
import com.rosy.punish.dao.HearOfWitnesseDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class HearOfWitnesseDaoHibernate extends BaseDaoHibernate implements HearOfWitnesseDao {

    /**
     * @see com.rosy.punish.dao.HearOfWitnesseDao#getHearOfWitnesses(com.rosy.punish.model.HearOfWitnesse)
     */
    public List getHearOfWitnesses(final HearOfWitnesse hearOfWitnesse) {
        return getHibernateTemplate().find("from HearOfWitnesse");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (hearOfWitnesse == null) {
            return getHibernateTemplate().find("from HearOfWitnesse");
        } else {
            // filter on properties set in the hearOfWitnesse
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(hearOfWitnesse).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(HearOfWitnesse.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.HearOfWitnesseDao#getHearOfWitnesse(String id)
     */
    public HearOfWitnesse getHearOfWitnesse(final String id) {
        HearOfWitnesse hearOfWitnesse = (HearOfWitnesse) getHibernateTemplate().get(HearOfWitnesse.class, id);
        if (hearOfWitnesse == null) {
            log.warn("uh oh, hearOfWitnesse with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(HearOfWitnesse.class, id);
        }

        return hearOfWitnesse;
    }

    /**
     * @see com.rosy.punish.dao.HearOfWitnesseDao#saveHearOfWitnesse(HearOfWitnesse hearOfWitnesse)
     */    
    public void saveHearOfWitnesse(final HearOfWitnesse hearOfWitnesse) {
        getHibernateTemplate().saveOrUpdate(hearOfWitnesse);
    }

    /**
     * @see com.rosy.punish.dao.HearOfWitnesseDao#removeHearOfWitnesse(String id)
     */
    public void removeHearOfWitnesse(final String id) {
        getHibernateTemplate().delete(getHearOfWitnesse(id));
    }
}
