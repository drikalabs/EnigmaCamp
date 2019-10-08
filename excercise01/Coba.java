

public class Coba {
    public static void main(String args[]) {
        int[] a = {2, 3, 4, 5, 5, 6, 7};// array
        a[2] = 9;//menambahkan nilai ke indexs ke 2
        int[] b = new int[6];//buat array kosong baru
        b[0] = 9;//menambahkan nilai ke indexs ke 0
        //Interger [] c ={2,3,4,5,5,6,7,3,8,9,9,5,0};


        System.out.println(a[2]);// melihat data ke[2]dari indexs array
        System.out.println(a.length);// .length panjang data array
        System.out.println(b.length);
        System.out.println(b[2]);
    }
}