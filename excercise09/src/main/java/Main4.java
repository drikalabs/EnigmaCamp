import com.enigma.config.HibernateConfigs;
import com.enigma.model.Room;
import com.enigma.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session =sessionFactory.getCurrentSession();
        session.beginTransaction();
        Room classYangDidapat = session.get(Room.class,2);
        System.out.println(classYangDidapat.toString());
        Student studentYangDidapat = session.get(Student.class,10);
        studentYangDidapat.setClassromId(classYangDidapat);
        session.save(studentYangDidapat);
        session.getTransaction().commit();
    }
}
