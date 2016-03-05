
package com.rosy.investigate.dao;

import java.util.List;

import com.rosy.dao.Dao;
import com.rosy.investigate.model.ExamProceeding;

public interface ExamProceedingDao extends Dao {

    /**
     * Retrieves all of the examProceedings
     */
    public List getExamProceedings(ExamProceeding examProceeding);

    /**
     * Gets examProceeding's information based on primary key. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * 
     * @param id the examProceeding's id
     * @return examProceeding populated examProceeding object
     */
    public ExamProceeding getExamProceeding(final String id);

    /**
     * Saves a examProceeding's information
     * @param examProceeding the object to be saved
     */    
    public void saveExamProceeding(ExamProceeding examProceeding);

    /**
     * Removes a examProceeding from the database by id
     * @param id the examProceeding's id
     */
    public void removeExamProceeding(final String id);
}

