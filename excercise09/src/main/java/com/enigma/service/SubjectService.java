package com.enigma.service;

import com.enigma.config.HibernateConfigs;

import com.enigma.model.Student;
import com.enigma.model.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class SubjectService {
    public static void create(Subject subject) {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(subject);
        session.getTransaction().commit();
        session.close();
    }

    public static List<Subject> getAll() {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List subject = session.createQuery("from com.enigma.model.Subject").getResultList();
        session.getTransaction().commit();
        session.close();
        return subject;
    }

    public static List<Subject> getById(Integer id) {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List subject = session.createQuery("from com.enigma.model.Subject where id =" + id + "").getResultList();
        session.getTransaction().commit();
        session.close();
        return subject;
    }

    public static void update(Subject subject) {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(subject);
        session.getTransaction().commit();
        session.close();
    }

    public static void deleteByid(Integer id) {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Subject deleteSubject = new Subject();
        deleteSubject.setId(id);
        session.beginTransaction();
        session.delete(deleteSubject);
        session.getTransaction().commit();
        session.close();
    }
}
