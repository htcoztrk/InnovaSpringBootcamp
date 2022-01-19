package com.innova.databaseHomework.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mysql implements IDatabase{

	@Override
	public String databaseName() {
		// TODO Auto-generated method stub
		return "MySQL";
	}

}
