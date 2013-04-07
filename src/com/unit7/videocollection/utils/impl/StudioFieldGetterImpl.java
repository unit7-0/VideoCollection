/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.impl;

import com.unit7.videocollection.entities.Studio;
import com.unit7.videocollection.utils.EntityFieldGetter;

/**
 *
 * @author unit7
 */
public class StudioFieldGetterImpl implements EntityFieldGetter {
    @Override
    public Object getFieldValue(Object entity, String field) {
        if (entity instanceof Studio) {
            Studio studio = (Studio) entity;
            if (field.equals("id"))
                return studio.getId();
            else if (field.equals("name"))
                return studio.getName();
        }
        
        return null;
    }
}
