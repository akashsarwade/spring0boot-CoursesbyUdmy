package com.datajpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.datajpa.entity.Student;
import com.datajpa.repo.StudentRepository;

@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
	private StudentRepository studentRepository; 
	
	@Test
	public void testSaveStudent() {
		Student student =new Student();
		student.setId(11L);
		student.setName("Akash");
		student.setScoreTest(100);
		studentRepository.save(student);
		
		
		Student savedStud=studentRepository.findById(11L).get();
		assertNotNull(savedStud);
		
	}

}
