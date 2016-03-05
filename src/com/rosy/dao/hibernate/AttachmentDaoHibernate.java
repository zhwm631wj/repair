
package com.rosy.dao.hibernate;

import java.util.List;

import com.rosy.dao.hibernate.BaseDaoHibernate;
import com.rosy.model.Attachment;
import com.rosy.dao.AttachmentDao;

import org.springframework.orm.ObjectRetrievalFailureException;

public class AttachmentDaoHibernate extends BaseDaoHibernate implements AttachmentDao {

    /**
     * @see com.rosy.dao.AttachmentDao#getAttachments(com.rosy.model.Attachment)
     */
    public List getAttachments(final Attachment attachment) {
        return getHibernateTemplate().find("from Attachment");

        /* Remove the line above and uncomment this code block if you want 
           to use Hibernate's Query by Example API.
        if (attachment == null) {
            return getHibernateTemplate().find("from Attachment");
        } else {
            // filter on properties set in the attachment
            HibernateCallback callback = new HibernateCallback() {
                public Object doInHibernate(Session session) throws HibernateException {
                    Example ex = Example.create(attachment).ignoreCase().enableLike(MatchMode.ANYWHERE);
                    return session.createCriteria(Attachment.class).add(ex).list();
                }
            };
            return (List) getHibernateTemplate().execute(callback);
        }*/
    }

    /**
     * @see com.rosy.dao.AttachmentDao#getAttachment(String id)
     */
    public Attachment getAttachment(final String id) {
        Attachment attachment = (Attachment) getHibernateTemplate().get(Attachment.class, id);
        if (attachment == null) {
            log.warn("uh oh, attachment with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(Attachment.class, id);
        }

        return attachment;
    }

    /**
     * @see com.rosy.dao.AttachmentDao#saveAttachment(Attachment attachment)
     */    
    public void saveAttachment(final Attachment attachment) {
        getHibernateTemplate().saveOrUpdate(attachment);
    }

    /**
     * @see com.rosy.dao.AttachmentDao#removeAttachment(String id)
     */
    public void removeAttachment(final String id) {
        getHibernateTemplate().delete(getAttachment(id));
    }
}
