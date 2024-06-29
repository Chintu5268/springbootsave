package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.Model.Student;
import com.velocity.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	/*@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		Student student2=studentService.saveStudent(student);
		return student2;
		
	}
	*/
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		Student student2=studentService.updateStudent(student);
		return student2;
	}
	
}
