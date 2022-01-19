package com.innova.databaseHomework.manuel_IOC_CDI;

public class Test {
   
	
	public static void main(String[] args) {
		DatabaseManager manager=new DatabaseManager(new Postgresql());
		manager.getDatabaseName();
	}
}
