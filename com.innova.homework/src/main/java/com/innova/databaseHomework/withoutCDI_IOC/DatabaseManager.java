package com.innova.databaseHomework.withoutCDI_IOC;

public class DatabaseManager {

	Database database=new Database();
	public void getDatabase() {
		database.databaseName("deneme");
		
	}
}
