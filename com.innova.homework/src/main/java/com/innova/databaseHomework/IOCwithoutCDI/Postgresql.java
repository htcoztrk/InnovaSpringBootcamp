package com.innova.databaseHomework.IOCwithoutCDI;

public class Postgresql implements Database {

    @Override
    public void databaseName() {
        System.out.println("PostgreSQL");
    }

}
