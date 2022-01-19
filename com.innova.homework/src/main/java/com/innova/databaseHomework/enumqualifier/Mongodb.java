package com.innova.databaseHomework.enumqualifier;

@EQualifier(EDatabaseName.MONGODB)
public class Mongodb implements IDatabaseName{

	@Override
	public String databaseName() {
		// TODO Auto-generated method stub
		return "MongoDB";
	}

}
