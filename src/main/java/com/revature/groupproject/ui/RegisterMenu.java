package com.revature.groupproject.ui;

import com.revature.groupproject.models.Courses;
import com.revature.groupproject.models.Student_Course;
import com.revature.groupproject.models.Students;
import com.revature.groupproject.services.CoursesServices;
import com.revature.groupproject.services.Student_CourseServices;


import java.util.List;
import java.util.Scanner;

public class RegisterMenu implements IMenu{
    private final CoursesServices coursesServices;
    private final Students students;
    private final Student_CourseServices student_courseServices;
    public RegisterMenu(CoursesServices coursesServices, Students students, Student_CourseServices student_courseServices) {
        this.coursesServices=coursesServices;
        this.students = students;
        this.student_courseServices = student_courseServices;
    }

    @Override
    public void start() {
        Scanner scanner=new Scanner(System.in);

        exit:{
            while(true){
                System.out.println("\nWelcome to the Register menu:");
                System.out.println("[1]Register for Classes");
                System.out.println("[x]Sign out");

                System.out.println("\nEnter:");

                switch(scanner.nextLine()){
                    case "1":
                        registerCourse();
                        break ;
                    case"x":
                        break exit;
                    default:
                        System.out.println("\nInvalid input");
                        break;
                }
            }
        }

    }

    private void registerCourse() {
        Scanner scan = new Scanner(System.in);
        exit:
        while (true) {
            List<Courses> courses = coursesServices.getAll();
            for (int i = 0; i < courses.size(); i++) {
                System.out.println("[" + (i + 1) + "]" + courses.get(i).toString());
            }
            System.out.println("[x]Exit");
            String in = scan.nextLine();
            if (in.matches("\\d+")) {
                int temp = Integer.valueOf(in)-1;
                if (temp >= 0 && temp < courses.size() && courses.get(temp).getStudentamount() > 0) {

                    Student_Course student_course = new Student_Course(students.getId(), courses.get(temp).getId());
                    if(student_courseServices.duplicateCourse(student_course)) {
                        student_courseServices.register(student_course);

                        //Code to update course student amount
                        Courses c = courses.get(temp);
                        c.setStudentamount(c.getStudentamount() - 1);
                        coursesServices.updateCourse(c);
                        //Code to update course student amount

                        System.out.println("Registered for: " + courses.get(temp).getCoursename());
                    }else {
                        System.out.println("Can only register one time per a course.");
                    }
                    break exit;
                }
            } else if (in.equals("x")) {
                break exit;
            } else {
                System.out.println("Invalid Input");
            }
        }
        }
}
