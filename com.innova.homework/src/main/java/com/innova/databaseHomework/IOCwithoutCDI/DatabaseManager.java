package com.innova.databaseHomework.IOCwithoutCDI;

public class DatabaseManager {

    Database databaseInterface;

    public DatabaseManager(Database databaseInterface) {
        this.databaseInterface = databaseInterface;
    }

    public void getDatabaseName() {
        databaseInterface.databaseName();
    }
}
