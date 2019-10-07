import com.enigma.model.Student;
import com.enigma.service.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;

public class StudentUpdateById {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insert initial Id for update :");
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
        StudentService.update(student);
    }
}
