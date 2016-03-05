
package com.rosy.relation.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.relation.model.ReInOrOutPropList;
import com.rosy.relation.dao.ReInOrOutPropListDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class ReInOrOutPropListDaoHibernate extends BaseDaoHibernate implements ReInOrOutPropListDao {

    /**
     * @see com.rosy.relation.dao.ReInOrOutPropListDao#getReInOrOutPropLists(com.rosy.relation.model.ReInOrOutPropList)
     */
    public List getReInOrOutPropLists(final ReInOrOutPropList reInOrOutPropList) {
        return getHibernateTemplate().find("from ReInOrOutPropList");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (reInOrOutPropList == null) {
            return getHibernateTemplate().find("from ReInOrOutPropList");
        } else {
            // filter on properties set in the reInOrOutPropList
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(reInOrOutPropList).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(ReInOrOutPropList.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.relation.dao.ReInOrOutPropListDao#getReInOrOutPropList(String id)
     */
    public ReInOrOutPropList getReInOrOutPropList(final String id) {
        ReInOrOutPropList reInOrOutPropList = (ReInOrOutPropList) getHibernateTemplate().get(ReInOrOutPropList.class, id);
        if (reInOrOutPropList == null) {
            log.warn("uh oh, reInOrOutPropList with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(ReInOrOutPropList.class, id);
        }

        return reInOrOutPropList;
    }

    /**
     * @see com.rosy.relation.dao.ReInOrOutPropListDao#saveReInOrOutPropList(ReInOrOutPropList reInOrOutPropList)
     */    
    public void saveReInOrOutPropList(final ReInOrOutPropList reInOrOutPropList) {
        getHibernateTemplate().saveOrUpdate(reInOrOutPropList);
    }

    /**
     * @see com.rosy.relation.dao.ReInOrOutPropListDao#removeReInOrOutPropList(String id)
     */
    public void removeReInOrOutPropList(final String id) {
        getHibernateTemplate().delete(getReInOrOutPropList(id));
    }
}
