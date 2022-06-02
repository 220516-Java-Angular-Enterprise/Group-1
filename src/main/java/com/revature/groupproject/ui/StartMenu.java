package com.revature.groupproject.ui;

import java.util.Scanner;

import com.revature.groupproject.daos.CoursesDAO;
import com.revature.groupproject.daos.StudentsDAO;
import com.revature.groupproject.models.Students;
import com.revature.groupproject.services.StudentsServices;
import com.revature.groupproject.services.CoursesServices;
import com.revature.groupproject.util.custom_exception.InvalidStudentsException;

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
                boolean students = studentsServices.login(username, password);
                Students temp=new Students();
                new MainMenu(temp, new StudentsServices(new StudentsDAO()),new CoursesServices(new CoursesDAO())).start();
                break;
            }catch (InvalidStudentsException e){
                System.out.println(e.getMessage());
            }
        }


}}
