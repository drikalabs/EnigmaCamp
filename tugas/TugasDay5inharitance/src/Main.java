import com.enigma.model.MobaHero;
import com.enigma.model.RoleType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader take =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nama Hero :");
        String name = take.readLine();

        System.out.print("Healt Point :");
        String hp = take.readLine();
        System.out.print("Mana Point :");
        String mp = take.readLine();
        System.out.print("Basic Damage :");
        String basicdamage = take.readLine();
        System.out.print("Basic Deffends :");
        String basicdeff = take.readLine();
        System.out.println(" Chose Role / Type (ASSASSIN, FIGHTER, MAGE, TANK)");
        String role = take.readLine();
        RoleType myhero = new RoleType(Double.parseDouble(hp),
                Double.parseDouble(mp),
                Double.parseDouble(basicdamage),
                Double.parseDouble(basicdeff),
                name,role);
        //System.out.println(myhero.print());
//        myhero.doBalancingRole(role);
        myhero.showStatuslv1();
        System.out.println("<=====SIMULASTION STATS HERO ON LEVEL 2-15====>");
        myhero.doSimulation();

    }
}
