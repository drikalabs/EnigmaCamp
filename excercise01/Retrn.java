import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Retrn {
    public static void main(String args[]) throws IOException {
        BufferedReader pArray = new BufferedReader(new InputStreamReader(System.in));
        int n = 7;
        System.out.println(getDesk(Integer.parseInt(pArray.readLine())));
    }

    static Integer getDesk(int numb) {
        Integer hasil = numb * 2;
        // konversi = String.valueOf(hasil);
        return hasil;
    }
    // {
    //     if ( numb%2==0 ) 
    //     {
    //         return "genap";
    //     }
    //     else
    //     {
    //         return "ganjil";
    //     }
    // }
}