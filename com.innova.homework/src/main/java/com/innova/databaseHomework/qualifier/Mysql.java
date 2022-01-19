package com.innova.databaseHomework.qualifier;

import javax.enterprise.inject.Default;

@Default
public class Mysql implements IDatabase{

	@Override
	public String databaseName() {
		// TODO Auto-generated method stub
		return "MySQL";
	}

}
