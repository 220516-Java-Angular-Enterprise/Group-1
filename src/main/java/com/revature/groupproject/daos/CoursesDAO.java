package com.revature.groupproject.daos;

import com.revature.groupproject.models.Courses;
import com.revature.groupproject.models.Students;
import com.revature.groupproject.util.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CoursesDAO implements CRUDDao<Courses>{
    Connection con = DatabaseConnection.getCon();


    @Override
    public void save(Courses obj) {

    }

    @Override
    public void update(Courses obj) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE courses SET studentamount = ? WHERE id = ?");
            ps.setInt(1, obj.getStudentamount());
            ps.setString(2, obj.getId());
            ps.executeUpdate();
        } catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Courses> getAll() {
        List<Courses> coursesList = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement("SELECT * FROM courses ORDER BY id");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Courses courses = new Courses(rs.getString("id"), rs.getString("name"), rs.getString("description"), rs.getInt("studentamount"));
                coursesList.add(courses);
            }
        }catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
        return coursesList;
    }

    @Override
    public Courses getById(String id) {
        return null;
    }
}
