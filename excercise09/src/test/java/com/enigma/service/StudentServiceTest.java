/*
package com.enigma.service;

import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StudentServiceTest {

    @Test
    public void create() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void getById_should_return_True() {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Student student=session.get(Student.class ,17);
        session.getTransaction().commit();
        session.close();
        assertEquals(student.toString(),StudentService.getById(17).get(0).toString());
    }

    @Test
    public void update() {
    }

    @Test
    public void deleteByid() {
    }
}*/
