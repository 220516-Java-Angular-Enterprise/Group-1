package com.revature.groupproject.services;

import com.revature.groupproject.models.Students;
import com.revature.groupproject.daos.StudentsDAO;
import com.revature.groupproject.util.custom_exception.InvalidStudentsException;

import java.util.List;

public class StudentsServices {

    private final StudentsDAO studentsDAO;

    public StudentsServices(StudentsDAO studentsDAO){
        this.studentsDAO = studentsDAO;
    }

    public boolean login(String username, String password){

<<<<<<< HEAD:src/main/java/com/revature/groupproject/Services/StudentsServices.java
        List<Students> students = StudentsDAO.getAll();
=======
        List<Students> students = studentsDAO.getAll();
>>>>>>> 314973a25aa1c932b0b1a80bd8281804709fe9f1:src/main/java/com/revature/groupproject/services/StudentsServices.java

        for(Students s : students){

            if(s.getUsername() .equals(username) && s.getPassword() .equals(password))
            { return true;}

        }
        return false;
    }

    private Students isValidCredentials(Students students){
        if(students.getUsername() == null && students.getPassword() == null)
            throw new InvalidStudentsException("Username and Password are incorrect");

        else if (students.getUsername() == null) throw new InvalidStudentsException("Incorrect username");
        else if (students.getPassword() == null) throw new InvalidStudentsException("Incorrect password");

        return students;
    }
}

