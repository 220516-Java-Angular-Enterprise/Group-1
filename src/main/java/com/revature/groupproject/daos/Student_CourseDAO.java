package com.revature.groupproject.daos;

import com.revature.groupproject.models.Courses;
import com.revature.groupproject.models.Student_Course;
import com.revature.groupproject.models.Students;
import com.revature.groupproject.util.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        //unused
        /*
        try{
            PreparedStatement ps = con.prepareStatement("UPDATE studentcourse SET studentid = ?, courseid = ? WHERE ");
            ps.setString(1, obj.getStudentID());
            ps.setString(2, obj.getCourseID());
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
         */
    }

    @Override
    public void delete(String donotuse){}
    public void delete(String sID, String cID) {
        try{
            PreparedStatement ps = con.prepareStatement("DELETE FROM studentcourse WHERE studentid = ? AND courseid = ?");
            ps.setString(1, sID);
            ps.setString(2, cID);
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }

    @Override
    public List getAll() {
        List<Student_Course> student_coursesList = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("select sc.studentid, sc.courseid, s.name, c.id, c.name AS c_name, c.description, c.studentamount from studentcourse sc inner join students s on s.id = sc.studentid inner join courses c on c.id = sc.courseid");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Students students = new Students();
                students.setName(rs.getString("name"));
                Courses courses = new Courses();
                courses.setId(rs.getString("id"));
                courses.setCoursename(rs.getString("c_name"));
                courses.setDescription(rs.getString("description"));
                courses.setStudentamount(rs.getInt("studentamount"));
                Student_Course student_course = new Student_Course(rs.getString("studentid"),rs.getString("courseid"));
                student_course.setCourses(courses);
                student_course.setStudents(students);
                student_coursesList.add(student_course);
            }
        }catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }

        return student_coursesList;
    }

    @Override
    public Student_Course getById(String id) {
        return null;
    }
}
