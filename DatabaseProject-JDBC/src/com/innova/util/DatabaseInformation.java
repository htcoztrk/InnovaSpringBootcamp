package com.innova.util;

import lombok.Data;


abstract public class DatabaseInformation {
    //object varibales
    private String url;
    private String userName;
    private String userPassword;
    private String forNameData;

    //constructor without parameter
    public DatabaseInformation(){
        this.url="jdbc:postgresql://localhost:5432/innova1";
        this.userName="postgres";
        this.userPassword="12345";
        this.forNameData="org.postgresql.Driver";

    }
   //constructor with parameter
    public DatabaseInformation(String url,String userName,String userPassword,String forNameData){
        this.url=url;
        this.userName=userName;
        this.userPassword=userPassword;
        this.forNameData=forNameData;
    }

    @Override
    public String toString() {
        return "DatabaseInformation{" +
                "url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", forNameData='" + forNameData + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getForNameData() {
        return forNameData;
    }

    public void setForNameData(String forNameData) {
        this.forNameData = forNameData;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
