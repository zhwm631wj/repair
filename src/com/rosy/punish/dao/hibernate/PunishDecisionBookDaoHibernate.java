
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.PunishDecisionBook;
import com.rosy.punish.dao.PunishDecisionBookDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class PunishDecisionBookDaoHibernate extends BaseDaoHibernate implements PunishDecisionBookDao {

    /**
     * @see com.rosy.punish.dao.PunishDecisionBookDao#getPunishDecisionBooks(com.rosy.punish.model.PunishDecisionBook)
     */
    public List getPunishDecisionBooks(final PunishDecisionBook punishDecisionBook) {
        return getHibernateTemplate().find("from PunishDecisionBook");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (punishDecisionBook == null) {
            return getHibernateTemplate().find("from PunishDecisionBook");
        } else {
            // filter on properties set in the punishDecisionBook
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(punishDecisionBook).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(PunishDecisionBook.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.PunishDecisionBookDao#getPunishDecisionBook(String id)
     */
    public PunishDecisionBook getPunishDecisionBook(final String id) {
        PunishDecisionBook punishDecisionBook = (PunishDecisionBook) getHibernateTemplate().get(PunishDecisionBook.class, id);
        if (punishDecisionBook == null) {
            log.warn("uh oh, punishDecisionBook with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(PunishDecisionBook.class, id);
        }

        return punishDecisionBook;
    }

    /**
     * @see com.rosy.punish.dao.PunishDecisionBookDao#savePunishDecisionBook(PunishDecisionBook punishDecisionBook)
     */    
    public void savePunishDecisionBook(final PunishDecisionBook punishDecisionBook) {
        getHibernateTemplate().saveOrUpdate(punishDecisionBook);
    }

    /**
     * @see com.rosy.punish.dao.PunishDecisionBookDao#removePunishDecisionBook(String id)
     */
    public void removePunishDecisionBook(final String id) {
        getHibernateTemplate().delete(getPunishDecisionBook(id));
    }
}
