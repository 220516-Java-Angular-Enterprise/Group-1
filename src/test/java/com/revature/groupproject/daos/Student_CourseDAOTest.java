package com.revature.groupproject.daos;

import com.revature.groupproject.models.Courses;
import com.revature.groupproject.models.Student_Course;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Student_CourseDAOTest {
    Student_CourseDAO student_courseDAO = new Student_CourseDAO();

    @Test
    public void save() {
    }

    @Test
    public void getAll() {
        //Act
        List<Student_Course> student_courseList = student_courseDAO.getAll();
        //Arrange
        //Need to populate student_course table first;
        Student_Course student_course = student_courseList.get(0);
        //Assert
        assertEquals("HED404", student_course.getCourses().getCoursename());
    }
}