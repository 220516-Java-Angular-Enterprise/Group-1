package com.revature.groupproject.util.custom_exception;

public class InvalidSQLException extends RuntimeException{
    public InvalidSQLException(String message){
        super(message);
    }
}
