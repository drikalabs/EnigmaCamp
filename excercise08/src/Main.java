import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/school","postgres","blimbeng38");
            Statement statement= connection.createStatement();
            ResultSet set= statement.executeQuery("select * from student");
            set.next();
            System.out.println(set.getString("name"));
            set.next();
            System.out.println(set.getString("name"));
            set.next();
            System.out.println(set.getString("name"));
            set.next();
            System.out.println(set.getString("name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
