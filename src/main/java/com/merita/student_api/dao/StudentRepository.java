package com.merita.student_api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.merita.student_api.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student , Integer>{

}
