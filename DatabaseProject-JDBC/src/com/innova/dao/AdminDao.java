package com.innova.dao;

import com.innova.dto.AdminDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDao implements IDaoConnection<AdminDto>{
    @Override
    public void create(AdminDto adminDto) {
        try(Connection connection=getInterfaceConnection()){
            String sql="insert into admin(admin_name,admin_surname) values(?,?);";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,adminDto.getAdminName());
            preparedStatement.setString(2,adminDto.getAdminSurname());
            int rowEfected=preparedStatement.executeUpdate();
            if(rowEfected>0){
                System.out.println(AdminDao.class + "success");
            }else{
                System.out.println(AdminDao.class + "failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(AdminDto adminDto) {

        try(Connection connection =getInterfaceConnection()){
            String sql="UPDATE admin\n" +
                    "SET admin_name = ?,\n" +
                    "\t\tadmin_surname = ? \n" +
                    "WHERE  admin_id=?;";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,adminDto.getAdminName());
            preparedStatement.setString(2,adminDto.getAdminSurname());
           // preparedStatement.setString(3,adminDto.getAdminID());
            preparedStatement.setInt(3,adminDto.getAdminID());
            int rowEfected=preparedStatement.executeUpdate();
            if(rowEfected>0){
                System.out.println(AdminDao.class + "success");
            }else{
                System.out.println(AdminDao.class + "failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(AdminDto adminDto) {
        try(Connection connection=getInterfaceConnection()){
            String sql="DELETE FROM admin\n" +
                    "WHERE admin_id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,adminDto.getAdminID());
            int rowEfected=preparedStatement.executeUpdate();
            if(rowEfected>0){
                System.out.println("successfully deleted");
            }
            else{
                System.out.println("failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public ArrayList<AdminDto> list() {
        List<AdminDto> admins=new ArrayList<AdminDto>();
        try(Connection connection=getInterfaceConnection()){
            String sql="SELECT * FROM admin;";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
               // System.out.println(rs.getInt(1)+" "+rs.getString(2));
                admins.add(new AdminDto(rs.getInt(1),rs.getString(2),rs.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return (ArrayList<AdminDto>) admins;
    }
}
