import com.enigma.connection.DBConnection;
import com.enigma.model.Student;
import com.enigma.service.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class Main3 {
    public static void main(String[] args) throws IOException, SQLException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insert how many new Student :");
        Integer studentLenght = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i <studentLenght ; i++) {
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
            Student studentInput = new Student(name,brithplace,date,gender,major);
            StudentService.create(studentInput);
        }
        List<Student>students=StudentService.getAll();
        for (Student studen:students) {
            System.out.println(studen.toString());
        }
    }
}
