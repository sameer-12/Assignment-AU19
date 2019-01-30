package com.au.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.au.spring.model.Student;
import com.au.spring.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	


	@GetMapping("/getName")
	public List<Student> getName() {

		return studentService.getName();
	}
	
	@PostMapping(path = "/insert/Details")
    public void insertStudentDetails(@RequestBody Student student) {
     studentService.insertDetails(student);
	}
	
	
}