import com.enigma.model.Subject;
import com.enigma.service.SubjectService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SubjectMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insert how many new Subject :");
        Integer sublength = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i <sublength ; i++) {
            System.out.print("Id :");
            Integer id = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Subject :");
            String subject = bufferedReader.readLine();
            System.out.print("SKS :");
            Integer sks = Integer.parseInt(bufferedReader.readLine());
            Subject insertsubject = new Subject(id,subject,sks);
            SubjectService.create(insertsubject);
        }
    }
}
