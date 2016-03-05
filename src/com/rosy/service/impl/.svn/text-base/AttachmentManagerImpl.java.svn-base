
package com.rosy.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.model.Attachment;
import com.rosy.dao.AttachmentDao;
import com.rosy.service.AttachmentManager;

public class AttachmentManagerImpl extends BaseManager implements AttachmentManager {
    private AttachmentDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setAttachmentDao(AttachmentDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.service.AttachmentManager#getAttachments(com.rosy.model.Attachment)
     */
    public List getAttachments(final Attachment attachment) {
        return dao.getAttachments(attachment);
    }

    /**
     * @see com.rosy.service.AttachmentManager#getAttachment(String id)
     */
    public Attachment getAttachment(final String id) {
        return dao.getAttachment(new String(id));
    }

    /**
     * @see com.rosy.service.AttachmentManager#saveAttachment(Attachment attachment)
     */
    public void saveAttachment(Attachment attachment) {
    	if(StringUtils.isEmpty(attachment.getId())){
    		attachment.setId(null);
    		attachment.setStatus(Constants.ACTION);
    		attachment.setUploadTime(new Date(System.currentTimeMillis()));
    	}
        dao.saveAttachment(attachment);
    }

    /**
     * @see com.rosy.service.AttachmentManager#removeAttachment(String id)
     */
    public void removeAttachment(final String id) {
        dao.removeAttachment(new String(id));
    }
}
