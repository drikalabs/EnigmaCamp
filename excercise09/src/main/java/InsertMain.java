import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import com.enigma.service.StudentService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.List;

public class InsertMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insert how many new Student :");
        Integer studentLenght = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i <studentLenght ; i++) {
            System.out.print("Id :");
            Integer id = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Name :");
            String name = bufferedReader.readLine();
            System.out.print("Birth Place :");
            String brithplace =bufferedReader.readLine();
            System.out.print("Birth Date :");
            Date date = Date.valueOf(bufferedReader.readLine());
            System.out.print("Gender :");
            String gender = bufferedReader.readLine();
            System.out.print("Major :");
            String major =bufferedReader.readLine();
            Student student = new Student(id,name,brithplace,date,gender,major);
            StudentService.create(student);
        }
        List<Student>students =StudentService.getAll();
        for (Student student:students) {
            System.out.println(student.toString());
        }
    }
}
