/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.impl;

import com.unit7.videocollection.entities.Director;
import com.unit7.videocollection.utils.EntityFieldSetter;
import java.math.BigDecimal;

/**
 *
 * @author unit7
 */
public class DirectorFieldSetterImpl implements EntityFieldSetter {
    @Override
    public void setField(Object entity, String field, Object value) {
        if (entity instanceof Director) {
            Director director = (Director) entity;
            if (field.equals("id"))
                director.setId((BigDecimal) value);
            else if (field.equals("name"))
                director.setName((String) value);
        }
    }
}
