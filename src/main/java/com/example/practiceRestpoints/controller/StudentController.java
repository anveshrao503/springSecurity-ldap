package com.example.practiceRestpoints.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practiceRestpoints.dto.Student;
import com.example.practiceRestpoints.service.StudentService;

@RestController
@RequestMapping("/Students")
public class StudentController {
	
	@Autowired
	protected StudentService studentService;
	
	@GetMapping(value="/details",produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getStudentDetails() {
		
		return studentService.getStudentDetails();
		
	}
	
	@GetMapping(value="/details/{name}",produces =MediaType.APPLICATION_JSON_VALUE)
	public Student getStudentDetailsByName(@PathVariable String name) {
		
		return studentService.getStudentDetailsByName(name);
		
	}

}
