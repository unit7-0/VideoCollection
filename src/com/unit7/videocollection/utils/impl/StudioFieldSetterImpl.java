/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.impl;

import com.unit7.videocollection.entities.Studio;
import com.unit7.videocollection.utils.EntityFieldSetter;
import java.math.BigDecimal;

/**
 *
 * @author unit7
 */
public class StudioFieldSetterImpl implements EntityFieldSetter {
    @Override
    public void setField(Object entity, String field, Object value) {
        if (entity instanceof Studio) {
            Studio studio = (Studio) entity;
            if (field.equals("id"))
                studio.setId((BigDecimal) value);
            else if (field.equals("name"))
                studio.setName((String) value);
        }
    }
}
