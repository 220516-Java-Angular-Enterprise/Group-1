package com.revature.groupproject.models;

public class Student_Course {
    private String studentID;
    private String courseID;
    private Students students;
    private Courses courses;

    public Student_Course(String studentID, String courseID) {
        this.studentID = studentID;
        this.courseID = courseID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student_Course{" +
                "studentID='" + studentID + '\'' +
                ", courseID='" + courseID + '\'' +
                ", students=" + students +
                ", courses=" + courses +
                '}';
    }
}
