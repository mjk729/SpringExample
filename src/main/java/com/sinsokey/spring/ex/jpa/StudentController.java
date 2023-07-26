package com.sinsokey.spring.ex.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinsokey.spring.ex.jpa.domain.Student;
import com.sinsokey.spring.ex.jpa.service.StudentService;

@RequestMapping("/jpa/student")
@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/create")
	@ResponseBody
	public Student createStudent() {
		
		String name = "김민중";
		String phoneNumber = "01012345678";
		String email = "sinsokey@gmail.com";
		String dreamJob = "개발자";
		
		Student student = studentService.addStudent(name, phoneNumber, email, dreamJob);
		
		return student;
		
	}
	
	@GetMapping("/update")
	@ResponseBody
	public Student updateStudent() {
		// id 3인 데이터의 장래희망을 강사로 변경
		Student student = studentService.updateStudentDreamJob(3, "강사");
		
		return student;
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public String deleteStudent() {
		// id가 3인 행 삭제
		studentService.deleteStudent(3);
		return "삭제 완료";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/lombok/test")
	@ResponseBody
	public void test() {
//		Student student = new Student();
//		student.setName("김민중");
//		student.setDreabjob("개발자");
//		student.setPhoneNumber("010-1234-5678");
		Student student = Student.builder().name("김민중")
				.dreamJob("개발자")
				.phoneNumber("010-1234-5678")
				.build();
		
		System.out.println(student);
	}
	
}
