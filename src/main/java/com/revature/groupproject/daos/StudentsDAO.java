package com.revature.groupproject.daos;

import com.revature.groupproject.models.Students;
import com.revature.groupproject.util.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentsDAO implements CRUDDao{
    Connection con= DatabaseConnection.getCon();
    @Override
    public void save(Object obj) {

    }
    @Override
    public void update(Object obj) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List getAll() {
        List<Students> studentsList = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement("SELECT * FROM students");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Students students = new Students(rs.getString("id"), rs.getString("username"), rs.getString("password"), rs.getString("name"));
                studentsList.add(students);
            }
        }catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
        return studentsList;
    }

    @Override
    public List getById(String id) {
        return null;
    }
}
