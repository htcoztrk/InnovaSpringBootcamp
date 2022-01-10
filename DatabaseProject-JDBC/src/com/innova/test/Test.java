package com.innova.test;

import com.innova.controller.AdminController;
import com.innova.dto.AdminDto;

public class Test {
    public static void main(String[] args) {
        AdminController adminController=new AdminController();

        //create admin
        AdminDto adminDto=new AdminDto();
        adminDto.setAdminName("Hatice");
        adminDto.setAdminSurname("Ozturk");
        adminController.create(adminDto);
    }
}
