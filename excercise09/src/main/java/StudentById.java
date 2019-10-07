import com.enigma.model.Student;
import com.enigma.service.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class StudentById {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan Id Yang dicari :");
        Integer cari =Integer.parseInt(bufferedReader.readLine());
        List<Student> students = StudentService.getById(cari);
        for (Student student:students) {
            System.out.println(student.toString());
        }
    }
}
