package com.enigma.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfigs {
    private static SessionFactory sessionFactory;
    private static SessionFactory buildSessionFactory(){
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();

        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory  creation failed"+ex);
            ex.printStackTrace();
        }
        return sessionFactory;
    }
    public static  SessionFactory getSessionFactory(){
        if (sessionFactory==null) sessionFactory=buildSessionFactory();
        return sessionFactory;
    }
}
