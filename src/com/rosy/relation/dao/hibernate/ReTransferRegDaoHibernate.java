
package com.rosy.relation.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.relation.model.ReTransferReg;
import com.rosy.relation.dao.ReTransferRegDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class ReTransferRegDaoHibernate extends BaseDaoHibernate implements ReTransferRegDao {

    /**
     * @see com.rosy.relation.dao.ReTransferRegDao#getReTransferRegs(com.rosy.relation.model.ReTransferReg)
     */
    public List getReTransferRegs(final ReTransferReg reTransferReg) {
        return getHibernateTemplate().find("from ReTransferReg");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (reTransferReg == null) {
            return getHibernateTemplate().find("from ReTransferReg");
        } else {
            // filter on properties set in the reTransferReg
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(reTransferReg).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ReTransferReg.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.relation.dao.ReTransferRegDao#getReTransferReg(String id)
     */
    public ReTransferReg getReTransferReg(final String id) {
        ReTransferReg reTransferReg = (ReTransferReg) getHibernateTemplate().get(ReTransferReg.class, id);
        if (reTransferReg == null) {
            log.warn("uh oh, reTransferReg with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ReTransferReg.class, id);
        }

        return reTransferReg;
    }

    /**
     * @see com.rosy.relation.dao.ReTransferRegDao#saveReTransferReg(ReTransferReg reTransferReg)
     */    
    public void saveReTransferReg(final ReTransferReg reTransferReg) {
        getHibernateTemplate().saveOrUpdate(reTransferReg);
    }

    /**
     * @see com.rosy.relation.dao.ReTransferRegDao#removeReTransferReg(String id)
     */
    public void removeReTransferReg(final String id) {
        getHibernateTemplate().delete(getReTransferReg(id));
    }
}
