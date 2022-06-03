package com.revature.groupproject.services;

import com.revature.groupproject.daos.Student_CourseDAO;
import com.revature.groupproject.models.Student_Course;
import com.revature.groupproject.util.custom_exception.InvalidSQLException;

import java.util.List;
import java.util.stream.Collectors;



public class Student_CourseServices {

    private final Student_CourseDAO student_coursesDAO;

    public Student_CourseServices(Student_CourseDAO student_coursesDAO){
        this.student_coursesDAO = student_coursesDAO;
    }

    public void register(Student_Course student_course){
        student_coursesDAO.save(student_course);

    }

    public List<Student_Course>getAllStudent_Course(String id){
        List<Student_Course> otherList = student_coursesDAO.getAll();
        List<Student_Course> student_course = otherList.stream().filter(studentCourse -> studentCourse.getStudentID().equals(id)).collect(Collectors.toList());
        return student_course;
    }

    public void deletestudentCourse(Student_Course student_course){
            String studentid = student_course.getStudentID();
            String courseid = student_course.getCourseID();
            student_coursesDAO.delete(studentid, courseid);

        }


}
