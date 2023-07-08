package com.hrsystemapp.HrSystemApp.exception;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(Integer id){
        super("Could not found id:"+id);
    }
}
