import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main7 {
    public static void main(String[] args) {
        File file = new File("D:\\\\Academy\\\\excercise06\\\\data.txt");
        List<String> text = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);

            while (true) {
                String txt = br.readLine();
                text.add(txt);
                if (txt == null) {
                    break;
                }
            }
            for (String str : text) {
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
