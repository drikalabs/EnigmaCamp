import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Tugas{   

    public static void main(String args[]) throws IOException {
        BufferedReader pArray = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Jumlah data :");// data 1
        String data1 = pArray.readLine();// ambil data 1
        //System.out.print(data1);// cek nilai data 1
        int num1 = Integer.parseInt(data1); 
        //System.out.print(num1);// cek nilai num 1
        String [] nama = new String[num1];
        String [] umur = new String[num1];
        // System.out.println("panjang array nama"+nama.length); //tampil panjang array nama
        // System.out.println("pannjang array umur"+umur.length);// ta,pil panjang array umur
        int antrianArray =1; //nomor ururt data
        for( int a =0;a<num1; a=a+1){ //karena array index mulai dari 0 
            System.out.println("Masukkan Data ke:"+antrianArray++);
            System.out.print("Nama :");
            String dataNama = pArray.readLine();// ambil data nama
            System.out.print("Umur :");// ambil data umur
            String dataUmur =pArray.readLine();

            nama [a] = dataNama;
            umur [a] = dataUmur;

        }
        System.out.println("|nama|Umur|");
        for(int a =0;a<num1; a=a+1){
            System.out.print("|"+nama[a]);
            System.out.println("|"+umur[a]+"|");
        }
        //System.out.println(nama.length);// uji panjang array
        

    }

}