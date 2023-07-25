package com.sinsokey.spring.ex.jpa;

import org.springframework.stereotype.Controller;

import com.sinsokey.spring.ex.jpa.domain.Student;

@Controller
public class StudentController {

	public void test() {
		Student student = new Student();
		student.getName();
	}
	
}
