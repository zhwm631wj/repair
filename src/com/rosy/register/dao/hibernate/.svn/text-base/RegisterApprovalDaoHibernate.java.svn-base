
package com.rosy.register.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.register.model.RegisterApproval;
import com.rosy.register.dao.RegisterApprovalDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class RegisterApprovalDaoHibernate extends BaseDaoHibernate implements RegisterApprovalDao {

    /**
     * @see com.rosy.register.dao.RegisterApprovalDao#getRegisterApprovals(com.rosy.register.model.RegisterApproval)
     */
    public List getRegisterApprovals(final RegisterApproval registerApproval) {
        return getHibernateTemplate().find("from RegisterApproval");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (registerApproval == null) {
            return getHibernateTemplate().find("from RegisterApproval");
        } else {
            // filter on properties set in the registerApproval
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(registerApproval).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(RegisterApproval.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.register.dao.RegisterApprovalDao#getRegisterApproval(String id)
     */
    public RegisterApproval getRegisterApproval(final String id) {
        RegisterApproval registerApproval = (RegisterApproval) getHibernateTemplate().get(RegisterApproval.class, id);
        if (registerApproval == null) {
            log.warn("uh oh, registerApproval with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(RegisterApproval.class, id);
        }

        return registerApproval;
    }

    /**
     * @see com.rosy.register.dao.RegisterApprovalDao#saveRegisterApproval(RegisterApproval registerApproval)
     */    
    public void saveRegisterApproval(final RegisterApproval registerApproval) {
        getHibernateTemplate().saveOrUpdate(registerApproval);
    }

    /**
     * @see com.rosy.register.dao.RegisterApprovalDao#removeRegisterApproval(String id)
     */
    public void removeRegisterApproval(final String id) {
        getHibernateTemplate().delete(getRegisterApproval(id));
    }
}
