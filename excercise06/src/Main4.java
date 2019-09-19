public class Main4 {
    public static void main(String[] args) {
    String name ="Adrika Rohman";

    String pisah[]=name.split(" ");
        System.out.println(pisah[0]);
        System.out.println(pisah[1]);
    String lastName = name.substring(7,13);
        System.out.println(lastName);
        System.out.println(name);
        System.out.println(name.trim());//pangakas spasi luar kiri kanan
    }
}
