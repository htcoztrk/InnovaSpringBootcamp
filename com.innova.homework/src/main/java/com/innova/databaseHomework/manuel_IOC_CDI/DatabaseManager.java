package com.innova.databaseHomework.manuel_IOC_CDI;

import javax.inject.Inject;

public class DatabaseManager {

	//manuel IOC kullanımı
	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	Database databaseInterface;

	public DatabaseManager(Database databaseInterface) {
		this.databaseInterface = databaseInterface;
	}
	public void getDatabaseName() {
		databaseInterface.databaseName();
	}
}
