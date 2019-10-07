import com.enigma.model.Direction;
import com.enigma.model.Robot;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader ambil = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Cordinate x,y,and Direction on the last ");
        String[] xydir= ambil.readLine().split(",");
        Robot rush =new Robot(Integer.parseInt(xydir[0]),Integer.parseInt(xydir[1]),Direction.valueOf(xydir[2].toUpperCase()));
        System.out.println("Comand Turn Right=R,Turn Left=L,FORRWARD =F, BACKWARD = B");
        rush.setCommands(ambil.readLine());
        System.out.println("NORT EAST SOUT WEST");
        rush.Run();
    }
}
