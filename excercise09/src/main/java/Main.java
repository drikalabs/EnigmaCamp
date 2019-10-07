import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory =HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        //Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
//        Student student =new Student();
//        student.setId(17);
//        student.setName("Crish Hamsword");
//        student.setBirthPlace("London");
//        student.setBirthDate(new Date(1995-8-02));
//        student.setGender("M");
//        student.setMajor("IS");
//
//        session.beginTransaction();
//
//        session.save(student);
//
//        session.getTransaction().commit();
    }
}
