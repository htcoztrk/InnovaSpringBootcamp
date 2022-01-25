package com.innova.databaseHomework.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCDI")
@ApplicationScoped
public class QualifierDatabaseManager implements Serializable {

    @Inject
    @QualifierCokluSecim
    private IDatabase databaseInterface;

    public String getDatabaseName() {
        return databaseInterface.databaseName();
    }
}
