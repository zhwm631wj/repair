
package com.rosy.investigate.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.investigate.model.ExamProceeding;
import com.rosy.investigate.dao.ExamProceedingDao;
import com.rosy.investigate.service.ExamProceedingManager;

public class ExamProceedingManagerImpl extends BaseManager implements ExamProceedingManager {
    private ExamProceedingDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setExamProceedingDao(ExamProceedingDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.investigate.service.ExamProceedingManager#getExamProceedings(com.rosy.investigate.model.ExamProceeding)
     */
    public List getExamProceedings(final ExamProceeding examProceeding) {
        return dao.getExamProceedings(examProceeding);
    }

    /**
     * @see com.rosy.investigate.service.ExamProceedingManager#getExamProceeding(String id)
     */
    public ExamProceeding getExamProceeding(final String id) {
        return dao.getExamProceeding(new String(id));
    }

    /**
     * @see com.rosy.investigate.service.ExamProceedingManager#saveExamProceeding(ExamProceeding examProceeding)
     */
    public void saveExamProceeding(ExamProceeding examProceeding) {
    	if(StringUtils.isEmpty(examProceeding.getId())){
    		examProceeding.setId(null);
    		examProceeding.setCreateDate(new Date(System.currentTimeMillis()));
    		examProceeding.setRflag(Constants.ACTION);
      	 }
        dao.saveExamProceeding(examProceeding);
    }

    /**
     * @see com.rosy.investigate.service.ExamProceedingManager#removeExamProceeding(String id)
     */
    public void removeExamProceeding(final String id) {
        dao.removeExamProceeding(new String(id));
    }
}
