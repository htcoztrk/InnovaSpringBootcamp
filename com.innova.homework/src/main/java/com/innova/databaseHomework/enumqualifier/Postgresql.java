package com.innova.databaseHomework.enumqualifier;

@EQualifier(EDatabaseName.POSTGRESQL)
public class Postgresql implements IDatabaseName {

    @Override
    public String databaseName() {
        // TODO Auto-generated method stub
        return "PostgreSQL";
    }

}
