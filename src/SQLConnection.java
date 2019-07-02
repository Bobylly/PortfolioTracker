import java.sql.*;

public class SQLConnection {

    public void startConnection() {

        // 1. Connection - connection object used to provide access to database
        Connection conn = null;

        try {
            // 2.a. Driver - it queries the database with java
            // 2.b. forName - dynamically loads the class for me, in this case mysql
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2.c. DriverManager handles jdbc drivers.
            // 2.d. getConnection method establishes a connection to the database (url, user, pw).
            conn = DriverManager.getConnection("jdbc:mysql://localhost/portfolio","zamboni", "bobpasword01");

            // 3.a. Statement obj execute sql queries
            // 3.b. createStatement returns a Statement obj
            Statement sqlState = conn.createStatement();
            Statement sqlState2 = conn.createStatement();

            String selectfirst_name = "Select first_name from users";
            String selectlast_name = "Select last_name from users";


            ResultSet row1 = sqlState.executeQuery(selectfirst_name);
            ResultSet row2 = sqlState2.executeQuery(selectlast_name);
            // iterate through query results
            while(row1.next()) {
                System.out.println(row1.getString("first_name"));
            }
            while(row2.next()) {
                System.out.println(row2.getString("last_name"));
            }
        }

        catch(
                SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
        catch(ClassNotFoundException e) {
            System.out.println("class not found exception, add jdbc driver to classpath. (worked when added to spring lib.");
            e.printStackTrace();
        }
    }
}
