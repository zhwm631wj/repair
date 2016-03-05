
package com.rosy.register.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.register.model.CaseReport;
import com.rosy.register.dao.CaseReportDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class CaseReportDaoHibernate extends BaseDaoHibernate implements CaseReportDao {

    /**
     * @see com.rosy.register.dao.CaseReportDao#getCaseReports(com.rosy.register.model.CaseReport)
     */
    public List getCaseReports(final CaseReport caseReport) {
        return getHibernateTemplate().find("from CaseReport");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (caseReport == null) {
            return getHibernateTemplate().find("from CaseReport");
        } else {
            // filter on properties set in the caseReport
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(caseReport).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(CaseReport.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.register.dao.CaseReportDao#getCaseReport(String id)
     */
    public CaseReport getCaseReport(final String id) {
        CaseReport caseReport = (CaseReport) getHibernateTemplate().get(CaseReport.class, id);
        if (caseReport == null) {
            log.warn("uh oh, caseReport with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(CaseReport.class, id);
        }

        return caseReport;
    }

    /**
     * @see com.rosy.register.dao.CaseReportDao#saveCaseReport(CaseReport caseReport)
     */    
    public void saveCaseReport(final CaseReport caseReport) {
        getHibernateTemplate().saveOrUpdate(caseReport);
    }

    /**
     * @see com.rosy.register.dao.CaseReportDao#removeCaseReport(String id)
     */
    public void removeCaseReport(final String id) {
        getHibernateTemplate().delete(getCaseReport(id));
    }
}
