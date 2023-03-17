 package com.example.demo.repositoryTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Course;
import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;

@SpringBootTest
public class TeacherRepositoryTest {
	@Autowired
	private TeacherRepository teacherRepository;
	@Test
	public void saveTeacher() {
		Course courseDsa=Course.builder()
				.title("DSA")
				.credits(4).build();
		Course courseDBata=Course.builder()
				.title("DMBS")
				.credits(4).build();
		Course courseJava=Course.builder()
				.title("java")
				.credits(4).build();
		
		Teacher teacher=Teacher.builder()
				.firstName("Ayyub").
				lastName("Pathan")
//				.courses(List.of(courseDsa,courseDBata,courseJava))
				.build();
	teacherRepository.save(teacher);
	}

}
