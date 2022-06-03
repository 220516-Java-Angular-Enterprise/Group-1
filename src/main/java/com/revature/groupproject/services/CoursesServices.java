package com.revature.groupproject.services;

import com.revature.groupproject.daos.CoursesDAO;
import com.revature.groupproject.models.Courses;

import java.util.List;

public class CoursesServices {

    private final CoursesDAO coursesDAO;

    public CoursesServices(CoursesDAO coursesDAO){

        this.coursesDAO = coursesDAO;
    }

    public List<Courses> getAll(){
        List<Courses> courseList = coursesDAO.getAll();
        courseList.isEmpty();
            return courseList;
    }

    public void updateCourse(Courses courses){
        coursesDAO.update(courses);
    }

}
