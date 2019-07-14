import Model.User;

import java.sql.*;


public class Users {

    private Connection conn;


    public Users(Connection connection) {

        this.conn = connection;
        try {
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(10);

            String sql;
            sql = "CREATE TABLE IF NOT EXISTS Users (\n" +
                    "id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                    "first_name VARCHAR(30) NOT NULL,\n" +
                    "last_name VARCHAR(30) NOT NULL,\n" +
                    "balance INT(16),\n" +
                    "stocks VARCHAR(30)\n" +
                    ")";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void remove(User user) {
        try {
            Statement statement = this.conn.createStatement();
            String sql = "DELETE FROM Users WHERE id =" + user.getId();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // todo: try catch
    }

    private User getUserById(int id) {

        try {
            Statement statement = this.conn.createStatement();
            String sql = "SELECT * FROM User WHERE id =" + id;
            ResultSet data = statement.executeQuery(sql);
            while (data.next()) {
                System.out.println(data + "test");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void save(User user) {
    }

    // todo: update  users, set first_name, last_name, balance, stocks, where id = ?
    // todo: try catch

    /**
     * @param firstName
     * @param lastName
     * @return
     */
    public User create(String firstName, String lastName, int balance, String stocks) {

        int lastInsertedId = 0;
        try {
            String sql = "INSERT into users(first_name, last_name, balance, stocks) VALUES (?, ?, ?, ?);";
            PreparedStatement statement = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setInt(3, balance);
            statement.setString(4, stocks);
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                lastInsertedId = rs.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (lastInsertedId == 0) {
            return null;
        }
        return new User(lastInsertedId, firstName, lastName, balance, stocks);
    }
}







 /*
    public void Database() {

        // 1. Connection - connection object used to provide access to database
        Connection connection = null;

        try {
            // 2.a. Driver - it queries the database with java
            // 2.b. forName - dynamically loads the class for me, in this case mysql
           // Class.forName("com.mysql.cj.jdbc.Driver"); - old way of doing things

            // 2.c. DriverManager handles jdbc drivers.
            // 2.d. getConnection method establishes a connection to the database (url, user, pw).
            connection = DriverManager.getConnection("jdbc:mysql://localhost/portfolio","zamboni", "bobpasword01");

            // 3.a. Statement obj execute sql queries
            // 3.b. createStatement returns a Statement obj
            Statement sqlState = connection.createStatement();
            Statement sqlState2 = connection.createStatement();

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
/*        catch(ClassNotFoundException e) {
//            System.out.println("class not found exception, add jdbc driver to classpath. (worked when added to spring lib.");
//            e.printStackTrace();
//        }
        */


// Ctrl + Shift + Alt + T