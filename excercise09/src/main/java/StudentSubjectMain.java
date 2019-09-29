import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import com.enigma.model.StudentSubject;
import com.enigma.model.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Set;

public class StudentSubjectMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session =sessionFactory.getCurrentSession();
        session.beginTransaction();

        Student student = session.get(Student.class, 1);
        List<StudentSubject> studentSubjects = student.getStudentSubjects();
        for (StudentSubject stud:studentSubjects) {
            stud.getIdStudent();
            stud.getIdSubject();
            System.out.println(stud.toString());

        }


        session.getTransaction().commit();
        session.close();
    }
}
