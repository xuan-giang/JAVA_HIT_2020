package Bai1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLController {
    private final String URL_SQLSERVER = "jdbc:sqlserver://localhost:1433;databaseName=JavaTest";
    private final String USERNAME_SQLSERVER = "sa";
    private final String PASSWORD_SQLSERVER = "123";

    public Connection GetConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL_SQLSERVER, USERNAME_SQLSERVER, PASSWORD_SQLSERVER);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  conn;
    }


}
