/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.impl;

import com.unit7.videocollection.entities.Users;
import com.unit7.videocollection.utils.EntityFieldSetter;
import java.math.BigDecimal;

/**
 *
 * @author unit7
 */
public class UserFieldSetterImpl implements EntityFieldSetter {
    @Override
    public void setField(Object entity, String field, Object value) {
        if (entity instanceof Users) {
            Users user = (Users) entity;
            if (field.equals("id"))
                user.setId((BigDecimal) value);
        }
    }
    
}
