package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

//This class has all the business logic.
@Service //similar to component but this is more about semantics.
public class StudentService {
    public Student getStudents(){
        //return "Hello World, trying to use rest end point"; //To get a json array, just replace this with a list of strings
        return (new Student(1,"Divya","divya@gmail.com", LocalDate.of(2022, Month.JANUARY, 01),1));
        //The above statement returns a static value, to get the value dynamically, we need to fetch the data from database.

    }
}
