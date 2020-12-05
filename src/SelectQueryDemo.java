import java.sql.*;

public class SelectQueryDemo {
    public static void main(String[] args) {
        try {
            Connection con = getDbConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM testinfo WHERE id > 1;";
            ResultSet rs = stmt.executeQuery(sql);
            //processing result
            while (rs.next()){
               int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + "\t\t\t" + name);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public static Connection getDbConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "";
        return DriverManager.getConnection(url, user,pass);
    }
}