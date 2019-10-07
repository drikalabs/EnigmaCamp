import com.enigma.model.Circle;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Circle> circleSet =new HashSet<>();
        circleSet.add(new Circle(3));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(4));
        circleSet.add(new Circle(8));
        System.out.println("BAnyak nilai ="+circleSet.size());
        for (Circle nilai:circleSet){
            System.out.println(nilai.getR());
        }

    }
}
