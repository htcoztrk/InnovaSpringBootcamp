package com.innova.dto;

import java.util.Date;

public class AdminDto {
    private int adminID;
    private String adminName;
    private String adminSurname;
    private Date createdDate;

    public AdminDto() {

    }

    public AdminDto(String adminName, String adminSurname) {
        this.adminName = adminName;
        this.adminSurname = adminSurname;
    }

    public AdminDto(int id, String adminName, String adminSurname) {
        this.adminID = id;
        this.adminName = adminName;
        this.adminSurname = adminSurname;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getAdminID() {
        return adminID;
    }

    public String getAdminSurname() {
        return adminSurname;
    }

    public void setAdminSurname(String adminSurname) {
        this.adminSurname = adminSurname;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    @Override
    public String toString() {
        return "AdninDto{" +
                "adminID=" + adminID +
                ", adminName='" + adminName + '\'' +
                ", adminSurname='" + adminSurname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
