package com.revature.groupproject.ui;

import java.util.Scanner;

public class CourseMenu implements IMenu{
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
