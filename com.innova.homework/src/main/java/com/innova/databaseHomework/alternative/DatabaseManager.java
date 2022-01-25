package com.innova.databaseHomework.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeCDI")
@ApplicationScoped
public class DatabaseManager {

    @Inject
    IDatabase databaseInterface;

    public String getDatabaseName() {
        return databaseInterface.databaseName();
    }
}
