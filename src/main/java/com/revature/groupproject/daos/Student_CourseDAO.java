package com.revature.groupproject.daos;

import com.revature.groupproject.models.Courses;
import com.revature.groupproject.models.Student_Course;
import com.revature.groupproject.util.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Student_CourseDAO implements CRUDDao<Student_Course>{
    Connection con = DatabaseConnection.getCon();
    @Override
    public void save(Student_Course obj) {
        try{
            PreparedStatement ps = con.prepareStatement("INSERT INTO studentcourse (studentid, courseid) values(?,?)");
            ps.setString(1, obj.getStudentID());
            ps.setString(2, obj.getCourseID());
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }

    @Override
    public void update(Student_Course obj) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public List getById(String id) {
        return null;
    }
}
