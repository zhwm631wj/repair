
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.PunishExamine;
import com.rosy.punish.dao.PunishExamineDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class PunishExamineDaoHibernate extends BaseDaoHibernate implements PunishExamineDao {

    /**
     * @see com.rosy.punish.dao.PunishExamineDao#getPunishExamines(com.rosy.punish.model.PunishExamine)
     */
    public List getPunishExamines(final PunishExamine punishExamine) {
        return getHibernateTemplate().find("from PunishExamine");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (punishExamine == null) {
            return getHibernateTemplate().find("from PunishExamine");
        } else {
            // filter on properties set in the punishExamine
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(punishExamine).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(PunishExamine.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.PunishExamineDao#getPunishExamine(String id)
     */
    public PunishExamine getPunishExamine(final String id) {
        PunishExamine punishExamine = (PunishExamine) getHibernateTemplate().get(PunishExamine.class, id);
        if (punishExamine == null) {
            log.warn("uh oh, punishExamine with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(PunishExamine.class, id);
        }

        return punishExamine;
    }

    /**
     * @see com.rosy.punish.dao.PunishExamineDao#savePunishExamine(PunishExamine punishExamine)
     */    
    public void savePunishExamine(final PunishExamine punishExamine) {
        getHibernateTemplate().saveOrUpdate(punishExamine);
    }

    /**
     * @see com.rosy.punish.dao.PunishExamineDao#removePunishExamine(String id)
     */
    public void removePunishExamine(final String id) {
        getHibernateTemplate().delete(getPunishExamine(id));
    }
}
