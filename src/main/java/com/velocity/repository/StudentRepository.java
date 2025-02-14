package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
