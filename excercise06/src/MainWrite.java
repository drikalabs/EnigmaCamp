import com.enigma.model.Person;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class MainWrite {
    public static void main(String[] args){
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Masukkan Jumlah Teman  :");
            String num=bufferedReader.readLine();
            int serialNumber=1;
            for (int i = 0; i <Integer.parseInt(num) ; i++) {
                System.out.println("Masukkan Data Teman Ke " + serialNumber++);
                System.out.print("Nama   :");
                String name = bufferedReader.readLine();
                System.out.print("Umur   :");
                String age = bufferedReader.readLine();
                System.out.print("Gender :");
                String gender = bufferedReader.readLine();
                Person person=new Person(name,Integer.parseInt(age),gender);
                person.witeText();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
