package com.innova.databaseHomework.manuel_IOC_CDI;

public class Postgresql implements Database{

	@Override
	public void databaseName() {
		System.out.println("PostgreSQL");
	}

}
