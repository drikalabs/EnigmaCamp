import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main6 {

    public static void main(String[] args) {
        File fileku = new File("D:\\Academy\\excercise06\\data.txt");
        try {
            FileReader fileReader = new FileReader(fileku);
            boolean eof = false;
            while (!eof) {
                int c = fileReader.read();
                if (c == -1) {
                    eof = true;
                    break;
                }
                System.out.print(c == 10 ? "*" : String.valueOf((char) c));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
