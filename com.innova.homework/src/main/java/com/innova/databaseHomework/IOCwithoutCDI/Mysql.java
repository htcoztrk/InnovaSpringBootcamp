package com.innova.databaseHomework.IOCwithoutCDI;

public class Mysql implements Database{

	@Override
	public void databaseName() {
		System.out.println("MySQL");
	}

}
