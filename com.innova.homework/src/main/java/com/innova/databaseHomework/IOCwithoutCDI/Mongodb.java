package com.innova.databaseHomework.IOCwithoutCDI;

public class Mongodb implements Database{

	@Override
	public void databaseName() {
		System.out.println("MongoDB");
	}

}
