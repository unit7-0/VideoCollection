/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.components;

/**
 *
 * @author unit7
 */
public abstract class ObjectWrapper {
    public ObjectWrapper(Object... objs) {
        objects = objs;
    }
    
    @Override
    public abstract String toString();
    
    public void wrapObjects(Object... objs) {
        objects = objs;
    }
    
    public Object[] unwrapObjects() {
        return objects;
    }
    
    protected Object[] objects;
}
