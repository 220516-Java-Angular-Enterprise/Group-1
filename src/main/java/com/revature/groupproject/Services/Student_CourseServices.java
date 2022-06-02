package com.revature.groupproject.services;

import com.revature.groupproject.daos.Student_CoursesDAO;
import com.revature.groupproject.models.student_course;

public class Students_CoursesServices {

    private final Student_CoursesDAO student_coursesDAO;

    public students_coursesServices(Student_CoursesDAO student_coursesDAO){
        this.student_coursesDAO = student_coursesDAO;
    }
}

