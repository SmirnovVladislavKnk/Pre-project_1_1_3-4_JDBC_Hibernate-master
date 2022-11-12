package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/users_table";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Ghbynth_vjybnjh_99";
    private static Connection connection = null;

    public static Connection getConnection() {
        try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            connection = con;
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
