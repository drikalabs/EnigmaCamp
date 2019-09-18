import com.enigma.model.Circle;
import com.enigma.model.Direction;
import com.enigma.model.Kendaraan;
import com.enigma.model.Mobil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader ambil = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("input x,y");
        String data =ambil.readLine();
        String[] xy= data.split(",");
        Kendaraan rush =new Kendaraan(Integer.parseInt(xy[0]),Integer.parseInt(xy[1] /*, Direction.NORT*/));

        System.out.println("Masukkan Bensin");
        String bensin = ambil.readLine();
        int bsn =Integer.parseInt(bensin);
        rush.setFuel(bsn);

        System.out.println("masukkan Arah R,L,F,B");
        String comands = ambil.readLine();
        rush.setCommands(comands);
        rush.doRun();



    }
}
