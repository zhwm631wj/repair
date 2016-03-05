
package com.rosy.investigate.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.investigate.model.ExamProceeding;
import com.rosy.investigate.dao.ExamProceedingDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class ExamProceedingDaoHibernate extends BaseDaoHibernate implements ExamProceedingDao {

    /**
     * @see com.rosy.investigate.dao.ExamProceedingDao#getExamProceedings(com.rosy.investigate.model.ExamProceeding)
     */
    public List getExamProceedings(final ExamProceeding examProceeding) {
        return getHibernateTemplate().find("from ExamProceeding");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (examProceeding == null) {
            return getHibernateTemplate().find("from ExamProceeding");
        } else {
            // filter on properties set in the examProceeding
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(examProceeding).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ExamProceeding.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.investigate.dao.ExamProceedingDao#getExamProceeding(String id)
     */
    public ExamProceeding getExamProceeding(final String id) {
        ExamProceeding examProceeding = (ExamProceeding) getHibernateTemplate().get(ExamProceeding.class, id);
        if (examProceeding == null) {
            log.warn("uh oh, examProceeding with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ExamProceeding.class, id);
        }

        return examProceeding;
    }

    /**
     * @see com.rosy.investigate.dao.ExamProceedingDao#saveExamProceeding(ExamProceeding examProceeding)
     */    
    public void saveExamProceeding(final ExamProceeding examProceeding) {
        getHibernateTemplate().saveOrUpdate(examProceeding);
    }

    /**
     * @see com.rosy.investigate.dao.ExamProceedingDao#removeExamProceeding(String id)
     */
    public void removeExamProceeding(final String id) {
        getHibernateTemplate().delete(getExamProceeding(id));
    }
}
