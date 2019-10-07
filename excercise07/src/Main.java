import java.time.Clock;

public class Main {
    
    public static void main(String[] args) {
        Clock c = Clock.systemUTC();
        System.out.println(c.instant());
    }
}
