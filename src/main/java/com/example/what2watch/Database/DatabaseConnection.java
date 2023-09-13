package com.example.what2watch.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    private static Connection databaseLink;
    private static final String databaseUser = "root";
    private static final String databasePassword = "root";
    private static final String databaseUrl = "jdbc:mysql://localhost:3306/w2wdatabase";

    public static Connection getConnection() {
        if (databaseLink == null) {
            try {
                databaseLink = DriverManager.getConnection(databaseUrl, databaseUser, databasePassword);

            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Could not open database.");
                System.exit(1);

            }
        }
        return databaseLink;
    }
}
