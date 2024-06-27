package com.datajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
