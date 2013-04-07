/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.impl;

import com.unit7.videocollection.entities.Film;
import com.unit7.videocollection.utils.EntityFieldSetter;
import java.math.BigDecimal;

/**
 *
 * @author unit7
 */
public class FilmFieldSetterImpl implements EntityFieldSetter {
    @Override
    public void setField(Object entity, String field, Object value) {
        if (entity instanceof Film) {
            Film film = (Film) entity;
            if (field.equals("id"))
                film.setId((BigDecimal) value);
            else if (field.equals("title"))
                film.setTitle((String) value);
        }
    }
}
