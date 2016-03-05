
package com.rosy.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.model.Attachment;

public interface AttachmentDao extends Dao {

    /**
     * Retrieves all of the attachments
     */
    public List getAttachments(Attachment attachment);

    /**
     * Gets attachment's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
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

