import com.enigma.service.PersonGenerator;
public class MainRead {
    public static void main(String[] args) {
        PersonGenerator personGenerator=new PersonGenerator("D:\\Academy\\excercise06\\dataContainer\\data.txt");
        personGenerator.Readfile();
        personGenerator.print();
        personGenerator.getAverageAge();
        personGenerator.getFriend();

    }
}

