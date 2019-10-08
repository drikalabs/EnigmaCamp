import com.enigma.config.HibernateConfigs;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List students = session.createQuery("from com.enigma.model.Student").getResultList();
        session.getTransaction().commit();
        for (Object student : students) {
            System.out.println(student.toString());
        }
    }
}
