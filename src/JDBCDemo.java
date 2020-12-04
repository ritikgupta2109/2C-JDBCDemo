
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            //step1
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step2
            // create connection
            String url = "jdbc:mysql://localhost:3306/demo";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);
            //step3
            // prepare statement
            Statement stmt = con.createStatement();
            String query = "INSERT INTO `testinfo` (`id`, `name`) VALUES ('6', 'Abhi');";
            //step4
            // exceute query
            int row = stmt.executeUpdate(query);
            //step5
            // process the result
            System.out.println("no. of rows affected = " + row);
        }
        catch (ClassNotFoundException e) {
            System.out.println("class not found");
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
