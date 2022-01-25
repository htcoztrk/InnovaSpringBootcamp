package com.innova.databaseHomework.IOCwithoutCDI;

public class Test {


    public static void main(String[] args) {
        DatabaseManager manager = new DatabaseManager(new Postgresql());
        manager.getDatabaseName();
    }
}
