import java.sql.*;

public class Main2 {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection
                    ("jdbc:postgresql://127.0.0.1:5432/school",
                            "postgres","blimbeng38");
            Statement statement= connection.createStatement();
            Integer id=6;
            String name="Math";
            Integer sks=3;
            String query="insert into subject(id_subject,subject,sks)values("+id+",'"+name+"',"+sks+")";
            statement.execute(query);// you can use executeUpdate or jus execute for insert update delete. executequery just for select or ani sintak who need return
            ResultSet set= statement.executeQuery("select * from student");
            for (int i = 0;true; i++) {
                if (set.next()){
                    System.out.println(set.getString("name")+","+set.getString("gender"));
                }else{
                    break;
                }
            }
            System.out.println("<+++++++++++++++++++++++++++++++++>");
            set =statement.executeQuery("select * from subject");// new set for new query whitout making new result set
            for (int i = 0;true; i++) {
                if (set.next()){
                    System.out.println(set.getString("id_subject")+","+set.getString("subject"));
                }else{
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
