package com.revature.groupproject.util.custom_exception;

public class InvalidStudentsException extends RuntimeException{
    public InvalidStudentsException(String message){
        super(message);
    }
}
