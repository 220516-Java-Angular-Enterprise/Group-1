package com.revature.groupproject.ui;

import com.revature.groupproject.models.Courses;
import com.revature.groupproject.models.Students;
import com.revature.groupproject.services.CoursesServices;
import com.revature.groupproject.services.StudentsServices;

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
    public void start(){
        System.out.print("Welcome to the Main Menu"+students.getUsername());
        Scanner scan = new Scanner(System.in);

        System.out.println("[1]View All Courses");
        System.out.println("[2] Register for Course");
        System.out.println("[x] Sign out.");

        System.out.println("\nEnter: ");

        switch(scan.nextLine()){
            case "1":
                viewCourses();
                break;
            case "2":
           new RegisterMenu().start();
            case "x":
                break;
            default:
                System.out.println("\nInvalid input.");
                break;
        }

    }
    private void viewCourses(){
        Scanner scanner=new Scanner(System.in);
        List<Courses> courses= null;//CoursesServices.getAllCourses();

        while(true){
            System.out.println("Please select a Course");

            for(int i=0;i<courses.size();i++){
                System.out.println("["+(i+1)+"]"+courses.get(i).getCoursename());
            }
            System.out.println("\nEnter: ");


    }

}}
