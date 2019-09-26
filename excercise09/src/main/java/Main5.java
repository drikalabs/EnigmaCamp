import com.enigma.config.HibernateConfigs;
import com.enigma.model.Room;
import com.enigma.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session =sessionFactory.getCurrentSession();
        session.beginTransaction();
        Room classYangDidapat = session.get(Room.class,1);
        List<Student>studentList =classYangDidapat.getStudents();
        for (Student stu:studentList) {
            System.out.println(stu.toString());
        }
        session.getTransaction().commit();
    }
}
