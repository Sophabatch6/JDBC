import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrepareAndBatchProcessing {
    public static void main(String[] args) {
        B6B  obj = new B6B();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id and name: ");
        String id = input.next();
        String name = input.next();
        obj.setId(id);
        obj.setuName(name);

        PrepareAndBatchProcessing pp = new PrepareAndBatchProcessing();
        pp.InsertData(obj);

    }
    public void InsertData(B6B obj){
        try {
           // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b6b");
            PreparedStatement ps = con.prepareStatement("insert into b6b values(?, ?)");
            ps.setString(1, obj.getId());
            ps.setString(2, obj.getuName());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
