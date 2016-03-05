
package com.rosy.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.model.SysLog;
import com.rosy.dao.SysLogDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class SysLogDaoHibernate extends BaseDaoHibernate implements SysLogDao {

    /**
     * @see com.rosy.dao.SysLogDao#getSysLogs(com.rosy.model.SysLog)
     */
    public List getSysLogs(final SysLog sysLog) {
        return getHibernateTemplate().find("from SysLog");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (sysLog == null) {
            return getHibernateTemplate().find("from SysLog");
        } else {
            // filter on properties set in the sysLog
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(sysLog).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(SysLog.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.dao.SysLogDao#getSysLog(String id)
     */
    public SysLog getSysLog(final String id) {
        SysLog sysLog = (SysLog) getHibernateTemplate().get(SysLog.class, id);
        if (sysLog == null) {
            log.warn("uh oh, sysLog with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(SysLog.class, id);
        }

        return sysLog;
    }

    /**
     * @see com.rosy.dao.SysLogDao#saveSysLog(SysLog sysLog)
     */    
    public void saveSysLog(final SysLog sysLog) {
        getHibernateTemplate().saveOrUpdate(sysLog);
    }

    /**
     * @see com.rosy.dao.SysLogDao#removeSysLog(String id)
     */
    public void removeSysLog(final String id) {
        getHibernateTemplate().delete(getSysLog(id));
    }
}
