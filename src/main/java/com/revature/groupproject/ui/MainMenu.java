package com.revature.groupproject.ui;

import com.revature.groupproject.daos.CoursesDAO;
import com.revature.groupproject.daos.Student_CourseDAO;
import com.revature.groupproject.models.Courses;
import com.revature.groupproject.models.Students;
import com.revature.groupproject.services.CoursesServices;
import com.revature.groupproject.services.Student_CourseServices;
import com.revature.groupproject.services.StudentsServices;
import com.revature.groupproject.util.custom_exception.InvalidCourseException;
import com.revature.groupproject.util.custom_exception.InvalidStudentsException;

import java.util.List;
import java.util.Scanner;

public class MainMenu implements IMenu {

    private final Students students;

    private final StudentsServices studentsService;

    private final CoursesServices coursesService;

    public MainMenu(Students students, StudentsServices studentsService,CoursesServices coursesService){
        this.students=students;
        this.studentsService=studentsService;
        this.coursesService=coursesService;
    }
    public void start() {
        exit:
        {
            while (true) {

                System.out.print("Welcome to the Main Menu " + students.getName());
                Scanner scan = new Scanner(System.in);

                System.out.println("\n[1]View All Courses");
                System.out.println("[2] Register for Course");
                System.out.println("[x] Sign out.");

                System.out.println("\nEnter: ");

                switch (scan.nextLine()) {
                    case "1":
                        new CourseMenu(new CoursesServices(new CoursesDAO()), students, new Student_CourseServices(new Student_CourseDAO())).start();
                        break;
                    case "2":
                        new RegisterMenu(new CoursesServices(new CoursesDAO()), students, new Student_CourseServices(new Student_CourseDAO())).start();
                        break;
                    case "x":
                        break exit;
                    default:
                        System.out.println("\nInvalid input.");
                        break;
                }

            }
        }
    }
    private void viewCourses(){
        Scanner scanner=new Scanner(System.in);
        List<Courses> courses= null;//CoursesServices.getAllCourses();
try{
        while(true) {
            System.out.println("Please select a Course");

            for (int i = 0; i < courses.size(); i++) {
                System.out.println("[" + (i + 1) + "]" + courses.get(i).getCoursename());
            }
            System.out.println("\nEnter: ");
        }}
catch (InvalidCourseException e)
{ throw new RuntimeException("Invalid input.");}

}}
