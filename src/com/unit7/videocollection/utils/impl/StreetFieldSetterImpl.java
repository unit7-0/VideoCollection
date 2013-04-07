/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.impl;

import com.unit7.videocollection.entities.Street;
import com.unit7.videocollection.utils.EntityFieldSetter;
import java.math.BigDecimal;

/**
 *
 * @author unit7
 */
public class StreetFieldSetterImpl implements EntityFieldSetter {
    @Override
    public void setField(Object entity, String field, Object value) {
        if (entity instanceof Street) {
            Street street = (Street) entity;
            if (field.equals("id"))
                street.setId((BigDecimal) value);
            else if (field.equals("title"))
                street.setName((String) value);
        }
    }
    
}
