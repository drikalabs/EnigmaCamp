import com.enigma.dao.StudentDao;
import com.enigma.model.Student;
import com.enigma.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext(
                "aplicationContext.xml");

        Student tony =new Student(1,"Tony","Jakarta",new Date(),"M","IT");
        Student dani =new Student(2,"dani","Jakarta",new Date(),"M","IT");
        Student dedi =new Student(3,"dedi","Jakarta",new Date(),"M","IT");
        Student Dono =new Student(4,"dono","Jakarta",new Date(),"M","IT");
        Student sarah =new Student(5,"Sarah","Jakarta",new Date(),"F","IT");
        StudentDao studentDao= (StudentDao) context.getBean("studentDao");
        studentDao.save(tony);
        studentDao.save(dani);
        studentDao.save(dedi);
        studentDao.save(Dono);
        studentDao.save(sarah);
        StudentService studentService=(StudentService) context.getBean("studentService");
        System.out.println(studentService.countMale());

       /* StudentDao studentDao=new StudentDao();
        studentDao.save(tony);
        System.out.println(studentDao.get(1).getName());
        System.out.println(studentDao.get(1).getBirthDate());*/
    }
}
