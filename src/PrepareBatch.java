import java.sql.*;
import java.util.Scanner;

public class PrepareBatch {
    public static void main(String[] args) {
        int num = 0;
        Scanner s = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/b6b", "root", "");
            Statement st = con.createStatement();
            st.execute("create table kit (id varchar(35), sname varchar(50))");
            System.out.println("Table created...");

            PreparedStatement ps = con.prepareStatement("insert into kit values(?,?)");
            System.out.println("Enter total number of records");
            num = s.nextInt();

            for(int i = 0;i<num;i++){
                System.out.println("Enter id and record");
                String id = s.next();
                String name = s.next();
                ps.setString(1,id);
                ps.setString(2,name);

                ps.addBatch();
            }

            ps.executeBatch();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
