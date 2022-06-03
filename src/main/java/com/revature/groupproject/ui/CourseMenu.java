package com.revature.groupproject.ui;

import com.revature.groupproject.models.Courses;
import com.revature.groupproject.models.Student_Course;
import com.revature.groupproject.models.Students;
import com.revature.groupproject.services.CoursesServices;
import com.revature.groupproject.services.Student_CourseServices;

import java.util.List;
import java.util.Scanner;

public class CourseMenu implements IMenu{
    private final CoursesServices coursesServices;
    private final Students students;
    private final Student_CourseServices student_courseServices;

    public CourseMenu(CoursesServices coursesServices, Students students, Student_CourseServices student_courseServices) {
        this.coursesServices=coursesServices;
        this.students = students;
        this.student_courseServices = student_courseServices;
    }
    @Override
    public void start() {

        Scanner scanner= new Scanner(System.in);
        exit:{
            while(true){
                System.out.println("\nWelcome to the Course menu:");
                System.out.println("[1] Drop Course");
                System.out.println("[x]Sign out");

                System.out.println("\nEnter:");

                switch(scanner.nextLine()){
                    case "1":
                        dropCourse();
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

    private void dropCourse() {
        Scanner scan = new Scanner(System.in);
        exit:{
        while (true) {
        List<Student_Course> student_courses = student_courseServices.getAllStudent_Course(students.getId());
        for (int i = 0; i < student_courses.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + student_courses.get(i).toString());
        }
        System.out.println("[x]Exit");
        String in = scan.nextLine();
        if (in.matches("\\d+")) {
            int temp = Integer.valueOf(in)-1;
            if (temp >= 0 && temp < student_courses.size()) {
                Student_Course student_course= student_courses.get(temp);
                //Code to update course student amount
                Courses c = student_course.getCourses();
                c.setStudentamount(c.getStudentamount() + 1);
                coursesServices.updateCourse(c);
                //Code to update course student amount
                student_courseServices.deletestudentCourse(student_course);
                System.out.println("Dropped Student course for: " + student_courses.get(temp).getCourses().getCoursename());
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
}
