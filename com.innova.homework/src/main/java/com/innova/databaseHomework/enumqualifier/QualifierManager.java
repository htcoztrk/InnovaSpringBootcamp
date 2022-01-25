package com.innova.databaseHomework.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped
public class QualifierManager {

    @Inject
    @EQualifier(EDatabaseName.POSTGRESQL)
    IDatabaseName databaseName;

    public String getDatabaseName() {
        return databaseName.databaseName();
    }
}
