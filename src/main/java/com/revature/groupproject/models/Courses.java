package com.revature.groupproject.models;

public class Courses {
    private String id;
    private String coursename;
    private String description;
    private String studentamount;

   public Courses() {

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

    public String getStudentamount() {
        return studentamount;
    }

    public void setStudentamount(String studentamount) {
        this.studentamount = studentamount;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id='" + id + '\'' +
                ", coursename='" + coursename + '\'' +
                ", description='" + description + '\'' +
                ", studentamount='" + studentamount + '\'' +
                '}';
    }
}
