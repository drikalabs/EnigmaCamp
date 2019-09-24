import com.enigma.model.Student;
import com.enigma.service.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MainSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What you looking FOr :");
        String keyword = bufferedReader.readLine();
        List<Student> students= StudentService.search(keyword);
        for (Student studen:students) {
            System.out.println(studen.toString());
        }

    }
}
