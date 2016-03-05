
package com.rosy.relation.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.relation.model.ReInspectReg;
import com.rosy.relation.dao.ReInspectRegDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class ReInspectRegDaoHibernate extends BaseDaoHibernate implements ReInspectRegDao {

    /**
     * @see com.rosy.relation.dao.ReInspectRegDao#getReInspectRegs(com.rosy.relation.model.ReInspectReg)
     */
    public List getReInspectRegs(final ReInspectReg reInspectReg) {
        return getHibernateTemplate().find("from ReInspectReg");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (reInspectReg == null) {
            return getHibernateTemplate().find("from ReInspectReg");
        } else {
            // filter on properties set in the reInspectReg
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(reInspectReg).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ReInspectReg.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.relation.dao.ReInspectRegDao#getReInspectReg(String id)
     */
    public ReInspectReg getReInspectReg(final String id) {
        ReInspectReg reInspectReg = (ReInspectReg) getHibernateTemplate().get(ReInspectReg.class, id);
        if (reInspectReg == null) {
            log.warn("uh oh, reInspectReg with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ReInspectReg.class, id);
        }

        return reInspectReg;
    }

    /**
     * @see com.rosy.relation.dao.ReInspectRegDao#saveReInspectReg(ReInspectReg reInspectReg)
     */    
    public void saveReInspectReg(final ReInspectReg reInspectReg) {
        getHibernateTemplate().saveOrUpdate(reInspectReg);
    }

    /**
     * @see com.rosy.relation.dao.ReInspectRegDao#removeReInspectReg(String id)
     */
    public void removeReInspectReg(final String id) {
        getHibernateTemplate().delete(getReInspectReg(id));
    }
}
