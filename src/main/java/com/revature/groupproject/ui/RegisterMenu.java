package com.revature.groupproject.ui;

import com.revature.groupproject.models.Courses;
import com.revature.groupproject.models.Student_Course;
import com.revature.groupproject.services.CoursesServices;


import java.util.List;
import java.util.Scanner;

public class RegisterMenu implements IMenu{
    private final CoursesServices coursesServices;
    public RegisterMenu(CoursesServices coursesServices) {
        this.coursesServices=coursesServices;
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
        List<Courses>courses=coursesServices.getAll();
         for(int i=0;i<courses.size();i++) {
           System.out.println("["+(i+1)+"]"+courses.get(i).toString());
        }
        System.out.println("[x]Exit");
    }


}
