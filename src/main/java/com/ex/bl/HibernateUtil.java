package com.ex.bl;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
* @IonToncu
* */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {

            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        sessionFactory.close();
        /*
         * mandatory need to close session after using this db
         * */
    }
}