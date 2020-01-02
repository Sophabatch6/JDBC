package dbproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCTransactionBatchA {
    Connection con = null;
    Statement st = null;
    public static void main(String[] args) {
        new JDBCTransactionBatchA().transact();
    }
    public void transact(){
        int debId = 0;
        int creId = 0;
        int amt = 0;
        Scanner s = new Scanner(System.in);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "");
            con.setAutoCommit(false);

            System.out.println("Enter your account number: ");
            debId = s.nextInt();

            System.out.println("Enter amount to transfer: ");
            amt = s.nextInt();

            System.out.println("Enter account number to credit: ");
            creId = s.nextInt();

            st = con.createStatement();

            st.executeUpdate("update bank set balance = balance - '"+amt+"' where id = '"+debId+"'");
            st.executeUpdate("update bank set balance = balance + '"+amt+"' where id = '"+creId+"'");

            con.commit();

            System.out.println("Transaction Success... Thank you for using our service");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCTransactionBatchA.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception w){
            System.out.println("Unable to process your request... Thank you for using our service...");
            try
            {
                con.rollback();
                System.out.println("Your money is safe...");
            } catch (SQLException ex) {
                System.out.println("Unable to put your money back (Roll back failed...)");
            }
        }
    }
}