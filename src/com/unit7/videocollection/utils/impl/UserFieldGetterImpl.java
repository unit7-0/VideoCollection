/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.impl;

import com.unit7.videocollection.entities.Users;
import com.unit7.videocollection.utils.EntityFieldGetter;

/**
 *
 * @author unit7
 */
public class UserFieldGetterImpl implements EntityFieldGetter {
    @Override
    public Object getFieldValue(Object entity, String field) {
        if (entity instanceof Users) {
            Users user = (Users) entity;
            if (field.equals("id"))
                return user.getId();
        }
        
        return null;
    }
    
}
