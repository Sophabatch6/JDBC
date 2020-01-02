import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class B6B {
    private String B6B;
    private String id ="";
    private String uName ="";
    public void setId(String value){
        this.id = value;
    }
    public void setuName(String value){
        this.uName = value;
    }
    public String getId(){
        return this.id;
    }
    public String getuName(){
        return this.uName;
    }
//    public Statement getStatement(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b6b", "root", "");
//            Statement st = con.createStatement();
//            return st;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//    public void insertRecord(B6B obj){
//        try {
//            getStatement().execute("insert into b6b values('"+obj.getId()+"','"+obj.getuName()+"')");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }


}
