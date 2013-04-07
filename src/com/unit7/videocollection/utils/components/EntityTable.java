/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.components;

import com.unit7.videocollection.utils.HibernateUtil;
import java.util.Collection;
import javax.swing.JTable;
import org.hibernate.Session;

/**
 *
 * @author unit7
 */
public abstract class EntityTable<T> extends JTable implements EntityTableActions {
    public EntityTable(Class<T> clazz) {
        entityClass = clazz;
    }
    
    protected abstract void init();
    
    @Override
    public void refresh() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        entities = session.createCriteria(entityClass).list();
    }
    
    protected Collection<T> entities;
    private Class entityClass;
}
