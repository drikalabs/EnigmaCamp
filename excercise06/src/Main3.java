import com.enigma.model.Circle;

import java.io.FileWriter;

public class Main3 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\Academy\\excercise06\\data.txt", true);
            Circle circle = new Circle(5);
            fileWriter.write(circle.print());
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

