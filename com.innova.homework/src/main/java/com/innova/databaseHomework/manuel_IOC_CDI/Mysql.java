package com.innova.databaseHomework.manuel_IOC_CDI;

public class Mysql implements Database {

    @Override
    public void databaseName() {
        System.out.println("MySQL");
    }

}
