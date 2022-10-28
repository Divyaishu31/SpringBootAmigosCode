package com.example.demo.student;

//It will have all the resources for the student API.It has to interact with the service layer to get the
//data from the data access layer

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping //Used because we are trying to get this out of server.
    public Student getStudents(){
        return studentService.getStudents();

    }
}
