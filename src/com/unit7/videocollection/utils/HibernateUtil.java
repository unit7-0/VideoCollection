package com.unit7.videocollection.utils;

import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

/**
 * @autor unit7
 */
public class HibernateUtil {
    static {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Exception e) {
            System.err.println("Error while creating connection: " + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void insertEntity(Object entity, EntityFieldSetter setter, EntityFieldGetter getter) {
        Session session = getSessionFactory().openSession();
        List list = session.createCriteria(entity.getClass()).list();
        BigDecimal lastId = BigDecimal.ZERO;
        
        if (list != null && list.size() > 0) 
            lastId = (BigDecimal) getter.getFieldValue(list.get(list.size() - 1), "id");
        
        setter.setField(entity, "id", lastId.add(BigDecimal.ONE));
        
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

    public static Object getEntityFromTable(Class entity, String field, Object value) {
        Session session = getSessionFactory().openSession();
        return session.createCriteria(entity).add(Restrictions.eq(field, value)).uniqueResult();
    }
    
    private static final SessionFactory sessionFactory;
}
