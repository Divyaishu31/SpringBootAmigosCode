package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping //Used because we are trying to get this out of server.
	public Student Hello(){
		//return "Hello World, trying to use rest end point"; //To get a json array, just replace this with a list of strings
		return (new Student(1,"Divya","divya@gmail.com", LocalDate.of(2022, Month.JANUARY, 01),1)
		);
	}

}
