package com.revature.groupproject.util;

import com.revature.groupproject.daos.StudentsDAO;
import com.revature.groupproject.ui.StartMenu;
import com.revature.groupproject.services.StudentsServices;

public class MainDriver { public static void main(String[] args){
    new StartMenu(new StudentsServices(new StudentsDAO())).start();
}}
