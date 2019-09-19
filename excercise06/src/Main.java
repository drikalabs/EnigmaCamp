import com.enigma.service.FileService;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        FileService file = new FileService();
        file.weriteText(1);
    }
}
