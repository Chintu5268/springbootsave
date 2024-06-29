package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.Model.Student;
import com.velocity.repository.StudentRepository;
import com.velocity.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;



	@Override
	public Student updateStudent(Student student) {
Student student2=studentRepository.save(student);
		return student2;
	}

}
