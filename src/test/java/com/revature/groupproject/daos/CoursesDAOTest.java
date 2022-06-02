package com.revature.groupproject.daos;

import com.revature.groupproject.models.Courses;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
public class CoursesDAOTest {
    CoursesDAO coursesDAO = new CoursesDAO();

    @Test
    public void getAll() {
        //Act
        List<Courses> coursesList = coursesDAO.getAll();
        //Arrange
        Courses courses = coursesList.get(3);
        //Assert
        assertEquals("HED404", courses.getCoursename());
    }
}