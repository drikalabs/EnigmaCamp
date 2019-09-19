import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter= new FileWriter("D:\\Academy\\excercise06\\contoh.txt",true);
        fileWriter.write("halo");
        fileWriter.append("adrika");
        fileWriter.close();
    }
}
