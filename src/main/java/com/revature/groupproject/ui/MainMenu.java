package com.revature.groupproject.ui;

import com.revature.groupproject.models.Students;

public class MainMenu implements IMenu {

    private final Students students;

    private final StudentsService studentsService;

    private final CoursesService coursesService;

    public MainMenu(Students students, StudentsService studentsService,CoursesService coursesService){
        this.students=students;
        this.studentsService=studentsService;
        this.coursesService=coursesService;
    }
    public void start(){
        System.out.print("Welcome to the Main Menu"+students.getUsername());
    }

}
