import com.enigma.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

//        Heroes gatotkaca = new StregntHeroes(100,120,20,40,30);
        Skill jump= new Skill("Jump",20,15);
        Heroes gundala =new Heroes("gundala",100,100,15,jump);
        Heroes saitama =new Heroes("saitama",100,100,50,jump);
        Heroes ninja =new AssassinHeroes("Ninja",100,100,20,jump);
        gundala.attack(saitama);
        Tower tower =new Tower(1000);
        saitama.castSkill(gundala);
        saitama.attack(tower);
        ninja.attack(gundala);
        gundala.attack(ninja);
        ninja.attack(tower);
        System.out.println(gundala.print());
        System.out.println(ninja.print());
        System.out.println(saitama.print());
        System.out.println(tower.print());
    }


}
