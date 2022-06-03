package com.revature.groupproject.models;

public class Courses {
    private String id;
    private String coursename;
    private String description;
    private int studentamount;

   public Courses() {

   }

    public Courses(String id, String coursename, String description, int studentamount) {
        this.id = id;
        this.coursename = coursename;
        this.description = description;
        this.studentamount = studentamount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStudentamount() {
        return studentamount;
    }

    public void setStudentamount(int studentamount) {
        this.studentamount = studentamount;
    }

    @Override
    public String toString() {
        return "Coursename: " + coursename + ", " + description + " | Open spots: " + studentamount;
    }
}
