import com.enigma.model.Friend;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Set<Friend> angga = new HashSet<>(); // list teman angga
        angga.add(new Friend("jono"));
        angga.add(new Friend("joni"));
        angga.add(new Friend("joe"));
        angga.add(new Friend("ilham"));
        angga.add(new Friend("dedy"));
        angga.add(new Friend("wahyu"));
        angga.add(new Friend("bayu"));
        Set<Friend> onggo = new HashSet<>();// list teman onggo
        onggo.add(new Friend("ilham"));
        onggo.add(new Friend("wahyu"));
        onggo.add(new Friend("dedy"));
        onggo.add(new Friend("adrika"));
        onggo.add(new Friend("aldy"));
        onggo.add(new Friend("agam"));
        onggo.add(new Friend("ragil"));
        Set<Friend> interception = new HashSet<Friend>(angga);

        System.out.println("List of people who are friends with these two people Angga and Onggo");
        if (interception.retainAll(onggo)) {
            for (Friend nilai : interception) {
                System.out.println(nilai.getFriend());
            }
        }
    }
}
