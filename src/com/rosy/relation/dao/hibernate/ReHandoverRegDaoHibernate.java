
package com.rosy.relation.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.relation.model.ReHandoverReg;
import com.rosy.relation.dao.ReHandoverRegDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class ReHandoverRegDaoHibernate extends BaseDaoHibernate implements ReHandoverRegDao {

    /**
     * @see com.rosy.relation.dao.ReHandoverRegDao#getReHandoverRegs(com.rosy.relation.model.ReHandoverReg)
     */
    public List getReHandoverRegs(final ReHandoverReg reHandoverReg) {
        return getHibernateTemplate().find("from ReHandoverReg");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (reHandoverReg == null) {
            return getHibernateTemplate().find("from ReHandoverReg");
        } else {
            // filter on properties set in the reHandoverReg
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(reHandoverReg).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ReHandoverReg.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.relation.dao.ReHandoverRegDao#getReHandoverReg(String id)
     */
    public ReHandoverReg getReHandoverReg(final String id) {
        ReHandoverReg reHandoverReg = (ReHandoverReg) getHibernateTemplate().get(ReHandoverReg.class, id);
        if (reHandoverReg == null) {
            log.warn("uh oh, reHandoverReg with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ReHandoverReg.class, id);
        }

        return reHandoverReg;
    }

    /**
     * @see com.rosy.relation.dao.ReHandoverRegDao#saveReHandoverReg(ReHandoverReg reHandoverReg)
     */    
    public void saveReHandoverReg(final ReHandoverReg reHandoverReg) {
        getHibernateTemplate().saveOrUpdate(reHandoverReg);
    }

    /**
     * @see com.rosy.relation.dao.ReHandoverRegDao#removeReHandoverReg(String id)
     */
    public void removeReHandoverReg(final String id) {
        getHibernateTemplate().delete(getReHandoverReg(id));
    }
}
