package com.revature.groupproject.ui;

import com.revature.groupproject.models.Courses;
import com.revature.groupproject.services.CoursesServices;
import jdk.internal.jrtfs.JrtPath;

import java.util.Scanner;

public class RegisterMenu implements IMenu{
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



}
