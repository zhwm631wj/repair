
package com.rosy.punish.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.punish.model.CaseInvestEndReport;
import com.rosy.punish.dao.CaseInvestEndReportDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class CaseInvestEndReportDaoHibernate extends BaseDaoHibernate implements CaseInvestEndReportDao {

    /**
     * @see com.rosy.punish.dao.CaseInvestEndReportDao#getCaseInvestEndReports(com.rosy.punish.model.CaseInvestEndReport)
     */
    public List getCaseInvestEndReports(final CaseInvestEndReport caseInvestEndReport) {
        return getHibernateTemplate().find("from CaseInvestEndReport");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (caseInvestEndReport == null) {
            return getHibernateTemplate().find("from CaseInvestEndReport");
        } else {
            // filter on properties set in the caseInvestEndReport
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(caseInvestEndReport).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(CaseInvestEndReport.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.punish.dao.CaseInvestEndReportDao#getCaseInvestEndReport(String id)
     */
    public CaseInvestEndReport getCaseInvestEndReport(final String id) {
        CaseInvestEndReport caseInvestEndReport = (CaseInvestEndReport) getHibernateTemplate().get(CaseInvestEndReport.class, id);
        if (caseInvestEndReport == null) {
            log.warn("uh oh, caseInvestEndReport with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(CaseInvestEndReport.class, id);
        }

        return caseInvestEndReport;
    }

    /**
     * @see com.rosy.punish.dao.CaseInvestEndReportDao#saveCaseInvestEndReport(CaseInvestEndReport caseInvestEndReport)
     */    
    public void saveCaseInvestEndReport(final CaseInvestEndReport caseInvestEndReport) {
        getHibernateTemplate().saveOrUpdate(caseInvestEndReport);
    }

    /**
     * @see com.rosy.punish.dao.CaseInvestEndReportDao#removeCaseInvestEndReport(String id)
     */
    public void removeCaseInvestEndReport(final String id) {
        getHibernateTemplate().delete(getCaseInvestEndReport(id));
    }
}
