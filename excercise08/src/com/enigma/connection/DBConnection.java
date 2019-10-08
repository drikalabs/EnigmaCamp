package com.enigma.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    static Connection connection;

    public static Connection makeConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/school", "postgres", "blimbeng38");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
