
package com.rosy.relation.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.rosy.Constants;
import com.rosy.service.impl.BaseManager;
import com.rosy.relation.model.UndertakePerson;
import com.rosy.relation.dao.UndertakePersonDao;
import com.rosy.relation.service.UndertakePersonManager;

public class UndertakePersonManagerImpl extends BaseManager implements UndertakePersonManager {
    private UndertakePersonDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setUndertakePersonDao(UndertakePersonDao dao) {
        this.dao = dao;
    }

    /**
     * @see com.rosy.relation.service.UndertakePersonManager#getUndertakePersons(com.rosy.relation.model.UndertakePerson)
     */
    public List getUndertakePersons(final UndertakePerson undertakePerson) {
        return dao.getUndertakePersons(undertakePerson);
    }

    /**
     * @see com.rosy.relation.service.UndertakePersonManager#getUndertakePerson(String id)
     */
    public UndertakePerson getUndertakePerson(final String id) {
        return dao.getUndertakePerson(new String(id));
    }

    /**
     * @see com.rosy.relation.service.UndertakePersonManager#saveUndertakePerson(UndertakePerson undertakePerson)
     */
    public void saveUndertakePerson(UndertakePerson undertakePerson) {
    	 if(StringUtils.isEmpty(undertakePerson.getId())){
    		 undertakePerson.setId(null);
    		 undertakePerson.setCreateDate(new Date(System.currentTimeMillis()));
    		 undertakePerson.setRflag(Constants.ACTION);
    	 }
    	dao.saveUndertakePerson(undertakePerson);
    }

    /**
     * @see com.rosy.relation.service.UndertakePersonManager#removeUndertakePerson(String id)
     */
    public void removeUndertakePerson(final String id) {
        dao.removeUndertakePerson(new String(id));
    }
}
