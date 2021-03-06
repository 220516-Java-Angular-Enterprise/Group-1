package com.revature.groupproject.services;

import com.revature.groupproject.models.Students;
import com.revature.groupproject.daos.StudentsDAO;
import com.revature.groupproject.util.custom_exception.InvalidStudentsException;

import java.util.ArrayList;
import java.util.List;

public class StudentsServices {

    private final StudentsDAO studentsDAO;

    public StudentsServices(StudentsDAO studentsDAO){
        this.studentsDAO = studentsDAO;
    }

    public Students login(String username, String password) throws InvalidStudentsException{

        List<Students> students = studentsDAO.getAll();

        for(Students s : students){
            if(s.getUsername().equals(username) && s.getPassword().equals(password)) {
                return s;
            }
        }

        throw new InvalidStudentsException("Incorrect Login Credentials");
    }

    private Students isValidCredentials(Students students){
        if(students.getUsername() == null && students.getPassword() == null)
            throw new InvalidStudentsException("Username and Password are incorrect");

        else if (students.getUsername() == null) throw new InvalidStudentsException("Incorrect username");
        else if (students.getPassword() == null) throw new InvalidStudentsException("Incorrect password");

        return students;
    }
}
