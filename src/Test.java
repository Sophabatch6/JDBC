import java.sql.*;

public class Test {
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    public Test(){
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user, pass);
            System.out.println("Connection Successful");;
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
