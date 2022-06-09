package ro.unibuc.lab11.diplomas.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
clasa definita pentru a stabili conexiunea la baza de date pao_lab11
 */
public class DbConnection {
    private static Connection connection;

    private DbConnection() {}

    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            String url = "jdbc:mysql://localhost:3306/lab11";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}
