/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.impl;

import com.unit7.videocollection.entities.Genre;
import com.unit7.videocollection.utils.EntityFieldSetter;
import java.math.BigDecimal;

/**
 *
 * @author unit7
 */
public class GenreFieldSetterImpl implements EntityFieldSetter {
    @Override
    public void setField(Object entity, String field, Object value) {
        if (entity instanceof Genre) {
            Genre genre = (Genre) entity;
            if (field.equals("id"))
                genre.setId((BigDecimal) value);
            else if (field.equals("name"))
                genre.setName((String) value);
        }
    }
}
