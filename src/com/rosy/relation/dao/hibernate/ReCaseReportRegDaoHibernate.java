
package com.rosy.relation.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.relation.model.ReCaseReportReg;
import com.rosy.relation.dao.ReCaseReportRegDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class ReCaseReportRegDaoHibernate extends BaseDaoHibernate implements ReCaseReportRegDao {

    /**
     * @see com.rosy.relation.dao.ReCaseReportRegDao#getReCaseReportRegs(com.rosy.relation.model.ReCaseReportReg)
     */
    public List getReCaseReportRegs(final ReCaseReportReg reCaseReportReg) {
        return getHibernateTemplate().find("from ReCaseReportReg");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (reCaseReportReg == null) {
            return getHibernateTemplate().find("from ReCaseReportReg");
        } else {
            // filter on properties set in the reCaseReportReg
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(reCaseReportReg).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ReCaseReportReg.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.relation.dao.ReCaseReportRegDao#getReCaseReportReg(String id)
     */
    public ReCaseReportReg getReCaseReportReg(final String id) {
        ReCaseReportReg reCaseReportReg = (ReCaseReportReg) getHibernateTemplate().get(ReCaseReportReg.class, id);
        if (reCaseReportReg == null) {
            log.warn("uh oh, reCaseReportReg with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ReCaseReportReg.class, id);
        }

        return reCaseReportReg;
    }

    /**
     * @see com.rosy.relation.dao.ReCaseReportRegDao#saveReCaseReportReg(ReCaseReportReg reCaseReportReg)
     */    
    public void saveReCaseReportReg(final ReCaseReportReg reCaseReportReg) {
        getHibernateTemplate().saveOrUpdate(reCaseReportReg);
    }

    /**
     * @see com.rosy.relation.dao.ReCaseReportRegDao#removeReCaseReportReg(String id)
     */
    public void removeReCaseReportReg(final String id) {
        getHibernateTemplate().delete(getReCaseReportReg(id));
    }
}
