package com.merita.student_api.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.merita.student_api.entity.Student;

@RestController
public class StudentController {
	
	public Student getStudent(@PathVariable int id)
	{
		return null;
	}
	
	//This is a comment

}
