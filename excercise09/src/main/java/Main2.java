import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class Main2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory =HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Student student=session.get(Student.class ,17);
        session.getTransaction().commit();
        System.out.println(student.toString());
    }
}
