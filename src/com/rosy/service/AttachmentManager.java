
package com.rosy.service;

import java.util.List;

import com.rosy.service.Manager;
import com.rosy.model.Attachment;
import com.rosy.dao.AttachmentDao;

public interface AttachmentManager extends Manager {
    /**
     * Retrieves all of the attachments
     */
    public List getAttachments(Attachment attachment);

    /**
     * Gets attachment's information based on id.
     * @param id the attachment's id
     * @return attachment populated attachment object
     */
    public Attachment getAttachment(final String id);

    /**
     * Saves a attachment's information
     * @param attachment the object to be saved
     */
    public void saveAttachment(Attachment attachment);

    /**
     * Removes a attachment from the database by id
     * @param id the attachment's id
     */
    public void removeAttachment(final String id);
}

