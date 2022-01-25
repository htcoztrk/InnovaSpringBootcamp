package com.innova.databaseHomework.withoutCDI_IOC;

public class Database {
    public void databaseName(String name) {
        if (name.equals("mssql")) {
            System.out.println("Microsoft SQL Server.");
        } else if (name.equals("postgre")) {
            System.out.println("PostgreSQL");
        } else {
            System.out.println("Database bulunamadı.");
        }
    }
}
