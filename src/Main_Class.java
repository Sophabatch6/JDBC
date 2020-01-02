import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {
        String driverName = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driverName);
            System.out.println("Driver loaded successfully");
            // Create Connection Object
            String dBUrl = "jdbc:mysql://localhost://3306/Collection";
            String uName = "root";
            String uPass = "";
            Connection con = DriverManager.getConnection(dBUrl,uName,uPass);
            System.out.println("Connection Created Successfully");
            // Take user input and store as object
            Scanner input = new Scanner(System.in);
            ArrayList<Collection> list = new ArrayList<>();
            System.out.println("Insert Data Into DataBase:");
            System.out.println("Numbers Of Data to Insert: ");
            int loop = input.nextInt();
            // Insert to Collection and add to Array
            for (int i =1; i <= loop; i++){
                Collection collection = new Collection();
                System.out.println("Data #: +i");
                System.out.print("ID: ");
                collection.setId(input.nextInt());
                System.out.print("Name: ");
                collection.setName(input.next());
                list.add(collection);
            }
            // Insert into Database (forEach)

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
