package com.rosy.dao.hibernate;

import java.util.List;

import com.rosy.dao.LookupDao;


/**
 * Hibernate implementation of LookupDao.
 *
 * <p><a href="LookupDaoHibernate.java.html"><i>View Source</i></a></p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public class LookupDaoHibernate extends BaseDaoHibernate implements LookupDao {

    /**
     * @see com.rosy.dao.LookupDao#getRoles()
     */
    public List getRoles() {
        log.debug("retrieving all role names...");

        return getHibernateTemplate().find("from Role order by name");
    }
}
