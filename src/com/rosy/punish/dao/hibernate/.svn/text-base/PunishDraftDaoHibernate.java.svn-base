
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.PunishDraft;
import com.rosy.punish.dao.PunishDraftDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class PunishDraftDaoHibernate extends BaseDaoHibernate implements PunishDraftDao {

    /**
     * @see com.rosy.punish.dao.PunishDraftDao#getPunishDrafts(com.rosy.punish.model.PunishDraft)
     */
    public List getPunishDrafts(final PunishDraft punishDraft) {
        return getHibernateTemplate().find("from PunishDraft");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (punishDraft == null) {
            return getHibernateTemplate().find("from PunishDraft");
        } else {
            // filter on properties set in the punishDraft
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(punishDraft).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(PunishDraft.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.PunishDraftDao#getPunishDraft(String id)
     */
    public PunishDraft getPunishDraft(final String id) {
        PunishDraft punishDraft = (PunishDraft) getHibernateTemplate().get(PunishDraft.class, id);
        if (punishDraft == null) {
            log.warn("uh oh, punishDraft with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(PunishDraft.class, id);
        }

        return punishDraft;
    }

    /**
     * @see com.rosy.punish.dao.PunishDraftDao#savePunishDraft(PunishDraft punishDraft)
     */    
    public void savePunishDraft(final PunishDraft punishDraft) {
        getHibernateTemplate().saveOrUpdate(punishDraft);
    }

    /**
     * @see com.rosy.punish.dao.PunishDraftDao#removePunishDraft(String id)
     */
    public void removePunishDraft(final String id) {
        getHibernateTemplate().delete(getPunishDraft(id));
    }
}
