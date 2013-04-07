/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.impl;

import com.unit7.videocollection.entities.Film;
import com.unit7.videocollection.utils.EntityFieldGetter;

/**
 *
 * @author unit7
 */
public class FilmFieldGetterImpl implements EntityFieldGetter {
    @Override
    public Object getFieldValue(Object entity, String field) {
        if (entity instanceof Film) {
            Film film = (Film) entity;
            if (field.equals("id"))
                return film.getId();
            else if (field.equals("title"))
                return film.getTitle();
        }
        
        return null;
    }
}
