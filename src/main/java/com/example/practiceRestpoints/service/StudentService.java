package com.example.practiceRestpoints.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.practiceRestpoints.dto.Student;

@Service
public class StudentService {
	
	public List<Student> stdlist=Arrays.asList(new Student("Anvesh", "503K", 26),
			new Student("BCD", "504K", 27),
			new Student("DCB", "505K", 28));
	
	
	public List<Student> getStudentDetails(){
		return stdlist;
	}
	
	public Student getStudentDetailsByName(String name) {
		
		Optional<Student> std=stdlist.stream().filter(s -> s.getName().equals(name)).findFirst();
		
		return std.get();
		
		
		
	}

}
