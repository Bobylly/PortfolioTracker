package Storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySql {
    private String host;
    private String user;
    private String password;

    public MySql(String host, String user, String password) {
        this.host = host;
        this.user = user;
        this.password = password;
    }


    /**
     * @return Connection
     */
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(this.host, this.user, this.password);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
