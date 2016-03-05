
package com.rosy.investigate.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.investigate.model.CheckupReport;
import com.rosy.investigate.dao.CheckupReportDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class CheckupReportDaoHibernate extends BaseDaoHibernate implements CheckupReportDao {

    /**
     * @see com.rosy.investigate.dao.CheckupReportDao#getCheckupReports(com.rosy.investigate.model.CheckupReport)
     */
    public List getCheckupReports(final CheckupReport checkupReport) {
        return getHibernateTemplate().find("from CheckupReport");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (checkupReport == null) {
            return getHibernateTemplate().find("from CheckupReport");
        } else {
            // filter on properties set in the checkupReport
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(checkupReport).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(CheckupReport.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.investigate.dao.CheckupReportDao#getCheckupReport(String id)
     */
    public CheckupReport getCheckupReport(final String id) {
        CheckupReport checkupReport = (CheckupReport) getHibernateTemplate().get(CheckupReport.class, id);
        if (checkupReport == null) {
            log.warn("uh oh, checkupReport with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(CheckupReport.class, id);
        }

        return checkupReport;
    }

    /**
     * @see com.rosy.investigate.dao.CheckupReportDao#saveCheckupReport(CheckupReport checkupReport)
     */    
    public void saveCheckupReport(final CheckupReport checkupReport) {
        getHibernateTemplate().saveOrUpdate(checkupReport);
    }

    /**
     * @see com.rosy.investigate.dao.CheckupReportDao#removeCheckupReport(String id)
     */
    public void removeCheckupReport(final String id) {
        getHibernateTemplate().delete(getCheckupReport(id));
    }
}
