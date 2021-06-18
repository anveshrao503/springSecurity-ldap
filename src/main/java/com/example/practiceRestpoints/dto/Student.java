package com.example.practiceRestpoints.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Student {
    @Getter@Setter
	private String name;
    @Getter@Setter
    private String rollNo;
    @Getter@Setter
    private int age;
    
    
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRollNo() {
		return rollNo;
	}


	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Student(String name, String rollNo, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + "]";
	}
    
    
	
}
