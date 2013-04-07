/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.impl;

import com.unit7.videocollection.entities.Genre;
import com.unit7.videocollection.utils.EntityFieldGetter;

/**
 *
 * @author unit7
 */
public class GenreFieldGetterImpl implements EntityFieldGetter {
    @Override
    public Object getFieldValue(Object entity, String field) {
        if (entity instanceof Genre) {
            Genre genre = (Genre) entity;
            if (field.equals("id"))
                return genre.getId();
            else if (field.equals("name"))
                return genre.getName();
        }
        
        return null;
    }
}
