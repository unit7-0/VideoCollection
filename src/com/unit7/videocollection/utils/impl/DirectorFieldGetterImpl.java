/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.impl;

import com.unit7.videocollection.entities.Director;
import com.unit7.videocollection.utils.EntityFieldGetter;

/**
 *
 * @author unit7
 */
public class DirectorFieldGetterImpl implements EntityFieldGetter {
    @Override
    public Object getFieldValue(Object entity, String field) {
        if (entity instanceof Director) {
            Director director = (Director) entity;
            if (field.equals("id"))
                return director.getId();
            else if (field.equals("name"))
                return director.getName();
        }
        
        return null;
    }
}
