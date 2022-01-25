package com.innova.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection extends DatabaseInformation {
    //databse connection
    private Connection connection;

    //database connection information
    private String url = this.getUrl();
    private String userName = this.getUserName();
    private String userPassword = this.getUserPassword();

    //singleton desing pattern
    private static DatabaseConnection instance;

    //private constractor
    private DatabaseConnection() {
        try {

            Class.forName(this.getForNameData());
            System.out.println("Driver Success");
            this.connection = DriverManager.getConnection(url, userName, userPassword);
            System.out.println("Connection success");
        } catch (Exception e) {
            System.out.println("error !!! connection failed");
            e.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance() {
        try {
            if (instance == null) {
                instance = new DatabaseConnection();
            } else if (instance.connection.isClosed()) {
                instance = new DatabaseConnection();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public DatabaseConnection setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }
}

















