import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import com.enigma.model.StudentSubject;
import com.enigma.model.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentSubjectMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session =sessionFactory.getCurrentSession();
        session.beginTransaction();

        Student student = (Student) session.get(Student.class, 1);
        Subject subject = (Subject) session.get(Subject.class, 1);

        StudentSubject stusub =new StudentSubject();
        stusub.setIdStudent(student);
        stusub.setIdSubject(subject);

        session.getTransaction().commit();
        session.close();
    }
}
