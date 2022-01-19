package com.innova.databaseHomework.enumqualifier;

@EQualifier(EDatabaseName.MySQL)
public class Mysql implements IDatabaseName{

	@Override
	public String databaseName() {
		// TODO Auto-generated method stub
		return "MySQL";
	}

	
}
