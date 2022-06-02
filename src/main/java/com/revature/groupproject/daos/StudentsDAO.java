package com.revature.groupproject.daos;

import com.revature.groupproject.models.Students;
import com.revature.groupproject.util.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentsDAO implements CRUDDao<Students> {
    Connection con = DatabaseConnection.getCon();

    @Override
    public void save(Students obj) {
    }

    @Override
    public List<Students> getAll() {
        List<Students> studentsList = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM students");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Students students = new Students(rs.getString("id"), rs.getString("username"), rs.getString("password"), rs.getString("name"));
                studentsList.add(students);
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
        return studentsList;
    }


    @Override
    public void update(Students obj) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Students getById(String id) {
        Students students = new Students();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM students");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                students.setId(rs.getString("id"));
                students.setUsername(rs.getString("username"));
                students.setPassword(rs.getString("password"));
                students.setName(rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
        return students;
    }
}
