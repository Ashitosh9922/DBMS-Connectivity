package demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
    public static void main(String[] args) {
        try {
            // Step 1: Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Step 2: Establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name", "root", "Ash123");
            System.out.println("Connection created");
            
            // Step 3: Create a statement
            Statement stmt = con.createStatement();
            
            // Step 4: Write and execute SQL query
            String sql = "INSERT INTO emp4 VALUES(43, 'Ashitosh', 20)";
            stmt.executeUpdate(sql);
            System.out.println("Data inserted successfully");
            
            // Close the connection
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e);
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e);
        }
    }
}
