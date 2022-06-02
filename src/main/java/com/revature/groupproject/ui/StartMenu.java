package com.revature.groupproject.ui;

import java.util.Scanner;
import com.revature.groupproject.Services.StudentsServices;
public class StartMenu implements IMenu{

    private final StudentsServices studentsServices;

    public StartMenu(StudentsServices studentsServices){this.studentsServices=studentsServices;}
    @Override
    public void start() {
        Scanner scan= new Scanner(System.in);

        exit:
        {
            while(true){
                displayWelcomeMsg();
                String input=scan.nextLine();

                switch(input){
                    case"1":
                        login();
                        break;

                    case "x":
                        System.out.println("\nGoodbye !");
                        break exit;
                    default:
                        System.out.println("\nInvalid input");
                        break;
                }


            }
        }
    }
    private void displayWelcomeMsg(){
        System.out.println("Welcome to Imagination University");
        System.out.println("[1]Login");
        System.out.println("[x]Exit:");
    }

    private void login(){
        String username="";
        String password="";
        String name="";

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("\nLogging in..");
            System.out.print("\nUsername: ");
            username=scan.nextLine();

            System.out.println("\nPassword: ");
            password=scan.nextLine();

            try{
                students = studentsServices.login(username,password);
                if MainMenu(students, new StudentsServices())
            }
        }
    }
}
