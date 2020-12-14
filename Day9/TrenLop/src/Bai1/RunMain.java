package Bai1;

import java.sql.*;

public class RunMain {
    private static final String URL_SQLSERVER = "jdbc:sqlserver://localhost:1433;databaseName=JavaTest";
    private static final String USERNAME_SQLSERVER = "sa";
    private static final String PASSWORD_SQLSERVER = "123";
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL_SQLSERVER, USERNAME_SQLSERVER, PASSWORD_SQLSERVER);

            if(connection != null){
                System.out.println("ok");
            }

            String sql = "SELECT * FROM HangHoa";
            String name = "Tê Giác";
            String sqlInsert = "INSERT INTO HangHoa VALUES(4, N'"+ name +"')";
            Statement statement = connection.createStatement();
            statement.execute(sqlInsert);
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){
                System.out.println(rs.getInt(1) + ":" + rs.getString(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
