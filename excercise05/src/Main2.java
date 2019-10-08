import com.enigma.model.Circle;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(10));
        circles.add(new Circle(15));
        circles.add(new Circle(3));
        circles.add(new Circle(1));
        circles.add(new Circle(2));

        System.out.println(circles.size());
        Circle plate = new Circle(15);
        System.out.println("cari  :" + plate);
        System.out.println(circles.contains(plate));

        Iterator<Circle> iterator = circles.iterator();

        while (iterator.hasNext()) {
            Circle circle = iterator.next();
            System.out.println(circle.getR());
            if (iterator.equals(circles.contains(plate))) {
                iterator.remove();
            }
        }
        System.out.println("============>");
        System.out.println(circles.size());
        System.out.println("============>");
        iterator = circles.iterator();
        while (iterator.hasNext()) {
            Circle circle = iterator.next();
            System.out.println(circle.getR());
        }
        System.out.println("============>");
        System.out.println(circles.size());
    }

}
