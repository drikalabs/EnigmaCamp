package com.enigma.service;

import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentService {
    public static void create(Student student) {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }
    public static List<Student> getAll(){
        SessionFactory sessionFactory =HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List students= session.createQuery("from com.enigma.model.Student").getResultList();
        session.getTransaction().commit();
        session.close();
        return students;
    }
    public  static List<Student>getById(Integer id){
        SessionFactory sessionFactory =HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List students= session.createQuery("from com.enigma.model.Student where id ="+id+"").getResultList();
        session.getTransaction().commit();
        session.close();
        return students;
    }
    public static void update(Student student) {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(student);
        session.getTransaction().commit();
        session.close();
    }
    public static void deleteByid(Integer id){
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Student deleteStudent = new Student();
        deleteStudent.setId(id);
        session.beginTransaction();
        session.delete(deleteStudent);
        session.getTransaction().commit();
        session.close();
    }
}
