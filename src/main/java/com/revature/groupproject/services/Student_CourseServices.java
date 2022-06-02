package com.revature.groupproject.services;

import com.revature.groupproject.daos.Student_CourseDAO;

public class Student_CourseServices {

    private final Student_CourseDAO student_coursesDAO;

    public Student_CourseServices(Student_CourseDAO student_coursesDAO){
        this.student_coursesDAO = student_coursesDAO;
    }
}

