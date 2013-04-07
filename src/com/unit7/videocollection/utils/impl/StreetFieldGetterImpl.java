/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.impl;

import com.unit7.videocollection.entities.Street;
import com.unit7.videocollection.utils.EntityFieldGetter;

/**
 *
 * @author unit7
 */
public class StreetFieldGetterImpl implements EntityFieldGetter {
    @Override
    public Object getFieldValue(Object entity, String field) {
        if (entity instanceof Street) {
            Street street = (Street) entity;
            if (field.equals("id"))
                return street.getId();
            else if (field.equals("name"))
                return street.getName();
        }
        
        return null;
    }
    
}
