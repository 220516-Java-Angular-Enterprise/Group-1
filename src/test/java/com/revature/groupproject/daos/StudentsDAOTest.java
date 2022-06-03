package com.revature.groupproject.daos;

import com.revature.groupproject.models.Courses;
import com.revature.groupproject.models.Students;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StudentsDAOTest {
    StudentsDAO studentsDAO = new StudentsDAO();

    @Test
    public void getAll() {
        //Act
        List<Students> studentsList= studentsDAO.getAll();
        //Arrange
        Students students = studentsList.get(2);
        //Assert
        assertEquals("HED404", students.getName());
    }
}